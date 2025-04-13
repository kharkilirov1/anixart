package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class FutureSingleObserver<T> extends CountDownLatch implements SingleObserver<T>, Future<T>, Disposable {

    /* renamed from: b */
    public T f59655b;

    /* renamed from: c */
    public Throwable f59656c;

    /* renamed from: d */
    public final AtomicReference<Disposable> f59657d;

    public FutureSingleObserver() {
        super(1);
        this.f59657d = new AtomicReference<>();
    }

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(Disposable disposable) {
        DisposableHelper.m31413e(this.f59657d, disposable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Disposable disposable;
        DisposableHelper disposableHelper;
        do {
            disposable = this.f59657d.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!this.f59657d.compareAndSet(disposable, disposableHelper));
        if (disposable != null) {
            disposable.mo31379f();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f59656c;
        if (th == null) {
            return this.f59655b;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.m31410b(this.f59657d.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        Disposable disposable;
        do {
            disposable = this.f59657d.get();
            if (disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59656c = th;
        } while (!this.f59657d.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        Disposable disposable = this.f59657d.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return;
        }
        this.f59655b = t;
        this.f59657d.compareAndSet(disposable, this);
        countDown();
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public T get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j2, timeUnit)) {
            throw new TimeoutException(ExceptionHelper.m31820d(j2, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th = this.f59656c;
            if (th == null) {
                return this.f59655b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}

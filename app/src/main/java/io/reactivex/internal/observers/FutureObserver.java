package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {

    /* renamed from: b */
    public T f59652b;

    /* renamed from: c */
    public Throwable f59653c;

    /* renamed from: d */
    public final AtomicReference<Disposable> f59654d;

    public FutureObserver() {
        super(1);
        this.f59654d = new AtomicReference<>();
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        DisposableHelper.m31413e(this.f59654d, disposable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Disposable disposable;
        DisposableHelper disposableHelper;
        do {
            disposable = this.f59654d.get();
            if (disposable == this || disposable == (disposableHelper = DisposableHelper.DISPOSED)) {
                return false;
            }
        } while (!this.f59654d.compareAndSet(disposable, disposableHelper));
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
        Throwable th = this.f59653c;
        if (th == null) {
            return this.f59652b;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.m31410b(this.f59654d.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable;
        if (this.f59652b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            disposable = this.f59654d.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                return;
            }
        } while (!this.f59654d.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Disposable disposable;
        if (this.f59653c != null) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        this.f59653c = th;
        do {
            disposable = this.f59654d.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.m31848b(th);
                return;
            }
        } while (!this.f59654d.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f59652b == null) {
            this.f59652b = t;
        } else {
            this.f59654d.get().mo31379f();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
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
            Throwable th = this.f59653c;
            if (th == null) {
                return this.f59652b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}

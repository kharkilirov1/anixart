package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class SingleTimeout<T> extends Single<T> {

    public static final class TimeoutMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62558b;

        /* renamed from: f */
        public final long f62562f;

        /* renamed from: e */
        public SingleSource<? extends T> f62561e = null;

        /* renamed from: g */
        public final TimeUnit f62563g = null;

        /* renamed from: c */
        public final AtomicReference<Disposable> f62559c = new AtomicReference<>();

        /* renamed from: d */
        public final TimeoutFallbackObserver<T> f62560d = null;

        public static final class TimeoutFallbackObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {

            /* renamed from: b */
            public final SingleObserver<? super T> f62564b;

            @Override // io.reactivex.SingleObserver
            /* renamed from: a */
            public void mo31388a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.f62564b.onError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                this.f62564b.onSuccess(t);
            }
        }

        public TimeoutMainObserver(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource, long j2, TimeUnit timeUnit) {
            this.f62558b = singleObserver;
            this.f62562f = j2;
        }

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f62559c);
            TimeoutFallbackObserver<T> timeoutFallbackObserver = this.f62560d;
            if (timeoutFallbackObserver != null) {
                DisposableHelper.m31409a(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f62559c);
                this.f62558b.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            DisposableHelper.m31409a(this.f62559c);
            this.f62558b.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper || !compareAndSet(disposable, disposableHelper)) {
                return;
            }
            if (disposable != null) {
                disposable.mo31379f();
            }
            SingleSource<? extends T> singleSource = this.f62561e;
            if (singleSource == null) {
                this.f62558b.onError(new TimeoutException(ExceptionHelper.m31820d(this.f62562f, this.f62563g)));
            } else {
                this.f62561e = null;
                singleSource.mo31385b(this.f62560d);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        singleObserver.mo31388a(new TimeoutMainObserver(singleObserver, null, 0L, null));
        throw null;
    }
}

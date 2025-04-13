package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class MaybeTimeoutMaybe<T, U> extends AbstractMaybeWithUpstream<T, T> {

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61139b;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61139b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61139b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61139b.onSuccess(t);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61140b;

        /* renamed from: c */
        public final TimeoutOtherMaybeObserver<T, U> f61141c = new TimeoutOtherMaybeObserver<>(this);

        /* renamed from: d */
        public final MaybeSource<? extends T> f61142d = null;

        /* renamed from: e */
        public final TimeoutFallbackMaybeObserver<T> f61143e = null;

        public TimeoutMainMaybeObserver(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f61140b = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        /* renamed from: b */
        public void m31626b() {
            if (DisposableHelper.m31409a(this)) {
                MaybeSource<? extends T> maybeSource = this.f61142d;
                if (maybeSource == null) {
                    this.f61140b.onError(new TimeoutException());
                } else {
                    maybeSource.mo31353b(this.f61143e);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            DisposableHelper.m31409a(this);
            DisposableHelper.m31409a(this.f61141c);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f61143e;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.m31409a(timeoutFallbackMaybeObserver);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.m31409a(this.f61141c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61140b.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            DisposableHelper.m31409a(this.f61141c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61140b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            DisposableHelper.m31409a(this.f61141c);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f61140b.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(get());
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Disposable> implements MaybeObserver<Object> {

        /* renamed from: b */
        public final TimeoutMainMaybeObserver<T, U> f61144b;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.f61144b = timeoutMainMaybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            DisposableHelper.m31413e(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61144b.m31626b();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver = this.f61144b;
            if (DisposableHelper.m31409a(timeoutMainMaybeObserver)) {
                timeoutMainMaybeObserver.f61140b.onError(th);
            } else {
                RxJavaPlugins.m31848b(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f61144b.m31626b();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.mo31355a(new TimeoutMainMaybeObserver(maybeObserver, null));
        throw null;
    }
}

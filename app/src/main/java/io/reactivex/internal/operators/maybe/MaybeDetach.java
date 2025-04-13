package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeDetach<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class DetachMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public MaybeObserver<? super T> f61010b;

        /* renamed from: c */
        public Disposable f61011c;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61011c, disposable)) {
                this.f61011c = disposable;
                this.f61010b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61010b = null;
            this.f61011c.mo31379f();
            this.f61011c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61011c = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f61010b;
            if (maybeObserver != null) {
                this.f61010b = null;
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61011c = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f61010b;
            if (maybeObserver != null) {
                this.f61010b = null;
                maybeObserver.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61011c = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.f61010b;
            if (maybeObserver != null) {
                this.f61010b = null;
                maybeObserver.onSuccess(t);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61011c.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}

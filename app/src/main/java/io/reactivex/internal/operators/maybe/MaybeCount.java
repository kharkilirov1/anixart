package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* loaded from: classes3.dex */
public final class MaybeCount<T> extends Single<Long> implements HasUpstreamMaybeSource<T> {

    public static final class CountMaybeObserver implements MaybeObserver<Object>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Long> f60987b;

        /* renamed from: c */
        public Disposable f60988c;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f60988c, disposable)) {
                this.f60988c = disposable;
                this.f60987b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f60988c.mo31379f();
            this.f60988c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f60988c = DisposableHelper.DISPOSED;
            this.f60987b.onSuccess(0L);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f60988c = DisposableHelper.DISPOSED;
            this.f60987b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f60988c = DisposableHelper.DISPOSED;
            this.f60987b.onSuccess(1L);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f60988c.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Long> singleObserver) {
        throw null;
    }
}

package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamSingleSource;

/* loaded from: classes3.dex */
public final class MaybeFromSingle<T> extends Maybe<T> implements HasUpstreamSingleSource<T> {

    public static final class FromSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61075b;

        /* renamed from: c */
        public Disposable f61076c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61076c, disposable)) {
                this.f61076c = disposable;
                this.f61075b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61076c.mo31379f();
            this.f61076c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f61076c = DisposableHelper.DISPOSED;
            this.f61075b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f61076c = DisposableHelper.DISPOSED;
            this.f61075b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61076c.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}

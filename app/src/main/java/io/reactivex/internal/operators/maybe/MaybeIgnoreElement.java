package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeIgnoreElement<T> extends AbstractMaybeWithUpstream<T, T> {

    public static final class IgnoreMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super T> f61079b;

        /* renamed from: c */
        public Disposable f61080c;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61080c, disposable)) {
                this.f61080c = disposable;
                this.f61079b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61080c.mo31379f();
            this.f61080c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61080c = DisposableHelper.DISPOSED;
            this.f61079b.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61080c = DisposableHelper.DISPOSED;
            this.f61079b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61080c = DisposableHelper.DISPOSED;
            this.f61079b.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61080c.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super T> maybeObserver) {
        throw null;
    }
}

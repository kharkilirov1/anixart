package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class MaybeIsEmpty<T> extends AbstractMaybeWithUpstream<T, Boolean> {

    public static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {

        /* renamed from: b */
        public final MaybeObserver<? super Boolean> f61083b;

        /* renamed from: c */
        public Disposable f61084c;

        @Override // io.reactivex.MaybeObserver
        /* renamed from: a */
        public void mo31355a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61084c, disposable)) {
                this.f61084c = disposable;
                this.f61083b.mo31355a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61084c.mo31379f();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f61083b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.f61083b.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.f61083b.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61084c.mo31380s();
        }
    }

    @Override // io.reactivex.Maybe
    /* renamed from: c */
    public void mo31354c(MaybeObserver<? super Boolean> maybeObserver) {
        throw null;
    }
}

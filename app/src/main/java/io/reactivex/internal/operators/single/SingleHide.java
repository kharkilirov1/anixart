package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class SingleHide<T> extends Single<T> {

    public static final class HideSingleObserver<T> implements SingleObserver<T>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super T> f62532b;

        /* renamed from: c */
        public Disposable f62533c;

        @Override // io.reactivex.SingleObserver
        /* renamed from: a */
        public void mo31388a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f62533c, disposable)) {
                this.f62533c = disposable;
                this.f62532b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f62533c.mo31379f();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.f62532b.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.f62532b.onSuccess(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f62533c.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super T> singleObserver) {
        throw null;
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;

/* loaded from: classes3.dex */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {

    public static final class CountObserver implements Observer<Object>, Disposable {

        /* renamed from: b */
        public final SingleObserver<? super Long> f61541b;

        /* renamed from: c */
        public Disposable f61542c;

        /* renamed from: d */
        public long f61543d;

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61542c, disposable)) {
                this.f61542c = disposable;
                this.f61541b.mo31388a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61542c.mo31379f();
            this.f61542c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61542c = DisposableHelper.DISPOSED;
            this.f61541b.onSuccess(Long.valueOf(this.f61543d));
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61542c = DisposableHelper.DISPOSED;
            this.f61541b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f61543d++;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61542c.mo31380s();
        }
    }

    @Override // io.reactivex.Single
    /* renamed from: c */
    public void mo31386c(SingleObserver<? super Long> singleObserver) {
        throw null;
    }
}

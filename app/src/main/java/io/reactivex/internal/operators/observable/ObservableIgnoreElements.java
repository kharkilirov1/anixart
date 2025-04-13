package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public final class ObservableIgnoreElements<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class IgnoreObservable<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61758b;

        /* renamed from: c */
        public Disposable f61759c;

        public IgnoreObservable(Observer<? super T> observer) {
            this.f61758b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            this.f61759c = disposable;
            this.f61758b.mo31373a(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61759c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61758b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61758b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61759c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new IgnoreObservable(observer));
    }
}

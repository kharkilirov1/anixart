package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableCount<T> extends AbstractObservableWithUpstream<T, Long> {

    public static final class CountObserver implements Observer<Object>, Disposable {

        /* renamed from: b */
        public final Observer<? super Long> f61538b;

        /* renamed from: c */
        public Disposable f61539c;

        /* renamed from: d */
        public long f61540d;

        public CountObserver(Observer<? super Long> observer) {
            this.f61538b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61539c, disposable)) {
                this.f61539c = disposable;
                this.f61538b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61539c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61538b.onNext(Long.valueOf(this.f61540d));
            this.f61538b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61538b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f61540d++;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61539c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Long> observer) {
        this.f61337b.mo31364c(new CountObserver(observer));
    }
}

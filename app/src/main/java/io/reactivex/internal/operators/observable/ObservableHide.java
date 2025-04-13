package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes3.dex */
public final class ObservableHide<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class HideDisposable<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public final Observer<? super T> f61756b;

        /* renamed from: c */
        public Disposable f61757c;

        public HideDisposable(Observer<? super T> observer) {
            this.f61756b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61757c, disposable)) {
                this.f61757c = disposable;
                this.f61756b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61757c.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f61756b.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f61756b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61756b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61757c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new HideDisposable(observer));
    }
}

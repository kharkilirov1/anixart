package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;

/* loaded from: classes3.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractObservableWithUpstream<T, T> {

    /* renamed from: c */
    public final ObservableSource<? extends T> f62059c;

    public static final class SwitchIfEmptyObserver<T> implements Observer<T> {

        /* renamed from: b */
        public final Observer<? super T> f62060b;

        /* renamed from: c */
        public final ObservableSource<? extends T> f62061c;

        /* renamed from: e */
        public boolean f62063e = true;

        /* renamed from: d */
        public final SequentialDisposable f62062d = new SequentialDisposable();

        public SwitchIfEmptyObserver(Observer<? super T> observer, ObservableSource<? extends T> observableSource) {
            this.f62060b = observer;
            this.f62061c = observableSource;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            DisposableHelper.m31412d(this.f62062d, disposable);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f62063e) {
                this.f62060b.onComplete();
            } else {
                this.f62063e = false;
                this.f62061c.mo31364c(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f62060b.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            if (this.f62063e) {
                this.f62063e = false;
            }
            this.f62060b.onNext(t);
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        SwitchIfEmptyObserver switchIfEmptyObserver = new SwitchIfEmptyObserver(observer, this.f62059c);
        observer.mo31373a(switchIfEmptyObserver.f62062d);
        this.f61337b.mo31364c(switchIfEmptyObserver);
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* loaded from: classes3.dex */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DetachObserver<T> implements Observer<T>, Disposable {

        /* renamed from: b */
        public Observer<? super T> f61589b;

        /* renamed from: c */
        public Disposable f61590c;

        public DetachObserver(Observer<? super T> observer) {
            this.f61589b = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a */
        public void mo31373a(Disposable disposable) {
            if (DisposableHelper.m31414h(this.f61590c, disposable)) {
                this.f61590c = disposable;
                this.f61589b.mo31373a(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            Disposable disposable = this.f61590c;
            EmptyComponent emptyComponent = EmptyComponent.INSTANCE;
            this.f61590c = emptyComponent;
            this.f61589b = emptyComponent;
            disposable.mo31379f();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Observer<? super T> observer = this.f61589b;
            EmptyComponent emptyComponent = EmptyComponent.INSTANCE;
            this.f61590c = emptyComponent;
            this.f61589b = emptyComponent;
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Observer<? super T> observer = this.f61589b;
            EmptyComponent emptyComponent = EmptyComponent.INSTANCE;
            this.f61590c = emptyComponent;
            this.f61589b = emptyComponent;
            observer.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            this.f61589b.onNext(t);
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61590c.mo31380s();
        }
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new DetachObserver(observer));
    }
}

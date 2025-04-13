package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;

/* loaded from: classes3.dex */
public final class ObservableJust<T> extends Observable<T> implements ScalarCallable<T> {

    /* renamed from: b */
    public final T f61792b;

    public ObservableJust(T t) {
        this.f61792b = t;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.f61792b;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        ObservableScalarXMap.ScalarDisposable scalarDisposable = new ObservableScalarXMap.ScalarDisposable(observer, this.f61792b);
        observer.mo31373a(scalarDisposable);
        scalarDisposable.run();
    }
}

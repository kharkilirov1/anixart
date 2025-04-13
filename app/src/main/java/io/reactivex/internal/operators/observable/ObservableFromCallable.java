package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ObservableFromCallable<T> extends Observable<T> implements Callable<T> {

    /* renamed from: b */
    public final Callable<? extends T> f61703b;

    public ObservableFromCallable(Callable<? extends T> callable) {
        this.f61703b = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        T call = this.f61703b.call();
        Objects.requireNonNull(call, "The callable returned a null value");
        return call;
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.mo31373a(deferredScalarDisposable);
        if (deferredScalarDisposable.mo31380s()) {
            return;
        }
        try {
            T call = this.f61703b.call();
            Objects.requireNonNull(call, "Callable returned null");
            deferredScalarDisposable.m31431b(call);
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            if (deferredScalarDisposable.mo31380s()) {
                RxJavaPlugins.m31848b(th);
            } else {
                observer.onError(th);
            }
        }
    }
}

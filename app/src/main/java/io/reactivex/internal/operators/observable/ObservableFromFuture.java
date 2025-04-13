package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* loaded from: classes3.dex */
public final class ObservableFromFuture<T> extends Observable<T> {
    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.mo31373a(deferredScalarDisposable);
        if (deferredScalarDisposable.mo31380s()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            if (deferredScalarDisposable.mo31380s()) {
                return;
            }
            observer.onError(th);
        }
    }
}

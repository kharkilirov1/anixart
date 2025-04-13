package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class ObservableError<T> extends Observable<T> {
    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            observer.mo31373a(EmptyDisposable.INSTANCE);
            observer.onError(th);
        }
    }
}

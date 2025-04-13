package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;

/* loaded from: classes3.dex */
public final class ObservableNever extends Observable<Object> {
    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super Object> observer) {
        observer.mo31373a(EmptyDisposable.NEVER);
    }
}

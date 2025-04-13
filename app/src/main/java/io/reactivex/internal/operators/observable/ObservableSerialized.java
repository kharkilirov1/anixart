package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.observers.SerializedObserver;

/* loaded from: classes3.dex */
public final class ObservableSerialized<T> extends AbstractObservableWithUpstream<T, T> {
    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61337b.mo31364c(new SerializedObserver(observer));
    }
}

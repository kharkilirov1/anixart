package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* loaded from: classes3.dex */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {

    /* renamed from: b */
    public final ObservableSource<T> f61713b;

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f61713b.mo31364c(observer);
    }
}

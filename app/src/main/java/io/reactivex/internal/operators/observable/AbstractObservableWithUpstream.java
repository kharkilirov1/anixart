package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* loaded from: classes3.dex */
abstract class AbstractObservableWithUpstream<T, U> extends Observable<U> implements HasUpstreamObservableSource<T> {

    /* renamed from: b */
    public final ObservableSource<T> f61337b;

    public AbstractObservableWithUpstream(ObservableSource<T> observableSource) {
        this.f61337b = observableSource;
    }
}

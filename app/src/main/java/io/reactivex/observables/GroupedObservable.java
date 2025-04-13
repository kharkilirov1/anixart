package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {

    /* renamed from: b */
    public final K f62807b;

    public GroupedObservable(@Nullable K k2) {
        this.f62807b = k2;
    }
}

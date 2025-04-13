package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class GroupedFlowable<K, T> extends Flowable<T> {

    /* renamed from: c */
    public final K f59612c;

    public GroupedFlowable(@Nullable K k2) {
        this.f59612c = k2;
    }
}

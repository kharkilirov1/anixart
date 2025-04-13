package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.List;

@GwtCompatible
/* loaded from: classes2.dex */
abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {
    }

    public static final class Present<V> {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    /* renamed from: t */
    public void mo12172t(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.mo12172t(releaseResourcesReason);
    }
}

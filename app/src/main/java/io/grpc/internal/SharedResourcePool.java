package io.grpc.internal;

import io.grpc.internal.SharedResourceHolder;

/* loaded from: classes3.dex */
public final class SharedResourcePool<T> implements ObjectPool<T> {

    /* renamed from: a */
    public final SharedResourceHolder.Resource<T> f59154a;

    public SharedResourcePool(SharedResourceHolder.Resource<T> resource) {
        this.f59154a = resource;
    }
}

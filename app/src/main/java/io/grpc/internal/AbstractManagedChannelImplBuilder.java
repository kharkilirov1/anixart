package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.ManagedChannelBuilder;

/* loaded from: classes3.dex */
public abstract class AbstractManagedChannelImplBuilder<T extends ManagedChannelBuilder<T>> extends ManagedChannelBuilder<T> {
    /* renamed from: a */
    public abstract ManagedChannelBuilder<?> mo30963a();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo30963a());
        return m11166b.toString();
    }
}

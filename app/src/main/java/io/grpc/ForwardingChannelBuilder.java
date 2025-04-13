package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ForwardingChannelBuilder;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class ForwardingChannelBuilder<T extends ForwardingChannelBuilder<T>> extends ManagedChannelBuilder<T> {
    /* renamed from: a */
    public abstract ManagedChannelBuilder<?> mo30859a();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo30859a());
        return m11166b.toString();
    }
}

package io.grpc.util;

import com.google.common.base.MoreObjects;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class ForwardingLoadBalancer extends LoadBalancer {
    /* renamed from: a */
    public abstract LoadBalancer mo31325a();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo31325a());
        return m11166b.toString();
    }
}

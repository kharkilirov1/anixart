package io.grpc.util;

import com.google.common.base.MoreObjects;
import io.grpc.ConnectivityState;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class ForwardingLoadBalancerHelper extends LoadBalancer.Helper {
    @Override // io.grpc.LoadBalancer.Helper
    /* renamed from: a */
    public void mo30882a() {
        mo31326c().mo30882a();
    }

    @Override // io.grpc.LoadBalancer.Helper
    /* renamed from: b */
    public void mo30883b(ConnectivityState connectivityState, LoadBalancer.SubchannelPicker subchannelPicker) {
        mo31326c().mo30883b(connectivityState, subchannelPicker);
    }

    /* renamed from: c */
    public abstract LoadBalancer.Helper mo31326c();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo31326c());
        return m11166b.toString();
    }
}

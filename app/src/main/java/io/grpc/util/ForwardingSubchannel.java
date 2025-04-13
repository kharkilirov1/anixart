package io.grpc.util;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;
import io.grpc.ExperimentalApi;
import io.grpc.LoadBalancer;
import java.util.List;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class ForwardingSubchannel extends LoadBalancer.Subchannel {
    @Override // io.grpc.LoadBalancer.Subchannel
    /* renamed from: a */
    public List<EquivalentAddressGroup> mo30887a() {
        return m31327d().mo30887a();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    /* renamed from: b */
    public Attributes mo30888b() {
        return m31327d().mo30888b();
    }

    @Override // io.grpc.LoadBalancer.Subchannel
    /* renamed from: c */
    public void mo30889c() {
        m31327d().mo30889c();
    }

    /* renamed from: d */
    public abstract LoadBalancer.Subchannel m31327d();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", m31327d());
        return m11166b.toString();
    }
}

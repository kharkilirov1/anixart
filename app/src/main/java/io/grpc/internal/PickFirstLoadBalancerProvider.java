package io.grpc.internal;

import io.grpc.LoadBalancerProvider;

/* loaded from: classes3.dex */
public final class PickFirstLoadBalancerProvider extends LoadBalancerProvider {

    /* renamed from: b */
    public static final /* synthetic */ int f58945b = 0;

    @Override // io.grpc.LoadBalancerProvider
    /* renamed from: a */
    public String mo30891a() {
        return "pick_first";
    }

    @Override // io.grpc.LoadBalancerProvider
    /* renamed from: b */
    public int mo30892b() {
        return 5;
    }

    @Override // io.grpc.LoadBalancerProvider
    /* renamed from: c */
    public boolean mo30893c() {
        return true;
    }
}

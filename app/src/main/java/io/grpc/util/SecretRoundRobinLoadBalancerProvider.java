package io.grpc.util;

import io.grpc.LoadBalancerProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SecretRoundRobinLoadBalancerProvider {

    public static final class Provider extends LoadBalancerProvider {

        /* renamed from: b */
        public static final /* synthetic */ int f59539b = 0;

        @Override // io.grpc.LoadBalancerProvider
        /* renamed from: a */
        public String mo30891a() {
            return "round_robin";
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
}

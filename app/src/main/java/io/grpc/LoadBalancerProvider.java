package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.LoadBalancer;
import io.grpc.NameResolver;

@ExperimentalApi
/* loaded from: classes3.dex */
public abstract class LoadBalancerProvider extends LoadBalancer.Factory {

    /* renamed from: a */
    public static final NameResolver.ConfigOrError f58199a = new NameResolver.ConfigOrError(new UnknownConfig());

    public static final class UnknownConfig {
        public String toString() {
            return "service config is unused";
        }
    }

    /* renamed from: a */
    public abstract String mo30891a();

    /* renamed from: b */
    public abstract int mo30892b();

    /* renamed from: c */
    public abstract boolean mo30893c();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("policy", mo30891a());
        m11166b.m11168b("priority", mo30892b());
        m11166b.m11170d("available", mo30893c());
        return m11166b.toString();
    }
}

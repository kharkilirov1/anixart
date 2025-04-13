package io.grpc;

import io.grpc.ServiceProviders;
import io.grpc.internal.PickFirstLoadBalancerProvider;
import io.grpc.util.SecretRoundRobinLoadBalancerProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public final class LoadBalancerRegistry {

    /* renamed from: b */
    public static final Logger f58200b = Logger.getLogger(LoadBalancerRegistry.class.getName());

    /* renamed from: c */
    public static final Iterable<Class<?>> f58201c;

    /* renamed from: a */
    public final LinkedHashMap<String, LoadBalancerProvider> f58202a;

    public static final class LoadBalancerPriorityAccessor implements ServiceProviders.PriorityAccessor<LoadBalancerProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int mo30894a(LoadBalancerProvider loadBalancerProvider) {
            return loadBalancerProvider.mo30892b();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = PickFirstLoadBalancerProvider.f58945b;
            arrayList.add(PickFirstLoadBalancerProvider.class);
        } catch (ClassNotFoundException e2) {
            f58200b.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            int i3 = SecretRoundRobinLoadBalancerProvider.Provider.f59539b;
            arrayList.add(SecretRoundRobinLoadBalancerProvider.Provider.class);
        } catch (ClassNotFoundException e3) {
            f58200b.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        f58201c = Collections.unmodifiableList(arrayList);
    }

    public LoadBalancerRegistry() {
        new LinkedHashSet();
        this.f58202a = new LinkedHashMap<>();
    }
}

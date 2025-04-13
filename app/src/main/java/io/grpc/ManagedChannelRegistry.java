package io.grpc;

import io.grpc.ServiceProviders;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Internal
/* loaded from: classes3.dex */
public final class ManagedChannelRegistry {

    /* renamed from: a */
    @GuardedBy
    public List<ManagedChannelProvider> f58203a;

    /* renamed from: io.grpc.ManagedChannelRegistry$1 */
    class C63001 implements Comparator<ManagedChannelProvider> {
        @Override // java.util.Comparator
        public int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.mo30895a() - managedChannelProvider2.mo30895a();
        }
    }

    public static final class ManagedChannelPriorityAccessor implements ServiceProviders.PriorityAccessor<ManagedChannelProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int mo30894a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.mo30895a();
        }
    }

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    static {
        Logger.getLogger(ManagedChannelRegistry.class.getName());
    }

    public ManagedChannelRegistry() {
        new LinkedHashSet();
        this.f58203a = Collections.emptyList();
    }
}

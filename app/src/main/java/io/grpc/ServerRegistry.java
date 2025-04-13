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
public final class ServerRegistry {

    /* renamed from: a */
    @GuardedBy
    public List<ServerProvider> f58274a;

    /* renamed from: io.grpc.ServerRegistry$1 */
    class C63091 implements Comparator<ServerProvider> {
        @Override // java.util.Comparator
        public int compare(ServerProvider serverProvider, ServerProvider serverProvider2) {
            return serverProvider.m30936a() - serverProvider2.m30936a();
        }
    }

    public static final class ProviderNotFoundException extends RuntimeException {
    }

    public static final class ServerPriorityAccessor implements ServiceProviders.PriorityAccessor<ServerProvider> {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int mo30894a(ServerProvider serverProvider) {
            return serverProvider.m30936a();
        }
    }

    static {
        Logger.getLogger(ServerRegistry.class.getName());
    }

    public ServerRegistry() {
        new LinkedHashSet();
        this.f58274a = Collections.emptyList();
    }
}

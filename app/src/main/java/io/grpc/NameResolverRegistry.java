package io.grpc;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.yandex.metrica.push.common.CoreConstants;
import io.grpc.NameResolver;
import io.grpc.ServiceProviders;
import io.grpc.internal.DnsNameResolverProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi
@ThreadSafe
/* loaded from: classes3.dex */
public final class NameResolverRegistry {

    /* renamed from: e */
    public static final Logger f58251e = Logger.getLogger(NameResolverRegistry.class.getName());

    /* renamed from: f */
    public static NameResolverRegistry f58252f;

    /* renamed from: a */
    public final NameResolver.Factory f58253a = new NameResolverFactory(null);

    /* renamed from: b */
    @GuardedBy
    public String f58254b = CoreConstants.Transport.UNKNOWN;

    /* renamed from: c */
    @GuardedBy
    public final LinkedHashSet<NameResolverProvider> f58255c = new LinkedHashSet<>();

    /* renamed from: d */
    @GuardedBy
    public ImmutableMap<String, NameResolverProvider> f58256d = ImmutableMap.m11650l();

    public final class NameResolverFactory extends NameResolver.Factory {
        public NameResolverFactory(C63061 c63061) {
        }

        @Override // io.grpc.NameResolver.Factory
        /* renamed from: a */
        public String mo30927a() {
            String str;
            synchronized (NameResolverRegistry.this) {
                str = NameResolverRegistry.this.f58254b;
            }
            return str;
        }
    }

    public static final class NameResolverPriorityAccessor implements ServiceProviders.PriorityAccessor<NameResolverProvider> {
        public NameResolverPriorityAccessor() {
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int mo30894a(NameResolverProvider nameResolverProvider) {
            return nameResolverProvider.mo30929c();
        }

        /* renamed from: b */
        public boolean m30932b(Object obj) {
            return ((NameResolverProvider) obj).mo30928b();
        }

        public NameResolverPriorityAccessor(C63061 c63061) {
        }
    }

    /* renamed from: a */
    public static synchronized NameResolverRegistry m30930a() {
        NameResolverRegistry nameResolverRegistry;
        synchronized (NameResolverRegistry.class) {
            if (f58252f == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(DnsNameResolverProvider.class);
                } catch (ClassNotFoundException e2) {
                    f58251e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e2);
                }
                List<NameResolverProvider> m30940a = ServiceProviders.m30940a(NameResolverProvider.class, Collections.unmodifiableList(arrayList), NameResolverProvider.class.getClassLoader(), new NameResolverPriorityAccessor(null));
                if (m30940a.isEmpty()) {
                    f58251e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f58252f = new NameResolverRegistry();
                for (NameResolverProvider nameResolverProvider : m30940a) {
                    f58251e.fine("Service loader found " + nameResolverProvider);
                    if (nameResolverProvider.mo30928b()) {
                        NameResolverRegistry nameResolverRegistry2 = f58252f;
                        synchronized (nameResolverRegistry2) {
                            Preconditions.m11179c(nameResolverProvider.mo30928b(), "isAvailable() returned false");
                            nameResolverRegistry2.f58255c.add(nameResolverProvider);
                        }
                    }
                }
                f58252f.m30931b();
            }
            nameResolverRegistry = f58252f;
        }
        return nameResolverRegistry;
    }

    /* renamed from: b */
    public final synchronized void m30931b() {
        HashMap hashMap = new HashMap();
        int i2 = Integer.MIN_VALUE;
        String str = CoreConstants.Transport.UNKNOWN;
        Iterator<NameResolverProvider> it = this.f58255c.iterator();
        while (it.hasNext()) {
            NameResolverProvider next = it.next();
            String mo30927a = next.mo30927a();
            NameResolverProvider nameResolverProvider = (NameResolverProvider) hashMap.get(mo30927a);
            if (nameResolverProvider == null || nameResolverProvider.mo30929c() < next.mo30929c()) {
                hashMap.put(mo30927a, next);
            }
            if (i2 < next.mo30929c()) {
                i2 = next.mo30929c();
                str = next.mo30927a();
            }
        }
        this.f58256d = ImmutableMap.m11649b(hashMap);
        this.f58254b = str;
    }
}

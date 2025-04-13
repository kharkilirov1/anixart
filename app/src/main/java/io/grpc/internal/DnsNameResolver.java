package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import io.grpc.NameResolver;
import io.grpc.Status;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class DnsNameResolver extends NameResolver {

    /* renamed from: d */
    public static final Logger f58624d;

    /* renamed from: e */
    public static final Set<String> f58625e;

    /* renamed from: f */
    @VisibleForTesting
    public static boolean f58626f;

    /* renamed from: g */
    @VisibleForTesting
    public static boolean f58627g;

    /* renamed from: h */
    @VisibleForTesting
    public static boolean f58628h;

    /* renamed from: i */
    public static final ResourceResolverFactory f58629i;

    /* renamed from: a */
    public final String f58630a;

    /* renamed from: b */
    public final int f58631b;

    /* renamed from: c */
    public boolean f58632c;

    @VisibleForTesting
    public interface AddressResolver {
    }

    public static final class InternalResolutionResult {
    }

    public enum JdkAddressResolver implements AddressResolver {
        INSTANCE
    }

    public final class Resolve implements Runnable {

        /* renamed from: b */
        public final NameResolver.Listener2 f58635b;

        /* renamed from: c */
        public final /* synthetic */ DnsNameResolver f58636c;

        /* renamed from: io.grpc.internal.DnsNameResolver$Resolve$1 */
        public class RunnableC63881 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ boolean f58637b;

            /* renamed from: c */
            public final /* synthetic */ Resolve f58638c;

            @Override // java.lang.Runnable
            public void run() {
                if (this.f58637b) {
                    Objects.requireNonNull(this.f58638c.f58636c);
                }
                this.f58638c.f58636c.f58632c = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger logger = DnsNameResolver.f58624d;
            if (logger.isLoggable(Level.FINER)) {
                StringBuilder m24u = C0000a.m24u("Attempting DNS resolution of ");
                m24u.append(this.f58636c.f58630a);
                logger.finer(m24u.toString());
            }
            try {
                DnsNameResolver dnsNameResolver = this.f58636c;
                InetSocketAddress.createUnresolved(dnsNameResolver.f58630a, dnsNameResolver.f58631b);
                throw null;
            } catch (IOException e2) {
                this.f58635b.mo30926a(Status.f58287n.m30947g("Unable to resolve host " + this.f58636c.f58630a).m30946f(e2));
                Objects.requireNonNull(this.f58636c);
                throw null;
            }
        }
    }

    @VisibleForTesting
    public interface ResourceResolver {
    }

    public interface ResourceResolverFactory {
        @Nullable
        /* renamed from: a */
        Throwable mo31085a();
    }

    @VisibleForTesting
    public static final class SrvRecord {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SrvRecord.class != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{null, 0});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("host", null);
            m11166b.m11168b("port", 0);
            return m11166b.toString();
        }
    }

    static {
        ResourceResolverFactory resourceResolverFactory;
        Logger logger = Logger.getLogger(DnsNameResolver.class.getName());
        f58624d = logger;
        f58625e = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f58626f = Boolean.parseBoolean(property);
        f58627g = Boolean.parseBoolean(property2);
        f58628h = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    resourceResolverFactory = (ResourceResolverFactory) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, DnsNameResolver.class.getClassLoader()).asSubclass(ResourceResolverFactory.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    f58624d.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                f58624d.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            f58624d.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            f58624d.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        if (resourceResolverFactory.mo31085a() != null) {
            logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", resourceResolverFactory.mo31085a());
            resourceResolverFactory = null;
        }
        f58629i = resourceResolverFactory;
    }
}

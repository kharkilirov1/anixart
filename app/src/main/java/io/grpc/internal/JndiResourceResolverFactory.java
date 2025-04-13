package io.grpc.internal;

import android.annotation.SuppressLint;
import com.google.common.annotations.VisibleForTesting;
import io.grpc.internal.DnsNameResolver;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes3.dex */
final class JndiResourceResolverFactory implements DnsNameResolver.ResourceResolverFactory {

    /* renamed from: a */
    @Nullable
    public static final Throwable f58785a;

    @SuppressLint
    @IgnoreJRERequirement
    @VisibleForTesting
    public static final class JndiRecordFetcher implements RecordFetcher {
    }

    @VisibleForTesting
    public static final class JndiResourceResolver implements DnsNameResolver.ResourceResolver {

        /* renamed from: a */
        public static final Logger f58786a = Logger.getLogger(JndiResourceResolver.class.getName());

        static {
            Pattern.compile("\\s+");
        }
    }

    @VisibleForTesting
    public interface RecordFetcher {
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e2) {
            e = e2;
        } catch (Error e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
        f58785a = e;
    }

    @Override // io.grpc.internal.DnsNameResolver.ResourceResolverFactory
    @Nullable
    /* renamed from: a */
    public Throwable mo31085a() {
        return f58785a;
    }
}

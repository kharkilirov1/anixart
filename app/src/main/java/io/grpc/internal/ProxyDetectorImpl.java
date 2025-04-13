package io.grpc.internal;

import com.google.common.base.Supplier;
import io.grpc.ProxyDetector;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.util.Objects;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class ProxyDetectorImpl implements ProxyDetector {

    /* renamed from: d */
    public static final Logger f58949d = Logger.getLogger(ProxyDetectorImpl.class.getName());

    /* renamed from: e */
    public static final AuthenticationProvider f58950e = new AuthenticationProvider() { // from class: io.grpc.internal.ProxyDetectorImpl.1
    };

    /* renamed from: f */
    public static final Supplier<ProxySelector> f58951f = new Supplier<ProxySelector>() { // from class: io.grpc.internal.ProxyDetectorImpl.2
        @Override // com.google.common.base.Supplier
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    };

    /* renamed from: a */
    public final Supplier<ProxySelector> f58952a;

    /* renamed from: b */
    public final AuthenticationProvider f58953b;

    /* renamed from: c */
    public final InetSocketAddress f58954c;

    public interface AuthenticationProvider {
    }

    public ProxyDetectorImpl() {
        Supplier<ProxySelector> supplier = f58951f;
        AuthenticationProvider authenticationProvider = f58950e;
        String str = System.getenv("GRPC_PROXY_EXP");
        Objects.requireNonNull(supplier);
        this.f58952a = supplier;
        Objects.requireNonNull(authenticationProvider);
        this.f58953b = authenticationProvider;
        if (str == null) {
            this.f58954c = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f58949d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f58954c = new InetSocketAddress(split[0], parseInt);
    }
}

package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z60 implements InterfaceC4803ac {

    /* renamed from: b */
    @NotNull
    private final InterfaceC5088fq f57054b;

    /* renamed from: com.yandex.mobile.ads.impl.z60$a */
    public /* synthetic */ class C6109a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57055a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f57055a = iArr;
        }
    }

    public z60(@NotNull InterfaceC5088fq defaultDns) {
        Intrinsics.m32179h(defaultDns, "defaultDns");
        this.f57054b = defaultDns;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4803ac
    @Nullable
    /* renamed from: a */
    public final aw0 mo22455a(@Nullable dy0 dy0Var, @NotNull rw0 response) throws IOException {
        Proxy proxy;
        InetAddress address;
        PasswordAuthentication requestPasswordAuthentication;
        InetAddress address2;
        C6008x6 m23960a;
        InterfaceC5088fq m29669c;
        Intrinsics.m32179h(response, "response");
        List<C5125gh> m27996d = response.m27996d();
        aw0 m28008p = response.m28008p();
        t00 m22640h = m28008p.m22640h();
        boolean z = response.m27997e() == 407;
        if (dy0Var == null || (proxy = dy0Var.m23961b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C5125gh c5125gh : m27996d) {
            if (StringsKt.m33927y("Basic", c5125gh.m24893c(), true)) {
                InterfaceC5088fq interfaceC5088fq = (dy0Var == null || (m23960a = dy0Var.m23960a()) == null || (m29669c = m23960a.m29669c()) == null) ? this.f57054b : m29669c;
                if (z) {
                    SocketAddress address3 = proxy.address();
                    Intrinsics.m32177f(address3, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address3;
                    String hostName = inetSocketAddress.getHostName();
                    Proxy.Type type = proxy.type();
                    if ((type != null ? C6109a.f57055a[type.ordinal()] : -1) == 1) {
                        address2 = (InetAddress) CollectionsKt.m32044u(interfaceC5088fq.mo24227a(m22640h.m28392g()));
                    } else {
                        SocketAddress address4 = proxy.address();
                        Intrinsics.m32177f(address4, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address2 = ((InetSocketAddress) address4).getAddress();
                        Intrinsics.m32178g(address2, "address() as InetSocketAddress).address");
                    }
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, address2, inetSocketAddress.getPort(), m22640h.m28397l(), c5125gh.m24892b(), c5125gh.m24893c(), m22640h.m28399n(), Authenticator.RequestorType.PROXY);
                } else {
                    String m28392g = m22640h.m28392g();
                    Intrinsics.m32178g(proxy, "proxy");
                    Proxy.Type type2 = proxy.type();
                    if ((type2 != null ? C6109a.f57055a[type2.ordinal()] : -1) == 1) {
                        address = (InetAddress) CollectionsKt.m32044u(interfaceC5088fq.mo24227a(m22640h.m28392g()));
                    } else {
                        SocketAddress address5 = proxy.address();
                        Intrinsics.m32177f(address5, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address = ((InetSocketAddress) address5).getAddress();
                        Intrinsics.m32178g(address, "address() as InetSocketAddress).address");
                    }
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(m28392g, address, m22640h.m28394i(), m22640h.m28397l(), c5125gh.m24892b(), c5125gh.m24893c(), m22640h.m28399n(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    Intrinsics.m32178g(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    Intrinsics.m32178g(password, "auth.password");
                    return m28008p.m22639g().m22649b(str, C5595pl.m27337a(userName, new String(password), c5125gh.m24891a())).m22645a();
                }
            }
        }
        return null;
    }
}

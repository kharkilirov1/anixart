package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import com.yandex.mobile.ads.impl.t00;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x6 */
/* loaded from: classes3.dex */
public final class C6008x6 {

    /* renamed from: a */
    @NotNull
    private final InterfaceC5088fq f56372a;

    /* renamed from: b */
    @NotNull
    private final SocketFactory f56373b;

    /* renamed from: c */
    @Nullable
    private final SSLSocketFactory f56374c;

    /* renamed from: d */
    @Nullable
    private final HostnameVerifier f56375d;

    /* renamed from: e */
    @Nullable
    private final C5079fh f56376e;

    /* renamed from: f */
    @NotNull
    private final InterfaceC4803ac f56377f;

    /* renamed from: g */
    @Nullable
    private final Proxy f56378g;

    /* renamed from: h */
    @NotNull
    private final ProxySelector f56379h;

    /* renamed from: i */
    @NotNull
    private final t00 f56380i;

    /* renamed from: j */
    @NotNull
    private final List<bt0> f56381j;

    /* renamed from: k */
    @NotNull
    private final List<C5189hk> f56382k;

    public C6008x6(@NotNull String uriHost, int i2, @NotNull InterfaceC5088fq dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable ln0 ln0Var, @Nullable C5079fh c5079fh, @NotNull InterfaceC4803ac proxyAuthenticator, @NotNull List protocols, @NotNull List connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.m32179h(uriHost, "uriHost");
        Intrinsics.m32179h(dns, "dns");
        Intrinsics.m32179h(socketFactory, "socketFactory");
        Intrinsics.m32179h(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.m32179h(protocols, "protocols");
        Intrinsics.m32179h(connectionSpecs, "connectionSpecs");
        Intrinsics.m32179h(proxySelector, "proxySelector");
        this.f56372a = dns;
        this.f56373b = socketFactory;
        this.f56374c = sSLSocketFactory;
        this.f56375d = ln0Var;
        this.f56376e = c5079fh;
        this.f56377f = proxyAuthenticator;
        this.f56378g = null;
        this.f56379h = proxySelector;
        this.f56380i = new t00.C5776a().m28408c(sSLSocketFactory != null ? "https" : "http").m28404b(uriHost).m28400a(i2).m28402a();
        this.f56381j = t91.m28526b(protocols);
        this.f56382k = t91.m28526b(connectionSpecs);
    }

    @JvmName
    @Nullable
    /* renamed from: a */
    public final C5079fh m29666a() {
        return this.f56376e;
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public final List<C5189hk> m29668b() {
        return this.f56382k;
    }

    @JvmName
    @NotNull
    /* renamed from: c */
    public final InterfaceC5088fq m29669c() {
        return this.f56372a;
    }

    @JvmName
    @Nullable
    /* renamed from: d */
    public final HostnameVerifier m29670d() {
        return this.f56375d;
    }

    @JvmName
    @NotNull
    /* renamed from: e */
    public final List<bt0> m29671e() {
        return this.f56381j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C6008x6) {
            C6008x6 c6008x6 = (C6008x6) obj;
            if (Intrinsics.m32174c(this.f56380i, c6008x6.f56380i) && m29667a(c6008x6)) {
                return true;
            }
        }
        return false;
    }

    @JvmName
    @Nullable
    /* renamed from: f */
    public final Proxy m29672f() {
        return this.f56378g;
    }

    @JvmName
    @NotNull
    /* renamed from: g */
    public final InterfaceC4803ac m29673g() {
        return this.f56377f;
    }

    @JvmName
    @NotNull
    /* renamed from: h */
    public final ProxySelector m29674h() {
        return this.f56379h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f56376e) + ((Objects.hashCode(this.f56375d) + ((Objects.hashCode(this.f56374c) + ((Objects.hashCode(this.f56378g) + ((this.f56379h.hashCode() + ((this.f56382k.hashCode() + ((this.f56381j.hashCode() + ((this.f56377f.hashCode() + ((this.f56372a.hashCode() + ((this.f56380i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @JvmName
    @NotNull
    /* renamed from: i */
    public final SocketFactory m29675i() {
        return this.f56373b;
    }

    @JvmName
    @Nullable
    /* renamed from: j */
    public final SSLSocketFactory m29676j() {
        return this.f56374c;
    }

    @JvmName
    @NotNull
    /* renamed from: k */
    public final t00 m29677k() {
        return this.f56380i;
    }

    @NotNull
    public final String toString() {
        String sb;
        StringBuilder m26356a = l60.m26356a("Address{");
        m26356a.append(this.f56380i.m28392g());
        m26356a.append(':');
        m26356a.append(this.f56380i.m28394i());
        m26356a.append(", ");
        if (this.f56378g != null) {
            StringBuilder m26356a2 = l60.m26356a("proxy=");
            m26356a2.append(this.f56378g);
            sb = m26356a2.toString();
        } else {
            StringBuilder m26356a3 = l60.m26356a("proxySelector=");
            m26356a3.append(this.f56379h);
            sb = m26356a3.toString();
        }
        return C0576a.m4118q(m26356a, sb, '}');
    }

    /* renamed from: a */
    public final boolean m29667a(@NotNull C6008x6 that) {
        Intrinsics.m32179h(that, "that");
        return Intrinsics.m32174c(this.f56372a, that.f56372a) && Intrinsics.m32174c(this.f56377f, that.f56377f) && Intrinsics.m32174c(this.f56381j, that.f56381j) && Intrinsics.m32174c(this.f56382k, that.f56382k) && Intrinsics.m32174c(this.f56379h, that.f56379h) && Intrinsics.m32174c(this.f56378g, that.f56378g) && Intrinsics.m32174c(this.f56374c, that.f56374c) && Intrinsics.m32174c(this.f56375d, that.f56375d) && Intrinsics.m32174c(this.f56376e, that.f56376e) && this.f56380i.m28394i() == that.f56380i.m28394i();
    }
}

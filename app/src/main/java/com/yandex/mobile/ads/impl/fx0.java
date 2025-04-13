package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aw0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fx0 implements j60 {

    /* renamed from: a */
    @NotNull
    private final mn0 f50449a;

    public fx0(@NotNull mn0 client) {
        Intrinsics.m32179h(client, "client");
        this.f50449a = client;
    }

    @Override // com.yandex.mobile.ads.impl.j60
    @NotNull
    /* renamed from: a */
    public final rw0 mo24184a(@NotNull pu0 chain) throws IOException {
        C6037xr m25971g;
        aw0 m24751a;
        Intrinsics.m32179h(chain, "chain");
        aw0 m27502f = chain.m27502f();
        ju0 m27498b = chain.m27498b();
        List list = EmptyList.f63144b;
        rw0 rw0Var = null;
        boolean z = true;
        int i2 = 0;
        while (true) {
            m27498b.m25960a(m27502f, z);
            try {
                if (m27498b.m25974j()) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        rw0 m27497a = chain.m27497a(m27502f);
                        if (rw0Var != null) {
                            m27497a = m27497a.m28004l().m28027c(rw0Var.m28004l().m28018a((vw0) null).m28019a()).m28019a();
                        }
                        rw0Var = m27497a;
                        m25971g = m27498b.m25971g();
                        m24751a = m24751a(rw0Var, m25971g);
                    } catch (IOException e2) {
                        if (!m24752a(e2, m27498b, m27502f, !(e2 instanceof C5131gk))) {
                            throw t91.m28500a(e2, list);
                        }
                        list = CollectionsKt.m32003P(list, e2);
                        m27498b.m25963a(true);
                        z = false;
                    }
                } catch (fy0 e3) {
                    if (!m24752a(e3.m24757b(), m27498b, m27502f, false)) {
                        throw t91.m28500a(e3.m24755a(), list);
                    }
                    list = CollectionsKt.m32003P(list, e3.m24755a());
                    m27498b.m25963a(true);
                    z = false;
                }
                if (m24751a == null) {
                    if (m25971g != null && m25971g.m29798j()) {
                        m27498b.m25978n();
                    }
                    m27498b.m25963a(false);
                    return rw0Var;
                }
                vw0 m27993a = rw0Var.m27993a();
                if (m27993a != null) {
                    t91.m28509a(m27993a);
                }
                i2++;
                if (i2 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i2);
                }
                m27498b.m25963a(true);
                m27502f = m24751a;
                z = true;
            } catch (Throwable th) {
                m27498b.m25963a(true);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final boolean m24752a(IOException iOException, ju0 ju0Var, aw0 aw0Var, boolean z) {
        if (!this.f50449a.m26719v()) {
            return false;
        }
        if (z && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        return (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) && ju0Var.m25977m();
    }

    /* renamed from: a */
    private final aw0 m24751a(rw0 rw0Var, C6037xr c6037xr) throws IOException {
        String m27992a;
        t00 m28386b;
        ku0 m29794f;
        dy0 m26280k = (c6037xr == null || (m29794f = c6037xr.m29794f()) == null) ? null : m29794f.m26280k();
        int m27997e = rw0Var.m27997e();
        String m22638f = rw0Var.m28008p().m22638f();
        if (m27997e != 307 && m27997e != 308) {
            if (m27997e == 401) {
                return this.f50449a.m26700c().mo22455a(m26280k, rw0Var);
            }
            if (m27997e == 421) {
                Objects.requireNonNull(rw0Var.m28008p());
                if (c6037xr == null || !c6037xr.m29797i()) {
                    return null;
                }
                c6037xr.m29794f().m26278i();
                return rw0Var.m28008p();
            }
            int i2 = Integer.MAX_VALUE;
            if (m27997e == 503) {
                rw0 m28005m = rw0Var.m28005m();
                if (m28005m != null && m28005m.m27997e() == 503) {
                    return null;
                }
                String m27992a2 = rw0.m27992a(rw0Var, "Retry-After");
                if (m27992a2 != null && new Regex("\\d+").m33872d(m27992a2)) {
                    Integer valueOf = Integer.valueOf(m27992a2);
                    Intrinsics.m32178g(valueOf, "valueOf(header)");
                    i2 = valueOf.intValue();
                }
                if (i2 == 0) {
                    return rw0Var.m28008p();
                }
                return null;
            }
            if (m27997e == 407) {
                Intrinsics.m32176e(m26280k);
                if (m26280k.m23961b().type() == Proxy.Type.HTTP) {
                    return this.f50449a.m26716s().mo22455a(m26280k, rw0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (m27997e == 408) {
                if (!this.f50449a.m26719v()) {
                    return null;
                }
                Objects.requireNonNull(rw0Var.m28008p());
                rw0 m28005m2 = rw0Var.m28005m();
                if (m28005m2 != null && m28005m2.m27997e() == 408) {
                    return null;
                }
                String m27992a3 = rw0.m27992a(rw0Var, "Retry-After");
                if (m27992a3 != null) {
                    if (new Regex("\\d+").m33872d(m27992a3)) {
                        Integer valueOf2 = Integer.valueOf(m27992a3);
                        Intrinsics.m32178g(valueOf2, "valueOf(header)");
                        r4 = valueOf2.intValue();
                    } else {
                        r4 = Integer.MAX_VALUE;
                    }
                }
                if (r4 > 0) {
                    return null;
                }
                return rw0Var.m28008p();
            }
            switch (m27997e) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f50449a.m26709l() || (m27992a = rw0.m27992a(rw0Var, "Location")) == null || (m28386b = rw0Var.m28008p().m22640h().m28386b(m27992a)) == null) {
            return null;
        }
        if (!Intrinsics.m32174c(m28386b.m28397l(), rw0Var.m28008p().m22640h().m28397l()) && !this.f50449a.m26710m()) {
            return null;
        }
        aw0.C4827a m22639g = rw0Var.m28008p().m22639g();
        if (n00.m26783a(m22638f)) {
            int m27997e2 = rw0Var.m27997e();
            r4 = (n00.m26785c(m22638f) || m27997e2 == 308 || m27997e2 == 307) ? 1 : 0;
            if (n00.m26784b(m22638f) && m27997e2 != 308 && m27997e2 != 307) {
                m22639g.m22643a("GET", (dw0) null);
            } else {
                m22639g.m22643a(m22638f, r4 != 0 ? rw0Var.m28008p().m22632a() : null);
            }
            if (r4 == 0) {
                m22639g.m22647a("Transfer-Encoding");
                m22639g.m22647a("Content-Length");
                m22639g.m22647a("Content-Type");
            }
        }
        if (!t91.m28513a(rw0Var.m28008p().m22640h(), m28386b)) {
            m22639g.m22647a("Authorization");
        }
        return m22639g.m22642a(m28386b).m22645a();
    }
}

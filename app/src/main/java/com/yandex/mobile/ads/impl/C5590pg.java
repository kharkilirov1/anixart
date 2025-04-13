package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rw0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.BufferedSink;
import okio.Okio;
import okio.RealBufferedSink;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.pg */
/* loaded from: classes3.dex */
public final class C5590pg implements j60 {

    /* renamed from: a */
    private final boolean f53558a;

    public C5590pg(boolean z) {
        this.f53558a = z;
    }

    @Override // com.yandex.mobile.ads.impl.j60
    @NotNull
    /* renamed from: a */
    public final rw0 mo24184a(@NotNull pu0 chain) throws IOException {
        boolean z;
        rw0.C5716a c5716a;
        Intrinsics.m32179h(chain, "chain");
        C6037xr m27500d = chain.m27500d();
        Intrinsics.m32176e(m27500d);
        aw0 m27502f = chain.m27502f();
        dw0 m22632a = m27502f.m22632a();
        long currentTimeMillis = System.currentTimeMillis();
        m27500d.m29789b(m27502f);
        if (!n00.m26783a(m27502f.m22638f()) || m22632a == null) {
            m27500d.m29800l();
            z = true;
            c5716a = null;
        } else {
            if (StringsKt.m33927y("100-continue", m27502f.m22633a("Expect"), true)) {
                m27500d.m29792d();
                c5716a = m27500d.m29784a(true);
                m27500d.m29801m();
                z = false;
            } else {
                z = true;
                c5716a = null;
            }
            if (c5716a == null) {
                BufferedSink m34601c = Okio.m34601c(m27500d.m29786a(m27502f));
                m22632a.mo23538a(m34601c);
                ((RealBufferedSink) m34601c).close();
            } else {
                m27500d.m29800l();
                if (!m27500d.m29794f().m26277h()) {
                    m27500d.m29799k();
                }
            }
        }
        m27500d.m29791c();
        if (c5716a == null) {
            c5716a = m27500d.m29784a(false);
            Intrinsics.m32176e(c5716a);
            if (z) {
                m27500d.m29801m();
                z = false;
            }
        }
        rw0 m28019a = c5716a.m28013a(m27502f).m28015a(m27500d.m29794f().m26275f()).m28023b(currentTimeMillis).m28012a(System.currentTimeMillis()).m28019a();
        int m27997e = m28019a.m27997e();
        if (m27997e == 100) {
            rw0.C5716a m29784a = m27500d.m29784a(false);
            Intrinsics.m32176e(m29784a);
            if (z) {
                m27500d.m29801m();
            }
            m28019a = m29784a.m28013a(m27502f).m28015a(m27500d.m29794f().m26275f()).m28023b(currentTimeMillis).m28012a(System.currentTimeMillis()).m28019a();
            m27997e = m28019a.m27997e();
        }
        m27500d.m29790b(m28019a);
        rw0 m28019a2 = (this.f53558a && m27997e == 101) ? m28019a.m28004l().m28018a(t91.f54981c).m28019a() : m28019a.m28004l().m28018a(m27500d.m29783a(m28019a)).m28019a();
        if (StringsKt.m33927y("close", m28019a2.m28008p().m22633a("Connection"), true) || StringsKt.m33927y("close", rw0.m27992a(m28019a2, "Connection"), true)) {
            m27500d.m29799k();
        }
        if (m27997e == 204 || m27997e == 205) {
            vw0 m27993a = m28019a2.m27993a();
            if ((m27993a != null ? m27993a.mo27787b() : -1L) > 0) {
                StringBuilder m25v = C0000a.m25v("HTTP ", m27997e, " had non-zero Content-Length: ");
                vw0 m27993a2 = m28019a2.m27993a();
                m25v.append(m27993a2 != null ? Long.valueOf(m27993a2.mo27787b()) : null);
                throw new ProtocolException(m25v.toString());
            }
        }
        return m28019a2;
    }
}

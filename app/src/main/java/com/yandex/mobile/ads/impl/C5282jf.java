package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.rw0;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jf */
/* loaded from: classes3.dex */
public final class C5282jf implements j60 {

    /* renamed from: a */
    @NotNull
    private final InterfaceC4875bl f51589a;

    public C5282jf(@NotNull InterfaceC4875bl cookieJar) {
        Intrinsics.m32179h(cookieJar, "cookieJar");
        this.f51589a = cookieJar;
    }

    @Override // com.yandex.mobile.ads.impl.j60
    @NotNull
    /* renamed from: a */
    public final rw0 mo24184a(@NotNull pu0 chain) throws IOException {
        boolean z;
        vw0 m27993a;
        String m28502a;
        Intrinsics.m32179h(chain, "chain");
        aw0 m27505i = chain.m27505i();
        aw0.C4827a m22639g = m27505i.m22639g();
        dw0 m22632a = m27505i.m22632a();
        if (m22632a != null) {
            hc0 mo23539b = m22632a.mo23539b();
            if (mo23539b != null) {
                m22639g.m22649b("Content-Type", mo23539b.toString());
            }
            long mo23537a = m22632a.mo23537a();
            if (mo23537a != -1) {
                m22639g.m22649b("Content-Length", String.valueOf(mo23537a));
                m22639g.m22647a("Transfer-Encoding");
            } else {
                m22639g.m22649b("Transfer-Encoding", "chunked");
                m22639g.m22647a("Content-Length");
            }
        }
        if (m27505i.m22633a("Host") == null) {
            m28502a = t91.m28502a(m27505i.m22640h(), false);
            m22639g.m22649b("Host", m28502a);
        }
        if (m27505i.m22633a("Connection") == null) {
            m22639g.m22649b("Connection", "Keep-Alive");
        }
        int i2 = 0;
        if (m27505i.m22633a("Accept-Encoding") == null && m27505i.m22633a("Range") == null) {
            m22639g.m22649b("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C6127zk> mo22539a = this.f51589a.mo22539a(m27505i.m22640h());
        if (!mo22539a.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : mo22539a) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.m32023h0();
                    throw null;
                }
                C6127zk c6127zk = (C6127zk) obj;
                if (i2 > 0) {
                    sb.append("; ");
                }
                sb.append(c6127zk.m30202e());
                sb.append('=');
                sb.append(c6127zk.m30203f());
                i2 = i3;
            }
            String sb2 = sb.toString();
            Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
            m22639g.m22649b("Cookie", sb2);
        }
        if (m27505i.m22633a("User-Agent") == null) {
            m22639g.m22649b("User-Agent", "okhttp/4.9.3");
        }
        rw0 m27497a = chain.m27497a(m22639g.m22645a());
        m00.m26550a(this.f51589a, m27505i.m22640h(), m27497a.m28000h());
        rw0.C5716a m28013a = m27497a.m28004l().m28013a(m27505i);
        if (z && StringsKt.m33927y("gzip", rw0.m27992a(m27497a, "Content-Encoding"), true) && m00.m26552a(m27497a) && (m27993a = m27497a.m27993a()) != null) {
            GzipSource gzipSource = new GzipSource(m27993a.mo27789d());
            m28013a.m28016a(m27497a.m28000h().m25382b().m25389b("Content-Encoding").m25389b("Content-Length").m25386a());
            m28013a.m28018a(new qu0(rw0.m27992a(m27497a, "Content-Type"), -1L, Okio.m34602d(gzipSource)));
        }
        return m28013a.m28019a();
    }
}

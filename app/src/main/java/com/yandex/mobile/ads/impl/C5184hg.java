package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5204hy;
import com.yandex.mobile.ads.impl.C5336kg;
import com.yandex.mobile.ads.impl.rw0;
import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.hg */
/* loaded from: classes3.dex */
public final class C5184hg implements j60 {
    static {
        new a(0);
    }

    @Override // com.yandex.mobile.ads.impl.j60
    @NotNull
    /* renamed from: a */
    public final rw0 mo24184a(@NotNull pu0 chain) throws IOException {
        AbstractC5814tr abstractC5814tr;
        Intrinsics.m32179h(chain, "chain");
        ju0 m27496a = chain.m27496a();
        C5336kg m26122a = new C5336kg.b(System.currentTimeMillis(), chain.m27505i()).m26122a();
        aw0 m26120b = m26122a.m26120b();
        rw0 m26119a = m26122a.m26119a();
        ju0 ju0Var = m27496a instanceof ju0 ? m27496a : null;
        if (ju0Var == null || (abstractC5814tr = ju0Var.m25969e()) == null) {
            abstractC5814tr = AbstractC5814tr.f55192a;
        }
        if (m26120b == null && m26119a == null) {
            rw0 m28019a = new rw0.C5716a().m28013a(chain.m27505i()).m28014a(bt0.f48974c).m28011a(504).m28025b("Unsatisfiable Request (only-if-cached)").m28018a(t91.f54981c).m28023b(-1L).m28012a(System.currentTimeMillis()).m28019a();
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28721c(m27496a, m28019a);
            return m28019a;
        }
        if (m26120b == null) {
            Intrinsics.m32176e(m26119a);
            rw0 m28019a2 = m26119a.m28004l().m28017a(a.m25191a(m26119a)).m28019a();
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28718b(m27496a, m28019a2);
            return m28019a2;
        }
        if (m26119a != null) {
            Objects.requireNonNull(abstractC5814tr);
            AbstractC5814tr.m28708a((InterfaceC5537og) m27496a, m26119a);
        }
        rw0 m27497a = chain.m27497a(m26120b);
        if (m26119a != null) {
            if (m27497a.m27997e() == 304) {
                m26119a.m28004l().m28016a(a.m25190a(m26119a.m28000h(), m27497a.m28000h())).m28023b(m27497a.m28009q()).m28012a(m27497a.m28007o()).m28017a(a.m25191a(m26119a)).m28024b(a.m25191a(m27497a)).m28019a();
                vw0 m27993a = m27497a.m27993a();
                Intrinsics.m32176e(m27993a);
                m27993a.close();
                Intrinsics.m32176e(null);
                throw null;
            }
            vw0 m27993a2 = m26119a.m27993a();
            if (m27993a2 != null) {
                t91.m28509a(m27993a2);
            }
        }
        Intrinsics.m32176e(m27497a);
        return m27497a.m28004l().m28017a(a.m25191a(m26119a)).m28024b(a.m25191a(m27497a)).m28019a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.hg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i2) {
            this();
        }

        /* renamed from: a */
        public static final rw0 m25191a(rw0 rw0Var) {
            if ((rw0Var != null ? rw0Var.m27993a() : null) == null) {
                return rw0Var;
            }
            Objects.requireNonNull(rw0Var);
            return new rw0.C5716a(rw0Var).m28018a((vw0) null).m28019a();
        }

        /* renamed from: a */
        public static final C5204hy m25190a(C5204hy c5204hy, C5204hy c5204hy2) {
            C5204hy.a aVar = new C5204hy.a();
            int size = c5204hy.size();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= size) {
                    break;
                }
                String m25380a = c5204hy.m25380a(i2);
                String m25383b = c5204hy.m25383b(i2);
                if (!StringsKt.m33927y("Warning", m25380a, true) || !StringsKt.m33898X(m25383b, "1", false, 2, null)) {
                    if (!StringsKt.m33927y("Content-Length", m25380a, true) && !StringsKt.m33927y("Content-Encoding", m25380a, true) && !StringsKt.m33927y("Content-Type", m25380a, true)) {
                        z = false;
                    }
                    if (z || !m25192a(m25380a) || c5204hy2.m25381a(m25380a) == null) {
                        aVar.m25391b(m25380a, m25383b);
                    }
                }
                i2++;
            }
            int size2 = c5204hy2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String m25380a2 = c5204hy2.m25380a(i3);
                if (!(StringsKt.m33927y("Content-Length", m25380a2, true) || StringsKt.m33927y("Content-Encoding", m25380a2, true) || StringsKt.m33927y("Content-Type", m25380a2, true)) && m25192a(m25380a2)) {
                    aVar.m25391b(m25380a2, c5204hy2.m25383b(i3));
                }
            }
            return aVar.m25386a();
        }

        /* renamed from: a */
        private static boolean m25192a(String str) {
            return (StringsKt.m33927y("Connection", str, true) || StringsKt.m33927y("Keep-Alive", str, true) || StringsKt.m33927y("Proxy-Authenticate", str, true) || StringsKt.m33927y("Proxy-Authorization", str, true) || StringsKt.m33927y("TE", str, true) || StringsKt.m33927y("Trailers", str, true) || StringsKt.m33927y("Transfer-Encoding", str, true) || StringsKt.m33927y("Upgrade", str, true)) ? false : true;
        }
    }
}

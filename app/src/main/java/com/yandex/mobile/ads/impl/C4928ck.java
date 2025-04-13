package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.cz0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ck */
/* loaded from: classes3.dex */
final class C4928ck implements InterfaceC4872bk {

    /* renamed from: c */
    @NotNull
    private static final a f49287c = new a(0);

    /* renamed from: d */
    @Deprecated
    @NotNull
    private static final Object f49288d = new Object();

    /* renamed from: b */
    @NotNull
    private final p80 f49289b;

    /* renamed from: com.yandex.mobile.ads.impl.ck$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i2) {
            this();
        }

        /* renamed from: a */
        public static final Boolean m23295a(a aVar, p80 p80Var, String str) {
            if (!p80Var.contains(str)) {
                p80Var = null;
            }
            if (p80Var != null) {
                return Boolean.valueOf(p80Var.getBoolean(str, false));
            }
            return null;
        }

        /* renamed from: b */
        public static final Integer m23299b(a aVar, p80 p80Var, String str) {
            if (!p80Var.contains(str)) {
                p80Var = null;
            }
            if (p80Var != null) {
                return Integer.valueOf(p80Var.mo27189b(0, str));
            }
            return null;
        }

        /* renamed from: c */
        public static final Long m23300c(a aVar, p80 p80Var, String str) {
            if (!p80Var.contains(str)) {
                p80Var = null;
            }
            if (p80Var != null) {
                return Long.valueOf(p80Var.mo27184a(str));
            }
            return null;
        }

        /* renamed from: a */
        public static final void m23296a(a aVar, p80 p80Var, String str, Boolean bool) {
            if (bool != null) {
                p80Var.putBoolean(str, bool.booleanValue());
            } else {
                p80Var.remove(str);
            }
        }

        /* renamed from: a */
        public static final void m23297a(a aVar, p80 p80Var, String str, Integer num) {
            if (num != null) {
                p80Var.mo27186a(num.intValue(), str);
            } else {
                p80Var.remove(str);
            }
        }

        /* renamed from: a */
        public static final void m23298a(a aVar, p80 p80Var, String str, Long l2) {
            if (l2 != null) {
                p80Var.putLong(str, l2.longValue());
            } else {
                p80Var.remove(str);
            }
        }
    }

    public C4928ck(@NotNull p80 localStorage) {
        Intrinsics.m32179h(localStorage, "localStorage");
        this.f49289b = localStorage;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4872bk
    @Nullable
    /* renamed from: a */
    public final cz0 mo22849a() {
        cz0 cz0Var;
        synchronized (f49288d) {
            long mo27184a = this.f49289b.mo27184a(C4974dk.m23897a(1));
            a aVar = f49287c;
            Boolean m23295a = a.m23295a(aVar, this.f49289b, C4974dk.m23897a(8));
            if (mo27184a != 0) {
                Integer m23299b = a.m23299b(aVar, this.f49289b, C4974dk.m23897a(21));
                Integer m23299b2 = a.m23299b(aVar, this.f49289b, C4974dk.m23897a(22));
                Long m23300c = a.m23300c(aVar, this.f49289b, C4974dk.m23897a(6));
                boolean z = this.f49289b.getBoolean(C4974dk.m23897a(7), false);
                int mo27189b = this.f49289b.mo27189b(0, C4974dk.m23897a(5));
                int mo27189b2 = this.f49289b.mo27189b(0, C4974dk.m23897a(31));
                Boolean m23295a2 = a.m23295a(aVar, this.f49289b, C4974dk.m23897a(10));
                boolean z2 = this.f49289b.getBoolean(C4974dk.m23897a(12), false);
                boolean z3 = this.f49289b.getBoolean(C4974dk.m23897a(13), false);
                boolean z4 = this.f49289b.getBoolean(C4974dk.m23897a(14), false);
                boolean z5 = this.f49289b.getBoolean(C4974dk.m23897a(15), false);
                Boolean m23295a3 = a.m23295a(aVar, this.f49289b, C4974dk.m23897a(16));
                String mo27190b = this.f49289b.mo27190b(C4974dk.m23897a(9));
                String mo27190b2 = this.f49289b.mo27190b(C4974dk.m23897a(46));
                String mo27190b3 = this.f49289b.mo27190b(C4974dk.m23897a(47));
                String mo27190b4 = this.f49289b.mo27190b(C4974dk.m23897a(43));
                String mo27190b5 = this.f49289b.mo27190b(C4974dk.m23897a(2));
                String mo27190b6 = this.f49289b.mo27190b(C4974dk.m23897a(3));
                boolean z6 = this.f49289b.getBoolean(C4974dk.m23897a(4), false);
                boolean z7 = this.f49289b.getBoolean(C4974dk.m23897a(11), false);
                boolean z8 = this.f49289b.getBoolean(C4974dk.m23897a(44), false);
                boolean z9 = this.f49289b.getBoolean(C4974dk.m23897a(18), false);
                boolean z10 = this.f49289b.getBoolean(C4974dk.m23897a(17), false);
                boolean z11 = this.f49289b.getBoolean(C4974dk.m23897a(19), false);
                boolean z12 = this.f49289b.getBoolean(C4974dk.m23897a(20), false);
                boolean z13 = this.f49289b.getBoolean(C4974dk.m23897a(25), false);
                boolean z14 = this.f49289b.getBoolean(C4974dk.m23897a(26), false);
                boolean z15 = this.f49289b.getBoolean(C4974dk.m23897a(23), false);
                boolean z16 = this.f49289b.getBoolean(C4974dk.m23897a(24), false);
                boolean z17 = this.f49289b.getBoolean(C4974dk.m23897a(28), false);
                boolean z18 = this.f49289b.getBoolean(C4974dk.m23897a(29), false);
                boolean z19 = this.f49289b.getBoolean(C4974dk.m23897a(39), false);
                boolean z20 = this.f49289b.getBoolean(C4974dk.m23897a(30), false);
                BiddingSettings m27908a = C5685re.m27908a(this.f49289b);
                String mo27190b7 = this.f49289b.mo27190b(C4974dk.m23897a(32));
                String mo27190b8 = this.f49289b.mo27190b(C4974dk.m23897a(27));
                Integer m23299b3 = a.m23299b(aVar, this.f49289b, C4974dk.m23897a(33));
                boolean z21 = this.f49289b.getBoolean(C4974dk.m23897a(34), false);
                boolean z22 = this.f49289b.getBoolean(C4974dk.m23897a(35), false);
                boolean z23 = this.f49289b.getBoolean(C4974dk.m23897a(37), false);
                boolean z24 = this.f49289b.getBoolean(C4974dk.m23897a(38), false);
                boolean z25 = this.f49289b.getBoolean(C4974dk.m23897a(40), false);
                boolean z26 = this.f49289b.getBoolean(C4974dk.m23897a(36), false);
                boolean z27 = this.f49289b.getBoolean(C4974dk.m23897a(41), false);
                boolean z28 = this.f49289b.getBoolean(C4974dk.m23897a(42), false);
                boolean z29 = this.f49289b.getBoolean(C4974dk.m23897a(48), false);
                Boolean m23295a4 = a.m23295a(aVar, this.f49289b, C4974dk.m23897a(45));
                boolean z30 = this.f49289b.getBoolean(C4974dk.m23897a(49), false);
                boolean z31 = this.f49289b.getBoolean(C4974dk.m23897a(50), false);
                boolean z32 = this.f49289b.getBoolean(C4974dk.m23897a(51), false);
                boolean z33 = this.f49289b.getBoolean(C4974dk.m23897a(52), false);
                Long m23300c2 = a.m23300c(aVar, this.f49289b, C4974dk.m23897a(53));
                long longValue = m23300c2 != null ? m23300c2.longValue() : 0L;
                Long m23300c3 = a.m23300c(aVar, this.f49289b, C4974dk.m23897a(54));
                long longValue2 = m23300c3 != null ? m23300c3.longValue() : 0L;
                cz0.C4946a m23712i = new cz0.C4946a().m23710h(mo27190b).m23698c(m23295a3).m23682a(mo27184a).m23686a(m23299b).m23694b(m23299b2).m23687a(m23300c).m23689a(z).m23681a(mo27189b).m23691b(mo27189b2).m23693b(m23295a2).m23709g(z2).m23716l(z3).m23725u(z4).m23696b(z5).m23675B(z7).m23717m(z8).m23706f(mo27190b5).m23708g(mo27190b6).m23707f(z6).m23701d(m23295a).m23721q(z9).m23722r(z10).m23729y(z11).m23730z(z12).m23677D(z13).m23676C(z14).m23718n(z15).m23703d(z26).m23720p(z16).m23704e(mo27190b8).m23714j(z17).m23683a(m27908a).m23705e(z21).m23719o(z22).m23711h(z23).m23726v(z20).m23680G(z24).m23728x(z18).m23724t(z19).m23685a(m23295a4).m23723s(z25).m23713i(z27).m23688a(mo27190b2).m23702d(mo27190b3).m23674A(z28).m23699c(mo27190b4).m23700c(z29).m23715k(z30).m23727w(z31).m23679F(z32).m23678E(z33).m23692b(longValue).m23697c(longValue2).m23695b(this.f49289b.mo27190b(C4974dk.m23897a(55))).m23712i(this.f49289b.mo27190b(C4974dk.m23897a(56)));
                Intrinsics.m32178g(m23712i, "Builder()\n              …upVersion(startupVersion)");
                if (mo27190b7 != null && m23299b3 != null) {
                    m23712i.m23684a(new C5353kr(m23299b3.intValue(), mo27190b7));
                }
                cz0Var = m23712i.m23690a();
            } else {
                cz0Var = null;
            }
        }
        return cz0Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4872bk
    /* renamed from: a */
    public final void mo22850a(@NotNull cz0 sdkConfiguration) {
        Intrinsics.m32179h(sdkConfiguration, "sdkConfiguration");
        synchronized (f49288d) {
            this.f49289b.putString(C4974dk.m23897a(9), sdkConfiguration.m23609r());
            this.f49289b.putString(C4974dk.m23897a(43), sdkConfiguration.m23598g());
            this.f49289b.putBoolean(C4974dk.m23897a(11), sdkConfiguration.m23584W());
            this.f49289b.putBoolean(C4974dk.m23897a(44), sdkConfiguration.m23568G());
            this.f49289b.putLong(C4974dk.m23897a(1), sdkConfiguration.m23601j());
            this.f49289b.putString(C4974dk.m23897a(2), sdkConfiguration.m23605n());
            this.f49289b.putString(C4974dk.m23897a(3), sdkConfiguration.m23607p());
            this.f49289b.putString(C4974dk.m23897a(27), sdkConfiguration.m23604m());
            this.f49289b.putBoolean(C4974dk.m23897a(4), sdkConfiguration.m23617z());
            this.f49289b.putBoolean(C4974dk.m23897a(25), sdkConfiguration.m23595d0());
            this.f49289b.putBoolean(C4974dk.m23897a(26), sdkConfiguration.m23593c0());
            this.f49289b.mo27186a(sdkConfiguration.m23592c(), C4974dk.m23897a(5));
            this.f49289b.putBoolean(C4974dk.m23897a(23), sdkConfiguration.m23569H());
            this.f49289b.putBoolean(C4974dk.m23897a(24), sdkConfiguration.m23571J());
            this.f49289b.putBoolean(C4974dk.m23897a(34), sdkConfiguration.m23616y());
            this.f49289b.putBoolean(C4974dk.m23897a(35), sdkConfiguration.m23570I());
            this.f49289b.putBoolean(C4974dk.m23897a(37), sdkConfiguration.m23563B());
            this.f49289b.putBoolean(C4974dk.m23897a(36), sdkConfiguration.m23615x());
            this.f49289b.putBoolean(C4974dk.m23897a(38), sdkConfiguration.m23587Z());
            this.f49289b.putBoolean(C4974dk.m23897a(39), sdkConfiguration.m23575N());
            this.f49289b.putBoolean(C4974dk.m23897a(40), sdkConfiguration.m23574M());
            this.f49289b.putBoolean(C4974dk.m23897a(41), sdkConfiguration.m23564C());
            this.f49289b.putBoolean(C4974dk.m23897a(42), sdkConfiguration.m23583V());
            this.f49289b.mo27186a(sdkConfiguration.m23606o(), C4974dk.m23897a(31));
            this.f49289b.putString(C4974dk.m23897a(46), sdkConfiguration.m23590b());
            this.f49289b.putString(C4974dk.m23897a(47), sdkConfiguration.m23599h());
            this.f49289b.putString(C4974dk.m23897a(55), sdkConfiguration.m23596e());
            Long m23588a = sdkConfiguration.m23588a();
            boolean m23612u = sdkConfiguration.m23612u();
            Boolean m23591b0 = sdkConfiguration.m23591b0();
            Boolean m23577P = sdkConfiguration.m23577P();
            boolean m23562A = sdkConfiguration.m23562A();
            boolean m23567F = sdkConfiguration.m23567F();
            boolean m23576O = sdkConfiguration.m23576O();
            boolean m23613v = sdkConfiguration.m23613v();
            Boolean m23589a0 = sdkConfiguration.m23589a0();
            boolean m23572K = sdkConfiguration.m23572K();
            boolean m23573L = sdkConfiguration.m23573L();
            boolean m23581T = sdkConfiguration.m23581T();
            boolean m23582U = sdkConfiguration.m23582U();
            boolean m23565D = sdkConfiguration.m23565D();
            boolean m23580S = sdkConfiguration.m23580S();
            boolean m23578Q = sdkConfiguration.m23578Q();
            Integer m23594d = sdkConfiguration.m23594d();
            Integer m23608q = sdkConfiguration.m23608q();
            BiddingSettings m23597f = sdkConfiguration.m23597f();
            boolean m23615x = sdkConfiguration.m23615x();
            boolean m23583V = sdkConfiguration.m23583V();
            Boolean m23611t = sdkConfiguration.m23611t();
            boolean m23614w = sdkConfiguration.m23614w();
            boolean m23566E = sdkConfiguration.m23566E();
            boolean m23579R = sdkConfiguration.m23579R();
            boolean m23586Y = sdkConfiguration.m23586Y();
            boolean m23585X = sdkConfiguration.m23585X();
            long m23602k = sdkConfiguration.m23602k();
            long m23603l = sdkConfiguration.m23603l();
            a aVar = f49287c;
            a.m23298a(aVar, this.f49289b, C4974dk.m23897a(6), m23588a);
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(7), Boolean.valueOf(m23612u));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(8), m23591b0);
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(10), m23577P);
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(12), Boolean.valueOf(m23562A));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(13), Boolean.valueOf(m23567F));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(14), Boolean.valueOf(m23576O));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(15), Boolean.valueOf(m23613v));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(16), m23589a0);
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(18), Boolean.valueOf(m23572K));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(17), Boolean.valueOf(m23573L));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(19), Boolean.valueOf(m23581T));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(20), Boolean.valueOf(m23582U));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(36), Boolean.valueOf(m23615x));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(28), Boolean.valueOf(m23565D));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(29), Boolean.valueOf(m23580S));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(30), Boolean.valueOf(m23578Q));
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(45), m23611t);
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(48), Boolean.valueOf(m23614w));
            a.m23297a(aVar, this.f49289b, C4974dk.m23897a(21), m23594d);
            a.m23297a(aVar, this.f49289b, C4974dk.m23897a(22), m23608q);
            if (m23597f != null) {
                C5685re.m27909a(this.f49289b, m23597f);
            } else {
                C5685re.m27910b(this.f49289b);
            }
            C5353kr m23600i = sdkConfiguration.m23600i();
            if (m23600i != null) {
                this.f49289b.putString(C4974dk.m23897a(32), m23600i.m26177a());
                this.f49289b.mo27186a(m23600i.m26178b(), C4974dk.m23897a(33));
            }
            a.m23296a(aVar, this.f49289b, C4974dk.m23897a(42), Boolean.valueOf(m23583V));
            this.f49289b.putLong(C4974dk.m23897a(53), m23602k);
            this.f49289b.putBoolean(C4974dk.m23897a(49), m23566E);
            this.f49289b.putBoolean(C4974dk.m23897a(50), m23579R);
            this.f49289b.putBoolean(C4974dk.m23897a(51), m23586Y);
            this.f49289b.putBoolean(C4974dk.m23897a(52), m23585X);
            this.f49289b.putLong(C4974dk.m23897a(54), m23603l);
            this.f49289b.putString(C4974dk.m23897a(56), sdkConfiguration.m23610s());
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5666r1;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.x2 */
/* loaded from: classes3.dex */
public final class C6003x2 {

    /* renamed from: a */
    @NonNull
    private final C5723s2 f56330a;

    /* renamed from: b */
    @NonNull
    private final f40 f56331b;

    /* renamed from: c */
    @NonNull
    private final m50 f56332c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC6103z2 f56333d;

    /* renamed from: e */
    @NonNull
    private final tb1 f56334e;

    /* renamed from: f */
    @NonNull
    private final C5953w2 f56335f;

    /* renamed from: g */
    @NonNull
    private final C5899v2 f56336g;

    /* renamed from: h */
    @NonNull
    private final sp0 f56337h;

    /* renamed from: i */
    @NonNull
    private final e50 f56338i;

    /* renamed from: j */
    private boolean f56339j;

    /* renamed from: k */
    private boolean f56340k;

    /* renamed from: l */
    private boolean f56341l;

    /* renamed from: com.yandex.mobile.ads.impl.x2$a */
    public final class a implements InterfaceC5925vl {

        /* renamed from: a */
        @NonNull
        private final InterfaceC6103z2 f56342a;

        public /* synthetic */ a(C6003x2 c6003x2, InterfaceC6103z2 interfaceC6103z2, int i2) {
            this(interfaceC6103z2);
        }

        /* renamed from: a */
        public final void m29649a() {
            InterfaceC6103z2 interfaceC6103z2 = C6003x2.this.f56333d;
            Objects.requireNonNull(interfaceC6103z2);
            pq1 pq1Var = new pq1(interfaceC6103z2, 0);
            if (C6003x2.this.f56330a.m28046e() != null) {
                C6003x2.this.f56336g.m29171a();
            } else {
                C6003x2.this.f56331b.m24313a();
                pq1Var.run();
            }
        }

        /* renamed from: b */
        public final void m29651b() {
            C5666r1.a aVar = (C5666r1.a) this.f56342a;
            if (C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a).equals(EnumC5832u1.f55324h)) {
                C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55323g);
            }
        }

        /* renamed from: c */
        public final void m29652c() {
            boolean z;
            if (!C6003x2.this.f56341l) {
                C6003x2.this.f56341l = true;
                C5666r1.a aVar = (C5666r1.a) this.f56342a;
                z = C5666r1.this.f54160g;
                C5666r1.this.f54160g = false;
                if (EnumC5832u1.f55318b.equals(C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a))) {
                    C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55319c);
                    if (z) {
                        C5666r1.m27807e(C5666r1.this);
                    } else if (C5666r1.this.f54159f != null) {
                        C5666r1.this.f54159f.mo24858a();
                    }
                }
            }
            C5666r1.a aVar2 = (C5666r1.a) this.f56342a;
            if (EnumC5832u1.f55318b.equals(C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a))) {
                C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55319c);
            }
            if (C6003x2.this.f56339j) {
                C6003x2.this.f56339j = false;
                C6003x2.this.m29645d();
            }
        }

        /* renamed from: d */
        public final void m29653d() {
            C5666r1.a aVar = (C5666r1.a) this.f56342a;
            if (C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a).equals(EnumC5832u1.f55323g)) {
                C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55324h);
            }
        }

        /* renamed from: e */
        public final void m29654e() {
            if (C6003x2.this.f56338i.m24013d()) {
                C6003x2.this.f56335f.m29365c();
                C6003x2.this.f56330a.m28042a();
            }
            InterfaceC6103z2 interfaceC6103z2 = C6003x2.this.f56333d;
            Objects.requireNonNull(interfaceC6103z2);
            pq1 pq1Var = new pq1(interfaceC6103z2, 3);
            if (C6003x2.this.f56330a.m28046e() != null) {
                C6003x2.this.f56336g.m29171a();
            } else {
                C6003x2.this.f56331b.m24313a();
                pq1Var.run();
            }
        }

        /* renamed from: f */
        public final void m29655f() {
            if (!C6003x2.this.f56340k) {
                C6003x2.this.f56340k = true;
                C5666r1.a aVar = (C5666r1.a) this.f56342a;
                if (C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a).equals(EnumC5832u1.f55319c)) {
                    C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55324h);
                    C5666r1.this.f54158e.m29843c();
                    if (C5666r1.this.f54159f != null) {
                        C5666r1.this.f54159f.mo24862b();
                    }
                }
            }
            C6003x2.this.f56339j = false;
            C6003x2.m29635h(C6003x2.this);
            C5666r1.a aVar2 = (C5666r1.a) this.f56342a;
            if (C5666r1.this.f54155b.m29165a(C5666r1.this.f54154a).equals(EnumC5832u1.f55319c)) {
                C5666r1.this.f54155b.m29166a(C5666r1.this.f54154a, EnumC5832u1.f55324h);
            }
        }

        /* renamed from: g */
        public final void m29656g() {
            if (C6003x2.this.f56330a.m28046e() != null) {
                C6003x2.this.f56331b.m24313a();
                return;
            }
            InterfaceC6103z2 interfaceC6103z2 = C6003x2.this.f56333d;
            Objects.requireNonNull(interfaceC6103z2);
            pq1 pq1Var = new pq1(interfaceC6103z2, 4);
            C6003x2.this.f56331b.m24313a();
            pq1Var.run();
        }

        private a(InterfaceC6103z2 interfaceC6103z2) {
            this.f56342a = interfaceC6103z2;
        }

        /* renamed from: a */
        public final void m29650a(@NonNull hc1 hc1Var) {
            if (C6003x2.this.f56330a.m28041a((hc1<VideoAd>) hc1Var).m22367b().m28207a() == rd1.f54293j) {
                C6003x2.this.f56335f.m29365c();
                InterfaceC6103z2 interfaceC6103z2 = C6003x2.this.f56333d;
                Objects.requireNonNull(interfaceC6103z2);
                pq1 pq1Var = new pq1(interfaceC6103z2, 1);
                C6003x2.this.f56331b.m24313a();
                pq1Var.run();
                return;
            }
            InterfaceC6103z2 interfaceC6103z22 = C6003x2.this.f56333d;
            Objects.requireNonNull(interfaceC6103z22);
            pq1 pq1Var2 = new pq1(interfaceC6103z22, 2);
            if (C6003x2.this.f56330a.m28046e() != null) {
                C6003x2.this.f56336g.m29171a();
            } else {
                C6003x2.this.f56331b.m24313a();
                pq1Var2.run();
            }
        }
    }

    public C6003x2(@NonNull Context context, @NonNull m50 m50Var, @NonNull t30 t30Var, @NonNull f40 f40Var, @NonNull i40 i40Var, @NonNull InterfaceC6103z2 interfaceC6103z2) {
        this.f56332c = m50Var;
        this.f56331b = f40Var;
        this.f56333d = interfaceC6103z2;
        sp0 sp0Var = new sp0();
        this.f56337h = sp0Var;
        tb1 tb1Var = new tb1();
        this.f56334e = tb1Var;
        C6052y2 c6052y2 = new C6052y2(new C5159h2(f40Var, tb1Var), new a(this, interfaceC6103z2, 0));
        C5723s2 m28437a = new C5779t2(context, m50Var, t30Var, sp0Var, i40Var, c6052y2).m28437a();
        this.f56330a = m28437a;
        c6052y2.m29848a(m28437a);
        this.f56335f = new C5953w2(m28437a);
        this.f56336g = new C5899v2(m28437a, f40Var, interfaceC6103z2, this);
        this.f56338i = e50.m24007a();
    }

    /* renamed from: h */
    public static void m29635h(C6003x2 c6003x2) {
        hc1<VideoAd> m28043b = c6003x2.f56330a.m28043b();
        tf1 m28045d = c6003x2.f56330a.m28045d();
        if (m28043b == null || m28045d == null) {
            n60.m26810c("Failed to show UI for ad group item", new Object[0]);
        } else {
            c6003x2.f56331b.m24315a(c6003x2.f56332c, m28043b, m28045d, c6003x2.f56334e, c6003x2.f56337h);
        }
    }

    /* renamed from: a */
    public final void m29642a(@Nullable sb1 sb1Var) {
        this.f56334e.m28583a(sb1Var);
    }

    /* renamed from: b */
    public final void m29643b() {
        this.f56339j = true;
    }

    /* renamed from: c */
    public final void m29644c() {
        i50 m28044c = this.f56330a.m28044c();
        if (m28044c != null) {
            m28044c.m25444b();
        } else {
            n60.m26810c("Failed to pause ad group item", new Object[0]);
        }
    }

    /* renamed from: d */
    public final void m29645d() {
        i50 m28044c = this.f56330a.m28044c();
        if (m28044c != null) {
            this.f56339j = false;
            m28044c.m25445c();
        } else {
            n60.m26810c("Failed to start ad group item", new Object[0]);
        }
        this.f56335f.m29364b();
    }

    /* renamed from: e */
    public final void m29646e() {
        i50 m28044c = this.f56330a.m28044c();
        if (m28044c != null) {
            m28044c.m25446d();
        } else {
            n60.m26810c("Failed to prepare ad group item", new Object[0]);
        }
    }

    /* renamed from: f */
    public final void m29647f() {
        hc1<VideoAd> m28043b = this.f56330a.m28043b();
        tf1 m28045d = this.f56330a.m28045d();
        if (m28043b == null || m28045d == null) {
            n60.m26810c("Failed to show UI for ad group item", new Object[0]);
        } else {
            this.f56331b.m24315a(this.f56332c, m28043b, m28045d, this.f56334e, this.f56337h);
        }
        i50 m28044c = this.f56330a.m28044c();
        if (m28044c != null) {
            m28044c.m25448f();
        } else {
            n60.m26810c("Failed to resume ad group item", new Object[0]);
        }
    }

    /* renamed from: g */
    public final void m29648g() {
        i50 m28044c = this.f56330a.m28044c();
        if (m28044c != null) {
            m28044c.m25449g();
        } else {
            n60.m26810c("Failed to stop ad group item", new Object[0]);
        }
        this.f56335f.m29365c();
    }

    /* renamed from: a */
    public final void m29641a() {
        i50 m28044c = this.f56330a.m28044c();
        if (m28044c != null) {
            m28044c.m25443a();
        }
        this.f56335f.m29363a();
        this.f56339j = false;
        this.f56341l = false;
        this.f56340k = false;
    }
}

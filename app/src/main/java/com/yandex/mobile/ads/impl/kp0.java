package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;

/* loaded from: classes3.dex */
public final class kp0 implements c01 {

    /* renamed from: a */
    private C5606pv f52049a;

    /* renamed from: b */
    private p61 f52050b;

    /* renamed from: c */
    private y61 f52051c;

    public kp0(String str) {
        this.f52049a = new C5606pv.a().m27561f(str).m27550a();
    }

    @Override // com.yandex.mobile.ads.impl.c01
    /* renamed from: a */
    public final void mo22999a(p61 p61Var, InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        this.f52050b = p61Var;
        c5112d.m24821a();
        y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 5);
        this.f52051c = mo23022a;
        mo23022a.mo28347a(this.f52049a);
    }

    @Override // com.yandex.mobile.ads.impl.c01
    /* renamed from: a */
    public final void mo22998a(ap0 ap0Var) {
        C5220ia.m25474b(this.f52050b);
        int i2 = s91.f54530a;
        long m27172b = this.f52050b.m27172b();
        long m27174c = this.f52050b.m27174c();
        if (m27172b == -9223372036854775807L || m27174c == -9223372036854775807L) {
            return;
        }
        C5606pv c5606pv = this.f52049a;
        if (m27174c != c5606pv.f53824p) {
            C5606pv m27550a = c5606pv.m27508a().m27543a(m27174c).m27550a();
            this.f52049a = m27550a;
            this.f52051c.mo28347a(m27550a);
        }
        int m22579a = ap0Var.m22579a();
        this.f52051c.mo28345a(m22579a, ap0Var);
        this.f52051c.mo28346a(m27172b, 1, m22579a, 0, null);
    }
}

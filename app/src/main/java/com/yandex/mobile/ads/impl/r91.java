package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;
import java.util.List;

/* loaded from: classes3.dex */
final class r91 {

    /* renamed from: a */
    private final List<C5606pv> f54240a;

    /* renamed from: b */
    private final y61[] f54241b;

    public r91(List<C5606pv> list) {
        this.f54240a = list;
        this.f54241b = new y61[list.size()];
    }

    /* renamed from: a */
    public final void m27883a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        for (int i2 = 0; i2 < this.f54241b.length; i2++) {
            c5112d.m24821a();
            y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 3);
            C5606pv c5606pv = this.f54240a.get(i2);
            String str = c5606pv.f53820l;
            C5220ia.m25472a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            mo23022a.mo28347a(new C5606pv.a().m27555c(c5112d.m24822b()).m27561f(str).m27570o(c5606pv.f53812d).m27559e(c5606pv.f53811c).m27542a(c5606pv.f53806D).m27548a(c5606pv.f53822n).m27550a());
            this.f54241b[i2] = mo23022a;
        }
    }

    /* renamed from: a */
    public final void m27882a(long j2, ap0 ap0Var) {
        if (ap0Var.m22579a() < 9) {
            return;
        }
        int m22595h = ap0Var.m22595h();
        int m22595h2 = ap0Var.m22595h();
        int m22607t = ap0Var.m22607t();
        if (m22595h == 434 && m22595h2 == 1195456820 && m22607t == 3) {
            C4971dh.m23883b(j2, ap0Var, this.f54241b);
        }
    }
}

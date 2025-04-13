package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;
import java.util.List;

/* loaded from: classes3.dex */
public final class j01 {

    /* renamed from: a */
    private final List<C5606pv> f51473a;

    /* renamed from: b */
    private final y61[] f51474b;

    public j01(List<C5606pv> list) {
        this.f51473a = list;
        this.f51474b = new y61[list.size()];
    }

    /* renamed from: a */
    public final void m25756a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        for (int i2 = 0; i2 < this.f51474b.length; i2++) {
            c5112d.m24821a();
            y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 3);
            C5606pv c5606pv = this.f51473a.get(i2);
            String str = c5606pv.f53820l;
            C5220ia.m25472a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c5606pv.f53809a;
            if (str2 == null) {
                str2 = c5112d.m24822b();
            }
            mo23022a.mo28347a(new C5606pv.a().m27555c(str2).m27561f(str).m27570o(c5606pv.f53812d).m27559e(c5606pv.f53811c).m27542a(c5606pv.f53806D).m27548a(c5606pv.f53822n).m27550a());
            this.f51474b[i2] = mo23022a;
        }
    }

    /* renamed from: a */
    public final void m25755a(long j2, ap0 ap0Var) {
        C4971dh.m23882a(j2, ap0Var, this.f51474b);
    }
}

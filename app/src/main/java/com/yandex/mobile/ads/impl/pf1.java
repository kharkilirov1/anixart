package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l51;

/* loaded from: classes3.dex */
final class pf1 extends l51 {

    /* renamed from: b */
    private final ap0 f53552b;

    /* renamed from: c */
    private final ap0 f53553c;

    /* renamed from: d */
    private int f53554d;

    /* renamed from: e */
    private boolean f53555e;

    /* renamed from: f */
    private boolean f53556f;

    /* renamed from: g */
    private int f53557g;

    public pf1(y61 y61Var) {
        super(y61Var);
        this.f53552b = new ap0(ch0.f49243a);
        this.f53553c = new ap0(4);
    }

    /* renamed from: a */
    public final boolean m27324a(ap0 ap0Var) throws l51.C5378a {
        int m22607t = ap0Var.m22607t();
        int i2 = (m22607t >> 4) & 15;
        int i3 = m22607t & 15;
        if (i3 != 7) {
            throw new l51.C5378a(k60.m26036a("Video format not supported: ", i3));
        }
        this.f53557g = i2;
        return i2 != 5;
    }

    /* renamed from: a */
    public final boolean m27323a(long j2, ap0 ap0Var) throws ep0 {
        int m22607t = ap0Var.m22607t();
        long m22596i = (ap0Var.m22596i() * 1000) + j2;
        if (m22607t == 0 && !this.f53555e) {
            ap0 ap0Var2 = new ap0(new byte[ap0Var.m22579a()]);
            ap0Var.m22583a(ap0Var2.m22587c(), 0, ap0Var.m22579a());
            C5332kc m26104a = C5332kc.m26104a(ap0Var2);
            this.f53554d = m26104a.f51937b;
            this.f52264a.mo28347a(new C5606pv.a().m27561f("video/avc").m27547a(m26104a.f51941f).m27572q(m26104a.f51938c).m27562g(m26104a.f51939d).m27551b(m26104a.f51940e).m27548a(m26104a.f51936a).m27550a());
            this.f53555e = true;
            return false;
        }
        if (m22607t != 1 || !this.f53555e) {
            return false;
        }
        int i2 = this.f53557g == 1 ? 1 : 0;
        if (!this.f53556f && i2 == 0) {
            return false;
        }
        byte[] m22587c = this.f53553c.m22587c();
        m22587c[0] = 0;
        m22587c[1] = 0;
        m22587c[2] = 0;
        int i3 = 4 - this.f53554d;
        int i4 = 0;
        while (ap0Var.m22579a() > 0) {
            ap0Var.m22583a(this.f53553c.m22587c(), i3, this.f53554d);
            this.f53553c.m22591e(0);
            int m22611x = this.f53553c.m22611x();
            this.f53552b.m22591e(0);
            this.f52264a.mo28345a(4, this.f53552b);
            this.f52264a.mo28345a(m22611x, ap0Var);
            i4 = i4 + 4 + m22611x;
        }
        this.f52264a.mo28346a(m22596i, i2, i4, 0, null);
        this.f53556f = true;
        return true;
    }
}

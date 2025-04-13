package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5206i;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;

/* renamed from: com.yandex.mobile.ads.impl.h */
/* loaded from: classes3.dex */
public final class C5155h implements InterfaceC4936cr {

    /* renamed from: a */
    private final zo0 f50774a;

    /* renamed from: b */
    private final ap0 f50775b;

    /* renamed from: c */
    @Nullable
    private final String f50776c;

    /* renamed from: d */
    private String f50777d;

    /* renamed from: e */
    private y61 f50778e;

    /* renamed from: f */
    private int f50779f;

    /* renamed from: g */
    private int f50780g;

    /* renamed from: h */
    private boolean f50781h;

    /* renamed from: i */
    private long f50782i;

    /* renamed from: j */
    private C5606pv f50783j;

    /* renamed from: k */
    private int f50784k;

    /* renamed from: l */
    private long f50785l;

    public C5155h() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f50779f = 0;
        this.f50780g = 0;
        this.f50781h = false;
        this.f50785l = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    public C5155h(@Nullable String str) {
        zo0 zo0Var = new zo0(new byte[128]);
        this.f50774a = zo0Var;
        this.f50775b = new ap0(zo0Var.f57274a);
        this.f50779f = 0;
        this.f50785l = -9223372036854775807L;
        this.f50776c = str;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f50777d = c5112d.m24822b();
        this.f50778e = interfaceC5509nt.mo23022a(c5112d.m24823c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f50785l = j2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22654a(ap0 ap0Var) {
        boolean z;
        C5220ia.m25474b(this.f50778e);
        while (ap0Var.m22579a() > 0) {
            int i2 = this.f50779f;
            if (i2 == 0) {
                while (true) {
                    if (ap0Var.m22579a() <= 0) {
                        z = false;
                        break;
                    }
                    if (!this.f50781h) {
                        this.f50781h = ap0Var.m22607t() == 11;
                    } else {
                        int m22607t = ap0Var.m22607t();
                        if (m22607t == 119) {
                            this.f50781h = false;
                            z = true;
                            break;
                        }
                        this.f50781h = m22607t == 11;
                    }
                }
                if (z) {
                    this.f50779f = 1;
                    this.f50775b.m22587c()[0] = 11;
                    this.f50775b.m22587c()[1] = 119;
                    this.f50780g = 2;
                }
            } else if (i2 == 1) {
                byte[] m22587c = this.f50775b.m22587c();
                int min = Math.min(ap0Var.m22579a(), 128 - this.f50780g);
                ap0Var.m22583a(m22587c, this.f50780g, min);
                int i3 = this.f50780g + min;
                this.f50780g = i3;
                if (i3 == 128) {
                    this.f50774a.m30255c(0);
                    C5206i.a m25407a = C5206i.m25407a(this.f50774a);
                    C5606pv c5606pv = this.f50783j;
                    if (c5606pv == null || m25407a.f51162c != c5606pv.f53833y || m25407a.f51161b != c5606pv.f53834z || !s91.m28112a(m25407a.f51160a, c5606pv.f53820l)) {
                        C5606pv m27550a = new C5606pv.a().m27555c(this.f50777d).m27561f(m25407a.f51160a).m27554c(m25407a.f51162c).m27569n(m25407a.f51161b).m27559e(this.f50776c).m27550a();
                        this.f50783j = m27550a;
                        this.f50778e.mo28347a(m27550a);
                    }
                    this.f50784k = m25407a.f51163d;
                    this.f50782i = (m25407a.f51164e * 1000000) / this.f50783j.f53834z;
                    this.f50775b.m22591e(0);
                    this.f50778e.mo28345a(128, this.f50775b);
                    this.f50779f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(ap0Var.m22579a(), this.f50784k - this.f50780g);
                this.f50778e.mo28345a(min2, ap0Var);
                int i4 = this.f50780g + min2;
                this.f50780g = i4;
                int i5 = this.f50784k;
                if (i4 == i5) {
                    long j2 = this.f50785l;
                    if (j2 != -9223372036854775807L) {
                        this.f50778e.mo28346a(j2, 1, i5, 0, null);
                        this.f50785l += this.f50782i;
                    }
                    this.f50779f = 0;
                }
            }
        }
    }
}

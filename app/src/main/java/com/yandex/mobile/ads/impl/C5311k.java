package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5369l;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;

/* renamed from: com.yandex.mobile.ads.impl.k */
/* loaded from: classes3.dex */
public final class C5311k implements InterfaceC4936cr {

    /* renamed from: a */
    private final zo0 f51782a;

    /* renamed from: b */
    private final ap0 f51783b;

    /* renamed from: c */
    @Nullable
    private final String f51784c;

    /* renamed from: d */
    private String f51785d;

    /* renamed from: e */
    private y61 f51786e;

    /* renamed from: f */
    private int f51787f;

    /* renamed from: g */
    private int f51788g;

    /* renamed from: h */
    private boolean f51789h;

    /* renamed from: i */
    private boolean f51790i;

    /* renamed from: j */
    private long f51791j;

    /* renamed from: k */
    private C5606pv f51792k;

    /* renamed from: l */
    private int f51793l;

    /* renamed from: m */
    private long f51794m;

    public C5311k() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f51787f = 0;
        this.f51788g = 0;
        this.f51789h = false;
        this.f51790i = false;
        this.f51794m = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    public C5311k(@Nullable String str) {
        zo0 zo0Var = new zo0(new byte[16]);
        this.f51782a = zo0Var;
        this.f51783b = new ap0(zo0Var.f57274a);
        this.f51787f = 0;
        this.f51788g = 0;
        this.f51789h = false;
        this.f51790i = false;
        this.f51794m = -9223372036854775807L;
        this.f51784c = str;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f51785d = c5112d.m24822b();
        this.f51786e = interfaceC5509nt.mo23022a(c5112d.m24823c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f51794m = j2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22654a(ap0 ap0Var) {
        boolean z;
        int m22607t;
        C5220ia.m25474b(this.f51786e);
        while (ap0Var.m22579a() > 0) {
            int i2 = this.f51787f;
            if (i2 == 0) {
                while (true) {
                    if (ap0Var.m22579a() <= 0) {
                        z = false;
                        break;
                    } else if (!this.f51789h) {
                        this.f51789h = ap0Var.m22607t() == 172;
                    } else {
                        m22607t = ap0Var.m22607t();
                        this.f51789h = m22607t == 172;
                        if (m22607t == 64 || m22607t == 65) {
                            break;
                        }
                    }
                }
                this.f51790i = m22607t == 65;
                z = true;
                if (z) {
                    this.f51787f = 1;
                    this.f51783b.m22587c()[0] = -84;
                    this.f51783b.m22587c()[1] = (byte) (this.f51790i ? 65 : 64);
                    this.f51788g = 2;
                }
            } else if (i2 == 1) {
                byte[] m22587c = this.f51783b.m22587c();
                int min = Math.min(ap0Var.m22579a(), 16 - this.f51788g);
                ap0Var.m22583a(m22587c, this.f51788g, min);
                int i3 = this.f51788g + min;
                this.f51788g = i3;
                if (i3 == 16) {
                    this.f51782a.m30255c(0);
                    C5369l.a m26306a = C5369l.m26306a(this.f51782a);
                    C5606pv c5606pv = this.f51792k;
                    if (c5606pv == null || 2 != c5606pv.f53833y || m26306a.f52201a != c5606pv.f53834z || !"audio/ac4".equals(c5606pv.f53820l)) {
                        C5606pv m27550a = new C5606pv.a().m27555c(this.f51785d).m27561f("audio/ac4").m27554c(2).m27569n(m26306a.f52201a).m27559e(this.f51784c).m27550a();
                        this.f51792k = m27550a;
                        this.f51786e.mo28347a(m27550a);
                    }
                    this.f51793l = m26306a.f52202b;
                    this.f51791j = (m26306a.f52203c * 1000000) / this.f51792k.f53834z;
                    this.f51783b.m22591e(0);
                    this.f51786e.mo28345a(16, this.f51783b);
                    this.f51787f = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(ap0Var.m22579a(), this.f51793l - this.f51788g);
                this.f51786e.mo28345a(min2, ap0Var);
                int i4 = this.f51788g + min2;
                this.f51788g = i4;
                int i5 = this.f51793l;
                if (i4 == i5) {
                    long j2 = this.f51794m;
                    if (j2 != -9223372036854775807L) {
                        this.f51786e.mo28346a(j2, 1, i5, 0, null);
                        this.f51794m += this.f51791j;
                    }
                    this.f51787f = 0;
                }
            }
        }
    }
}

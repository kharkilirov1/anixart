package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bc0;

/* loaded from: classes3.dex */
final class wb0 {

    /* renamed from: a */
    public final vb0 f56087a;

    /* renamed from: b */
    public final Object f56088b;

    /* renamed from: c */
    public final uy0[] f56089c;

    /* renamed from: d */
    public boolean f56090d;

    /* renamed from: e */
    public boolean f56091e;

    /* renamed from: f */
    public yb0 f56092f;

    /* renamed from: g */
    public boolean f56093g;

    /* renamed from: h */
    private final boolean[] f56094h;

    /* renamed from: i */
    private final dv0[] f56095i;

    /* renamed from: j */
    private final d71 f56096j;

    /* renamed from: k */
    private final ec0 f56097k;

    /* renamed from: l */
    @Nullable
    private wb0 f56098l;

    /* renamed from: m */
    private x61 f56099m;

    /* renamed from: n */
    private e71 f56100n;

    /* renamed from: o */
    private long f56101o;

    public wb0(dv0[] dv0VarArr, long j2, d71 d71Var, InterfaceC5476n8 interfaceC5476n8, ec0 ec0Var, yb0 yb0Var, e71 e71Var) {
        this.f56095i = dv0VarArr;
        this.f56101o = j2;
        this.f56096j = d71Var;
        this.f56097k = ec0Var;
        bc0.C4858b c4858b = yb0Var.f56788a;
        this.f56088b = c4858b.f56449a;
        this.f56092f = yb0Var;
        this.f56099m = x61.f56383d;
        this.f56100n = e71Var;
        this.f56089c = new uy0[dv0VarArr.length];
        this.f56094h = new boolean[dv0VarArr.length];
        this.f56087a = m29438a(c4858b, ec0Var, interfaceC5476n8, yb0Var.f56789b, yb0Var.f56791d);
    }

    /* renamed from: a */
    public final void m29442a(float f2, k61 k61Var) throws C5043es {
        this.f56090d = true;
        this.f56099m = this.f56087a.getTrackGroups();
        e71 m29445b = m29445b(f2, k61Var);
        yb0 yb0Var = this.f56092f;
        long j2 = yb0Var.f56789b;
        long j3 = yb0Var.f56792e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long m29440a = m29440a(m29445b, j2);
        long j4 = this.f56101o;
        yb0 yb0Var2 = this.f56092f;
        long j5 = yb0Var2.f56789b;
        this.f56101o = (j5 - m29440a) + j4;
        if (m29440a != j5) {
            yb0Var2 = new yb0(yb0Var2.f56788a, m29440a, yb0Var2.f56790c, yb0Var2.f56791d, yb0Var2.f56792e, yb0Var2.f56793f, yb0Var2.f56794g, yb0Var2.f56795h, yb0Var2.f56796i);
        }
        this.f56092f = yb0Var2;
    }

    /* renamed from: b */
    public final e71 m29445b(float f2, k61 k61Var) throws C5043es {
        e71 mo23822a = this.f56096j.mo23822a(this.f56095i, this.f56099m, this.f56092f.f56788a, k61Var);
        for (InterfaceC5939vs interfaceC5939vs : mo23822a.f49832c) {
            if (interfaceC5939vs != null) {
                interfaceC5939vs.mo24846a(f2);
            }
        }
        return mo23822a;
    }

    /* renamed from: c */
    public final long m29448c() {
        return this.f56101o;
    }

    /* renamed from: d */
    public final long m29451d(long j2) {
        return j2 + this.f56101o;
    }

    /* renamed from: e */
    public final x61 m29452e() {
        return this.f56099m;
    }

    /* renamed from: f */
    public final e71 m29453f() {
        return this.f56100n;
    }

    /* renamed from: g */
    public final void m29454g() {
        m29439a();
        ec0 ec0Var = this.f56097k;
        vb0 vb0Var = this.f56087a;
        try {
            if (vb0Var instanceof C4926ci) {
                ec0Var.m24105a(((C4926ci) vb0Var).f49270b);
            } else {
                ec0Var.m24105a(vb0Var);
            }
        } catch (RuntimeException e2) {
            d90.m23838a("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    /* renamed from: h */
    public final void m29455h() {
        this.f56101o = 1000000000000L;
    }

    /* renamed from: c */
    public final long m29449c(long j2) {
        return j2 - this.f56101o;
    }

    /* renamed from: d */
    public final long m29450d() {
        return this.f56092f.f56789b + this.f56101o;
    }

    @Nullable
    /* renamed from: b */
    public final wb0 m29446b() {
        return this.f56098l;
    }

    /* renamed from: b */
    public final void m29447b(long j2) {
        C5220ia.m25476b(this.f56098l == null);
        if (this.f56090d) {
            this.f56087a.reevaluateBuffer(j2 - this.f56101o);
        }
    }

    /* renamed from: a */
    public final long m29440a(e71 e71Var, long j2) {
        return m29441a(e71Var, j2, false, new boolean[this.f56095i.length]);
    }

    /* renamed from: a */
    public final long m29441a(e71 e71Var, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= e71Var.f49830a) {
                break;
            }
            boolean[] zArr2 = this.f56094h;
            if (!z) {
                e71 e71Var2 = this.f56100n;
                if (e71Var2 != null && s91.m28112a(e71Var.f49831b[i2], e71Var2.f49831b[i2]) && s91.m28112a(e71Var.f49832c[i2], e71Var2.f49832c[i2])) {
                    zArr2[i2] = z2;
                    i2++;
                }
            }
            z2 = false;
            zArr2[i2] = z2;
            i2++;
        }
        uy0[] uy0VarArr = this.f56089c;
        int i3 = 0;
        while (true) {
            dv0[] dv0VarArr = this.f56095i;
            if (i3 >= dv0VarArr.length) {
                break;
            }
            if (((AbstractC5074fe) dv0VarArr[i3]).mo23533m() == -2) {
                uy0VarArr[i3] = null;
            }
            i3++;
        }
        m29439a();
        this.f56100n = e71Var;
        if (this.f56098l == null) {
            int i4 = 0;
            while (true) {
                e71 e71Var3 = this.f56100n;
                if (i4 >= e71Var3.f49830a) {
                    break;
                }
                boolean m24039a = e71Var3.m24039a(i4);
                InterfaceC5939vs interfaceC5939vs = this.f56100n.f49832c[i4];
                if (m24039a && interfaceC5939vs != null) {
                    interfaceC5939vs.mo24849c();
                }
                i4++;
            }
        }
        long mo23266a = this.f56087a.mo23266a(e71Var.f49832c, this.f56094h, this.f56089c, zArr, j2);
        uy0[] uy0VarArr2 = this.f56089c;
        int i5 = 0;
        while (true) {
            dv0[] dv0VarArr2 = this.f56095i;
            if (i5 >= dv0VarArr2.length) {
                break;
            }
            if (((AbstractC5074fe) dv0VarArr2[i5]).mo23533m() == -2 && this.f56100n.m24039a(i5)) {
                uy0VarArr2[i5] = new C5042er();
            }
            i5++;
        }
        this.f56091e = false;
        int i6 = 0;
        while (true) {
            uy0[] uy0VarArr3 = this.f56089c;
            if (i6 >= uy0VarArr3.length) {
                return mo23266a;
            }
            if (uy0VarArr3[i6] != null) {
                C5220ia.m25476b(e71Var.m24039a(i6));
                if (((AbstractC5074fe) this.f56095i[i6]).mo23533m() != -2) {
                    this.f56091e = true;
                }
            } else {
                C5220ia.m25476b(e71Var.f49832c[i6] == null);
            }
            i6++;
        }
    }

    /* renamed from: a */
    public final void m29444a(@Nullable wb0 wb0Var) {
        if (wb0Var == this.f56098l) {
            return;
        }
        m29439a();
        this.f56098l = wb0Var;
        int i2 = 0;
        if (!(wb0Var == null)) {
            return;
        }
        while (true) {
            e71 e71Var = this.f56100n;
            if (i2 >= e71Var.f49830a) {
                return;
            }
            boolean m24039a = e71Var.m24039a(i2);
            InterfaceC5939vs interfaceC5939vs = this.f56100n.f49832c[i2];
            if (m24039a && interfaceC5939vs != null) {
                interfaceC5939vs.mo24849c();
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void m29443a(long j2) {
        C5220ia.m25476b(this.f56098l == null);
        this.f56087a.continueLoading(j2 - this.f56101o);
    }

    /* renamed from: a */
    private void m29439a() {
        int i2 = 0;
        if (!(this.f56098l == null)) {
            return;
        }
        while (true) {
            e71 e71Var = this.f56100n;
            if (i2 >= e71Var.f49830a) {
                return;
            }
            boolean m24039a = e71Var.m24039a(i2);
            InterfaceC5939vs interfaceC5939vs = this.f56100n.f49832c[i2];
            if (m24039a && interfaceC5939vs != null) {
                interfaceC5939vs.mo24848b();
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static vb0 m29438a(bc0.C4858b c4858b, ec0 ec0Var, InterfaceC5476n8 interfaceC5476n8, long j2, long j3) {
        x90 m24103a = ec0Var.m24103a(c4858b, interfaceC5476n8, j2);
        return j3 != -9223372036854775807L ? new C4926ci(m24103a, true, 0L, j3) : m24103a;
    }
}

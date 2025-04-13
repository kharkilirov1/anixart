package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.k61;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zb0 {

    /* renamed from: a */
    private final k61.C5321b f57097a = new k61.C5321b();

    /* renamed from: b */
    private final k61.C5323d f57098b = new k61.C5323d();

    /* renamed from: c */
    private final InterfaceC5569p8 f57099c;

    /* renamed from: d */
    private final Handler f57100d;

    /* renamed from: e */
    private long f57101e;

    /* renamed from: f */
    private int f57102f;

    /* renamed from: g */
    private boolean f57103g;

    /* renamed from: h */
    @Nullable
    private wb0 f57104h;

    /* renamed from: i */
    @Nullable
    private wb0 f57105i;

    /* renamed from: j */
    @Nullable
    private wb0 f57106j;

    /* renamed from: k */
    private int f57107k;

    /* renamed from: l */
    @Nullable
    private Object f57108l;

    /* renamed from: m */
    private long f57109m;

    public zb0(InterfaceC5569p8 interfaceC5569p8, Handler handler) {
        this.f57099c = interfaceC5569p8;
        this.f57100d = handler;
    }

    /* renamed from: g */
    private void m30126g() {
        int i2 = AbstractC4698p.f47900c;
        AbstractC4698p.a aVar = new AbstractC4698p.a();
        for (wb0 wb0Var = this.f57104h; wb0Var != null; wb0Var = wb0Var.m29446b()) {
            aVar.m22060b(wb0Var.f56092f.f56788a);
        }
        wb0 wb0Var2 = this.f57105i;
        this.f57100d.post(new sq1(this, aVar, wb0Var2 == null ? null : wb0Var2.f56092f.f56788a, 0));
    }

    /* renamed from: a */
    public final boolean m30133a(k61 k61Var, int i2) {
        this.f57102f = i2;
        return m30125a(k61Var);
    }

    /* renamed from: b */
    public final wb0 m30138b() {
        wb0 wb0Var = this.f57105i;
        C5220ia.m25476b((wb0Var == null || wb0Var.m29446b() == null) ? false : true);
        this.f57105i = this.f57105i.m29446b();
        m30126g();
        return this.f57105i;
    }

    /* renamed from: c */
    public final void m30139c() {
        if (this.f57107k == 0) {
            return;
        }
        wb0 wb0Var = (wb0) C5220ia.m25474b(this.f57104h);
        this.f57108l = wb0Var.f56088b;
        this.f57109m = wb0Var.f56092f.f56788a.f56452d;
        while (wb0Var != null) {
            wb0Var.m29454g();
            wb0Var = wb0Var.m29446b();
        }
        this.f57104h = null;
        this.f57106j = null;
        this.f57105i = null;
        this.f57107k = 0;
        m30126g();
    }

    @Nullable
    /* renamed from: d */
    public final wb0 m30140d() {
        return this.f57106j;
    }

    @Nullable
    /* renamed from: e */
    public final wb0 m30141e() {
        return this.f57104h;
    }

    @Nullable
    /* renamed from: f */
    public final wb0 m30142f() {
        return this.f57105i;
    }

    /* renamed from: h */
    public final boolean m30143h() {
        wb0 wb0Var = this.f57106j;
        if (wb0Var != null) {
            if (wb0Var.f56092f.f56796i) {
                return false;
            }
            if (!(wb0Var.f56090d && (!wb0Var.f56091e || wb0Var.f56087a.getBufferedPositionUs() == Long.MIN_VALUE)) || this.f57106j.f56092f.f56792e == -9223372036854775807L || this.f57107k >= 100) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m30135a(k61 k61Var, boolean z) {
        this.f57103g = z;
        return m30125a(k61Var);
    }

    /* renamed from: a */
    public final boolean m30136a(vb0 vb0Var) {
        wb0 wb0Var = this.f57106j;
        return wb0Var != null && wb0Var.f56087a == vb0Var;
    }

    /* renamed from: a */
    public final void m30132a(long j2) {
        wb0 wb0Var = this.f57106j;
        if (wb0Var != null) {
            wb0Var.m29447b(j2);
        }
    }

    @Nullable
    /* renamed from: a */
    public final yb0 m30130a(long j2, lq0 lq0Var) {
        wb0 wb0Var = this.f57106j;
        if (wb0Var == null) {
            k61 k61Var = lq0Var.f52493a;
            bc0.C4858b c4858b = lq0Var.f52494b;
            long j3 = lq0Var.f52495c;
            long j4 = lq0Var.f52510r;
            k61Var.mo23973a(c4858b.f56449a, this.f57097a);
            if (c4858b.m29735a()) {
                return m30121a(k61Var, c4858b.f56449a, c4858b.f56450b, c4858b.f56451c, j3, c4858b.f56452d);
            }
            return m30122a(k61Var, c4858b.f56449a, j4, j3, c4858b.f56452d);
        }
        return m30120a(lq0Var.f52493a, wb0Var, j2);
    }

    /* renamed from: a */
    public final wb0 m30129a(dv0[] dv0VarArr, d71 d71Var, InterfaceC5476n8 interfaceC5476n8, ec0 ec0Var, yb0 yb0Var, e71 e71Var) {
        wb0 wb0Var = this.f57106j;
        wb0 wb0Var2 = new wb0(dv0VarArr, wb0Var == null ? 1000000000000L : (wb0Var.m29448c() + this.f57106j.f56092f.f56792e) - yb0Var.f56789b, d71Var, interfaceC5476n8, ec0Var, yb0Var, e71Var);
        wb0 wb0Var3 = this.f57106j;
        if (wb0Var3 != null) {
            wb0Var3.m29444a(wb0Var2);
        } else {
            this.f57104h = wb0Var2;
            this.f57105i = wb0Var2;
        }
        this.f57108l = null;
        this.f57106j = wb0Var2;
        this.f57107k++;
        m30126g();
        return wb0Var2;
    }

    @Nullable
    /* renamed from: a */
    public final wb0 m30128a() {
        wb0 wb0Var = this.f57104h;
        if (wb0Var == null) {
            return null;
        }
        if (wb0Var == this.f57105i) {
            this.f57105i = wb0Var.m29446b();
        }
        this.f57104h.m29454g();
        int i2 = this.f57107k - 1;
        this.f57107k = i2;
        if (i2 == 0) {
            this.f57106j = null;
            wb0 wb0Var2 = this.f57104h;
            this.f57108l = wb0Var2.f56088b;
            this.f57109m = wb0Var2.f56092f.f56788a.f56452d;
        }
        this.f57104h = this.f57104h.m29446b();
        m30126g();
        return this.f57104h;
    }

    /* renamed from: a */
    public final boolean m30137a(wb0 wb0Var) {
        boolean z = false;
        C5220ia.m25476b(wb0Var != null);
        if (wb0Var.equals(this.f57106j)) {
            return false;
        }
        this.f57106j = wb0Var;
        while (wb0Var.m29446b() != null) {
            wb0Var = wb0Var.m29446b();
            if (wb0Var == this.f57105i) {
                this.f57105i = this.f57104h;
                z = true;
            }
            wb0Var.m29454g();
            this.f57107k--;
        }
        this.f57106j.m29444a((wb0) null);
        m30126g();
        return z;
    }

    /* renamed from: a */
    public final boolean m30134a(k61 k61Var, long j2, long j3) {
        boolean m30137a;
        yb0 yb0Var;
        k61 k61Var2 = k61Var;
        wb0 wb0Var = this.f57104h;
        wb0 wb0Var2 = null;
        while (wb0Var != null) {
            yb0 yb0Var2 = wb0Var.f56092f;
            if (wb0Var2 == null) {
                yb0Var = m30131a(k61Var2, yb0Var2);
            } else {
                yb0 m30120a = m30120a(k61Var2, wb0Var2, j2);
                if (m30120a == null) {
                    m30137a = m30137a(wb0Var2);
                } else {
                    if (yb0Var2.f56789b == m30120a.f56789b && yb0Var2.f56788a.equals(m30120a.f56788a)) {
                        yb0Var = m30120a;
                    } else {
                        m30137a = m30137a(wb0Var2);
                    }
                }
                return !m30137a;
            }
            long j4 = yb0Var2.f56790c;
            yb0 yb0Var3 = j4 == yb0Var.f56790c ? yb0Var : new yb0(yb0Var.f56788a, yb0Var.f56789b, j4, yb0Var.f56791d, yb0Var.f56792e, yb0Var.f56793f, yb0Var.f56794g, yb0Var.f56795h, yb0Var.f56796i);
            wb0Var.f56092f = yb0Var3;
            long j5 = yb0Var2.f56792e;
            if (!(j5 == -9223372036854775807L || j5 == yb0Var.f56792e)) {
                vb0 vb0Var = wb0Var.f56087a;
                if (vb0Var instanceof C4926ci) {
                    long j6 = yb0Var3.f56791d;
                    if (j6 == -9223372036854775807L) {
                        j6 = Long.MIN_VALUE;
                    }
                    ((C4926ci) vb0Var).m23267a(j6);
                }
                long j7 = yb0Var.f56792e;
                return (m30137a(wb0Var) || (wb0Var == this.f57105i && !wb0Var.f56092f.f56793f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : wb0Var.m29451d(j7)) ? 1 : (j3 == ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : wb0Var.m29451d(j7)) ? 0 : -1)) >= 0))) ? false : true;
            }
            wb0Var2 = wb0Var;
            wb0Var = wb0Var.m29446b();
            k61Var2 = k61Var;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.yb0 m30131a(com.yandex.mobile.ads.impl.k61 r22, com.yandex.mobile.ads.impl.yb0 r23) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zb0.m30131a(com.yandex.mobile.ads.impl.k61, com.yandex.mobile.ads.impl.yb0):com.yandex.mobile.ads.impl.yb0");
    }

    /* renamed from: a */
    private static bc0.C4858b m30119a(k61 k61Var, Object obj, long j2, long j3, k61.C5323d c5323d, k61.C5321b c5321b) {
        Object obj2 = obj;
        k61Var.mo23973a(obj, c5321b);
        k61Var.mo23974a(c5321b.f51851c, c5323d, 0L);
        int mo23970a = k61Var.mo23970a(obj);
        while (c5321b.f51852d == 0 && c5321b.m26047a() > 0 && c5321b.m26061f(c5321b.m26056c()) && c5321b.m26053b(0L) == -1) {
            int i2 = mo23970a + 1;
            if (mo23970a >= c5323d.f51879p) {
                break;
            }
            k61Var.mo23972a(i2, c5321b, true);
            obj2 = c5321b.f51850b;
            Objects.requireNonNull(obj2);
            mo23970a = i2;
        }
        k61Var.mo23973a(obj2, c5321b);
        int m26053b = c5321b.m26053b(j2);
        if (m26053b == -1) {
            return new bc0.C4858b(c5321b.m26049a(j2), j3, obj2);
        }
        return new bc0.C4858b(obj2, m26053b, c5321b.m26059d(m26053b), j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30123a(AbstractC4698p.a aVar, bc0.C4858b c4858b) {
        this.f57099c.mo23463a(aVar.m22058a(), c4858b);
    }

    /* renamed from: a */
    public final bc0.C4858b m30127a(k61 k61Var, Object obj, long j2) {
        long j3;
        int mo23970a;
        Object obj2 = obj;
        int i2 = k61Var.mo23973a(obj2, this.f57097a).f51851c;
        Object obj3 = this.f57108l;
        if (obj3 != null && (mo23970a = k61Var.mo23970a(obj3)) != -1 && k61Var.mo23972a(mo23970a, this.f57097a, false).f51851c == i2) {
            j3 = this.f57109m;
        } else {
            wb0 wb0Var = this.f57104h;
            while (true) {
                if (wb0Var != null) {
                    if (wb0Var.f56088b.equals(obj2)) {
                        j3 = wb0Var.f56092f.f56788a.f56452d;
                        break;
                    }
                    wb0Var = wb0Var.m29446b();
                } else {
                    wb0 wb0Var2 = this.f57104h;
                    while (true) {
                        if (wb0Var2 != null) {
                            int mo23970a2 = k61Var.mo23970a(wb0Var2.f56088b);
                            if (mo23970a2 != -1 && k61Var.mo23972a(mo23970a2, this.f57097a, false).f51851c == i2) {
                                j3 = wb0Var2.f56092f.f56788a.f56452d;
                                break;
                            }
                            wb0Var2 = wb0Var2.m29446b();
                        } else {
                            j3 = this.f57101e;
                            this.f57101e = 1 + j3;
                            if (this.f57104h == null) {
                                this.f57108l = obj2;
                                this.f57109m = j3;
                            }
                        }
                    }
                }
            }
        }
        long j4 = j3;
        k61Var.mo23973a(obj2, this.f57097a);
        k61Var.mo23974a(this.f57097a.f51851c, this.f57098b, 0L);
        boolean z = false;
        for (int mo23970a3 = k61Var.mo23970a(obj); mo23970a3 >= this.f57098b.f51878o; mo23970a3--) {
            k61Var.mo23972a(mo23970a3, this.f57097a, true);
            boolean z2 = this.f57097a.m26047a() > 0;
            z |= z2;
            k61.C5321b c5321b = this.f57097a;
            if (c5321b.m26053b(c5321b.f51852d) != -1) {
                obj2 = this.f57097a.f51850b;
                Objects.requireNonNull(obj2);
            }
            if (z && (!z2 || this.f57097a.f51852d != 0)) {
                break;
            }
        }
        return m30119a(k61Var, obj2, j2, j4, this.f57098b, this.f57097a);
    }

    /* renamed from: a */
    private boolean m30125a(k61 k61Var) {
        wb0 wb0Var = this.f57104h;
        if (wb0Var == null) {
            return true;
        }
        int mo23970a = k61Var.mo23970a(wb0Var.f56088b);
        while (true) {
            mo23970a = k61Var.m26040a(mo23970a, this.f57097a, this.f57098b, this.f57102f, this.f57103g);
            while (wb0Var.m29446b() != null && !wb0Var.f56092f.f56794g) {
                wb0Var = wb0Var.m29446b();
            }
            wb0 m29446b = wb0Var.m29446b();
            if (mo23970a == -1 || m29446b == null || k61Var.mo23970a(m29446b.f56088b) != mo23970a) {
                break;
            }
            wb0Var = m29446b;
        }
        boolean m30137a = m30137a(wb0Var);
        wb0Var.f56092f = m30131a(k61Var, wb0Var.f56092f);
        return !m30137a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        if (r1.m26061f(r1.m26056c()) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.impl.yb0 m30120a(com.yandex.mobile.ads.impl.k61 r21, com.yandex.mobile.ads.impl.wb0 r22, long r23) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zb0.m30120a(com.yandex.mobile.ads.impl.k61, com.yandex.mobile.ads.impl.wb0, long):com.yandex.mobile.ads.impl.yb0");
    }

    /* renamed from: a */
    private yb0 m30121a(k61 k61Var, Object obj, int i2, int i3, long j2, long j3) {
        bc0.C4858b c4858b = new bc0.C4858b(obj, i2, i3, j3);
        long m26050a = k61Var.mo23973a(obj, this.f57097a).m26050a(i2, i3);
        long m26054b = i3 == this.f57097a.m26059d(i2) ? this.f57097a.m26054b() : 0L;
        return new yb0(c4858b, (m26050a == -9223372036854775807L || m26054b < m26050a) ? m26054b : Math.max(0L, m26050a - 1), j2, -9223372036854775807L, m26050a, this.f57097a.m26061f(i2), false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.impl.yb0 m30122a(com.yandex.mobile.ads.impl.k61 r29, java.lang.Object r30, long r31, long r33, long r35) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zb0.m30122a(com.yandex.mobile.ads.impl.k61, java.lang.Object, long, long, long):com.yandex.mobile.ads.impl.yb0");
    }
}

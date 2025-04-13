package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4947d;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l51;
import java.util.Collections;

/* renamed from: com.yandex.mobile.ads.impl.vb */
/* loaded from: classes3.dex */
final class C5909vb extends l51 {

    /* renamed from: e */
    private static final int[] f55797e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f55798b;

    /* renamed from: c */
    private boolean f55799c;

    /* renamed from: d */
    private int f55800d;

    public C5909vb(y61 y61Var) {
        super(y61Var);
    }

    /* renamed from: a */
    public final boolean m29209a(ap0 ap0Var) throws l51.C5378a {
        if (this.f55798b) {
            ap0Var.m22593f(1);
        } else {
            int m22607t = ap0Var.m22607t();
            int i2 = (m22607t >> 4) & 15;
            this.f55800d = i2;
            if (i2 == 2) {
                this.f52264a.mo28347a(new C5606pv.a().m27561f("audio/mpeg").m27554c(1).m27569n(f55797e[(m22607t >> 2) & 3]).m27550a());
                this.f55799c = true;
            } else if (i2 == 7 || i2 == 8) {
                this.f52264a.mo28347a(new C5606pv.a().m27561f(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m27554c(1).m27569n(8000).m27550a());
                this.f55799c = true;
            } else if (i2 != 10) {
                StringBuilder m26356a = l60.m26356a("Audio format not supported: ");
                m26356a.append(this.f55800d);
                throw new l51.C5378a(m26356a.toString());
            }
            this.f55798b = true;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m29208a(long j2, ap0 ap0Var) throws ep0 {
        if (this.f55800d == 2) {
            int m22579a = ap0Var.m22579a();
            this.f52264a.mo28345a(m22579a, ap0Var);
            this.f52264a.mo28346a(j2, 1, m22579a, 0, null);
            return true;
        }
        int m22607t = ap0Var.m22607t();
        if (m22607t == 0 && !this.f55799c) {
            int m22579a2 = ap0Var.m22579a();
            byte[] bArr = new byte[m22579a2];
            ap0Var.m22583a(bArr, 0, m22579a2);
            C4947d.a m23731a = C4947d.m23731a(new zo0(m22579a2, bArr), false);
            this.f52264a.mo28347a(new C5606pv.a().m27561f("audio/mp4a-latm").m27547a(m23731a.f49493c).m27554c(m23731a.f49492b).m27569n(m23731a.f49491a).m27548a(Collections.singletonList(bArr)).m27550a());
            this.f55799c = true;
            return false;
        }
        if (this.f55800d == 10 && m22607t != 1) {
            return false;
        }
        int m22579a3 = ap0Var.m22579a();
        this.f52264a.mo28345a(m22579a3, ap0Var);
        this.f52264a.mo28346a(j2, 1, m22579a3, 0, null);
        return true;
    }
}

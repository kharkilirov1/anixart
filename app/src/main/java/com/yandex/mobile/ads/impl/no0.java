package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetricaDefaultValues;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.h41;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
final class no0 extends h41 {

    /* renamed from: o */
    private static final byte[] f53057o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private static final byte[] f53058p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    private boolean f53059n;

    /* renamed from: b */
    public static boolean m26933b(ap0 ap0Var) {
        byte[] bArr = f53057o;
        if (ap0Var.m22579a() < 8) {
            return false;
        }
        int m22588d = ap0Var.m22588d();
        byte[] bArr2 = new byte[8];
        ap0Var.m22583a(bArr2, 0, 8);
        ap0Var.m22591e(m22588d);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: a */
    public final void mo24269a(boolean z) {
        super.mo24269a(z);
        if (z) {
            this.f53059n = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: a */
    public final long mo24268a(ap0 ap0Var) {
        byte[] m22587c = ap0Var.m22587c();
        int i2 = m22587c[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = m22587c[1] & 63;
        }
        int i5 = i2 >> 3;
        return m25056b(i4 * (i5 >= 16 ? 2500 << r1 : i5 >= 12 ? YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << (r1 & 1) : (i5 & 3) == 3 ? 60000 : YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND << r1));
    }

    @Override // com.yandex.mobile.ads.impl.h41
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: a */
    public final boolean mo24270a(ap0 ap0Var, long j2, h41.C5163a c5163a) throws ep0 {
        boolean equals;
        boolean equals2;
        byte[] bArr = f53057o;
        if (ap0Var.m22579a() < 8) {
            equals = false;
        } else {
            int m22588d = ap0Var.m22588d();
            byte[] bArr2 = new byte[8];
            ap0Var.m22583a(bArr2, 0, 8);
            ap0Var.m22591e(m22588d);
            equals = Arrays.equals(bArr2, bArr);
        }
        if (equals) {
            byte[] copyOf = Arrays.copyOf(ap0Var.m22587c(), ap0Var.m22590e());
            int i2 = copyOf[9] & 255;
            ArrayList m27096a = oo0.m27096a(copyOf);
            if (c5163a.f50845a != null) {
                return true;
            }
            c5163a.f50845a = new C5606pv.a().m27561f("audio/opus").m27554c(i2).m27569n(48000).m27548a(m27096a).m27550a();
            return true;
        }
        byte[] bArr3 = f53058p;
        if (ap0Var.m22579a() < 8) {
            equals2 = false;
        } else {
            int m22588d2 = ap0Var.m22588d();
            byte[] bArr4 = new byte[8];
            ap0Var.m22583a(bArr4, 0, 8);
            ap0Var.m22591e(m22588d2);
            equals2 = Arrays.equals(bArr4, bArr3);
        }
        if (equals2) {
            C5220ia.m25474b(c5163a.f50845a);
            if (this.f53059n) {
                return true;
            }
            this.f53059n = true;
            ap0Var.m22593f(8);
            Metadata m22836a = bi1.m22836a(AbstractC4698p.m22053b(bi1.m22837a(ap0Var, false, false).f48885a));
            if (m22836a == null) {
                return true;
            }
            c5163a.f50845a = c5163a.f50845a.m27508a().m27545a(m22836a.m22235a(c5163a.f50845a.f53818j)).m27550a();
            return true;
        }
        C5220ia.m25474b(c5163a.f50845a);
        return false;
    }
}

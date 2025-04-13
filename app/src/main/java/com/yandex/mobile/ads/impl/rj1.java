package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.ff0;

/* loaded from: classes3.dex */
final class rj1 implements h01 {

    /* renamed from: a */
    private final long f54329a;

    /* renamed from: b */
    private final int f54330b;

    /* renamed from: c */
    private final long f54331c;

    /* renamed from: d */
    private final long f54332d;

    /* renamed from: e */
    private final long f54333e;

    /* renamed from: f */
    @Nullable
    private final long[] f54334f;

    private rj1(long j2, int i2, long j3, long j4, @Nullable long[] jArr) {
        this.f54329a = j2;
        this.f54330b = i2;
        this.f54331c = j3;
        this.f54334f = jArr;
        this.f54332d = j4;
        this.f54333e = j4 != -1 ? j2 + j4 : -1L;
    }

    @Nullable
    /* renamed from: a */
    public static rj1 m27936a(long j2, long j3, ff0.C5076a c5076a, ap0 ap0Var) {
        int m22611x;
        int i2 = c5076a.f50251g;
        int i3 = c5076a.f50248d;
        int m22595h = ap0Var.m22595h();
        if ((m22595h & 1) != 1 || (m22611x = ap0Var.m22611x()) == 0) {
            return null;
        }
        long m28097a = s91.m28097a(m22611x, i2 * 1000000, i3);
        if ((m22595h & 6) != 6) {
            return new rj1(j3, c5076a.f50247c, m28097a, -1L, null);
        }
        long m22609v = ap0Var.m22609v();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = ap0Var.m22607t();
        }
        if (j2 != -1) {
            long j4 = j3 + m22609v;
            if (j2 != j4) {
                d90.m23842d("XingSeeker", "XING data size mismatch: " + j2 + ", " + j4);
            }
        }
        return new rj1(j3, c5076a.f50247c, m28097a, m22609v, jArr);
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return this.f54334f != null;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f54331c;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        if (!mo22566b()) {
            g01 g01Var = new g01(0L, this.f54329a + this.f54330b);
            return new e01.C4997a(g01Var, g01Var);
        }
        long j3 = this.f54331c;
        int i2 = s91.f54530a;
        long max = Math.max(0L, Math.min(j2, j3));
        double d = (max * 100.0d) / this.f54331c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i3 = (int) d;
                double d3 = ((long[]) C5220ia.m25474b(this.f54334f))[i3];
                d2 = d3 + (((i3 == 99 ? 256.0d : r3[i3 + 1]) - d3) * (d - i3));
            }
        }
        g01 g01Var2 = new g01(max, this.f54329a + Math.max(this.f54330b, Math.min(Math.round((d2 / 256.0d) * this.f54332d), this.f54332d - 1)));
        return new e01.C4997a(g01Var2, g01Var2);
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25016a(long j2) {
        long j3 = j2 - this.f54329a;
        if (!mo22566b() || j3 <= this.f54330b) {
            return 0L;
        }
        long[] jArr = (long[]) C5220ia.m25474b(this.f54334f);
        double d = (j3 * 256.0d) / this.f54332d;
        int m28118b = s91.m28118b(jArr, (long) d, true);
        long j4 = this.f54331c;
        long j5 = (m28118b * j4) / 100;
        long j6 = jArr[m28118b];
        int i2 = m28118b + 1;
        long j7 = (j4 * i2) / 100;
        return Math.round((j6 == (m28118b == 99 ? 256L : jArr[i2]) ? 0.0d : (d - j6) / (r0 - j6)) * (j7 - j5)) + j5;
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25015a() {
        return this.f54333e;
    }
}

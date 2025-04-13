package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.ff0;

/* loaded from: classes3.dex */
final class za1 implements h01 {

    /* renamed from: a */
    private final long[] f57093a;

    /* renamed from: b */
    private final long[] f57094b;

    /* renamed from: c */
    private final long f57095c;

    /* renamed from: d */
    private final long f57096d;

    private za1(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f57093a = jArr;
        this.f57094b = jArr2;
        this.f57095c = j2;
        this.f57096d = j3;
    }

    @Nullable
    /* renamed from: a */
    public static za1 m30118a(long j2, long j3, ff0.C5076a c5076a, ap0 ap0Var) {
        int m22607t;
        ap0Var.m22593f(10);
        int m22595h = ap0Var.m22595h();
        if (m22595h <= 0) {
            return null;
        }
        int i2 = c5076a.f50248d;
        long m28097a = s91.m28097a(m22595h, 1000000 * (i2 >= 32000 ? 1152 : 576), i2);
        int m22613z = ap0Var.m22613z();
        int m22613z2 = ap0Var.m22613z();
        int m22613z3 = ap0Var.m22613z();
        ap0Var.m22593f(2);
        long j4 = j3 + c5076a.f50247c;
        long[] jArr = new long[m22613z];
        long[] jArr2 = new long[m22613z];
        int i3 = 0;
        long j5 = j3;
        while (i3 < m22613z) {
            int i4 = m22613z2;
            long j6 = j4;
            jArr[i3] = (i3 * m28097a) / m22613z;
            jArr2[i3] = Math.max(j5, j6);
            if (m22613z3 == 1) {
                m22607t = ap0Var.m22607t();
            } else if (m22613z3 == 2) {
                m22607t = ap0Var.m22613z();
            } else if (m22613z3 == 3) {
                m22607t = ap0Var.m22610w();
            } else {
                if (m22613z3 != 4) {
                    return null;
                }
                m22607t = ap0Var.m22611x();
            }
            j5 += m22607t * i4;
            i3++;
            jArr = jArr;
            m22613z2 = i4;
            j4 = j6;
        }
        long[] jArr3 = jArr;
        if (j2 != -1 && j2 != j5) {
            d90.m23842d("VbriSeeker", "VBRI data size mismatch: " + j2 + ", " + j5);
        }
        return new za1(jArr3, jArr2, m28097a, j5);
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        int m28118b = s91.m28118b(this.f57093a, j2, true);
        long[] jArr = this.f57093a;
        long j3 = jArr[m28118b];
        long[] jArr2 = this.f57094b;
        g01 g01Var = new g01(j3, jArr2[m28118b]);
        if (j3 >= j2 || m28118b == jArr.length - 1) {
            return new e01.C4997a(g01Var, g01Var);
        }
        int i2 = m28118b + 1;
        return new e01.C4997a(g01Var, new g01(jArr[i2], jArr2[i2]));
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f57095c;
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25016a(long j2) {
        return this.f57093a[s91.m28118b(this.f57094b, j2, true)];
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25015a() {
        return this.f57096d;
    }
}

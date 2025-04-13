package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;

/* loaded from: classes3.dex */
public final class t20 implements e01 {

    /* renamed from: a */
    private final long[] f54930a;

    /* renamed from: b */
    private final long[] f54931b;

    /* renamed from: c */
    private final long f54932c;

    /* renamed from: d */
    private final boolean f54933d;

    public t20(long j2, long[] jArr, long[] jArr2) {
        C5220ia.m25473a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f54933d = z;
        if (!z || jArr2[0] <= 0) {
            this.f54930a = jArr;
            this.f54931b = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f54930a = jArr3;
            long[] jArr4 = new long[i2];
            this.f54931b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f54932c = j2;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return this.f54933d;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f54932c;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        if (!this.f54933d) {
            g01 g01Var = g01.f50467c;
            return new e01.C4997a(g01Var, g01Var);
        }
        int m28118b = s91.m28118b(this.f54931b, j2, true);
        long[] jArr = this.f54931b;
        long j3 = jArr[m28118b];
        long[] jArr2 = this.f54930a;
        g01 g01Var2 = new g01(j3, jArr2[m28118b]);
        if (j3 == j2 || m28118b == jArr.length - 1) {
            return new e01.C4997a(g01Var2, g01Var2);
        }
        int i2 = m28118b + 1;
        return new e01.C4997a(g01Var2, new g01(jArr[i2], jArr2[i2]));
    }
}

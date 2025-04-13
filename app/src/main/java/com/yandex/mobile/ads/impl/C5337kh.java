package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.kh */
/* loaded from: classes3.dex */
public final class C5337kh implements e01 {

    /* renamed from: a */
    public final int f51972a;

    /* renamed from: b */
    public final int[] f51973b;

    /* renamed from: c */
    public final long[] f51974c;

    /* renamed from: d */
    public final long[] f51975d;

    /* renamed from: e */
    public final long[] f51976e;

    /* renamed from: f */
    private final long f51977f;

    public C5337kh(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f51973b = iArr;
        this.f51974c = jArr;
        this.f51975d = jArr2;
        this.f51976e = jArr3;
        int length = iArr.length;
        this.f51972a = length;
        if (length <= 0) {
            this.f51977f = 0L;
        } else {
            int i2 = length - 1;
            this.f51977f = jArr2[i2] + jArr3[i2];
        }
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        int m28118b = s91.m28118b(this.f51976e, j2, true);
        long[] jArr = this.f51976e;
        long j3 = jArr[m28118b];
        long[] jArr2 = this.f51974c;
        g01 g01Var = new g01(j3, jArr2[m28118b]);
        if (j3 >= j2 || m28118b == this.f51972a - 1) {
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
        return this.f51977f;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("ChunkIndex(length=");
        m26356a.append(this.f51972a);
        m26356a.append(", sizes=");
        m26356a.append(Arrays.toString(this.f51973b));
        m26356a.append(", offsets=");
        m26356a.append(Arrays.toString(this.f51974c));
        m26356a.append(", timeUs=");
        m26356a.append(Arrays.toString(this.f51976e));
        m26356a.append(", durationsUs=");
        m26356a.append(Arrays.toString(this.f51975d));
        m26356a.append(")");
        return m26356a.toString();
    }
}

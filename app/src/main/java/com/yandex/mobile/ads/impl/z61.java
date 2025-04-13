package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class z61 {

    /* renamed from: a */
    public final t61 f57056a;

    /* renamed from: b */
    public final int f57057b;

    /* renamed from: c */
    public final long[] f57058c;

    /* renamed from: d */
    public final int[] f57059d;

    /* renamed from: e */
    public final int f57060e;

    /* renamed from: f */
    public final long[] f57061f;

    /* renamed from: g */
    public final int[] f57062g;

    /* renamed from: h */
    public final long f57063h;

    public z61(t61 t61Var, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        C5220ia.m25473a(iArr.length == jArr2.length);
        C5220ia.m25473a(jArr.length == jArr2.length);
        C5220ia.m25473a(iArr2.length == jArr2.length);
        this.f57056a = t61Var;
        this.f57058c = jArr;
        this.f57059d = iArr;
        this.f57060e = i2;
        this.f57061f = jArr2;
        this.f57062g = iArr2;
        this.f57063h = j2;
        this.f57057b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m30066a(long j2) {
        for (int m28095a = s91.m28095a(this.f57061f, j2, true); m28095a < this.f57061f.length; m28095a++) {
            if ((this.f57062g[m28095a] & 1) != 0) {
                return m28095a;
            }
        }
        return -1;
    }
}

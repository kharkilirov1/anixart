package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;

/* loaded from: classes3.dex */
final class ji1 implements e01 {

    /* renamed from: a */
    private final hi1 f51621a;

    /* renamed from: b */
    private final int f51622b;

    /* renamed from: c */
    private final long f51623c;

    /* renamed from: d */
    private final long f51624d;

    /* renamed from: e */
    private final long f51625e;

    public ji1(hi1 hi1Var, int i2, long j2, long j3) {
        this.f51621a = hi1Var;
        this.f51622b = i2;
        this.f51623c = j2;
        long j4 = (j3 - j2) / hi1Var.f50936d;
        this.f51624d = j4;
        this.f51625e = m25891c(j4);
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        long j3 = this.f51624d - 1;
        int i2 = s91.f54530a;
        long max = Math.max(0L, Math.min((this.f51621a.f50935c * j2) / (this.f51622b * 1000000), j3));
        long j4 = (this.f51621a.f50936d * max) + this.f51623c;
        long m25891c = m25891c(max);
        g01 g01Var = new g01(m25891c, j4);
        if (m25891c >= j2 || max == this.f51624d - 1) {
            return new e01.C4997a(g01Var, g01Var);
        }
        long j5 = max + 1;
        return new e01.C4997a(g01Var, new g01(m25891c(j5), (this.f51621a.f50936d * j5) + this.f51623c));
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f51625e;
    }

    /* renamed from: c */
    private long m25891c(long j2) {
        return s91.m28097a(j2 * this.f51622b, 1000000L, this.f51621a.f50935c);
    }
}

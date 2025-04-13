package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;

/* renamed from: com.yandex.mobile.ads.impl.lk */
/* loaded from: classes3.dex */
public class C5401lk implements e01 {

    /* renamed from: a */
    private final long f52426a;

    /* renamed from: b */
    private final long f52427b;

    /* renamed from: c */
    private final int f52428c;

    /* renamed from: d */
    private final long f52429d;

    /* renamed from: e */
    private final int f52430e;

    /* renamed from: f */
    private final long f52431f;

    /* renamed from: g */
    private final boolean f52432g;

    public C5401lk(int i2, int i3, long j2, long j3, boolean z) {
        this.f52426a = j2;
        this.f52427b = j3;
        this.f52428c = i3 == -1 ? 1 : i3;
        this.f52430e = i2;
        this.f52432g = z;
        if (j2 == -1) {
            this.f52429d = -1L;
            this.f52431f = -9223372036854775807L;
        } else {
            this.f52429d = j2 - j3;
            this.f52431f = m26477a(i2, j2, j3);
        }
    }

    /* renamed from: a */
    private static long m26477a(int i2, long j2, long j3) {
        return ((Math.max(0L, j2 - j3) * 8) * 1000000) / i2;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return this.f52429d != -1 || this.f52432g;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f52431f;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        long j3 = this.f52429d;
        if (j3 == -1 && !this.f52432g) {
            g01 g01Var = new g01(0L, this.f52427b);
            return new e01.C4997a(g01Var, g01Var);
        }
        long j4 = this.f52428c;
        long j5 = (((this.f52430e * j2) / 8000000) / j4) * j4;
        if (j3 != -1) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = this.f52427b + Math.max(j5, 0L);
        long m26478c = m26478c(max);
        g01 g01Var2 = new g01(m26478c, max);
        if (this.f52429d != -1 && m26478c < j2) {
            long j6 = max + this.f52428c;
            if (j6 < this.f52426a) {
                return new e01.C4997a(g01Var2, new g01(m26478c(j6), j6));
            }
        }
        return new e01.C4997a(g01Var2, g01Var2);
    }

    /* renamed from: c */
    public final long m26478c(long j2) {
        return m26477a(this.f52430e, j2, this.f52427b);
    }
}

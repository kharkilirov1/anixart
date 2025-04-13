package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e01;

/* loaded from: classes3.dex */
final class u20 implements h01 {

    /* renamed from: a */
    private final long f55344a;

    /* renamed from: b */
    private final e90 f55345b;

    /* renamed from: c */
    private final e90 f55346c;

    /* renamed from: d */
    private long f55347d;

    public u20(long j2, long j3, long j4) {
        this.f55347d = j2;
        this.f55344a = j4;
        e90 e90Var = new e90();
        this.f55345b = e90Var;
        e90 e90Var2 = new e90();
        this.f55346c = e90Var2;
        e90Var.m24047a(0L);
        e90Var2.m24047a(j3);
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25016a(long j2) {
        return this.f55345b.m24046a(s91.m28092a(this.f55346c, j2));
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        int m28092a = s91.m28092a(this.f55345b, j2);
        long m24046a = this.f55345b.m24046a(m28092a);
        g01 g01Var = new g01(m24046a, this.f55346c.m24046a(m28092a));
        if (m24046a == j2 || m28092a == this.f55345b.m24045a() - 1) {
            return new e01.C4997a(g01Var, g01Var);
        }
        int i2 = m28092a + 1;
        return new e01.C4997a(g01Var, new g01(this.f55345b.m24046a(i2), this.f55346c.m24046a(i2)));
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f55347d;
    }

    /* renamed from: d */
    public final void m28839d(long j2) {
        this.f55347d = j2;
    }

    /* renamed from: c */
    public final boolean m28838c(long j2) {
        e90 e90Var = this.f55345b;
        return j2 - e90Var.m24046a(e90Var.m24045a() - 1) < 100000;
    }

    @Override // com.yandex.mobile.ads.impl.h01
    /* renamed from: a */
    public final long mo25015a() {
        return this.f55344a;
    }

    /* renamed from: a */
    public final void m28837a(long j2, long j3) {
        if (m28838c(j2)) {
            return;
        }
        this.f55345b.m24047a(j2);
        this.f55346c.m24047a(j3);
    }
}

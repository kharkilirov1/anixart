package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C5147gv;
import com.yandex.mobile.ads.impl.e01;

/* renamed from: com.yandex.mobile.ads.impl.fv */
/* loaded from: classes3.dex */
public final class C5093fv implements e01 {

    /* renamed from: a */
    private final C5147gv f50445a;

    /* renamed from: b */
    private final long f50446b;

    public C5093fv(C5147gv c5147gv, long j2) {
        this.f50445a = c5147gv;
        this.f50446b = j2;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final e01.C4997a mo22565b(long j2) {
        C5220ia.m25474b(this.f50445a.f50751k);
        C5147gv c5147gv = this.f50445a;
        C5147gv.a aVar = c5147gv.f50751k;
        long[] jArr = aVar.f50753a;
        long[] jArr2 = aVar.f50754b;
        int m28118b = s91.m28118b(jArr, c5147gv.m24982a(j2), false);
        long j3 = m28118b == -1 ? 0L : jArr[m28118b];
        long j4 = m28118b != -1 ? jArr2[m28118b] : 0L;
        long j5 = this.f50445a.f50745e;
        long j6 = (j3 * 1000000) / j5;
        long j7 = this.f50446b;
        g01 g01Var = new g01(j6, j4 + j7);
        if (j6 == j2 || m28118b == jArr.length - 1) {
            return new e01.C4997a(g01Var, g01Var);
        }
        int i2 = m28118b + 1;
        return new e01.C4997a(g01Var, new g01((jArr[i2] * 1000000) / j5, j7 + jArr2[i2]));
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: b */
    public final boolean mo22566b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.e01
    /* renamed from: c */
    public final long mo22567c() {
        return this.f50445a.m24986b();
    }
}

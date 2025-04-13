package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class v41 implements w41 {

    /* renamed from: a */
    private final C5751sl[] f55748a;

    /* renamed from: b */
    private final long[] f55749b;

    public v41(C5751sl[] c5751slArr, long[] jArr) {
        this.f55748a = c5751slArr;
        this.f55749b = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22723a(long j2) {
        int m28095a = s91.m28095a(this.f55749b, j2, false);
        if (m28095a < this.f55749b.length) {
            return m28095a;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: b */
    public final List<C5751sl> mo22726b(long j2) {
        C5751sl c5751sl;
        int m28118b = s91.m28118b(this.f55749b, j2, false);
        return (m28118b == -1 || (c5751sl = this.f55748a[m28118b]) == C5751sl.f54715r) ? Collections.emptyList() : Collections.singletonList(c5751sl);
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22722a() {
        return this.f55749b.length;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final long mo22724a(int i2) {
        C5220ia.m25473a(i2 >= 0);
        C5220ia.m25473a(i2 < this.f55749b.length);
        return this.f55749b[i2];
    }
}

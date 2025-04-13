package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ch */
/* loaded from: classes3.dex */
final class C4922ch implements w41 {

    /* renamed from: a */
    private final List<C5751sl> f49242a;

    public C4922ch(List<C5751sl> list) {
        this.f49242a = list;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22722a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22723a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final long mo22724a(int i2) {
        C5220ia.m25473a(i2 == 0);
        return 0L;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: b */
    public final List<C5751sl> mo22726b(long j2) {
        return j2 >= 0 ? this.f49242a : Collections.emptyList();
    }
}

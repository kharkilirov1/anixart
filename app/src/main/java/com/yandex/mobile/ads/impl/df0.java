package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class df0 implements w41 {

    /* renamed from: a */
    private final List<C5751sl> f49644a;

    public df0(ArrayList arrayList) {
        this.f49644a = Collections.unmodifiableList(arrayList);
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
        return j2 >= 0 ? this.f49644a : Collections.emptyList();
    }
}

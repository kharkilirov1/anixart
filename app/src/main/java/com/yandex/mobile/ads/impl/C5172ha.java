package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ha */
/* loaded from: classes3.dex */
public final class C5172ha {

    /* renamed from: a */
    private final float f50883a;

    public C5172ha(float f2) {
        this.f50883a = f2 == 0.0f ? 1.7777778f : f2;
    }

    /* renamed from: a */
    public final int m25096a(int i2) {
        return Math.round(i2 / this.f50883a);
    }

    /* renamed from: b */
    public final int m25097b(int i2) {
        return Math.round(i2 * this.f50883a);
    }
}

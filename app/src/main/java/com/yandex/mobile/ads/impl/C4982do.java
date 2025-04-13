package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.do */
/* loaded from: classes3.dex */
public final class C4982do {

    /* renamed from: a */
    private int f49717a;

    /* renamed from: b */
    private int f49718b;

    /* renamed from: c */
    private final int f49719c;

    /* renamed from: d */
    private final float f49720d;

    public C4982do() {
        this(1.0f, 2500, 1);
    }

    /* renamed from: a */
    public final int m23921a() {
        return this.f49718b;
    }

    /* renamed from: b */
    public final int m23923b() {
        return this.f49717a;
    }

    public C4982do(float f2, int i2, int i3) {
        this.f49717a = i2;
        this.f49719c = i3;
        this.f49720d = f2;
    }

    /* renamed from: a */
    public final void m23922a(qh1 qh1Var) throws qh1 {
        int i2 = this.f49718b + 1;
        this.f49718b = i2;
        int i3 = this.f49717a;
        this.f49717a = i3 + ((int) (i3 * this.f49720d));
        if (!(i2 <= this.f49719c)) {
            throw qh1Var;
        }
    }
}

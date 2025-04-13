package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.mf */
/* loaded from: classes3.dex */
public abstract class AbstractC5438mf {

    /* renamed from: a */
    private int f52655a;

    /* renamed from: b */
    public void mo22727b() {
        this.f52655a = 0;
    }

    /* renamed from: c */
    public final void m26633c() {
        this.f52655a &= Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public final boolean m26636d() {
        return m26634c(268435456);
    }

    /* renamed from: e */
    public final boolean m26637e() {
        return m26634c(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean m26638f() {
        return m26634c(4);
    }

    /* renamed from: g */
    public final boolean m26639g() {
        return m26634c(1);
    }

    /* renamed from: b */
    public final void m26632b(int i2) {
        this.f52655a = i2 | this.f52655a;
    }

    /* renamed from: c */
    public final boolean m26634c(int i2) {
        return (this.f52655a & i2) == i2;
    }

    /* renamed from: d */
    public final void m26635d(int i2) {
        this.f52655a = i2;
    }
}

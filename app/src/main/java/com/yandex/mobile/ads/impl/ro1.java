package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hf1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f54378b;

    /* renamed from: c */
    public final /* synthetic */ hf1.C5183a f54379c;

    /* renamed from: d */
    public final /* synthetic */ C5647qm f54380d;

    public /* synthetic */ ro1(hf1.C5183a c5183a, C5647qm c5647qm, int i2) {
        this.f54378b = i2;
        this.f54379c = c5183a;
        this.f54380d = c5647qm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54378b) {
            case 0:
                this.f54379c.m25171c(this.f54380d);
                break;
            default:
                this.f54379c.m25173d(this.f54380d);
                break;
        }
    }
}

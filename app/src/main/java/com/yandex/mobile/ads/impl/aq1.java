package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC5790tb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f48641b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5790tb.a f48642c;

    /* renamed from: d */
    public final /* synthetic */ C5647qm f48643d;

    public /* synthetic */ aq1(InterfaceC5790tb.a aVar, C5647qm c5647qm, int i2) {
        this.f48641b = i2;
        this.f48642c = aVar;
        this.f48643d = c5647qm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48641b) {
            case 0:
                this.f48642c.m28549d(this.f48643d);
                break;
            default:
                this.f48642c.m28546c(this.f48643d);
                break;
        }
    }
}

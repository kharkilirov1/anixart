package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC5790tb;
import com.yandex.mobile.ads.impl.InterfaceC5793tc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f49338b;

    /* renamed from: c */
    public final /* synthetic */ int f49339c;

    /* renamed from: d */
    public final /* synthetic */ long f49340d;

    /* renamed from: e */
    public final /* synthetic */ long f49341e;

    /* renamed from: f */
    public final /* synthetic */ Object f49342f;

    public /* synthetic */ cq1(Object obj, int i2, long j2, long j3, int i3) {
        this.f49338b = i3;
        this.f49342f = obj;
        this.f49339c = i2;
        this.f49340d = j2;
        this.f49341e = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49338b) {
            case 0:
                InterfaceC5793tc.a.C7018a.m28584a((InterfaceC5793tc.a.C7018a.C7019a) this.f49342f, this.f49339c, this.f49340d, this.f49341e);
                break;
            default:
                ((InterfaceC5790tb.a) this.f49342f).m28538a(this.f49339c, this.f49340d, this.f49341e);
                break;
        }
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f53311b;

    /* renamed from: c */
    public final /* synthetic */ wz0 f53312c;

    /* renamed from: d */
    public final /* synthetic */ wz0.InterfaceC5998a f53313d;

    public /* synthetic */ oq1(wz0 wz0Var, wz0.InterfaceC5998a interfaceC5998a, int i2) {
        this.f53311b = i2;
        this.f53312c = wz0Var;
        this.f53313d = interfaceC5998a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53311b) {
            case 0:
                this.f53312c.m29598c(this.f53313d);
                break;
            default:
                this.f53312c.m29595b(this.f53313d);
                break;
        }
    }
}

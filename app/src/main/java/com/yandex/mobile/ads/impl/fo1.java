package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.el1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f50401b;

    /* renamed from: c */
    public final /* synthetic */ el1 f50402c;

    public /* synthetic */ fo1(el1 el1Var, int i2) {
        this.f50401b = i2;
        this.f50402c = el1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50401b) {
            case 0:
                el1.m24199h(this.f50402c);
                break;
            default:
                el1.C5034b.m24205a(this.f50402c);
                break;
        }
    }
}

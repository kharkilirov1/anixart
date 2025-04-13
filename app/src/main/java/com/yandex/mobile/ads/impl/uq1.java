package com.yandex.mobile.ads.impl;

import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f55619b;

    /* renamed from: c */
    public final /* synthetic */ Set f55620c;

    public /* synthetic */ uq1(Set set, int i2) {
        this.f55619b = i2;
        this.f55620c = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55619b) {
            case 0:
                ze1.m30156d(this.f55620c);
                break;
            case 1:
                ze1.m30153a(this.f55620c);
                break;
            case 2:
                ze1.m30155c(this.f55620c);
                break;
            case 3:
                ze1.m30157e(this.f55620c);
                break;
            default:
                ze1.m30154b(this.f55620c);
                break;
        }
    }
}

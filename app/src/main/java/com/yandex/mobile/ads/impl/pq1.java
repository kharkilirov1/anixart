package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f53624b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6103z2 f53625c;

    public /* synthetic */ pq1(InterfaceC6103z2 interfaceC6103z2, int i2) {
        this.f53624b = i2;
        this.f53625c = interfaceC6103z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53624b) {
            case 0:
                this.f53625c.mo27819a();
                break;
            case 1:
                this.f53625c.mo27821c();
                break;
            case 2:
                this.f53625c.mo27820b();
                break;
            case 3:
                this.f53625c.mo27819a();
                break;
            default:
                this.f53625c.mo27819a();
                break;
        }
    }
}

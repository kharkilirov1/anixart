package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC5790tb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f48964b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5790tb.a f48965c;

    /* renamed from: d */
    public final /* synthetic */ Exception f48966d;

    public /* synthetic */ bq1(InterfaceC5790tb.a aVar, Exception exc, int i2) {
        this.f48964b = i2;
        this.f48965c = aVar;
        this.f48966d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48964b) {
            case 0:
                this.f48965c.m28548c(this.f48966d);
                break;
            default:
                this.f48965c.m28551d(this.f48966d);
                break;
        }
    }
}

package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f52041b;

    /* renamed from: c */
    public final /* synthetic */ ci0 f52042c;

    public /* synthetic */ kn1(ci0 ci0Var, int i2) {
        this.f52041b = i2;
        this.f52042c = ci0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52041b) {
            case 0:
                this.f52042c.m23278b();
                break;
            case 1:
                this.f52042c.m23280c();
                break;
            default:
                this.f52042c.m23282d();
                break;
        }
    }
}

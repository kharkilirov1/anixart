package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f56174b;

    /* renamed from: c */
    public final /* synthetic */ ht0 f56175c;

    public /* synthetic */ wo1(ht0 ht0Var, int i2) {
        this.f56174b = i2;
        this.f56175c = ht0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56174b) {
            case 0:
                ht0.m25363b(this.f56175c);
                break;
            case 1:
                ht0.m25361a(this.f56175c);
                break;
            case 2:
                ht0.m25365d(this.f56175c);
                break;
            default:
                ht0.m25364c(this.f56175c);
                break;
        }
    }
}

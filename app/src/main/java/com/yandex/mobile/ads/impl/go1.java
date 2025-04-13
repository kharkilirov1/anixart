package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class go1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f50689b;

    /* renamed from: c */
    public final /* synthetic */ et0 f50690c;

    public /* synthetic */ go1(et0 et0Var, int i2) {
        this.f50689b = i2;
        this.f50690c = et0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f50689b) {
            case 0:
                et0.m24257c(this.f50690c);
                break;
            case 1:
                et0.m24256b(this.f50690c);
                break;
            default:
                et0.m24253a(this.f50690c);
                break;
        }
    }
}

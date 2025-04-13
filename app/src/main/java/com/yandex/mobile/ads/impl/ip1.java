package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f51358b;

    /* renamed from: c */
    public final /* synthetic */ jt0 f51359c;

    public /* synthetic */ ip1(jt0 jt0Var, int i2) {
        this.f51358b = i2;
        this.f51359c = jt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51358b) {
            case 0:
                jt0.m25939a(this.f51359c);
                break;
            case 1:
                jt0.m25942b(this.f51359c);
                break;
            case 2:
                jt0.m25945d(this.f51359c);
                break;
            default:
                jt0.m25944c(this.f51359c);
                break;
        }
    }
}

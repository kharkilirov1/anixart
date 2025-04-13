package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f51669b;

    /* renamed from: c */
    public final /* synthetic */ cc0.C4914a f51670c;

    /* renamed from: d */
    public final /* synthetic */ cc0 f51671d;

    /* renamed from: e */
    public final /* synthetic */ j80 f51672e;

    /* renamed from: f */
    public final /* synthetic */ rb0 f51673f;

    public /* synthetic */ jn1(cc0.C4914a c4914a, cc0 cc0Var, j80 j80Var, rb0 rb0Var, int i2) {
        this.f51669b = i2;
        this.f51670c = c4914a;
        this.f51671d = cc0Var;
        this.f51672e = j80Var;
        this.f51673f = rb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51669b) {
            case 0:
                this.f51670c.m23201b(this.f51671d, this.f51672e, this.f51673f);
                break;
            case 1:
                this.f51670c.m23203c(this.f51671d, this.f51672e, this.f51673f);
                break;
            default:
                this.f51670c.m23197a(this.f51671d, this.f51672e, this.f51673f);
                break;
        }
    }
}

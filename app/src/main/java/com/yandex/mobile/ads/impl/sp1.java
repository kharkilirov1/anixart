package com.yandex.mobile.ads.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f54797b;

    /* renamed from: c */
    public final /* synthetic */ r90 f54798c;

    public /* synthetic */ sp1(r90 r90Var, int i2) {
        this.f54797b = i2;
        this.f54798c = r90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54797b) {
            case 0:
                this.f54798c.m27873a();
                break;
            case 1:
                this.f54798c.m27876b();
                break;
            default:
                this.f54798c.m27878c();
                break;
        }
    }
}

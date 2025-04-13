package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hf1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class so1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f54791b = 0;

    /* renamed from: c */
    public final /* synthetic */ hf1.C5183a f54792c;

    /* renamed from: d */
    public final /* synthetic */ long f54793d;

    /* renamed from: e */
    public final /* synthetic */ int f54794e;

    public /* synthetic */ so1(hf1.C5183a c5183a, int i2, long j2) {
        this.f54792c = c5183a;
        this.f54794e = i2;
        this.f54793d = j2;
    }

    public /* synthetic */ so1(hf1.C5183a c5183a, long j2, int i2) {
        this.f54792c = c5183a;
        this.f54793d = j2;
        this.f54794e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54791b) {
            case 0:
                this.f54792c.m25165b(this.f54794e, this.f54793d);
                break;
            default:
                this.f54792c.m25160a(this.f54793d, this.f54794e);
                break;
        }
    }
}

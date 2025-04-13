package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f52052b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f52053c;

    public /* synthetic */ kp1(Function0 function0, int i2) {
        this.f52052b = i2;
        this.f52053c = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52052b) {
            case 0:
                C5329k9.m26086a(this.f52053c);
                break;
            default:
                C5680r9.m27869a(this.f52053c);
                break;
        }
    }
}

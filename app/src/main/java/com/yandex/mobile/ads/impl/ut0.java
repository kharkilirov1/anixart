package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;

/* loaded from: classes3.dex */
public abstract class ut0 implements InterfaceC5589pf {

    /* renamed from: a */
    public static final InterfaceC5589pf.a<ut0> f55683a = jp1.f51691E;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static ut0 m29137a(Bundle bundle) {
        int i2 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i2 == 0) {
            return C5309jy.f51778d.fromBundle(bundle);
        }
        if (i2 == 1) {
            return pp0.f53611c.fromBundle(bundle);
        }
        if (i2 == 2) {
            return z31.f57028d.fromBundle(bundle);
        }
        if (i2 == 3) {
            return d61.f49580d.fromBundle(bundle);
        }
        throw new IllegalArgumentException(k60.m26036a("Unknown RatingType: ", i2));
    }
}

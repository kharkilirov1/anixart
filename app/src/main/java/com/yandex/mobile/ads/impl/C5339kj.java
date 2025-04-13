package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* renamed from: com.yandex.mobile.ads.impl.kj */
/* loaded from: classes3.dex */
public final class C5339kj {
    @NonNull
    /* renamed from: a */
    public static C5540oj m26130a(@NonNull NativeAd nativeAd, @NonNull InterfaceC5541ok interfaceC5541ok, @NonNull oj0 oj0Var, @NonNull InterfaceC5651qo interfaceC5651qo) {
        NativeAdAssets adAssets = nativeAd.getAdAssets();
        return new C5540oj(new C5203hx(nativeAd, interfaceC5541ok, oj0Var), new C5274j8(adAssets), new gb0(adAssets), new wt0(adAssets), interfaceC5651qo);
    }
}

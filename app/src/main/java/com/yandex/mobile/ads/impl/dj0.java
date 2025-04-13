package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dj0 implements NativeAdEventListener {

    /* renamed from: a */
    @NotNull
    private final C4637e f49659a;

    public dj0(@NotNull C4637e adViewController) {
        Intrinsics.m32179h(adViewController, "adViewController");
        this.f49659a = adViewController;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(@Nullable ImpressionData impressionData) {
        this.f49659a.mo21778a((AdImpressionData) impressionData);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
        this.f49659a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
        this.f49659a.onReturnedToApplication();
    }
}

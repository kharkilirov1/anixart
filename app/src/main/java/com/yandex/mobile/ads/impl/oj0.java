package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes3.dex */
public final class oj0 implements NativeAdEventListener, ClosableNativeAdEventListener {

    /* renamed from: a */
    @NonNull
    private final InterfaceC5896v0 f53278a;

    /* renamed from: b */
    @NonNull
    private final C4890bx f53279b;

    public oj0(@NonNull C4788a1 c4788a1, @NonNull C4890bx c4890bx) {
        this.f53278a = c4788a1;
        this.f53279b = c4890bx;
    }

    @Override // com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener
    public final void closeNativeAd() {
        if (this.f53279b.m22943a()) {
            ((C4788a1) this.f53278a).m22358a();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public void onImpression(@Nullable ImpressionData impressionData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", impressionData instanceof AdImpressionData ? (AdImpressionData) impressionData : null);
        ((C4788a1) this.f53278a).m22360a(16, bundle);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
        ((C4788a1) this.f53278a).m22360a(17, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
        ((C4788a1) this.f53278a).m22360a(18, null);
    }
}

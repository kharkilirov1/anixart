package com.yandex.mobile.ads.mediation.nativeads;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;

/* loaded from: classes3.dex */
interface MediatedNativeAd {
    void bindNativeAd(@NonNull NativeAdViewBinder nativeAdViewBinder);

    void destroy();

    @NonNull
    MediatedNativeAdAssets getMediatedNativeAdAssets();

    void unbindNativeAd(@NonNull NativeAdViewBinder nativeAdViewBinder);
}

package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.List;

@MainThread
/* loaded from: classes3.dex */
public interface SliderAd {
    void bindSliderAd(@NonNull NativeAdViewBinder nativeAdViewBinder) throws NativeAdException;

    @NonNull
    List<NativeAd> getNativeAds();
}

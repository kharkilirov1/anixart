package com.yandex.mobile.ads.nativeads;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.common.AdRequestError;

@MainThread
/* loaded from: classes3.dex */
public interface SliderAdLoadListener {
    void onSliderAdFailedToLoad(@NonNull AdRequestError adRequestError);

    void onSliderAdLoaded(@NonNull SliderAd sliderAd);
}

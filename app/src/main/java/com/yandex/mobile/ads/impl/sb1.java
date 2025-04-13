package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public interface sb1 {
    /* renamed from: a */
    void mo24000a(@NonNull l30 l30Var);

    /* renamed from: a */
    void mo24003a(@NonNull VideoAd videoAd);

    void onAdClicked(@NonNull VideoAd videoAd);

    void onAdCompleted(@NonNull VideoAd videoAd);

    void onAdError(@NonNull VideoAd videoAd);

    void onAdPaused(@NonNull VideoAd videoAd);

    void onAdResumed(@NonNull VideoAd videoAd);

    void onAdSkipped(@NonNull VideoAd videoAd);

    void onAdStarted(@NonNull VideoAd videoAd);

    void onAdStopped(@NonNull VideoAd videoAd);

    void onVolumeChanged(@NonNull VideoAd videoAd, float f2);
}

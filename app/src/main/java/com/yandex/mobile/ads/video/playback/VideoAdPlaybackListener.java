package com.yandex.mobile.ads.video.playback;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

@MainThread
/* loaded from: classes3.dex */
public interface VideoAdPlaybackListener {
    void onAdClicked(@NonNull VideoAd videoAd);

    void onAdCompleted(@NonNull VideoAd videoAd);

    void onAdError(@NonNull VideoAd videoAd);

    void onAdPaused(@NonNull VideoAd videoAd);

    void onAdPrepared(@NonNull VideoAd videoAd);

    void onAdResumed(@NonNull VideoAd videoAd);

    void onAdSkipped(@NonNull VideoAd videoAd);

    void onAdStarted(@NonNull VideoAd videoAd);

    void onAdStopped(@NonNull VideoAd videoAd);

    void onImpression(@NonNull VideoAd videoAd);

    void onVolumeChanged(@NonNull VideoAd videoAd, float f2);
}

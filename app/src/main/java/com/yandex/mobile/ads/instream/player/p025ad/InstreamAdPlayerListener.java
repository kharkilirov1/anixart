package com.yandex.mobile.ads.instream.player.p025ad;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.player.p025ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

@MainThread
/* loaded from: classes3.dex */
public interface InstreamAdPlayerListener {
    void onAdBufferingFinished(@NonNull VideoAd videoAd);

    void onAdBufferingStarted(@NonNull VideoAd videoAd);

    void onAdCompleted(@NonNull VideoAd videoAd);

    void onAdPaused(@NonNull VideoAd videoAd);

    void onAdPrepared(@NonNull VideoAd videoAd);

    void onAdResumed(@NonNull VideoAd videoAd);

    void onAdSkipped(@NonNull VideoAd videoAd);

    void onAdStarted(@NonNull VideoAd videoAd);

    void onAdStopped(@NonNull VideoAd videoAd);

    void onError(@NonNull VideoAd videoAd, @NonNull InstreamAdPlayerError instreamAdPlayerError);

    void onVolumeChanged(@NonNull VideoAd videoAd, float f2);
}

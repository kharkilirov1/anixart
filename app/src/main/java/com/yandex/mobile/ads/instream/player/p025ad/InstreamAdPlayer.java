package com.yandex.mobile.ads.instream.player.p025ad;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

@MainThread
/* loaded from: classes3.dex */
public interface InstreamAdPlayer {
    long getAdDuration(@NonNull VideoAd videoAd);

    long getAdPosition(@NonNull VideoAd videoAd);

    float getVolume(@NonNull VideoAd videoAd);

    boolean isPlayingAd(@NonNull VideoAd videoAd);

    void pauseAd(@NonNull VideoAd videoAd);

    void playAd(@NonNull VideoAd videoAd);

    void prepareAd(@NonNull VideoAd videoAd);

    void releaseAd(@NonNull VideoAd videoAd);

    void resumeAd(@NonNull VideoAd videoAd);

    void setInstreamAdPlayerListener(@Nullable InstreamAdPlayerListener instreamAdPlayerListener);

    void setVolume(@NonNull VideoAd videoAd, float f2);

    void skipAd(@NonNull VideoAd videoAd);

    void stopAd(@NonNull VideoAd videoAd);
}

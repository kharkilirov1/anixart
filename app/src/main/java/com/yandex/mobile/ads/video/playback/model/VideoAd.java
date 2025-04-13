package com.yandex.mobile.ads.video.playback.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface VideoAd {
    @NonNull
    AdPodInfo getAdPodInfo();

    long getDuration();

    @Nullable
    String getInfo();

    @NonNull
    MediaFile getMediaFile();

    @Nullable
    SkipInfo getSkipInfo();
}

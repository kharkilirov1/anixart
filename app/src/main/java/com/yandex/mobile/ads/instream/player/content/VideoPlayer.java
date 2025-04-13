package com.yandex.mobile.ads.instream.player.content;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

@MainThread
/* loaded from: classes3.dex */
public interface VideoPlayer {
    long getVideoDuration();

    long getVideoPosition();

    float getVolume();

    void pauseVideo();

    void prepareVideo();

    void resumeVideo();

    void setVideoPlayerListener(@Nullable VideoPlayerListener videoPlayerListener);
}

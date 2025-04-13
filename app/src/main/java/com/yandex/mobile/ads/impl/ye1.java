package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* loaded from: classes3.dex */
public final class ye1 implements VideoPlayerListener {

    /* renamed from: a */
    @Nullable
    private VideoPlayerListener f56814a;

    /* renamed from: a */
    public final void m29922a(@Nullable VideoPlayerListener videoPlayerListener) {
        this.f56814a = videoPlayerListener;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoCompleted() {
        VideoPlayerListener videoPlayerListener = this.f56814a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoError() {
        VideoPlayerListener videoPlayerListener = this.f56814a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPaused() {
        VideoPlayerListener videoPlayerListener = this.f56814a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoPrepared() {
        VideoPlayerListener videoPlayerListener = this.f56814a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
    public final void onVideoResumed() {
        VideoPlayerListener videoPlayerListener = this.f56814a;
        if (videoPlayerListener != null) {
            videoPlayerListener.onVideoResumed();
        }
    }
}

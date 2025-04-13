package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;

/* loaded from: classes3.dex */
public final class rl1 implements VideoPlayer {

    /* renamed from: a */
    @NonNull
    private final ss0 f54354a;

    /* renamed from: b */
    @NonNull
    private final br0 f54355b;

    /* renamed from: c */
    @NonNull
    private final ye1 f54356c;

    public rl1(@NonNull ls0 ls0Var, @NonNull br0 br0Var, @NonNull ye1 ye1Var) {
        this.f54354a = ls0Var;
        this.f54355b = br0Var;
        this.f54356c = ye1Var;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final long getVideoDuration() {
        return this.f54354a.mo24583a().m27098a();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final long getVideoPosition() {
        return this.f54354a.mo24583a().m27099b();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final float getVolume() {
        Float m22925a = this.f54355b.m22925a();
        if (m22925a != null) {
            return m22925a.floatValue();
        }
        return 0.0f;
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void pauseVideo() {
        this.f54356c.onVideoPaused();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void prepareVideo() {
        this.f54356c.onVideoPrepared();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void resumeVideo() {
        this.f54356c.onVideoResumed();
    }

    @Override // com.yandex.mobile.ads.instream.player.content.VideoPlayer
    public final void setVideoPlayerListener(@Nullable VideoPlayerListener videoPlayerListener) {
        this.f54356c.m29922a(videoPlayerListener);
    }
}

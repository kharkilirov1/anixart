package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* loaded from: classes3.dex */
public final class a50 implements Inroll, Pauseroll {

    /* renamed from: a */
    @NonNull
    private final k90 f48312a;

    public a50(@NonNull k90 k90Var) {
        this.f48312a = k90Var;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    @NonNull
    public final InstreamAdBreak getInstreamAdBreak() {
        return this.f48312a.getInstreamAdBreak();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        this.f48312a.invalidate();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        this.f48312a.pause();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(@NonNull InstreamAdView instreamAdView) {
        this.f48312a.play(instreamAdView);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(@NonNull InstreamAdPlayer instreamAdPlayer) {
        this.f48312a.prepare(instreamAdPlayer);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        this.f48312a.resume();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f48312a.setListener(instreamAdBreakEventListener);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f48312a.setVideoAdPlaybackListener(videoAdPlaybackListener);
    }
}

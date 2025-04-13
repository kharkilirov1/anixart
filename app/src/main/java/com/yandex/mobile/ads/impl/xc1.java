package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xc1 implements VideoAdPlaybackListener {

    /* renamed from: a */
    @Nullable
    private VideoAdPlaybackListener f56454a;

    /* renamed from: a */
    public final void m29737a(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f56454a = videoAdPlaybackListener;
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdClicked(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdClicked(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdCompleted(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdCompleted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdError(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdError(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdPaused(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdPaused(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdPrepared(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdPrepared(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdResumed(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdResumed(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdSkipped(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdSkipped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdStarted(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdStarted(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onAdStopped(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onAdStopped(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onImpression(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onImpression(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
    public final void onVolumeChanged(@NotNull VideoAd videoAd, float f2) {
        Intrinsics.m32179h(videoAd, "videoAd");
        VideoAdPlaybackListener videoAdPlaybackListener = this.f56454a;
        if (videoAdPlaybackListener != null) {
            videoAdPlaybackListener.onVolumeChanged(videoAd, f2);
        }
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zc1 implements sb1 {

    /* renamed from: a */
    public final /* synthetic */ VideoAdPlaybackListener f57116a;

    public zc1(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f57116a = videoAdPlaybackListener;
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24000a(@NotNull l30 videoAdCreativePlayback) {
        Intrinsics.m32179h(videoAdCreativePlayback, "videoAdCreativePlayback");
        this.f57116a.onAdPrepared(videoAdCreativePlayback.m26336a());
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdClicked(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdClicked(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdCompleted(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdCompleted(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdError(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdError(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdPaused(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdPaused(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdResumed(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdResumed(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdSkipped(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdSkipped(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStarted(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdStarted(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStopped(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onAdStopped(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onVolumeChanged(@NotNull VideoAd videoAd, float f2) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onVolumeChanged(videoAd, f2);
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24003a(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f57116a.onImpression(videoAd);
    }
}

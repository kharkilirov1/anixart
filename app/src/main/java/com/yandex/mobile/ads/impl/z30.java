package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z30 {

    /* renamed from: a */
    @NotNull
    private final w11 f57025a;

    /* renamed from: b */
    @NotNull
    private final ns0 f57026b;

    /* renamed from: c */
    @NotNull
    private final a60 f57027c;

    public z30(@NotNull VideoAd videoAd, @NotNull y50 videoViewProvider, @NotNull h50 videoAdPlayer, @NotNull i40 adViewsHolderManager, @NotNull sd1 adStatusController) {
        Intrinsics.m32179h(videoAd, "videoAd");
        Intrinsics.m32179h(videoViewProvider, "videoViewProvider");
        Intrinsics.m32179h(videoAdPlayer, "videoAdPlayer");
        Intrinsics.m32179h(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.m32179h(adStatusController, "adStatusController");
        this.f57025a = new w11(adViewsHolderManager, videoAd);
        this.f57026b = new ns0(adViewsHolderManager);
        this.f57027c = new a60(videoAdPlayer, videoViewProvider, adStatusController);
    }

    /* renamed from: a */
    public final void m30049a(@NotNull jd1 progressEventsObservable) {
        Intrinsics.m32179h(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.m25872a(this.f57025a, this.f57026b, this.f57027c);
    }
}

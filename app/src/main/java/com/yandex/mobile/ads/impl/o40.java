package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o40 {

    /* renamed from: a */
    @NotNull
    private final p40 f53168a;

    public o40(@NotNull m50 instreamVideoAdBreak, @NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(instreamVideoAdBreak, "instreamVideoAdBreak");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f53168a = new p40(instreamVideoAdBreak, videoAdInfo);
    }

    /* renamed from: a */
    public final void m26998a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        VideoAdControlsContainer m28929a = uiElements.m28929a();
        Intrinsics.m32178g(m28929a, "uiElements.adControlsContainer");
        m28929a.setTag(this.f53168a.m27162a());
    }
}

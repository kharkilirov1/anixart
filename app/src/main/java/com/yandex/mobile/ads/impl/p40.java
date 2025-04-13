package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p40 {

    /* renamed from: a */
    @NotNull
    private final m50 f53385a;

    /* renamed from: b */
    @NotNull
    private final hc1<VideoAd> f53386b;

    public p40(@NotNull m50 adBreak, @NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f53385a = adBreak;
        this.f53386b = videoAdInfo;
    }

    @NotNull
    /* renamed from: a */
    public final String m27162a() {
        int adPosition = this.f53386b.m25118c().getAdPodInfo().getAdPosition();
        StringBuilder m26356a = l60.m26356a("yma_");
        m26356a.append(this.f53385a);
        m26356a.append("_position_");
        m26356a.append(adPosition);
        return m26356a.toString();
    }
}

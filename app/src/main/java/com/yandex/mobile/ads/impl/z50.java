package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z50 {

    /* renamed from: a */
    @NotNull
    private final sd1 f57035a;

    /* renamed from: b */
    @NotNull
    private final m50 f57036b;

    /* renamed from: c */
    @NotNull
    private final hc1<VideoAd> f57037c;

    /* renamed from: d */
    private final e50 f57038d;

    public z50(@NotNull sd1 statusController, @NotNull m50 adBreak, @NotNull hc1<VideoAd> videoAdInfo) {
        Intrinsics.m32179h(statusController, "statusController");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        this.f57035a = statusController;
        this.f57036b = adBreak;
        this.f57037c = videoAdInfo;
        this.f57038d = e50.m24007a();
    }

    /* renamed from: a */
    public final boolean m30059a() {
        rd1 rd1Var;
        AdPodInfo adPodInfo = this.f57037c.m25118c().getAdPodInfo();
        Intrinsics.m32178g(adPodInfo, "videoAdInfo.playbackInfo.adPodInfo");
        if (!this.f57038d.m24010b() || adPodInfo.getAdPosition() <= 1) {
            String type = this.f57036b.getType();
            int hashCode = type.hashCode();
            rd1Var = (hashCode == -1183812830 ? type.equals(InstreamAdBreakType.INROLL) : hashCode == 830323571 ? type.equals(InstreamAdBreakType.PAUSEROLL) : hashCode == 1055572677 && type.equals(InstreamAdBreakType.MIDROLL)) ? adPodInfo.getAdPosition() == 1 ? rd1.f54287d : rd1.f54285b : rd1.f54285b;
        } else {
            rd1Var = rd1.f54287d;
        }
        return this.f57035a.m28208a(rd1Var);
    }
}

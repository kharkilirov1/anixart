package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class gc1 {
    @NotNull
    /* renamed from: a */
    public static String m24841a(long j2, @NotNull gd1 adPodInfo, @NotNull pb1 videoAd) {
        Intrinsics.m32179h(adPodInfo, "adPodInfo");
        Intrinsics.m32179h(videoAd, "videoAd");
        int adPosition = adPodInfo.getAdPosition();
        String m27268g = videoAd.m27268g();
        if (m27268g == null) {
            m27268g = String.valueOf(g10.m24763a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ad_break_#");
        sb.append(j2);
        sb.append("|position_");
        sb.append(adPosition);
        return C0000a.m20q(sb, "|video_ad_#", m27268g);
    }
}

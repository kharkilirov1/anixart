package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.th */
/* loaded from: classes3.dex */
public final class C5803th {
    @NotNull
    /* renamed from: a */
    public static C5747sh m28662a(@NotNull hc1 videoAdInfo, @NotNull Context context, @NotNull m50 adBreak, @NotNull tf1 videoTracker, @NotNull sb1 playbackListener, @Nullable C5276ja c5276ja) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        Intrinsics.m32179h(playbackListener, "playbackListener");
        t50 t50Var = new t50(new C5135gl());
        C5083fl m25116a = videoAdInfo.m25116a();
        Intrinsics.m32178g(m25116a, "videoAdInfo.creative");
        return new C5747sh(context, adBreak, videoAdInfo, videoTracker, playbackListener, t50Var.m28466a(m25116a, c5276ja != null ? c5276ja.m25824b() : null));
    }
}

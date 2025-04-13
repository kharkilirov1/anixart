package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.oa */
/* loaded from: classes3.dex */
public final class C5531oa {
    @NotNull
    /* renamed from: a */
    public static C5480na m27058a(@NotNull Context context, @NotNull hc1 videoAdInfo, @NotNull m50 adBreak, @NotNull tf1 videoTracker) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoTracker, "videoTracker");
        mo0 m23025a = new c50(context, adBreak, videoAdInfo).m23025a();
        Intrinsics.m32178g(m23025a, "instreamClickHandlerProvider.openUrlHandler");
        return new C5480na(videoAdInfo, m23025a, videoTracker);
    }
}

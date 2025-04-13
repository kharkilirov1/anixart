package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jb1 {

    /* renamed from: a */
    @NotNull
    private final go0 f51576a = new go0();

    @Nullable
    /* renamed from: a */
    public final ib1 m25861a(@NotNull Context context, @NotNull hc1<?> videoAdInfo, @NotNull EnumC5778t1 adBreakPosition, @NotNull rf1 videoEventTracker) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(adBreakPosition, "adBreakPosition");
        Intrinsics.m32179h(videoEventTracker, "videoEventTracker");
        if (this.f51576a.m24950b(context)) {
            return new ib1(context, videoAdInfo, adBreakPosition, videoEventTracker);
        }
        return null;
    }
}

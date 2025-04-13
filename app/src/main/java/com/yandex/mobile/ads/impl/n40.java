package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n40 {
    @NotNull
    /* renamed from: a */
    public static m40 m26795a(@NotNull Context context, @NotNull hc1 videoAdInfo) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        return new m40(new l40(context, videoAdInfo).m26350a());
    }
}

package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.BuildConfigFieldProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a01 {
    /* renamed from: a */
    public static boolean m22357a(@NotNull cz0 sdkConfiguration) {
        Intrinsics.m32179h(sdkConfiguration, "sdkConfiguration");
        return !Intrinsics.m32174c(BuildConfigFieldProvider.getVersion(), sdkConfiguration.m23609r());
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zx0 {
    @NotNull
    /* renamed from: a */
    public static yx0 m30345a(@NotNull Context context, @NotNull InterfaceC5513nw loadEventListener, @NotNull C5724s3 adLoadingPhasesManager, @NotNull C5097fz htmlAdResponseReportManager, @NotNull qx0 rewardedAdContentFactory) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(loadEventListener, "loadEventListener");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(rewardedAdContentFactory, "rewardedAdContentFactory");
        return new yx0(context, loadEventListener, adLoadingPhasesManager, htmlAdResponseReportManager, rewardedAdContentFactory);
    }
}

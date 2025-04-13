package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q60 {
    @NotNull
    /* renamed from: a */
    public static p60 m27645a(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull C5097fz htmlAdResponseReportManager, @NotNull o60 adContentFactory, @NotNull InterfaceC5513nw loadEventListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(adContentFactory, "adContentFactory");
        Intrinsics.m32179h(loadEventListener, "loadEventListener");
        return new p60(context, adLoadingPhasesManager, htmlAdResponseReportManager, adContentFactory, loadEventListener);
    }
}

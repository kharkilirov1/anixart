package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.exoplayer2.p009ui.AdOverlayInfo;
import com.yandex.mobile.ads.impl.fc1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bs */
/* loaded from: classes3.dex */
public final class C4883bs {
    @NotNull
    /* renamed from: a */
    public static fc1 m22928a(@NotNull AdOverlayInfo adOverlayInfo) {
        Intrinsics.m32179h(adOverlayInfo, "adOverlayInfo");
        View view = adOverlayInfo.f14061a;
        Intrinsics.m32178g(view, "adOverlayInfo.view");
        int i2 = adOverlayInfo.f14062b;
        return new fc1(view, i2 != 1 ? i2 != 2 ? i2 != 4 ? fc1.EnumC5072a.f50209d : fc1.EnumC5072a.f50208c : fc1.EnumC5072a.f50207b : fc1.EnumC5072a.f50206a, adOverlayInfo.f14063c);
    }
}

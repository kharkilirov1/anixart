package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p60 extends AbstractC5462mw<t60> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(@NotNull Context context, @NotNull C5724s3 adLoadingPhasesManager, @NotNull C5097fz htmlAdResponseReportManager, @NotNull o60 interstitialAdContentFactory, @NotNull InterfaceC5513nw<t60> loadEventListener) {
        super(context, EnumC5007e6.f49817c, loadEventListener, adLoadingPhasesManager, interstitialAdContentFactory, htmlAdResponseReportManager);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(interstitialAdContentFactory, "interstitialAdContentFactory");
        Intrinsics.m32179h(loadEventListener, "loadEventListener");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5462mw
    @NotNull
    /* renamed from: a */
    public final InterfaceC5148gw<t60> mo23082a(@NotNull InterfaceC5202hw controllerFactory) {
        Intrinsics.m32179h(controllerFactory, "controllerFactory");
        InterfaceC5148gw<t60> mo25121a = controllerFactory.mo25121a(this);
        Intrinsics.m32178g(mo25121a, "controllerFactory.create…erstitialController(this)");
        return mo25121a;
    }
}

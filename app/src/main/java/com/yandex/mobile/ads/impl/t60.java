package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t60 extends AbstractC4992dx<t60> {
    public /* synthetic */ t60(Context context, AdResponse adResponse, C5101g2 c5101g2, InterfaceC5148gw interfaceC5148gw, ht0 ht0Var) {
        this(context, adResponse, c5101g2, interfaceC5148gw, ht0Var, new C5097fz(), new C6142zv());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4992dx
    /* renamed from: n */
    public final t60 mo22410n() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(@NotNull Context context, @NotNull AdResponse adResponse, @NotNull C5101g2 adConfiguration, @NotNull InterfaceC5148gw fullScreenController, @NotNull ht0 fullScreenShowEventListener, @NotNull C5097fz htmlAdResponseReportManager, @NotNull C6142zv fullScreenAdVisibilityValidator) {
        super(context, adResponse, adConfiguration, fullScreenShowEventListener, fullScreenAdVisibilityValidator, fullScreenController);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(fullScreenController, "fullScreenController");
        Intrinsics.m32179h(fullScreenShowEventListener, "fullScreenShowEventListener");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        htmlAdResponseReportManager.m24758a(adResponse);
    }
}

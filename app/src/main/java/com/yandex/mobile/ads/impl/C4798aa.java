package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.aa */
/* loaded from: classes3.dex */
public final class C4798aa extends AbstractC4992dx<C4798aa> {

    /* renamed from: u */
    @NotNull
    private final ft0 f48337u;

    public /* synthetic */ C4798aa(Context context, AdResponse adResponse, C5101g2 c5101g2, InterfaceC5148gw interfaceC5148gw) {
        this(context, adResponse, c5101g2, interfaceC5148gw, new ft0(), new C6142zv(), new C5097fz());
    }

    /* renamed from: a */
    public final void m22409a(@NotNull InterfaceC5607pw showEventListener) {
        Intrinsics.m32179h(showEventListener, "showEventListener");
        this.f48337u.m24741a(showEventListener);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4992dx
    /* renamed from: n */
    public final C4798aa mo22410n() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4798aa(@NotNull Context context, @NotNull AdResponse<String> adResponse, @NotNull C5101g2 adConfiguration, @NotNull InterfaceC5148gw<C4798aa> fullScreenController, @NotNull ft0 proxyFullScreenShowEventListener, @NotNull C6142zv adVisibilityValidator, @NotNull C5097fz htmlAdResponseReportManager) {
        super(context, adResponse, adConfiguration, proxyFullScreenShowEventListener, adVisibilityValidator, fullScreenController);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(fullScreenController, "fullScreenController");
        Intrinsics.m32179h(proxyFullScreenShowEventListener, "proxyFullScreenShowEventListener");
        Intrinsics.m32179h(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.f48337u = proxyFullScreenShowEventListener;
        htmlAdResponseReportManager.m24758a(adResponse);
    }
}

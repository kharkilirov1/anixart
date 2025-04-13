package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tx0 extends AbstractC4992dx<tx0> {

    /* renamed from: u */
    @Nullable
    private final vx0 f55253u;

    public /* synthetic */ tx0(Context context, AdResponse adResponse, C5101g2 c5101g2, InterfaceC5148gw interfaceC5148gw, jt0 jt0Var) {
        this(context, adResponse, c5101g2, interfaceC5148gw, jt0Var, new wx0(jt0Var), new C5097fz(), new C6142zv());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4992dx
    /* renamed from: n */
    public final tx0 mo22410n() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4992dx, com.yandex.mobile.ads.impl.f71, com.yandex.mobile.ads.impl.InterfaceC5315k2
    public final void onReceiveResult(int i2, @Nullable Bundle bundle) {
        if (i2 == 13) {
            m28766r();
        } else {
            super.onReceiveResult(i2, bundle);
        }
    }

    /* renamed from: r */
    public final void m28766r() {
        vx0 vx0Var = this.f55253u;
        if (vx0Var != null) {
            vx0Var.mo22834a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0(@NotNull Context context, @NotNull AdResponse<String> adResponse, @NotNull C5101g2 adConfiguration, @NotNull InterfaceC5148gw<tx0> fullScreenController, @NotNull jt0 proxyRewardedAdShowListener, @NotNull wx0 rewardedExecutorProvider, @NotNull C5097fz htmlAdResponseReportManager, @NotNull C6142zv fullScreenAdVisibilityValidator) {
        super(context, adResponse, adConfiguration, proxyRewardedAdShowListener, fullScreenAdVisibilityValidator, fullScreenController);
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(fullScreenController, "fullScreenController");
        Intrinsics.m32179h(proxyRewardedAdShowListener, "proxyRewardedAdShowListener");
        Intrinsics.m32179h(rewardedExecutorProvider, "rewardedExecutorProvider");
        Intrinsics.m32179h(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        Intrinsics.m32179h(fullScreenAdVisibilityValidator, "fullScreenAdVisibilityValidator");
        this.f55253u = rewardedExecutorProvider.m29584a(context, adResponse, adConfiguration);
        htmlAdResponseReportManager.m24758a(adResponse);
    }
}

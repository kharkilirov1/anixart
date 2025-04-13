package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.banner.C4637e;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hk1 implements uk1<gk1> {

    /* renamed from: a */
    @NotNull
    private final C5101g2 f50961a;

    /* renamed from: b */
    @NotNull
    private final C4637e f50962b;

    /* renamed from: c */
    @Nullable
    private gk1 f50963c;

    public hk1(@NotNull C5101g2 adConfiguration, @NotNull C4637e adLoadController) {
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(adLoadController, "adLoadController");
        this.f50961a = adConfiguration;
        this.f50962b = adLoadController;
    }

    @Override // com.yandex.mobile.ads.impl.uk1
    /* renamed from: a */
    public final void mo25233a(@NotNull AdResponse<String> adResponse, @NotNull SizeInfo sizeInfo, @NotNull String htmlResponse, @NotNull wk1<gk1> creationListener) throws mi1 {
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(sizeInfo, "sizeInfo");
        Intrinsics.m32179h(htmlResponse, "htmlResponse");
        Intrinsics.m32179h(creationListener, "creationListener");
        Context m28621i = this.f50962b.m28621i();
        Intrinsics.m32178g(m28621i, "adLoadController.context");
        AbstractC4639g m21783y = this.f50962b.m21783y();
        Intrinsics.m32178g(m21783y, "adLoadController.adView");
        ke1 m21775A = this.f50962b.m21775A();
        Intrinsics.m32178g(m21775A, "adLoadController.videoEventController");
        gk1 gk1Var = new gk1(m28621i, this.f50961a, adResponse, m21783y, this.f50962b);
        this.f50963c = gk1Var;
        gk1Var.m24912a(sizeInfo, htmlResponse, m21775A, creationListener);
    }

    @Override // com.yandex.mobile.ads.impl.uk1
    /* renamed from: a */
    public final void mo25232a() {
        gk1 gk1Var = this.f50963c;
        if (gk1Var != null) {
            gk1Var.m24911a();
        }
        this.f50963c = null;
    }
}

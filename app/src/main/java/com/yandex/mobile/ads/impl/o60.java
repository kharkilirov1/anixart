package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o60 implements InterfaceC5943vw<t60> {

    /* renamed from: a */
    @NotNull
    private final Context f53174a;

    /* renamed from: b */
    @NotNull
    private final ht0 f53175b;

    public o60(@NotNull Context context, @NotNull ht0 adShowListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adShowListener, "adShowListener");
        this.f53174a = context;
        this.f53175b = adShowListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5943vw
    /* renamed from: a */
    public final t60 mo22753a(AdResponse adResponse, C5101g2 adConfiguration, InterfaceC5148gw<t60> fullScreenController) {
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(fullScreenController, "fullScreenController");
        return new t60(this.f53174a, adResponse, adConfiguration, fullScreenController, this.f53175b);
    }
}

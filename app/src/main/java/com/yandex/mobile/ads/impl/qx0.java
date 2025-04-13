package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qx0 implements InterfaceC5943vw<tx0> {

    /* renamed from: a */
    @NotNull
    private final Context f54143a;

    /* renamed from: b */
    @NotNull
    private final jt0 f54144b;

    public qx0(@NotNull Context context, @NotNull jt0 listener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(listener, "listener");
        this.f54143a = context;
        this.f54144b = listener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5943vw
    /* renamed from: a */
    public final tx0 mo22753a(AdResponse adResponse, C5101g2 adConfiguration, InterfaceC5148gw<tx0> fullScreenController) {
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(fullScreenController, "fullScreenController");
        return new tx0(this.f54143a, adResponse, adConfiguration, fullScreenController, this.f54144b);
    }
}

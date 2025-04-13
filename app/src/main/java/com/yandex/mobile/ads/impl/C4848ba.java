package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ba */
/* loaded from: classes3.dex */
public final class C4848ba implements InterfaceC5943vw<C4798aa> {

    /* renamed from: a */
    @NotNull
    private final Context f48805a;

    public C4848ba(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f48805a = context;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5943vw
    /* renamed from: a */
    public final C4798aa mo22753a(AdResponse adResponse, C5101g2 adConfiguration, InterfaceC5148gw<C4798aa> fullScreenController) {
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(fullScreenController, "fullScreenController");
        return new C4798aa(this.f48805a, adResponse, adConfiguration, fullScreenController);
    }
}

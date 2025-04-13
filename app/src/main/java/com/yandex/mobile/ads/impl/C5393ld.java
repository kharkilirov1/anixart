package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ld */
/* loaded from: classes3.dex */
public final class C5393ld {

    /* renamed from: a */
    @NotNull
    private final C5101g2 f52361a;

    /* renamed from: b */
    private final Context f52362b;

    public C5393ld(@NotNull Context context, @NotNull C5101g2 adConfiguration) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f52361a = adConfiguration;
        this.f52362b = context.getApplicationContext();
    }

    @NotNull
    /* renamed from: a */
    public final C5333kd m26431a(@NotNull AdResponse<String> adResponse, @NotNull SizeInfo configurationSizeInfo) throws mi1 {
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(configurationSizeInfo, "configurationSizeInfo");
        return new C5333kd(this.f52362b, adResponse, this.f52361a, configurationSizeInfo);
    }
}

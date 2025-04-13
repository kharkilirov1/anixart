package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.banner.C4635c;
import com.yandex.mobile.ads.base.AdResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.uc */
/* loaded from: classes3.dex */
public final class C5855uc {
    @NotNull
    /* renamed from: a */
    public static C4635c m28980a(@NotNull Context context, @NotNull AdResponse adResponse, @NotNull C5101g2 adConfiguration, @NotNull AbstractC4639g adView, @NotNull InterfaceC5176hd bannerShowEventListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Intrinsics.m32179h(adView, "adView");
        Intrinsics.m32179h(bannerShowEventListener, "bannerShowEventListener");
        return new C4635c(context, adResponse, adConfiguration, adView, bannerShowEventListener);
    }
}

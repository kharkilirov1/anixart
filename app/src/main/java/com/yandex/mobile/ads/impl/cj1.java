package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cc1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cj1 {
    @NotNull
    /* renamed from: a */
    public static cc1 m23294a(@NotNull pb1 videoAd, @NotNull pb1 wrapperVideoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        Intrinsics.m32179h(wrapperVideoAd, "wrapperVideoAd");
        cc1 m27273l = videoAd.m27273l();
        Intrinsics.m32178g(m27273l, "videoAd.videoAdExtensions");
        cc1 m27273l2 = wrapperVideoAd.m27273l();
        Intrinsics.m32178g(m27273l2, "wrapperVideoAd.videoAdExtensions");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m27273l.m23219a());
        arrayList.addAll(m27273l2.m23219a());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(m27273l.m23220b());
        arrayList2.addAll(m27273l2.m23220b());
        return new cc1.C4915a().m23221a(arrayList).m23223b(arrayList2).m23222a();
    }
}

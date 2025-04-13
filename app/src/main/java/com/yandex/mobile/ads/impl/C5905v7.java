package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v7 */
/* loaded from: classes3.dex */
public final class C5905v7 {

    /* renamed from: a */
    @NotNull
    private final C5145gt f55771a;

    public C5905v7(@NotNull pb1 videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        cc1 m27273l = videoAd.m27273l();
        Intrinsics.m32178g(m27273l, "videoAd.videoAdExtensions");
        this.f55771a = new C5145gt(m27273l);
    }

    /* renamed from: a */
    public final boolean m29185a() {
        return this.f55771a.m24969a();
    }
}

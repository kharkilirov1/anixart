package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r31 {

    /* renamed from: a */
    @NotNull
    private final C5905v7 f54183a;

    public r31(@NotNull C5905v7 advertiserPresentController) {
        Intrinsics.m32179h(advertiserPresentController, "advertiserPresentController");
        this.f54183a = advertiserPresentController;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/yandex/mobile/ads/impl/hc1<Lcom/yandex/mobile/ads/video/playback/model/VideoAd;>;)V */
    @NotNull
    /* renamed from: a */
    public final int m27826a(@NotNull hc1 videoAdInfo) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        if (videoAdInfo.m25119d() != null) {
            return 2;
        }
        return this.f54183a.m29185a() ? 3 : 1;
    }
}

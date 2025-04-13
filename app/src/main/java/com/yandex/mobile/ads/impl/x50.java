package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x50 implements gf1 {

    /* renamed from: a */
    @NotNull
    private final bg1 f56370a;

    /* renamed from: b */
    @NotNull
    private final z50 f56371b;

    public x50(@NotNull m50 adBreak, @NotNull hc1 videoAdInfo, @NotNull sd1 statusController, @NotNull y50 viewProvider) {
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(statusController, "statusController");
        Intrinsics.m32179h(viewProvider, "viewProvider");
        this.f56370a = new bg1(viewProvider);
        this.f56371b = new z50(statusController, adBreak, videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.gf1
    /* renamed from: a */
    public final boolean mo24877a() {
        return this.f56371b.m30059a() && this.f56370a.m22815a();
    }
}

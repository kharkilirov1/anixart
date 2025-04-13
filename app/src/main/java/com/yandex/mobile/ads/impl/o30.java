package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o30 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NotNull
    private final jc1 f53141a;

    public o30(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f53141a = new jc1(videoAd);
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(new LinkedHashMap());
        tv0Var.m28761b(this.f53141a.m25866a(), "product_type");
        Map<String, Object> m28756a = tv0Var.m28756a();
        Intrinsics.m32178g(m28756a, "reportDataWrapper.reportData");
        return m28756a;
    }
}

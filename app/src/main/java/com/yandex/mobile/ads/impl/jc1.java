package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jc1 {

    /* renamed from: a */
    @NotNull
    private final VideoAd f51580a;

    public jc1(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
        this.f51580a = videoAd;
    }

    @Nullable
    /* renamed from: a */
    public final String m25866a() {
        JSONObject m26034a;
        VideoAd videoAd = this.f51580a;
        k50 k50Var = videoAd instanceof k50 ? (k50) videoAd : null;
        String optString = (k50Var == null || (m26034a = k50Var.m26034a()) == null) ? null : m26034a.optString("productType");
        boolean z = false;
        if (optString != null) {
            if (optString.length() > 0) {
                z = true;
            }
        }
        if (z) {
            return optString;
        }
        return null;
    }
}

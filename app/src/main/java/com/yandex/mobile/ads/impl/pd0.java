package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pd0 {
    @Nullable
    /* renamed from: a */
    public static AdImpressionData m27314a(@NotNull JSONObject jsonObject) {
        Intrinsics.m32179h(jsonObject, "jsonObject");
        try {
            String m24810a = g70.m24810a("impression_data", jsonObject);
            Intrinsics.m32178g(m24810a, "getValidJsonString(jsonObject, attributeName)");
            return new AdImpressionData(m24810a);
        } catch (Exception e2) {
            n60.m26810c(e2.getMessage(), new Object[0]);
            return null;
        }
    }
}

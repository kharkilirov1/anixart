package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.bz */
/* loaded from: classes3.dex */
public final class C4893bz {
    @Nullable
    /* renamed from: a */
    public static AdImpressionData m22946a(@NonNull Map map) {
        String str = (String) map.get(j00.m25754b(9));
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new AdImpressionData(str);
    }
}

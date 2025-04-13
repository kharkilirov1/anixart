package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sh1 {
    @NotNull
    /* renamed from: a */
    public static sw0 m28251a(@NotNull km0 response) {
        Intrinsics.m32179h(response, "response");
        int i2 = response.f52032a;
        ww0 ww0Var = new ww0(response.f52033b);
        Map<String, String> map = response.f52034c;
        if (map == null) {
            map = EmptyMap.f63145b;
        }
        return new sw0(i2, ww0Var, map);
    }

    @NotNull
    /* renamed from: a */
    public static km0 m28250a(@NotNull sw0 response) {
        Intrinsics.m32179h(response, "response");
        return new km0(response.m28366c(), response.m28364a().m29582a(), response.m28365b());
    }
}

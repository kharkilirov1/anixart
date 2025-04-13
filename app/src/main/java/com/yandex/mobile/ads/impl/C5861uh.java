package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.uh */
/* loaded from: classes3.dex */
public final class C5861uh {
    @Nullable
    /* renamed from: a */
    public static int m28994a(@NotNull String value) {
        Intrinsics.m32179h(value, "value");
        for (int i2 : C5919vh._values()) {
            if (Intrinsics.m32174c(C5919vh.m29224a(i2), value)) {
                return i2;
            }
        }
        return 0;
    }
}

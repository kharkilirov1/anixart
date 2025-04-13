package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g21 {
    @NotNull
    /* renamed from: a */
    public static f21 m24800a(@NotNull f21 first, @NotNull f21 second, @NotNull RectF imageSize, @NotNull RectF viewSize) {
        Intrinsics.m32179h(first, "first");
        Intrinsics.m32179h(second, "second");
        Intrinsics.m32179h(imageSize, "imageSize");
        Intrinsics.m32179h(viewSize, "viewSize");
        float m25764a = j21.m25764a(first, viewSize, imageSize);
        float m25764a2 = j21.m25764a(second, viewSize, imageSize);
        if (m25764a == Float.MAX_VALUE) {
            return second;
        }
        return !(m25764a == m25764a2) ? m25764a > m25764a2 ? second : first : first.m24294a() > second.m24294a() ? first : second;
    }
}

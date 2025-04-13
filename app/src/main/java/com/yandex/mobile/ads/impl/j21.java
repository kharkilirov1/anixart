package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j21 {
    /* renamed from: a */
    public static final float m25764a(@NotNull f21 f21Var, @NotNull RectF view, @NotNull RectF image) {
        Intrinsics.m32179h(f21Var, "<this>");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(image, "image");
        float height = view.height();
        float width = view.width();
        float height2 = image.height();
        float width2 = image.width();
        if (!(height == 0.0f)) {
            if (!(width == 0.0f)) {
                if (!(height2 == 0.0f)) {
                    if (!(width2 == 0.0f)) {
                        float min = Math.min(1.0f, width2 / height2 > width / height ? height / height2 : width / width2);
                        if (width >= ((int) (f21Var.m24296c() * min)) && height >= ((int) (f21Var.m24295b() * min))) {
                            return Math.abs(height - (f21Var.m24295b() * min)) + Math.abs(width - (f21Var.m24296c() * min));
                        }
                    }
                }
            }
        }
        return Float.MAX_VALUE;
    }
}

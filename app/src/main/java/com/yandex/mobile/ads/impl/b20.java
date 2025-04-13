package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b20 {
    /* renamed from: a */
    public static boolean m22711a(@NotNull z10 imageValue, @NotNull Map images) {
        Intrinsics.m32179h(imageValue, "imageValue");
        Intrinsics.m32179h(images, "images");
        Bitmap bitmap = (Bitmap) images.get(imageValue.m30042d());
        return bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1;
    }
}

package com.google.android.material.resources;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;

@RestrictTo
/* loaded from: classes.dex */
public class TypefaceUtils {
    @Nullable
    /* renamed from: a */
    public static Typeface m10254a(@NonNull Configuration configuration, @NonNull Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (i2 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i2 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, MathUtils.m1934b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}

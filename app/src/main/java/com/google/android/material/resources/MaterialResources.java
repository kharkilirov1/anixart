package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo
/* loaded from: classes.dex */
public class MaterialResources {
    @Nullable
    /* renamed from: a */
    public static ColorStateList m10240a(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
        int resourceId;
        ColorStateList m496a;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m496a = AppCompatResources.m496a(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : m496a;
    }

    @Nullable
    /* renamed from: b */
    public static ColorStateList m10241b(@NonNull Context context, @NonNull TintTypedArray tintTypedArray, @StyleableRes int i2) {
        int resourceId;
        ColorStateList m496a;
        return (!tintTypedArray.f1582b.hasValue(i2) || (resourceId = tintTypedArray.f1582b.getResourceId(i2, 0)) == 0 || (m496a = AppCompatResources.m496a(context, resourceId)) == null) ? tintTypedArray.m954c(i2) : m496a;
    }

    /* renamed from: c */
    public static int m10242c(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i3);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    /* renamed from: d */
    public static Drawable m10243d(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
        int resourceId;
        Drawable m497b;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (m497b = AppCompatResources.m497b(context, resourceId)) == null) ? typedArray.getDrawable(i2) : m497b;
    }

    @Nullable
    /* renamed from: e */
    public static TextAppearance m10244e(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    /* renamed from: f */
    public static boolean m10245f(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: g */
    public static boolean m10246g(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

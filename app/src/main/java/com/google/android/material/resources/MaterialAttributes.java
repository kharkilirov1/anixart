package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class MaterialAttributes {
    @Nullable
    /* renamed from: a */
    public static TypedValue m10236a(@NonNull Context context, @AttrRes int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m10237b(@NonNull Context context, @AttrRes int i2, boolean z) {
        TypedValue m10236a = m10236a(context, i2);
        return (m10236a == null || m10236a.type != 18) ? z : m10236a.data != 0;
    }

    /* renamed from: c */
    public static int m10238c(@NonNull Context context, @AttrRes int i2, @NonNull String str) {
        return m10239d(context, i2, str).data;
    }

    @NonNull
    /* renamed from: d */
    public static TypedValue m10239d(@NonNull Context context, @AttrRes int i2, @NonNull String str) {
        TypedValue m10236a = m10236a(context, i2);
        if (m10236a != null) {
            return m10236a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }
}

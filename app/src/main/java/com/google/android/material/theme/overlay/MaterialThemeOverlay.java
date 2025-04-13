package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class MaterialThemeOverlay {

    /* renamed from: a */
    public static final int[] f19165a = {R.attr.theme, C2507R.attr.theme};

    /* renamed from: b */
    public static final int[] f19166b = {C2507R.attr.materialThemeOverlay};

    @NonNull
    /* renamed from: a */
    public static Context m10534a(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19166b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).f682a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f19165a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return contextThemeWrapper;
    }
}

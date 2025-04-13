package com.google.android.material.ripple;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.swiftsoft.anixartd.C2507R;
import kotlin.KotlinVersion;

@RestrictTo
/* loaded from: classes.dex */
public class RippleUtils {

    /* renamed from: a */
    public static final int[] f18609a = {R.attr.state_pressed};

    /* renamed from: b */
    public static final int[] f18610b = {R.attr.state_focused};

    /* renamed from: c */
    public static final int[] f18611c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d */
    public static final int[] f18612d = {R.attr.state_selected};

    /* renamed from: e */
    public static final int[] f18613e = {R.attr.state_enabled, R.attr.state_pressed};

    @RequiresApi
    public static class RippleUtilsLollipop {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: b */
        public static Drawable m10261b(@NonNull Context context, @Px int i2) {
            ColorStateList colorStateList;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i2, i2, i2, i2);
            ColorStateList valueOf = ColorStateList.valueOf(0);
            TypedValue m10236a = MaterialAttributes.m10236a(context, C2507R.attr.colorControlHighlight);
            if (m10236a != null) {
                int i3 = m10236a.resourceId;
                if (i3 != 0) {
                    Object obj = ContextCompat.f3288a;
                    colorStateList = ResourcesCompat.m1732b(context.getResources(), i3, context.getTheme());
                } else {
                    colorStateList = ColorStateList.valueOf(m10236a.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                valueOf = colorStateList;
            }
            return new RippleDrawable(valueOf, null, insetDrawable);
        }
    }

    @NonNull
    /* renamed from: a */
    public static ColorStateList m10255a(@Nullable ColorStateList colorStateList) {
        int[] iArr = f18610b;
        return new ColorStateList(new int[][]{f18612d, iArr, StateSet.NOTHING}, new int[]{m10257c(colorStateList, f18611c), m10257c(colorStateList, iArr), m10257c(colorStateList, f18609a)});
    }

    @NonNull
    @RequiresApi
    /* renamed from: b */
    public static Drawable m10256b(@NonNull Context context, @Px int i2) {
        return RippleUtilsLollipop.m10261b(context, i2);
    }

    @ColorInt
    /* renamed from: c */
    public static int m10257c(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ColorUtils.m1776e(colorForState, Math.min(Color.alpha(colorForState) * 2, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    @NonNull
    /* renamed from: d */
    public static ColorStateList m10258d(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f18613e, 0)) != 0) {
            Log.w("RippleUtils", "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m10259e(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}

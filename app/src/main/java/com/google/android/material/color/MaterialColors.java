package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.material.resources.MaterialAttributes;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class MaterialColors {
    @ColorInt
    /* renamed from: a */
    public static int m9968a(@ColorInt int i2, @IntRange int i3) {
        return androidx.core.graphics.ColorUtils.m1776e(i2, (Color.alpha(i2) * i3) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    @ColorInt
    /* renamed from: b */
    public static int m9969b(@NonNull Context context, @AttrRes int i2, @ColorInt int i3) {
        TypedValue m10236a = MaterialAttributes.m10236a(context, i2);
        if (m10236a == null) {
            return i3;
        }
        int i4 = m10236a.resourceId;
        return i4 != 0 ? ContextCompat.m1670c(context, i4) : m10236a.data;
    }

    @ColorInt
    /* renamed from: c */
    public static int m9970c(Context context, @AttrRes int i2, String str) {
        TypedValue m10239d = MaterialAttributes.m10239d(context, i2, str);
        int i3 = m10239d.resourceId;
        return i3 != 0 ? ContextCompat.m1670c(context, i3) : m10239d.data;
    }

    @ColorInt
    /* renamed from: d */
    public static int m9971d(@NonNull View view, @AttrRes int i2) {
        Context context = view.getContext();
        TypedValue m10239d = MaterialAttributes.m10239d(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = m10239d.resourceId;
        return i3 != 0 ? ContextCompat.m1670c(context, i3) : m10239d.data;
    }

    /* renamed from: e */
    public static boolean m9972e(@ColorInt int i2) {
        if (i2 != 0) {
            ThreadLocal<double[]> threadLocal = androidx.core.graphics.ColorUtils.f3366a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = red / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = green / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double[] dArr2 = dArr;
            double d3 = blue / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr2[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr2[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (dArr2[1] / 100.0d > 0.5d) {
                return true;
            }
        }
        return false;
    }

    @ColorInt
    /* renamed from: f */
    public static int m9973f(@ColorInt int i2, @ColorInt int i3, @FloatRange float f2) {
        return androidx.core.graphics.ColorUtils.m1773b(androidx.core.graphics.ColorUtils.m1776e(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }
}

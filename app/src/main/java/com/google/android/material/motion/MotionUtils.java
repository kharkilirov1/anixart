package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MotionUtils {
    /* renamed from: a */
    public static float m10182a(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static boolean m10183b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* renamed from: c */
    public static int m10184c(@NonNull Context context, @AttrRes int i2, int i3) {
        TypedValue m10236a = MaterialAttributes.m10236a(context, i2);
        return (m10236a == null || m10236a.type != 16) ? i3 : m10236a.data;
    }

    @NonNull
    /* renamed from: d */
    public static TimeInterpolator m10185d(@NonNull Context context, @AttrRes int i2, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!(m10183b(valueOf, "cubic-bezier") || m10183b(valueOf, "path"))) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m10183b(valueOf, "cubic-bezier")) {
            if (m10183b(valueOf, "path")) {
                return PathInterpolatorCompat.m2549b(PathParser.m1789d(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException(C0000a.m14k("Invalid motion easing type: ", valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return PathInterpolatorCompat.m2548a(m10182a(split, 0), m10182a(split, 1), m10182a(split, 2), m10182a(split, 3));
        }
        StringBuilder m24u = C0000a.m24u("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        m24u.append(split.length);
        throw new IllegalArgumentException(m24u.toString());
    }
}

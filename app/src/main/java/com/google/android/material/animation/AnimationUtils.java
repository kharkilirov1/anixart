package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class AnimationUtils {

    /* renamed from: a */
    public static final TimeInterpolator f17342a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f17343b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    public static final TimeInterpolator f17344c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    public static final TimeInterpolator f17345d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    public static final TimeInterpolator f17346e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m9737a(float f2, float f3, float f4) {
        return C0000a.m4a(f3, f2, f4, f2);
    }

    /* renamed from: b */
    public static float m9738b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : m9737a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    /* renamed from: c */
    public static int m9739c(int i2, int i3, float f2) {
        return Math.round(f2 * (i3 - i2)) + i2;
    }
}

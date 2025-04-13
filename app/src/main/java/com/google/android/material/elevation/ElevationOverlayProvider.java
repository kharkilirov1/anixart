package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.swiftsoft.anixartd.C2507R;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class ElevationOverlayProvider {

    /* renamed from: f */
    public static final int f18073f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f18074a;

    /* renamed from: b */
    public final int f18075b;

    /* renamed from: c */
    public final int f18076c;

    /* renamed from: d */
    public final int f18077d;

    /* renamed from: e */
    public final float f18078e;

    public ElevationOverlayProvider(@NonNull Context context) {
        boolean m10237b = MaterialAttributes.m10237b(context, C2507R.attr.elevationOverlayEnabled, false);
        int m9969b = MaterialColors.m9969b(context, C2507R.attr.elevationOverlayColor, 0);
        int m9969b2 = MaterialColors.m9969b(context, C2507R.attr.elevationOverlayAccentColor, 0);
        int m9969b3 = MaterialColors.m9969b(context, C2507R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f18074a = m10237b;
        this.f18075b = m9969b;
        this.f18076c = m9969b2;
        this.f18077d = m9969b3;
        this.f18078e = f2;
    }

    @ColorInt
    /* renamed from: a */
    public int m10047a(@ColorInt int i2, float f2) {
        int i3;
        if (!this.f18074a) {
            return i2;
        }
        if (!(ColorUtils.m1776e(i2, KotlinVersion.MAX_COMPONENT_VALUE) == this.f18077d)) {
            return i2;
        }
        float min = (this.f18078e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i2);
        int m9973f = MaterialColors.m9973f(ColorUtils.m1776e(i2, KotlinVersion.MAX_COMPONENT_VALUE), this.f18075b, min);
        if (min > 0.0f && (i3 = this.f18076c) != 0) {
            m9973f = ColorUtils.m1773b(ColorUtils.m1776e(i3, f18073f), m9973f);
        }
        return ColorUtils.m1776e(m9973f, alpha);
    }
}

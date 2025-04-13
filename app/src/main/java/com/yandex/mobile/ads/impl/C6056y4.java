package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: com.yandex.mobile.ads.impl.y4 */
/* loaded from: classes3.dex */
final class C6056y4 {

    /* renamed from: a */
    public static final ColorDrawable f56665a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* renamed from: b */
    public static final LayerDrawable f56666b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        int i2 = C6006x4.f56361b;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        f56666b = layerDrawable;
    }
}

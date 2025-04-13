package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.yandex.mobile.ads.impl.e5 */
/* loaded from: classes3.dex */
public final class C5005e5 {

    /* renamed from: a */
    public static final GradientDrawable f49806a;

    /* renamed from: b */
    public static final ColorDrawable f49807b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f49806a = gradientDrawable;
        f49807b = new ColorDrawable(Color.parseColor("#ff000000"));
    }
}

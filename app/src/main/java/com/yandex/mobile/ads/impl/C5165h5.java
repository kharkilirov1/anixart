package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.h5 */
/* loaded from: classes3.dex */
public final class C5165h5 {
    @NonNull
    /* renamed from: a */
    public static FrameLayout m25058a(@NonNull Context context) {
        C5104g5 c5104g5 = new C5104g5(context);
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = tg1.f55120b;
        int m26789a = n11.m26789a(context, 1, 25.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m26789a, m26789a);
        layoutParams.gravity = 17;
        int round = Math.round(TypedValue.applyDimension(1, 19.5f, context.getResources().getDisplayMetrics()));
        layoutParams.setMargins(round, round, round, round);
        frameLayout.addView(c5104g5, layoutParams);
        c5104g5.setTag(sg1.m28248a("close_button"));
        c5104g5.f50508h = 1.0f;
        c5104g5.invalidate();
        return frameLayout;
    }
}

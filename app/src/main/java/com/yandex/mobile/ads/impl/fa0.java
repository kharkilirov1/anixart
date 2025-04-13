package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ga0;

/* loaded from: classes3.dex */
public final class fa0 implements ga0 {

    /* renamed from: a */
    @NonNull
    private final Context f50189a;

    /* renamed from: b */
    @NonNull
    private final ga0.C5115a f50190b = new ga0.C5115a();

    /* renamed from: c */
    @NonNull
    private final View f50191c;

    /* renamed from: d */
    private final float f50192d;

    public fa0(@NonNull View view, float f2) {
        this.f50189a = view.getContext().getApplicationContext();
        this.f50191c = view;
        this.f50192d = f2;
    }

    @Override // com.yandex.mobile.ads.impl.ga0
    @NonNull
    /* renamed from: a */
    public final ga0.C5115a mo22622a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        Context context = this.f50189a;
        int i4 = tg1.f55120b;
        int round = Math.round(context.getResources().getDisplayMetrics().widthPixels * this.f50192d);
        ViewGroup.LayoutParams layoutParams = this.f50191c.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        }
        this.f50190b.f50538a = View.MeasureSpec.makeMeasureSpec(Math.max(Math.min(size, round), 0), mode);
        ga0.C5115a c5115a = this.f50190b;
        c5115a.f50539b = i3;
        return c5115a;
    }
}

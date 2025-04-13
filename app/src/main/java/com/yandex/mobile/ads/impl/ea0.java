package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ga0;

/* loaded from: classes3.dex */
public final class ea0 implements ga0 {

    /* renamed from: a */
    @NonNull
    private final Context f49850a;

    /* renamed from: b */
    @NonNull
    private final View f49851b;

    /* renamed from: c */
    @NonNull
    private final ga0.C5115a f49852c = new ga0.C5115a();

    /* renamed from: d */
    private final float f49853d;

    public ea0(@NonNull View view, float f2) {
        this.f49850a = view.getContext().getApplicationContext();
        this.f49851b = view;
        this.f49853d = f2;
    }

    @Override // com.yandex.mobile.ads.impl.ga0
    @NonNull
    /* renamed from: a */
    public final ga0.C5115a mo22622a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        Context context = this.f49850a;
        int i4 = tg1.f55120b;
        int round = Math.round(context.getResources().getDisplayMetrics().heightPixels * this.f49853d);
        ViewGroup.LayoutParams layoutParams = this.f49851b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = Math.max(Math.min(size, round), 0);
        ga0.C5115a c5115a = this.f49852c;
        c5115a.f50538a = i2;
        c5115a.f50539b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.f49852c;
    }
}

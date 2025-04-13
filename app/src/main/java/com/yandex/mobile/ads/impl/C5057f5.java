package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* renamed from: com.yandex.mobile.ads.impl.f5 */
/* loaded from: classes3.dex */
public final class C5057f5 {
    @NonNull
    /* renamed from: a */
    public static RelativeLayout.LayoutParams m24318a(@NonNull Context context, @Nullable SizeInfo sizeInfo) {
        RelativeLayout.LayoutParams layoutParams;
        if (sizeInfo != null) {
            int m21916c = sizeInfo.m21916c(context);
            int m21913a = sizeInfo.m21913a(context);
            int i2 = tg1.f55120b;
            layoutParams = new RelativeLayout.LayoutParams(n11.m26789a(context, 1, m21916c), n11.m26789a(context, 1, m21913a));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    @NonNull
    /* renamed from: a */
    public static RelativeLayout.LayoutParams m24317a(@NonNull Context context, @Nullable AdResponse adResponse) {
        RelativeLayout.LayoutParams layoutParams;
        if (adResponse != null) {
            int m21828r = adResponse.m21828r();
            int m21814d = adResponse.m21814d();
            int i2 = tg1.f55120b;
            layoutParams = new RelativeLayout.LayoutParams(n11.m26789a(context, 1, m21828r), n11.m26789a(context, 1, m21814d));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    @NonNull
    /* renamed from: a */
    public static RelativeLayout.LayoutParams m24319a(@NonNull Context context, @NonNull C5715rw c5715rw) {
        int i2 = tg1.f55120b;
        boolean z = true;
        int m26789a = n11.m26789a(context, 1, 25.0f);
        int m26789a2 = n11.m26789a(context, 1, 64.0f);
        int i3 = m26789a2 >> 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m26789a2, m26789a2);
        layoutParams.addRule(7, c5715rw.getId());
        layoutParams.addRule(6, c5715rw.getId());
        ViewGroup.LayoutParams layoutParams2 = c5715rw.getLayoutParams();
        int i4 = layoutParams2.width;
        boolean z2 = i4 == -1 || i4 + m26789a >= context.getResources().getDisplayMetrics().widthPixels;
        int i5 = layoutParams2.height;
        if (i5 != -1 && i5 + m26789a < context.getResources().getDisplayMetrics().heightPixels) {
            z = false;
        }
        int i6 = (m26789a >> 1) - ((m26789a2 - m26789a) / 2);
        if (!z2 && !z) {
            i6 = -i3;
        }
        layoutParams.setMargins(0, i6, i6, 0);
        return layoutParams;
    }
}

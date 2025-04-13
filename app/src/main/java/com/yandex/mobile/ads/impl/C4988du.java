package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;

/* renamed from: com.yandex.mobile.ads.impl.du */
/* loaded from: classes3.dex */
public final class C4988du {

    /* renamed from: c */
    private static final int f49742c = Color.parseColor("#66000000");

    /* renamed from: d */
    private static final int f49743d = Color.parseColor("#00000000");

    /* renamed from: e */
    private static final int f49744e = Color.parseColor("#7f7f7f");

    /* renamed from: a */
    @NonNull
    private Context f49745a;

    /* renamed from: b */
    @NonNull
    private final NativeAdAssets f49746b;

    public C4988du(@NonNull Context context, @NonNull NativeAdAssets nativeAdAssets) {
        this.f49745a = context;
        this.f49746b = nativeAdAssets;
    }

    /* renamed from: a */
    public final void m23939a(@NonNull ImageView imageView, @NonNull FrameLayout frameLayout, int i2) {
        if (!new C5045eu(this.f49746b).m24266a()) {
            int i3 = f49744e;
            Drawable m1671d = ContextCompat.m1671d(this.f49745a, C4632R.drawable.yandex_ads_internal_ic_close_gray);
            m1671d.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(m1671d);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground(null);
            frameLayout.setVisibility(0);
            return;
        }
        if (this.f49746b.getMedia() != null) {
            int i4 = f49744e;
            Drawable m1671d2 = ContextCompat.m1671d(this.f49745a, C4632R.drawable.yandex_ads_internal_ic_close_gray);
            m1671d2.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(m1671d2);
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setBackground(null);
            frameLayout.setVisibility(8);
            return;
        }
        if (this.f49746b.getImage() != null) {
            Drawable m1671d3 = ContextCompat.m1671d(this.f49745a, C4632R.drawable.yandex_ads_internal_ic_close_gray);
            m1671d3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            imageView.setImageDrawable(m1671d3);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f49742c, f49743d});
            frameLayout.setPadding(0, 0, 0, i2);
            frameLayout.setBackground(gradientDrawable);
            frameLayout.setVisibility(0);
        }
    }
}

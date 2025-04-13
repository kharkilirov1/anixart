package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ng0 {

    /* renamed from: a */
    @NotNull
    private final w10 f52985a;

    /* renamed from: com.yandex.mobile.ads.impl.ng0$a */
    public static final class ViewOnClickListenerC5494a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            ViewParent parent = view != null ? view.getParent() : null;
            ViewParent parent2 = parent != null ? parent.getParent() : null;
            ViewPager2 viewPager2 = parent2 instanceof ViewPager2 ? (ViewPager2) parent2 : null;
            if (viewPager2 != null) {
                viewPager2.callOnClick();
            }
        }
    }

    public ng0(@NotNull w10 imageProvider) {
        Intrinsics.m32179h(imageProvider, "imageProvider");
        this.f52985a = imageProvider;
    }

    @NotNull
    /* renamed from: a */
    public final mg0 m26905a(@NotNull ViewGroup parent) {
        Intrinsics.m32179h(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.m32178g(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new ViewOnClickListenerC5494a());
        return new mg0(imageView, new h20(imageView, this.f52985a));
    }
}

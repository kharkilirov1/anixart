package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rg0 {
    /* renamed from: a */
    public static void m27921a(@NotNull MediaView mediaView, @NotNull ExtendedViewContainer container, @NotNull ViewPager2 viewPager, @Nullable MultiBannerControlsContainer multiBannerControlsContainer) {
        Intrinsics.m32179h(mediaView, "mediaView");
        Intrinsics.m32179h(container, "container");
        Intrinsics.m32179h(viewPager, "viewPager");
        mediaView.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        container.addView(viewPager, layoutParams);
        if (multiBannerControlsContainer != null) {
            container.addView(multiBannerControlsContainer, layoutParams);
        }
        mediaView.addView(container, layoutParams);
    }
}

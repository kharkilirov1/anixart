package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kg0 {

    /* renamed from: a */
    @NotNull
    private final qy0<MultiBannerControlsContainer> f51969a = new qy0<>();

    @Nullable
    /* renamed from: a */
    public final MultiBannerControlsContainer m26123a(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        qy0<MultiBannerControlsContainer> qy0Var = this.f51969a;
        int i2 = C4632R.layout.yandex_ads_internal_multibanner_controls;
        Objects.requireNonNull(qy0Var);
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) qy0.m27797a(context, MultiBannerControlsContainer.class, i2, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        return multiBannerControlsContainer;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.AbstractViewOnClickListenerC5976wk;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sc0 {

    /* renamed from: a */
    @NotNull
    private final rg0 f54622a = new rg0();

    /* renamed from: b */
    @NotNull
    private final kg0 f54623b = new kg0();

    /* renamed from: c */
    @NotNull
    private final jg0 f54624c = new jg0();

    @NotNull
    /* renamed from: a */
    public final bl1 m28205a(@NotNull MediaView mediaView, @NotNull w10 imageProvider, @NotNull List imageValues, @NotNull C5101g2 adConfiguration, @Nullable s01 s01Var) {
        Long l2;
        ig0 ig0Var;
        Intrinsics.m32179h(mediaView, "mediaView");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(imageValues, "imageValues");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        Context context = mediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        Intrinsics.m32178g(context, "context");
        lg0 lg0Var = new lg0(context);
        sg0 sg0Var = new sg0(viewPager2);
        if (s01Var == null || (l2 = s01Var.m28034a()) == null) {
            l2 = 0L;
        }
        long longValue = l2.longValue();
        if (longValue > 0) {
            ig0Var = new ig0(viewPager2, sg0Var, lg0Var);
            viewPager2.addOnAttachStateChangeListener(new og0(ig0Var, longValue));
        } else {
            ig0Var = null;
        }
        viewPager2.m4389c(new xo0(lg0Var, ig0Var));
        MultiBannerControlsContainer m26123a = this.f54623b.m26123a(context);
        if (m26123a != null) {
            m26123a.m30748a(viewPager2);
            m26123a.setOnClickLeftButtonListener(new AbstractViewOnClickListenerC5976wk.a(sg0Var, lg0Var, ig0Var));
            m26123a.setOnClickRightButtonListener(new AbstractViewOnClickListenerC5976wk.b(sg0Var, lg0Var, ig0Var));
        }
        ExtendedViewContainer m25887a = this.f54624c.m25887a(context, imageValues);
        Objects.requireNonNull(this.f54622a);
        rg0.m27921a(mediaView, m25887a, viewPager2, m26123a);
        return new bl1(mediaView, new ug0(viewPager2, imageProvider), adConfiguration);
    }
}

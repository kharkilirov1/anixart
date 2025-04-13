package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bl1 extends nc0 {

    /* renamed from: c */
    @NotNull
    private final eg1<ViewPager2, List<z10>> f48920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl1(@NotNull MediaView mediaView, @NotNull ug0 multiBannerViewAdapter, @NotNull C5101g2 adConfiguration) {
        super(mediaView, adConfiguration);
        Intrinsics.m32179h(mediaView, "mediaView");
        Intrinsics.m32179h(multiBannerViewAdapter, "multiBannerViewAdapter");
        Intrinsics.m32179h(adConfiguration, "adConfiguration");
        this.f48920c = new eg1<>(multiBannerViewAdapter);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(MediaView mediaView) {
        MediaView mediaView2 = mediaView;
        Intrinsics.m32179h(mediaView2, "mediaView");
        this.f48920c.m24149a();
        super.mo22387a((bl1) mediaView2);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean mo22388a(@NotNull MediaView mediaView, @NotNull jc0 mediaValue) {
        Intrinsics.m32179h(mediaView, "mediaView");
        Intrinsics.m32179h(mediaValue, "mediaValue");
        List<z10> m25863a = mediaValue.m25863a();
        if (m25863a != null && (m25863a.isEmpty() ^ true)) {
            return this.f48920c.m24151a(m25863a);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    @NotNull
    /* renamed from: c */
    public final int mo22545c() {
        return 3;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22499a(C5276ja asset, gg1 viewConfigurator, jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        Intrinsics.m32179h(asset, "asset");
        Intrinsics.m32179h(viewConfigurator, "viewConfigurator");
        this.f48920c.m24150a(asset, viewConfigurator, jc0Var2 != null ? jc0Var2.m25863a() : null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.nc0
    /* renamed from: a */
    public final void mo22389b(@NotNull MediaView mediaView, @NotNull jc0 mediaValue) {
        Intrinsics.m32179h(mediaView, "mediaView");
        Intrinsics.m32179h(mediaValue, "mediaValue");
        super.mo22389b(mediaView, mediaValue);
        List<z10> m25863a = mediaValue.m25863a();
        if (m25863a != null && (m25863a.isEmpty() ^ true)) {
            this.f48920c.m24153b(m25863a);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    /* renamed from: a */
    public final void mo22543a(@NotNull jc0 mediaValue) {
        Intrinsics.m32179h(mediaValue, "mediaValue");
        List<z10> m25863a = mediaValue.m25863a();
        if (m25863a != null && (m25863a.isEmpty() ^ true)) {
            this.f48920c.m24153b(m25863a);
        }
    }
}

package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ug0 extends dg1<ViewPager2, List<? extends z10>> {

    /* renamed from: b */
    @NotNull
    private final w10 f55493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(@NotNull ViewPager2 viewPager, @NotNull w10 imageProvider) {
        super(viewPager);
        Intrinsics.m32179h(viewPager, "viewPager");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        this.f55493b = imageProvider;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final boolean mo22388a(ViewPager2 viewPager2, List<? extends z10> list) {
        ViewPager2 viewPager = viewPager2;
        List<? extends z10> imageValues = list;
        Intrinsics.m32179h(viewPager, "viewPager");
        Intrinsics.m32179h(imageValues, "imageValues");
        return viewPager.getAdapter() instanceof qg0;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(ViewPager2 viewPager2, List<? extends z10> list) {
        ViewPager2 viewPager = viewPager2;
        List<? extends z10> imageValues = list;
        Intrinsics.m32179h(viewPager, "viewPager");
        Intrinsics.m32179h(imageValues, "imageValues");
        viewPager.setAdapter(new qg0(this.f55493b, imageValues));
    }
}

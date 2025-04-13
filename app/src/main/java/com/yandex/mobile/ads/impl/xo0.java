package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xo0 extends ViewPager2.OnPageChangeCallback {

    /* renamed from: a */
    @NotNull
    private final lg0 f56516a;

    /* renamed from: b */
    @Nullable
    private final ig0 f56517b;

    /* renamed from: c */
    private boolean f56518c;

    public xo0(@NotNull lg0 multiBannerEventTracker, @Nullable ig0 ig0Var) {
        Intrinsics.m32179h(multiBannerEventTracker, "multiBannerEventTracker");
        this.f56516a = multiBannerEventTracker;
        this.f56517b = ig0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i2) {
        if (i2 == 0) {
            this.f56518c = false;
        } else {
            if (i2 != 1) {
                return;
            }
            ig0 ig0Var = this.f56517b;
            if (ig0Var != null) {
                ig0Var.m25533a();
            }
            this.f56518c = true;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i2) {
        if (this.f56518c) {
            this.f56516a.m26451c();
            this.f56518c = false;
        }
    }
}

package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sg0 {

    /* renamed from: a */
    @NotNull
    private final WeakReference<ViewPager2> f54668a;

    public sg0(@NotNull ViewPager2 viewPager) {
        Intrinsics.m32179h(viewPager, "viewPager");
        this.f54668a = new WeakReference<>(viewPager);
    }

    /* renamed from: a */
    public final void m28246a() {
        ViewPager2 viewPager2 = this.f54668a.get();
        if (viewPager2 != null) {
            viewPager2.m4391e(viewPager2.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: b */
    public final void m28247b() {
        ViewPager2 viewPager2 = this.f54668a.get();
        if (viewPager2 != null) {
            viewPager2.m4391e(viewPager2.getCurrentItem() - 1, true);
        }
    }
}

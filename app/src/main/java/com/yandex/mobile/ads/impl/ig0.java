package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ig0 {

    /* renamed from: a */
    @NotNull
    private final sg0 f51293a;

    /* renamed from: b */
    @NotNull
    private final lg0 f51294b;

    /* renamed from: c */
    @NotNull
    private final WeakReference<ViewPager2> f51295c;

    /* renamed from: d */
    @NotNull
    private final Timer f51296d;

    /* renamed from: e */
    @Nullable
    private tg0 f51297e;

    /* renamed from: f */
    private boolean f51298f;

    public ig0(@NotNull ViewPager2 viewPager, @NotNull sg0 multiBannerSwiper, @NotNull lg0 multiBannerEventTracker) {
        Intrinsics.m32179h(viewPager, "viewPager");
        Intrinsics.m32179h(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.m32179h(multiBannerEventTracker, "multiBannerEventTracker");
        this.f51293a = multiBannerSwiper;
        this.f51294b = multiBannerEventTracker;
        this.f51295c = new WeakReference<>(viewPager);
        this.f51296d = new Timer();
        this.f51298f = true;
    }

    /* renamed from: a */
    public final void m25534a(long j2) {
        Unit unit;
        if (j2 <= 0 || !this.f51298f) {
            return;
        }
        m25535b();
        ViewPager2 viewPager2 = this.f51295c.get();
        if (viewPager2 != null) {
            tg0 tg0Var = new tg0(viewPager2, this.f51293a, this.f51294b);
            this.f51297e = tg0Var;
            try {
                this.f51296d.schedule(tg0Var, j2, j2);
            } catch (Exception unused) {
                m25535b();
            }
            unit = Unit.f63088a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m25533a();
        }
    }

    /* renamed from: b */
    public final void m25535b() {
        tg0 tg0Var = this.f51297e;
        if (tg0Var != null) {
            tg0Var.cancel();
        }
        this.f51297e = null;
    }

    /* renamed from: a */
    public final void m25533a() {
        m25535b();
        this.f51298f = false;
        this.f51296d.cancel();
    }
}

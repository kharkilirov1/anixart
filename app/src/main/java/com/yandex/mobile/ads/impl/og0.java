package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class og0 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    @NotNull
    private final ig0 f53264a;

    /* renamed from: b */
    private final long f53265b;

    public og0(@NotNull ig0 multiBannerAutoSwipeController, long j2) {
        Intrinsics.m32179h(multiBannerAutoSwipeController, "multiBannerAutoSwipeController");
        this.f53264a = multiBannerAutoSwipeController;
        this.f53265b = j2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.m32179h(v, "v");
        this.f53264a.m25534a(this.f53265b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.m32179h(v, "v");
        this.f53264a.m25535b();
    }
}

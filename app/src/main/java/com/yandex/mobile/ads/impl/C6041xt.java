package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xt */
/* loaded from: classes3.dex */
public final class C6041xt implements k40 {

    /* renamed from: a */
    @NotNull
    private final w10 f56565a;

    /* renamed from: b */
    @Nullable
    private final C5276ja<?> f56566b;

    /* renamed from: c */
    @NotNull
    private final C5480na f56567c;

    public C6041xt(@NotNull w10 imageProvider, @Nullable C5276ja<?> c5276ja, @NotNull C5480na clickConfigurator) {
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(clickConfigurator, "clickConfigurator");
        this.f56565a = imageProvider;
        this.f56566b = c5276ja;
        this.f56567c = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        ImageView m28935g = uiElements.m28935g();
        if (m28935g != null) {
            C5276ja<?> c5276ja = this.f56566b;
            Object m25826d = c5276ja != null ? c5276ja.m25826d() : null;
            z10 z10Var = m25826d instanceof z10 ? (z10) m25826d : null;
            if (z10Var != null) {
                m28935g.setImageBitmap(this.f56565a.mo24878a(z10Var));
                m28935g.setVisibility(0);
            }
            this.f56567c.m26825a(m28935g, this.f56566b);
        }
    }
}

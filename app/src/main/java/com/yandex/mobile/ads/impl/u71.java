package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u71 implements k40 {

    /* renamed from: a */
    @NotNull
    private final w10 f55420a;

    /* renamed from: b */
    @Nullable
    private final C5276ja<?> f55421b;

    /* renamed from: c */
    @NotNull
    private final C5480na f55422c;

    public u71(@NotNull w10 imageProvider, @Nullable C5276ja<?> c5276ja, @NotNull C5480na assetClickConfigurator) {
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(assetClickConfigurator, "assetClickConfigurator");
        this.f55420a = imageProvider;
        this.f55421b = c5276ja;
        this.f55422c = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        ImageView m28944p = uiElements.m28944p();
        TextView m28943o = uiElements.m28943o();
        if (m28944p != null) {
            C5276ja<?> c5276ja = this.f55421b;
            Object m25826d = c5276ja != null ? c5276ja.m25826d() : null;
            z10 z10Var = m25826d instanceof z10 ? (z10) m25826d : null;
            if (z10Var != null) {
                m28944p.setImageBitmap(this.f55420a.mo24878a(z10Var));
                m28944p.setVisibility(0);
                if (m28943o != null) {
                    m28943o.setVisibility(0);
                }
            }
            this.f55422c.m26825a(m28944p, this.f55421b);
        }
    }
}

package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q31 implements k40 {

    /* renamed from: a */
    @Nullable
    private final C5276ja<?> f53923a;

    /* renamed from: b */
    @NotNull
    private final C5480na f53924b;

    public q31(@Nullable C5276ja<?> c5276ja, @NotNull C5480na clickConfigurator) {
        Intrinsics.m32179h(clickConfigurator, "clickConfigurator");
        this.f53923a = c5276ja;
        this.f53924b = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        TextView m28942n = uiElements.m28942n();
        if (m28942n != null) {
            C5276ja<?> c5276ja = this.f53923a;
            Object m25826d = c5276ja != null ? c5276ja.m25826d() : null;
            if (m25826d instanceof String) {
                m28942n.setText((CharSequence) m25826d);
                m28942n.setVisibility(0);
            }
            this.f53924b.m26825a(m28942n, this.f53923a);
        }
    }
}

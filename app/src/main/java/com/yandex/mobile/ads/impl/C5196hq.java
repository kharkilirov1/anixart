package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hq */
/* loaded from: classes3.dex */
public final class C5196hq implements k40 {

    /* renamed from: a */
    @Nullable
    private final C5276ja<?> f51120a;

    /* renamed from: b */
    @NotNull
    private final C5480na f51121b;

    public C5196hq(@Nullable C5276ja<?> c5276ja, @NotNull C5480na clickConfigurator) {
        Intrinsics.m32179h(clickConfigurator, "clickConfigurator");
        this.f51120a = c5276ja;
        this.f51121b = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        TextView m28934f = uiElements.m28934f();
        C5276ja<?> c5276ja = this.f51120a;
        Object m25826d = c5276ja != null ? c5276ja.m25826d() : null;
        if (m28934f == null || !(m25826d instanceof String)) {
            return;
        }
        m28934f.setText((CharSequence) m25826d);
        m28934f.setVisibility(0);
        this.f51121b.m26825a(m28934f, this.f51120a);
    }
}

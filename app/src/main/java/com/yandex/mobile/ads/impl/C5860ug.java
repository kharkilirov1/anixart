package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ug */
/* loaded from: classes3.dex */
public final class C5860ug implements k40 {

    /* renamed from: a */
    @Nullable
    private final C5276ja<?> f55491a;

    /* renamed from: b */
    @NotNull
    private final C5747sh f55492b;

    public C5860ug(@Nullable C5276ja<?> c5276ja, @NotNull C5747sh clickControlConfigurator) {
        Intrinsics.m32179h(clickControlConfigurator, "clickControlConfigurator");
        this.f55491a = c5276ja;
        this.f55492b = clickControlConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        TextView m28933e = uiElements.m28933e();
        ImageView m28932d = uiElements.m28932d();
        if (m28933e != null) {
            C5276ja<?> c5276ja = this.f55491a;
            Object m25826d = c5276ja != null ? c5276ja.m25826d() : null;
            if (m25826d instanceof String) {
                m28933e.setText((CharSequence) m25826d);
            }
            this.f55492b.m28249a(m28933e);
        }
        if (m28932d != null) {
            this.f55492b.m28249a(m28932d);
        }
    }
}

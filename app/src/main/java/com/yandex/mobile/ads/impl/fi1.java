package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedTextView;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fi1 implements k40 {

    /* renamed from: a */
    @Nullable
    private final C5276ja<?> f50275a;

    /* renamed from: b */
    @NotNull
    private final C5480na f50276b;

    public fi1(@Nullable C5276ja<?> c5276ja, @NotNull C5480na assetClickConfigurator) {
        Intrinsics.m32179h(assetClickConfigurator, "assetClickConfigurator");
        this.f50275a = c5276ja;
        this.f50276b = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.k40
    /* renamed from: a */
    public final void mo22548a(@NotNull ub1 uiElements) {
        Intrinsics.m32179h(uiElements, "uiElements");
        TextView m28945q = uiElements.m28945q();
        C5276ja<?> c5276ja = this.f50275a;
        Object m25826d = c5276ja != null ? c5276ja.m25826d() : null;
        if (!(m28945q instanceof ExtendedTextView) || !(m25826d instanceof String)) {
            if (m28945q == null) {
                return;
            }
            m28945q.setVisibility(8);
            return;
        }
        VideoAdControlsContainer m28929a = uiElements.m28929a();
        Intrinsics.m32178g(m28929a, "uiElements.adControlsContainer");
        C5888uu c5888uu = new C5888uu(m28929a);
        ExtendedTextView extendedTextView = (ExtendedTextView) m28945q;
        extendedTextView.setText((CharSequence) m25826d);
        extendedTextView.setVisibility(0);
        extendedTextView.setAutoSizeTextType(1);
        extendedTextView.setMeasureSpecProvider(c5888uu);
        this.f50276b.m26825a(m28945q, this.f50275a);
    }
}

package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ga0;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.uu */
/* loaded from: classes3.dex */
public final class C5888uu implements ga0 {

    /* renamed from: a */
    @NotNull
    private final View f55684a;

    /* renamed from: b */
    private final float f55685b;

    /* renamed from: c */
    @NotNull
    private final ga0.C5115a f55686c;

    public C5888uu(@NotNull VideoAdControlsContainer container) {
        Intrinsics.m32179h(container, "container");
        this.f55684a = container;
        this.f55685b = 0.1f;
        this.f55686c = new ga0.C5115a();
    }

    @Override // com.yandex.mobile.ads.impl.ga0
    @NotNull
    /* renamed from: a */
    public final ga0.C5115a mo22622a(int i2, int i3) {
        int m32223c = MathKt.m32223c(this.f55684a.getHeight() * this.f55685b);
        ga0.C5115a c5115a = this.f55686c;
        c5115a.f50538a = i2;
        c5115a.f50539b = View.MeasureSpec.makeMeasureSpec(m32223c, 1073741824);
        return this.f55686c;
    }
}

package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReverseInterpolator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/animation/ReverseInterpolator;", "Landroid/view/animation/Interpolator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ReverseInterpolator implements Interpolator {

    /* renamed from: a */
    @NotNull
    public final Interpolator f31007a;

    public ReverseInterpolator(@NotNull Interpolator interpolator) {
        this.f31007a = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        return 1.0f - this.f31007a.getInterpolation(1.0f - f2);
    }
}

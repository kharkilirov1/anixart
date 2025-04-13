package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/tooltip/Scale;", "Landroid/transition/Visibility;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class Scale extends Visibility {

    /* renamed from: b */
    public final float f31432b;

    public Scale(float f2) {
        this.f31432b = f2;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onAppear(@Nullable ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(startValues, "startValues");
        Intrinsics.m32179h(endValues, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, this.f31432b, view.getScaleX()), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, this.f31432b, view.getScaleY()));
        Intrinsics.m32178g(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…Y\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onDisappear(@Nullable ViewGroup viewGroup, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(startValues, "startValues");
        Intrinsics.m32179h(endValues, "endValues");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, view.getScaleX(), this.f31432b), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), this.f31432b));
        Intrinsics.m32178g(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…r\n            )\n        )");
        return ofPropertyValuesHolder;
    }
}

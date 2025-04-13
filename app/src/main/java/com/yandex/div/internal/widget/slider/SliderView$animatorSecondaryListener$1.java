package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"com/yandex/div/internal/widget/slider/SliderView$animatorSecondaryListener$1", "Landroid/animation/Animator$AnimatorListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SliderView$animatorSecondaryListener$1 implements Animator.AnimatorListener {

    /* renamed from: a */
    @Nullable
    public Float f34133a;

    /* renamed from: b */
    public boolean f34134b;

    /* renamed from: c */
    public final /* synthetic */ SliderView f34135c;

    public SliderView$animatorSecondaryListener$1(SliderView sliderView) {
        this.f34135c = sliderView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
        this.f34134b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
        SliderView sliderView = this.f34135c;
        sliderView.f34104e = null;
        if (this.f34134b) {
            return;
        }
        sliderView.m17454j(this.f34133a, sliderView.getThumbSecondaryValue());
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
        this.f34134b = false;
    }
}

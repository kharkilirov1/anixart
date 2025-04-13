package com.yandex.div.internal.widget.slider;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SliderView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"com/yandex/div/internal/widget/slider/SliderView$animatorListener$1", "Landroid/animation/Animator$AnimatorListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SliderView$animatorListener$1 implements Animator.AnimatorListener {

    /* renamed from: a */
    public float f34130a;

    /* renamed from: b */
    public boolean f34131b;

    /* renamed from: c */
    public final /* synthetic */ SliderView f34132c;

    public SliderView$animatorListener$1(SliderView sliderView) {
        this.f34132c = sliderView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
        this.f34131b = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
        SliderView sliderView = this.f34132c;
        sliderView.f34103d = null;
        if (this.f34131b) {
            return;
        }
        sliderView.m17453i(Float.valueOf(this.f34130a), this.f34132c.getThumbValue());
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.m32179h(animation, "animation");
        this.f34131b = false;
    }
}

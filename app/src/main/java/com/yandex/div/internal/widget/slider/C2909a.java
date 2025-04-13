package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.internal.widget.slider.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2909a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f34136a;

    /* renamed from: b */
    public final /* synthetic */ SliderView f34137b;

    public /* synthetic */ C2909a(SliderView sliderView, int i2) {
        this.f34136a = i2;
        this.f34137b = sliderView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f34136a) {
            case 0:
                SliderView this$0 = this.f34137b;
                int i2 = SliderView.f34100A;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                this$0.f34116q = ((Float) animatedValue).floatValue();
                this$0.postInvalidateOnAnimation();
                break;
            default:
                SliderView this$02 = this.f34137b;
                int i3 = SliderView.f34100A;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(it, "it");
                Object animatedValue2 = it.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                this$02.f34119t = Float.valueOf(((Float) animatedValue2).floatValue());
                this$02.postInvalidateOnAnimation();
                break;
        }
    }
}

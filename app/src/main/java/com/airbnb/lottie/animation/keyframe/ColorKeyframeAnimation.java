package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class ColorKeyframeAnimation extends KeyframeAnimation<Integer> {
    public ColorKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        return Integer.valueOf(m4717i(keyframe, f2));
    }

    /* renamed from: i */
    public int m4717i(Keyframe<Integer> keyframe, float f2) {
        Integer num;
        Integer num2 = keyframe.f7854b;
        if (num2 == null || keyframe.f7855c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = keyframe.f7855c.intValue();
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        return (lottieValueCallback == 0 || (num = (Integer) lottieValueCallback.m4861b(keyframe.f7857e, keyframe.f7858f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, m4706d(), this.f7413d)) == null) ? GammaEvaluator.m4831c(MiscUtils.m4845b(f2, 0.0f, 1.0f), intValue, intValue2) : num.intValue();
    }
}

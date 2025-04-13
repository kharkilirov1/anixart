package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class IntegerKeyframeAnimation extends KeyframeAnimation<Integer> {
    public IntegerKeyframeAnimation(List<Keyframe<Integer>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        return Integer.valueOf(m4720i(keyframe, f2));
    }

    /* renamed from: i */
    public int m4720i(Keyframe<Integer> keyframe, float f2) {
        Integer num;
        if (keyframe.f7854b == null || keyframe.f7855c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        if (lottieValueCallback != 0 && (num = (Integer) lottieValueCallback.m4861b(keyframe.f7857e, keyframe.f7858f.floatValue(), keyframe.f7854b, keyframe.f7855c, f2, m4706d(), this.f7413d)) != null) {
            return num.intValue();
        }
        if (keyframe.f7861i == 784923401) {
            keyframe.f7861i = keyframe.f7854b.intValue();
        }
        int i2 = keyframe.f7861i;
        if (keyframe.f7862j == 784923401) {
            keyframe.f7862j = keyframe.f7855c.intValue();
        }
        return MiscUtils.m4849f(i2, keyframe.f7862j, f2);
    }
}

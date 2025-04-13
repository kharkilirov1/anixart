package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* loaded from: classes.dex */
public class FloatKeyframeAnimation extends KeyframeAnimation<Float> {
    public FloatKeyframeAnimation(List<Keyframe<Float>> list) {
        super(list);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        return Float.valueOf(m4719j(keyframe, f2));
    }

    /* renamed from: i */
    public float m4718i() {
        return m4719j(m4703a(), m4705c());
    }

    /* renamed from: j */
    public float m4719j(Keyframe<Float> keyframe, float f2) {
        Float f3;
        if (keyframe.f7854b == null || keyframe.f7855c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        if (lottieValueCallback != 0 && (f3 = (Float) lottieValueCallback.m4861b(keyframe.f7857e, keyframe.f7858f.floatValue(), keyframe.f7854b, keyframe.f7855c, f2, m4706d(), this.f7413d)) != null) {
            return f3.floatValue();
        }
        if (keyframe.f7859g == -3987645.8f) {
            keyframe.f7859g = keyframe.f7854b.floatValue();
        }
        float f4 = keyframe.f7859g;
        if (keyframe.f7860h == -3987645.8f) {
            keyframe.f7860h = keyframe.f7855c.floatValue();
        }
        return MiscUtils.m4848e(f4, keyframe.f7860h, f2);
    }
}

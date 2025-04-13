package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;

/* loaded from: classes.dex */
public class ScaleKeyframeAnimation extends KeyframeAnimation<ScaleXY> {

    /* renamed from: i */
    public final ScaleXY f7435i;

    public ScaleKeyframeAnimation(List<Keyframe<ScaleXY>> list) {
        super(list);
        this.f7435i = new ScaleXY(1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        T t;
        ScaleXY scaleXY;
        T t2 = keyframe.f7854b;
        if (t2 == 0 || (t = keyframe.f7855c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ScaleXY scaleXY2 = (ScaleXY) t2;
        ScaleXY scaleXY3 = (ScaleXY) t;
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        if (lottieValueCallback != 0 && (scaleXY = (ScaleXY) lottieValueCallback.m4861b(keyframe.f7857e, keyframe.f7858f.floatValue(), scaleXY2, scaleXY3, f2, m4706d(), this.f7413d)) != null) {
            return scaleXY;
        }
        ScaleXY scaleXY4 = this.f7435i;
        float m4848e = MiscUtils.m4848e(scaleXY2.f7874a, scaleXY3.f7874a, f2);
        float m4848e2 = MiscUtils.m4848e(scaleXY2.f7875b, scaleXY3.f7875b, f2);
        scaleXY4.f7874a = m4848e;
        scaleXY4.f7875b = m4848e2;
        return this.f7435i;
    }
}

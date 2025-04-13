package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PointKeyframeAnimation extends KeyframeAnimation<PointF> {

    /* renamed from: i */
    public final PointF f7434i;

    public PointKeyframeAnimation(List<Keyframe<PointF>> list) {
        super(list);
        this.f7434i = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        T t;
        PointF pointF;
        T t2 = keyframe.f7854b;
        if (t2 == 0 || (t = keyframe.f7855c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) t2;
        PointF pointF3 = (PointF) t;
        LottieValueCallback<A> lottieValueCallback = this.f7414e;
        if (lottieValueCallback != 0 && (pointF = (PointF) lottieValueCallback.m4861b(keyframe.f7857e, keyframe.f7858f.floatValue(), pointF2, pointF3, f2, m4706d(), this.f7413d)) != null) {
            return pointF;
        }
        PointF pointF4 = this.f7434i;
        float f3 = pointF2.x;
        float m4a = C0000a.m4a(pointF3.x, f3, f2, f3);
        float f4 = pointF2.y;
        pointF4.set(m4a, ((pointF3.y - f4) * f2) + f4);
        return this.f7434i;
    }
}

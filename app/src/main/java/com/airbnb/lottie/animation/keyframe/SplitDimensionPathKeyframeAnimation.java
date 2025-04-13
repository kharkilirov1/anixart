package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.Keyframe;
import java.util.Collections;

/* loaded from: classes.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* renamed from: i */
    public final PointF f7438i;

    /* renamed from: j */
    public final BaseKeyframeAnimation<Float, Float> f7439j;

    /* renamed from: k */
    public final BaseKeyframeAnimation<Float, Float> f7440k;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f7438i = new PointF();
        this.f7439j = baseKeyframeAnimation;
        this.f7440k = baseKeyframeAnimation2;
        mo4710h(this.f7413d);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: e */
    public PointF mo4707e() {
        return this.f7438i;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public PointF mo4708f(Keyframe<PointF> keyframe, float f2) {
        return this.f7438i;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: h */
    public void mo4710h(float f2) {
        this.f7439j.mo4710h(f2);
        this.f7440k.mo4710h(f2);
        this.f7438i.set(this.f7439j.mo4707e().floatValue(), this.f7440k.mo4707e().floatValue());
        for (int i2 = 0; i2 < this.f7410a.size(); i2++) {
            this.f7410a.get(i2).mo4688a();
        }
    }
}

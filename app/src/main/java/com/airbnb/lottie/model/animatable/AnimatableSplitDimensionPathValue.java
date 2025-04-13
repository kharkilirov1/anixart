package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableSplitDimensionPathValue implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    public final AnimatableFloatValue f7501a;

    /* renamed from: b */
    public final AnimatableFloatValue f7502b;

    public AnimatableSplitDimensionPathValue(AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2) {
        this.f7501a = animatableFloatValue;
        this.f7502b = animatableFloatValue2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: i */
    public boolean mo4739i() {
        return this.f7501a.mo4739i() && this.f7502b.mo4739i();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation<PointF, PointF> mo4737j() {
        return new SplitDimensionPathKeyframeAnimation(this.f7501a.mo4737j(), this.f7502b.mo4737j());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: k */
    public List<Keyframe<PointF>> mo4738k() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}

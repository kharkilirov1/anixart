package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableFloatValue extends BaseAnimatableValue<Float, Float> {
    public AnimatableFloatValue() {
        super(Float.valueOf(0.0f));
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation<Float, Float> mo4737j() {
        return new FloatKeyframeAnimation(this.f7516a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: k */
    public List mo4738k() {
        return this.f7516a;
    }

    public AnimatableFloatValue(List<Keyframe<Float>> list) {
        super((List) list);
    }
}

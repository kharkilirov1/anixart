package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.IntegerKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableIntegerValue extends BaseAnimatableValue<Integer, Integer> {
    public AnimatableIntegerValue() {
        super(100);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation<Integer, Integer> mo4737j() {
        return new IntegerKeyframeAnimation(this.f7516a);
    }

    public AnimatableIntegerValue(List<Keyframe<Integer>> list) {
        super((List) list);
    }
}

package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ScaleKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableScaleValue extends BaseAnimatableValue<ScaleXY, ScaleXY> {
    public AnimatableScaleValue() {
        super(new ScaleXY(1.0f, 1.0f));
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation<ScaleXY, ScaleXY> mo4737j() {
        return new ScaleKeyframeAnimation(this.f7516a);
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: k */
    public List mo4738k() {
        return this.f7516a;
    }

    public AnimatableScaleValue(List<Keyframe<ScaleXY>> list) {
        super((List) list);
    }
}

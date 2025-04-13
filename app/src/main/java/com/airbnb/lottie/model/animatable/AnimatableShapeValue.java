package com.airbnb.lottie.model.animatable;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ShapeKeyframeAnimation;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {
    public AnimatableShapeValue(List<Keyframe<ShapeData>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation<ShapeData, Path> mo4737j() {
        return new ShapeKeyframeAnimation(this.f7516a);
    }
}

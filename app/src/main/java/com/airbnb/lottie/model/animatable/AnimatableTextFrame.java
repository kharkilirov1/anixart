package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {
    public AnimatableTextFrame(List<Keyframe<DocumentData>> list) {
        super((List) list);
    }

    /* renamed from: a */
    public TextKeyframeAnimation m4740a() {
        return new TextKeyframeAnimation(this.f7516a);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation mo4737j() {
        return new TextKeyframeAnimation(this.f7516a);
    }
}

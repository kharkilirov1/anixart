package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation;
import com.airbnb.lottie.value.Keyframe;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* renamed from: a */
    public final List<Keyframe<PointF>> f7500a;

    public AnimatablePathValue() {
        this.f7500a = Collections.singletonList(new Keyframe(new PointF(0.0f, 0.0f)));
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: i */
    public boolean mo4739i() {
        return this.f7500a.size() == 1 && this.f7500a.get(0).m4860d();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: j */
    public BaseKeyframeAnimation<PointF, PointF> mo4737j() {
        return this.f7500a.get(0).m4860d() ? new PointKeyframeAnimation(this.f7500a) : new PathKeyframeAnimation(this.f7500a);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: k */
    public List<Keyframe<PointF>> mo4738k() {
        return this.f7500a;
    }

    public AnimatablePathValue(List<Keyframe<PointF>> list) {
        this.f7500a = list;
    }
}

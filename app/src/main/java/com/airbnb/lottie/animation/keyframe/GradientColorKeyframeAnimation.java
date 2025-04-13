package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.utils.GammaEvaluator;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {

    /* renamed from: i */
    public final GradientColor f7424i;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        GradientColor gradientColor = list.get(0).f7854b;
        int length = gradientColor != null ? gradientColor.f7523b.length : 0;
        this.f7424i = new GradientColor(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* renamed from: f */
    public Object mo4708f(Keyframe keyframe, float f2) {
        GradientColor gradientColor = this.f7424i;
        GradientColor gradientColor2 = (GradientColor) keyframe.f7854b;
        GradientColor gradientColor3 = (GradientColor) keyframe.f7855c;
        Objects.requireNonNull(gradientColor);
        if (gradientColor2.f7523b.length != gradientColor3.f7523b.length) {
            StringBuilder m24u = C0000a.m24u("Cannot interpolate between gradients. Lengths vary (");
            m24u.append(gradientColor2.f7523b.length);
            m24u.append(" vs ");
            throw new IllegalArgumentException(C0000a.m18o(m24u, gradientColor3.f7523b.length, ")"));
        }
        for (int i2 = 0; i2 < gradientColor2.f7523b.length; i2++) {
            gradientColor.f7522a[i2] = MiscUtils.m4848e(gradientColor2.f7522a[i2], gradientColor3.f7522a[i2], f2);
            gradientColor.f7523b[i2] = GammaEvaluator.m4831c(f2, gradientColor2.f7523b[i2], gradientColor3.f7523b[i2]);
        }
        return this.f7424i;
    }
}

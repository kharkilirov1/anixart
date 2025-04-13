package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientFillContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes.dex */
public class GradientFill implements ContentModel {

    /* renamed from: a */
    public final GradientType f7524a;

    /* renamed from: b */
    public final Path.FillType f7525b;

    /* renamed from: c */
    public final AnimatableGradientColorValue f7526c;

    /* renamed from: d */
    public final AnimatableIntegerValue f7527d;

    /* renamed from: e */
    public final AnimatablePointValue f7528e;

    /* renamed from: f */
    public final AnimatablePointValue f7529f;

    /* renamed from: g */
    public final String f7530g;

    /* renamed from: h */
    public final boolean f7531h;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.f7524a = gradientType;
        this.f7525b = fillType;
        this.f7526c = animatableGradientColorValue;
        this.f7527d = animatableIntegerValue;
        this.f7528e = animatablePointValue;
        this.f7529f = animatablePointValue2;
        this.f7530g = str;
        this.f7531h = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new GradientFillContent(lottieDrawable, baseLayer, this);
    }
}

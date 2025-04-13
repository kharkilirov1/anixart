package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientStrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* loaded from: classes.dex */
public class GradientStroke implements ContentModel {

    /* renamed from: a */
    public final String f7532a;

    /* renamed from: b */
    public final GradientType f7533b;

    /* renamed from: c */
    public final AnimatableGradientColorValue f7534c;

    /* renamed from: d */
    public final AnimatableIntegerValue f7535d;

    /* renamed from: e */
    public final AnimatablePointValue f7536e;

    /* renamed from: f */
    public final AnimatablePointValue f7537f;

    /* renamed from: g */
    public final AnimatableFloatValue f7538g;

    /* renamed from: h */
    public final ShapeStroke.LineCapType f7539h;

    /* renamed from: i */
    public final ShapeStroke.LineJoinType f7540i;

    /* renamed from: j */
    public final float f7541j;

    /* renamed from: k */
    public final List<AnimatableFloatValue> f7542k;

    /* renamed from: l */
    @Nullable
    public final AnimatableFloatValue f7543l;

    /* renamed from: m */
    public final boolean f7544m;

    public GradientStroke(String str, GradientType gradientType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f2, List<AnimatableFloatValue> list, @Nullable AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.f7532a = str;
        this.f7533b = gradientType;
        this.f7534c = animatableGradientColorValue;
        this.f7535d = animatableIntegerValue;
        this.f7536e = animatablePointValue;
        this.f7537f = animatablePointValue2;
        this.f7538g = animatableFloatValue;
        this.f7539h = lineCapType;
        this.f7540i = lineJoinType;
        this.f7541j = f2;
        this.f7542k = list;
        this.f7543l = animatableFloatValue2;
        this.f7544m = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new GradientStrokeContent(lottieDrawable, baseLayer, this);
    }
}

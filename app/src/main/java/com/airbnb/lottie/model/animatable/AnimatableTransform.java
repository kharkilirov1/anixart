package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {

    /* renamed from: a */
    @Nullable
    public final AnimatablePathValue f7507a;

    /* renamed from: b */
    @Nullable
    public final AnimatableValue<PointF, PointF> f7508b;

    /* renamed from: c */
    @Nullable
    public final AnimatableScaleValue f7509c;

    /* renamed from: d */
    @Nullable
    public final AnimatableFloatValue f7510d;

    /* renamed from: e */
    @Nullable
    public final AnimatableIntegerValue f7511e;

    /* renamed from: f */
    @Nullable
    public final AnimatableFloatValue f7512f;

    /* renamed from: g */
    @Nullable
    public final AnimatableFloatValue f7513g;

    /* renamed from: h */
    @Nullable
    public final AnimatableFloatValue f7514h;

    /* renamed from: i */
    @Nullable
    public final AnimatableFloatValue f7515i;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
        this.f7507a = animatablePathValue;
        this.f7508b = animatableValue;
        this.f7509c = animatableScaleValue;
        this.f7510d = animatableFloatValue;
        this.f7511e = animatableIntegerValue;
        this.f7514h = animatableFloatValue2;
        this.f7515i = animatableFloatValue3;
        this.f7512f = animatableFloatValue4;
        this.f7513g = animatableFloatValue5;
    }
}

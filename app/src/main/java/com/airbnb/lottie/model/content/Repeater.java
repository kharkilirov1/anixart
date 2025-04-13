package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RepeaterContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes.dex */
public class Repeater implements ContentModel {

    /* renamed from: a */
    public final String f7584a;

    /* renamed from: b */
    public final AnimatableFloatValue f7585b;

    /* renamed from: c */
    public final AnimatableFloatValue f7586c;

    /* renamed from: d */
    public final AnimatableTransform f7587d;

    /* renamed from: e */
    public final boolean f7588e;

    public Repeater(String str, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableTransform animatableTransform, boolean z) {
        this.f7584a = str;
        this.f7585b = animatableFloatValue;
        this.f7586c = animatableFloatValue2;
        this.f7587d = animatableTransform;
        this.f7588e = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new RepeaterContent(lottieDrawable, baseLayer, this);
    }
}

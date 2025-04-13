package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.EllipseContent;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes.dex */
public class CircleShape implements ContentModel {

    /* renamed from: a */
    public final String f7517a;

    /* renamed from: b */
    public final AnimatableValue<PointF, PointF> f7518b;

    /* renamed from: c */
    public final AnimatablePointValue f7519c;

    /* renamed from: d */
    public final boolean f7520d;

    /* renamed from: e */
    public final boolean f7521e;

    public CircleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, boolean z, boolean z2) {
        this.f7517a = str;
        this.f7518b = animatableValue;
        this.f7519c = animatablePointValue;
        this.f7520d = z;
        this.f7521e = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new EllipseContent(lottieDrawable, baseLayer, this);
    }
}

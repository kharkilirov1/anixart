package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.RectangleContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class RectangleShape implements ContentModel {

    /* renamed from: a */
    public final String f7579a;

    /* renamed from: b */
    public final AnimatableValue<PointF, PointF> f7580b;

    /* renamed from: c */
    public final AnimatablePointValue f7581c;

    /* renamed from: d */
    public final AnimatableFloatValue f7582d;

    /* renamed from: e */
    public final boolean f7583e;

    public RectangleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f7579a = str;
        this.f7580b = animatableValue;
        this.f7581c = animatablePointValue;
        this.f7582d = animatableFloatValue;
        this.f7583e = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new RectangleContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("RectangleShape{position=");
        m24u.append(this.f7580b);
        m24u.append(", size=");
        m24u.append(this.f7581c);
        m24u.append('}');
        return m24u.toString();
    }
}

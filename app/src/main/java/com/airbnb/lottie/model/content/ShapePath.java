package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeContent;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShapePath implements ContentModel {

    /* renamed from: a */
    public final String f7601a;

    /* renamed from: b */
    public final int f7602b;

    /* renamed from: c */
    public final AnimatableShapeValue f7603c;

    /* renamed from: d */
    public final boolean f7604d;

    public ShapePath(String str, int i2, AnimatableShapeValue animatableShapeValue, boolean z) {
        this.f7601a = str;
        this.f7602b = i2;
        this.f7603c = animatableShapeValue;
        this.f7604d = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new ShapeContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShapePath{name=");
        m24u.append(this.f7601a);
        m24u.append(", index=");
        return C0000a.m17n(m24u, this.f7602b, '}');
    }
}

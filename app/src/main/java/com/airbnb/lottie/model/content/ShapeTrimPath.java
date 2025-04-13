package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShapeTrimPath implements ContentModel {

    /* renamed from: a */
    public final String f7619a;

    /* renamed from: b */
    public final Type f7620b;

    /* renamed from: c */
    public final AnimatableFloatValue f7621c;

    /* renamed from: d */
    public final AnimatableFloatValue f7622d;

    /* renamed from: e */
    public final AnimatableFloatValue f7623e;

    /* renamed from: f */
    public final boolean f7624f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.f7619a = str;
        this.f7620b = type;
        this.f7621c = animatableFloatValue;
        this.f7622d = animatableFloatValue2;
        this.f7623e = animatableFloatValue3;
        this.f7624f = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Trim Path: {start: ");
        m24u.append(this.f7621c);
        m24u.append(", end: ");
        m24u.append(this.f7622d);
        m24u.append(", offset: ");
        m24u.append(this.f7623e);
        m24u.append("}");
        return m24u.toString();
    }
}

package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* loaded from: classes.dex */
public class PolystarShape implements ContentModel {

    /* renamed from: a */
    public final String f7566a;

    /* renamed from: b */
    public final Type f7567b;

    /* renamed from: c */
    public final AnimatableFloatValue f7568c;

    /* renamed from: d */
    public final AnimatableValue<PointF, PointF> f7569d;

    /* renamed from: e */
    public final AnimatableFloatValue f7570e;

    /* renamed from: f */
    public final AnimatableFloatValue f7571f;

    /* renamed from: g */
    public final AnimatableFloatValue f7572g;

    /* renamed from: h */
    public final AnimatableFloatValue f7573h;

    /* renamed from: i */
    public final AnimatableFloatValue f7574i;

    /* renamed from: j */
    public final boolean f7575j;

    public enum Type {
        STAR(1),
        /* JADX INFO: Fake field, exist only in values array */
        POLYGON(2);


        /* renamed from: b */
        public final int f7578b;

        Type(int i2) {
            this.f7578b = i2;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z) {
        this.f7566a = str;
        this.f7567b = type;
        this.f7568c = animatableFloatValue;
        this.f7569d = animatableValue;
        this.f7570e = animatableFloatValue2;
        this.f7571f = animatableFloatValue3;
        this.f7572g = animatableFloatValue4;
        this.f7573h = animatableFloatValue5;
        this.f7574i = animatableFloatValue6;
        this.f7575j = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}

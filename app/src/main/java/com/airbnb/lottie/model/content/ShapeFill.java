package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.FillContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShapeFill implements ContentModel {

    /* renamed from: a */
    public final boolean f7592a;

    /* renamed from: b */
    public final Path.FillType f7593b;

    /* renamed from: c */
    public final String f7594c;

    /* renamed from: d */
    @Nullable
    public final AnimatableColorValue f7595d;

    /* renamed from: e */
    @Nullable
    public final AnimatableIntegerValue f7596e;

    /* renamed from: f */
    public final boolean f7597f;

    public ShapeFill(String str, boolean z, Path.FillType fillType, @Nullable AnimatableColorValue animatableColorValue, @Nullable AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.f7594c = str;
        this.f7592a = z;
        this.f7593b = fillType;
        this.f7595d = animatableColorValue;
        this.f7596e = animatableIntegerValue;
        this.f7597f = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new FillContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShapeFill{color=, fillEnabled=");
        m24u.append(this.f7592a);
        m24u.append('}');
        return m24u.toString();
    }
}

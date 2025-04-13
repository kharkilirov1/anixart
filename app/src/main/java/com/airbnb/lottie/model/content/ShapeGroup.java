package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Arrays;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShapeGroup implements ContentModel {

    /* renamed from: a */
    public final String f7598a;

    /* renamed from: b */
    public final List<ContentModel> f7599b;

    /* renamed from: c */
    public final boolean f7600c;

    public ShapeGroup(String str, List<ContentModel> list, boolean z) {
        this.f7598a = str;
        this.f7599b = list;
        this.f7600c = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new ContentGroup(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ShapeGroup{name='");
        m24u.append(this.f7598a);
        m24u.append("' Shapes: ");
        m24u.append(Arrays.toString(this.f7599b.toArray()));
        m24u.append('}');
        return m24u.toString();
    }
}

package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* loaded from: classes.dex */
public class Mask {

    /* renamed from: a */
    public final MaskMode f7548a;

    /* renamed from: b */
    public final AnimatableShapeValue f7549b;

    /* renamed from: c */
    public final AnimatableIntegerValue f7550c;

    /* renamed from: d */
    public final boolean f7551d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.f7548a = maskMode;
        this.f7549b = animatableShapeValue;
        this.f7550c = animatableIntegerValue;
        this.f7551d = z;
    }
}

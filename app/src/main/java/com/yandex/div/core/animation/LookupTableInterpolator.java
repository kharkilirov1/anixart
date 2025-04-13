package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: LookupTableInterpolator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/animation/LookupTableInterpolator;", "Landroid/view/animation/Interpolator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* renamed from: a */
    @NotNull
    public final float[] f31005a;

    /* renamed from: b */
    public final float f31006b;

    public LookupTableInterpolator(@NotNull float[] fArr) {
        this.f31005a = fArr;
        this.f31006b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        Intrinsics.m32179h(this.f31005a, "<this>");
        int length = (int) ((r0.length - 1) * f2);
        float[] fArr = this.f31005a;
        int length2 = fArr.length - 2;
        if (length > length2) {
            length = length2;
        }
        float f3 = this.f31006b;
        return C0000a.m4a(fArr[length + 1], fArr[length], (f2 - (length * f3)) / f3, fArr[length]);
    }
}

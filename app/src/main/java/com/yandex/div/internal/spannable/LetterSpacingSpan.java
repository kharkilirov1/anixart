package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LetterSpacingSpan.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/spannable/LetterSpacingSpan;", "Landroid/text/style/MetricAffectingSpan;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {

    /* renamed from: b */
    public final float f33874b;

    public LetterSpacingSpan(float f2) {
        this.f33874b = f2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.m32179h(paint, "paint");
        paint.setLetterSpacing(this.f33874b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.m32179h(paint, "paint");
        paint.setLetterSpacing(this.f33874b);
    }
}

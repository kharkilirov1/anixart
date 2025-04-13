package com.yandex.div.internal.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImagePlaceholderSpan.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/spannable/ImagePlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ImagePlaceholderSpan extends ReplacementSpan {

    /* renamed from: b */
    public final int f33871b;

    /* renamed from: c */
    public final int f33872c;

    /* renamed from: d */
    public final float f33873d;

    public ImagePlaceholderSpan(int i2, int i3, float f2) {
        this.f33871b = i2;
        this.f33872c = i3;
        this.f33873d = f2;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int i2, int i3, float f2, int i4, int i5, int i6, @NotNull Paint paint) {
        Intrinsics.m32179h(canvas, "canvas");
        Intrinsics.m32179h(text, "text");
        Intrinsics.m32179h(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.m32179h(paint, "paint");
        Intrinsics.m32179h(text, "text");
        if (fontMetricsInt != null) {
            if (i2 == 0 && Build.VERSION.SDK_INT < 28) {
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.descent = 0;
                fontMetricsInt.leading = 0;
            }
            int i4 = -((int) Math.ceil(this.f33872c - this.f33873d));
            fontMetricsInt.ascent = Math.min(i4, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i4, fontMetricsInt.top);
            int ceil = (int) Math.ceil(this.f33873d);
            fontMetricsInt.descent = Math.max(ceil, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(ceil, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return this.f33871b;
    }
}

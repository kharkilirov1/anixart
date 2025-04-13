package com.yandex.div.core.view2.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import androidx.annotation.Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LineHeightWithTopOffsetSpan.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/spannable/LineHeightWithTopOffsetSpan;", "Landroid/text/style/LineHeightSpan;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class LineHeightWithTopOffsetSpan implements LineHeightSpan {

    /* renamed from: a */
    @Px
    public final int f32935a;

    /* renamed from: b */
    @Px
    public final int f32936b;

    /* renamed from: c */
    public boolean f32937c;

    /* renamed from: d */
    public int f32938d = -1;

    /* renamed from: e */
    public int f32939e = -1;

    /* renamed from: f */
    public int f32940f = -1;

    public LineHeightWithTopOffsetSpan(int i2, int i3) {
        this.f32935a = i2;
        this.f32936b = i3;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@Nullable CharSequence charSequence, int i2, int i3, int i4, int i5, @NotNull Paint.FontMetricsInt fm) {
        int i6;
        int i7;
        int i8;
        int i9;
        Intrinsics.m32179h(fm, "fm");
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        int spanEnd = spanned.getSpanEnd(this);
        if (this.f32937c) {
            fm.ascent = this.f32938d;
            fm.descent = this.f32939e;
            fm.top = this.f32940f;
        } else if (i2 >= spanStart) {
            this.f32937c = true;
            this.f32938d = fm.ascent;
            this.f32939e = fm.descent;
            this.f32940f = fm.top;
        }
        if (i2 >= spanStart && i3 <= spanEnd && (i7 = this.f32936b) > 0 && (i9 = (i8 = fm.descent) - fm.ascent) >= 0) {
            int m32223c = MathKt.m32223c(i8 * ((i7 * 1.0f) / i9));
            fm.descent = m32223c;
            fm.ascent = m32223c - this.f32936b;
        }
        if ((i2 <= spanStart && spanStart <= i3) && (i6 = this.f32935a) > 0) {
            fm.ascent -= i6;
            fm.top -= i6;
        }
        if (StringsKt.m33922t(charSequence.subSequence(i2, i3).toString(), "\n", false, 2, null)) {
            this.f32937c = false;
        }
    }
}

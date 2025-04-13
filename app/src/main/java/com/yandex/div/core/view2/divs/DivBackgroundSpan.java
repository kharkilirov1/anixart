package com.yandex.div.core.view2.divs;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTextBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivBackgroundSpan;", "Landroid/text/style/UnderlineSpan;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivBackgroundSpan extends UnderlineSpan {

    /* renamed from: b */
    @Nullable
    public final DivTextRangeBorder f31911b;

    /* renamed from: c */
    @Nullable
    public final DivTextRangeBackground f31912c;

    public DivBackgroundSpan(@Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        this.f31911b = divTextRangeBorder;
        this.f31912c = divTextRangeBackground;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.m32179h(ds, "ds");
        ds.setUnderlineText(false);
    }
}

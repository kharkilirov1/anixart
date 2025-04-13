package com.yandex.div.internal.spannable;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NoStrikethroughSpan.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/spannable/NoStrikethroughSpan;", "Landroid/text/style/StrikethroughSpan;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class NoStrikethroughSpan extends StrikethroughSpan {
    @Override // android.text.style.StrikethroughSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.m32179h(ds, "ds");
        ds.setStrikeThruText(false);
    }
}

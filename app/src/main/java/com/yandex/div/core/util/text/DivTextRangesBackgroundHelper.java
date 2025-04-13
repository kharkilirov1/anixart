package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.core.view2.divs.DivBackgroundSpan;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTextRangesBackgroundHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTextRangesBackgroundHelper {

    /* renamed from: a */
    @NotNull
    public final View f31504a;

    /* renamed from: b */
    @NotNull
    public final ExpressionResolver f31505b;

    /* renamed from: c */
    @NotNull
    public ArrayList<DivBackgroundSpan> f31506c;

    /* renamed from: d */
    @NotNull
    public final Lazy f31507d;

    /* renamed from: e */
    @NotNull
    public final Lazy f31508e;

    public DivTextRangesBackgroundHelper(@NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f31504a = view;
        this.f31505b = resolver;
        this.f31506c = new ArrayList<>();
        this.f31507d = LazyKt.m31881b(new Function0<SingleLineRenderer>() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$singleLineRenderer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SingleLineRenderer invoke() {
                DivTextRangesBackgroundHelper divTextRangesBackgroundHelper = DivTextRangesBackgroundHelper.this;
                return new SingleLineRenderer(divTextRangesBackgroundHelper.f31504a, divTextRangesBackgroundHelper.f31505b);
            }
        });
        this.f31508e = LazyKt.m31881b(new Function0<MultiLineRenderer>() { // from class: com.yandex.div.core.util.text.DivTextRangesBackgroundHelper$multiLineRenderer$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public MultiLineRenderer invoke() {
                DivTextRangesBackgroundHelper divTextRangesBackgroundHelper = DivTextRangesBackgroundHelper.this;
                return new MultiLineRenderer(divTextRangesBackgroundHelper.f31504a, divTextRangesBackgroundHelper.f31505b);
            }
        });
    }

    /* renamed from: a */
    public final void m16790a(@NotNull Canvas canvas, @NotNull Spanned text, @NotNull Layout layout) {
        Intrinsics.m32179h(text, "text");
        for (DivBackgroundSpan divBackgroundSpan : this.f31506c) {
            int spanStart = text.getSpanStart(divBackgroundSpan);
            int spanEnd = text.getSpanEnd(divBackgroundSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            ((DivTextRangesBackgroundRenderer) (lineForOffset == lineForOffset2 ? this.f31507d.getValue() : this.f31508e.getValue())).mo16791a(canvas, layout, lineForOffset, lineForOffset2, (int) layout.getPrimaryHorizontal(spanStart), (int) layout.getPrimaryHorizontal(spanEnd), divBackgroundSpan.f31911b, divBackgroundSpan.f31912c);
        }
    }
}

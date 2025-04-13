package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/text/SingleLineRenderer;", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SingleLineRenderer extends DivTextRangesBackgroundRenderer {

    /* renamed from: a */
    @NotNull
    public final View f31513a;

    /* renamed from: b */
    @NotNull
    public final ExpressionResolver f31514b;

    public SingleLineRenderer(@NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(resolver, "resolver");
        this.f31513a = view;
        this.f31514b = resolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    /* renamed from: a */
    public void mo16791a(@NotNull Canvas canvas, @NotNull Layout layout, int i2, int i3, int i4, int i5, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        int m16793c = m16793c(layout, i2);
        int m16792b = m16792b(layout, i2);
        int min = Math.min(i4, i5);
        int max = Math.max(i4, i5);
        DisplayMetrics displayMetrics = this.f31513a.getResources().getDisplayMetrics();
        Intrinsics.m32178g(displayMetrics, "view.resources.displayMetrics");
        BackgroundDrawer backgroundDrawer = new BackgroundDrawer(displayMetrics, divTextRangeBorder, divTextRangeBackground, canvas, this.f31514b);
        backgroundDrawer.m16788a(backgroundDrawer.f31503g, min, m16793c, max, m16792b);
    }
}

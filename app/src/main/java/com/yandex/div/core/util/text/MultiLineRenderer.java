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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/text/MultiLineRenderer;", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MultiLineRenderer extends DivTextRangesBackgroundRenderer {

    /* renamed from: a */
    @NotNull
    public final View f31511a;

    /* renamed from: b */
    @NotNull
    public final ExpressionResolver f31512b;

    public MultiLineRenderer(@NotNull View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(resolver, "resolver");
        this.f31511a = view;
        this.f31512b = resolver;
    }

    @Override // com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer
    /* renamed from: a */
    public void mo16791a(@NotNull Canvas canvas, @NotNull Layout layout, int i2, int i3, int i4, int i5, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground) {
        int paragraphDirection = layout.getParagraphDirection(i2);
        float lineLeft = paragraphDirection == -1 ? layout.getLineLeft(i2) : layout.getLineRight(i2);
        int m16792b = m16792b(layout, i2);
        int m16793c = m16793c(layout, i2);
        DisplayMetrics displayMetrics = this.f31511a.getResources().getDisplayMetrics();
        Intrinsics.m32178g(displayMetrics, "view.resources.displayMetrics");
        BackgroundDrawer backgroundDrawer = new BackgroundDrawer(displayMetrics, divTextRangeBorder, divTextRangeBackground, canvas, this.f31512b);
        float f2 = i4;
        float f3 = m16793c;
        float f4 = (int) lineLeft;
        float f5 = m16792b;
        float[] fArr = new float[8];
        float[] fArr2 = backgroundDrawer.f31503g;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        backgroundDrawer.m16788a(fArr, f2, f3, f4, f5);
        for (int i6 = i2 + 1; i6 < i3; i6++) {
            backgroundDrawer.m16788a(new float[8], (int) layout.getLineLeft(i6), m16793c(layout, i6), (int) layout.getLineRight(i6), m16792b(layout, i6));
        }
        float lineRight = paragraphDirection == -1 ? layout.getLineRight(i2) : layout.getLineLeft(i2);
        int m16792b2 = m16792b(layout, i3);
        float f6 = (int) lineRight;
        float m16793c2 = m16793c(layout, i3);
        float f7 = i5;
        float f8 = m16792b2;
        float[] fArr3 = new float[8];
        float[] fArr4 = backgroundDrawer.f31503g;
        if (fArr4 != null) {
            fArr3[0] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[2] = fArr4[2];
            fArr3[3] = fArr4[3];
            fArr3[4] = fArr4[4];
            fArr3[5] = fArr4[5];
            fArr3[6] = 0.0f;
            fArr3[7] = 0.0f;
        }
        backgroundDrawer.m16788a(fArr3, f6, m16793c2, f7, f8);
    }
}

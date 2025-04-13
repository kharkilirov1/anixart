package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.text.Layout;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/text/DivTextRangesBackgroundRenderer;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivTextRangesBackgroundRenderer {
    /* renamed from: a */
    public abstract void mo16791a(@NotNull Canvas canvas, @NotNull Layout layout, int i2, int i3, int i4, int i5, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r5 == 1.0f) == false) goto L17;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m16792b(@org.jetbrains.annotations.NotNull android.text.Layout r9, int r10) {
        /*
            r8 = this;
            int r0 = r9.getLineBottom(r10)
            int r1 = r9.getLineCount()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r10 != r1) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            float r4 = r9.getSpacingAdd()
            float r5 = r9.getSpacingMultiplier()
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L1f
            r6 = 1
            goto L20
        L1f:
            r6 = 0
        L20:
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L2d
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 != 0) goto L2a
            r6 = 1
            goto L2b
        L2a:
            r6 = 0
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            r3 = 1
        L2e:
            if (r3 == 0) goto L4d
            if (r1 == 0) goto L33
            goto L4d
        L33:
            int r1 = java.lang.Float.compare(r5, r7)
            if (r1 == 0) goto L4a
            int r1 = r10 + 1
            int r1 = r9.getLineTop(r1)
            int r3 = r9.getLineTop(r10)
            int r1 = r1 - r3
            float r1 = (float) r1
            float r3 = r1 - r4
            float r3 = r3 / r5
            float r4 = r1 - r3
        L4a:
            float r0 = (float) r0
            float r0 = r0 - r4
            int r0 = (int) r0
        L4d:
            int r1 = r9.getLineCount()
            int r1 = r1 - r2
            if (r10 != r1) goto L59
            int r9 = r9.getBottomPadding()
            int r0 = r0 - r9
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.text.DivTextRangesBackgroundRenderer.m16792b(android.text.Layout, int):int");
    }

    /* renamed from: c */
    public final int m16793c(@NotNull Layout layout, int i2) {
        int lineTop = layout.getLineTop(i2);
        return i2 == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}

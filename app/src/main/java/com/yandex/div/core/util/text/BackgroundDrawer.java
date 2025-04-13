package com.yandex.div.core.util.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawerKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/text/BackgroundDrawer;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class BackgroundDrawer {

    /* renamed from: a */
    @NotNull
    public final DisplayMetrics f31497a;

    /* renamed from: b */
    @Nullable
    public final DivTextRangeBorder f31498b;

    /* renamed from: c */
    @Nullable
    public final DivTextRangeBackground f31499c;

    /* renamed from: d */
    @NotNull
    public final Canvas f31500d;

    /* renamed from: e */
    @NotNull
    public final ExpressionResolver f31501e;

    /* renamed from: f */
    @NotNull
    public final Paint f31502f;

    /* renamed from: g */
    @Nullable
    public final float[] f31503g;

    public BackgroundDrawer(@NotNull DisplayMetrics displayMetrics, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground, @NotNull Canvas canvas, @NotNull ExpressionResolver resolver) {
        Expression<Integer> expression;
        Integer mo17535b;
        Intrinsics.m32179h(resolver, "resolver");
        this.f31497a = displayMetrics;
        this.f31498b = divTextRangeBorder;
        this.f31499c = divTextRangeBackground;
        this.f31500d = canvas;
        this.f31501e = resolver;
        Paint paint = new Paint();
        this.f31502f = paint;
        if (divTextRangeBorder == null) {
            this.f31503g = null;
            return;
        }
        Expression<Long> expression2 = divTextRangeBorder.f40075a;
        float m16961u = BaseDivViewExtensionsKt.m16961u(expression2 != null ? expression2.mo17535b(resolver) : null, displayMetrics);
        this.f31503g = new float[]{m16961u, m16961u, m16961u, m16961u, m16961u, m16961u, m16961u, m16961u};
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(DivBorderDrawerKt.m17097a(divTextRangeBorder.f40076b, resolver, displayMetrics));
        DivStroke divStroke = divTextRangeBorder.f40076b;
        if (divStroke == null || (expression = divStroke.f39440a) == null || (mo17535b = expression.mo17535b(resolver)) == null) {
            return;
        }
        paint.setColor(mo17535b.intValue());
    }

    /* renamed from: a */
    public final void m16788a(float[] fArr, float f2, float f3, float f4, float f5) {
        DivSolidBackground divSolidBackground;
        RectF rectF = new RectF();
        rectF.set(f2, f3, f4, f5);
        DivTextRangeBackground divTextRangeBackground = this.f31499c;
        if (divTextRangeBackground == null) {
            divSolidBackground = null;
        } else {
            if (!(divTextRangeBackground instanceof DivTextRangeBackground.Solid)) {
                throw new NoWhenBranchMatchedException();
            }
            divSolidBackground = ((DivTextRangeBackground.Solid) divTextRangeBackground).f40068c;
        }
        if (divSolidBackground instanceof DivSolidBackground) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(divSolidBackground.f39186a.mo17535b(this.f31501e).intValue());
            this.f31500d.drawPath(m16789b(fArr, rectF), paint);
        }
        DivTextRangeBorder divTextRangeBorder = this.f31498b;
        if ((divTextRangeBorder == null ? null : divTextRangeBorder.f40076b) == null) {
            return;
        }
        RectF rectF2 = new RectF();
        DivStroke divStroke = this.f31498b.f40076b;
        Intrinsics.m32176e(divStroke);
        float m17097a = DivBorderDrawerKt.m17097a(divStroke, this.f31501e, this.f31497a) / 2;
        rectF2.set(Math.max(0.0f, f2 + m17097a), Math.max(0.0f, f3 + m17097a), Math.max(0.0f, f4 - m17097a), Math.max(0.0f, f5 - m17097a));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = Math.max(0.0f, fArr[i2] - m17097a);
            }
        }
        this.f31500d.drawPath(m16789b(fArr2, rectF2), this.f31502f);
    }

    /* renamed from: b */
    public final Path m16789b(float[] fArr, RectF rectF) {
        Path path = new Path();
        path.reset();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        path.close();
        return path;
    }
}

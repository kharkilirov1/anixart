package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RoundedRect.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/forms/RoundedRect;", "Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class RoundedRect implements SingleIndicatorDrawer {

    /* renamed from: a */
    @NotNull
    public final IndicatorParams.Style f34087a;

    /* renamed from: b */
    @NotNull
    public final Paint f34088b = new Paint();

    /* renamed from: c */
    @NotNull
    public final Paint f34089c;

    /* renamed from: d */
    @NotNull
    public final RectF f34090d;

    public RoundedRect(@NotNull IndicatorParams.Style style) {
        this.f34087a = style;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f34089c = paint;
        this.f34090d = new RectF();
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    /* renamed from: a */
    public void mo17443a(@NotNull Canvas canvas, @NotNull RectF rectF) {
        IndicatorParams.Shape shape = this.f34087a.f34045b;
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) shape;
        IndicatorParams.ItemSize.RoundedRect roundedRect2 = roundedRect.f34041b;
        this.f34088b.setColor(shape.getF34040a());
        float f2 = roundedRect2.f34037c;
        canvas.drawRoundRect(rectF, f2, f2, this.f34088b);
        int i2 = roundedRect.f34043d;
        if (i2 != 0) {
            if (roundedRect.f34042c == 0.0f) {
                return;
            }
            Paint paint = this.f34089c;
            paint.setColor(i2);
            paint.setStrokeWidth(roundedRect.f34042c);
            float f3 = roundedRect2.f34037c;
            canvas.drawRoundRect(rectF, f3, f3, this.f34089c);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    /* renamed from: b */
    public void mo17444b(@NotNull Canvas canvas, float f2, float f3, @NotNull IndicatorParams.ItemSize itemSize, int i2, float f4, int i3) {
        Intrinsics.m32179h(itemSize, "itemSize");
        IndicatorParams.ItemSize.RoundedRect roundedRect = (IndicatorParams.ItemSize.RoundedRect) itemSize;
        this.f34088b.setColor(i2);
        RectF rectF = this.f34090d;
        float f5 = roundedRect.f34035a / 2.0f;
        rectF.left = f2 - f5;
        float f6 = roundedRect.f34036b / 2.0f;
        rectF.top = f3 - f6;
        rectF.right = f5 + f2;
        rectF.bottom = f6 + f3;
        float f7 = roundedRect.f34037c;
        canvas.drawRoundRect(rectF, f7, f7, this.f34088b);
        if (i3 != 0) {
            if (f4 == 0.0f) {
                return;
            }
            Paint paint = this.f34089c;
            paint.setColor(i3);
            paint.setStrokeWidth(f4);
            RectF rectF2 = this.f34090d;
            float f8 = roundedRect.f34037c;
            canvas.drawRoundRect(rectF2, f8, f8, this.f34089c);
        }
    }
}

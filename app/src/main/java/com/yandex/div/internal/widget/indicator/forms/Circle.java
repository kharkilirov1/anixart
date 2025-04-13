package com.yandex.div.internal.widget.indicator.forms;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Circle.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/forms/Circle;", "Lcom/yandex/div/internal/widget/indicator/forms/SingleIndicatorDrawer;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Circle implements SingleIndicatorDrawer {

    /* renamed from: a */
    @NotNull
    public final IndicatorParams.Style f34084a;

    /* renamed from: b */
    @NotNull
    public final Paint f34085b = new Paint();

    /* renamed from: c */
    @NotNull
    public final RectF f34086c = new RectF();

    public Circle(@NotNull IndicatorParams.Style style) {
        this.f34084a = style;
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    /* renamed from: a */
    public void mo17443a(@NotNull Canvas canvas, @NotNull RectF rectF) {
        this.f34085b.setColor(this.f34084a.f34045b.getF34040a());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2, this.f34085b);
    }

    @Override // com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer
    /* renamed from: b */
    public void mo17444b(@NotNull Canvas canvas, float f2, float f3, @NotNull IndicatorParams.ItemSize itemSize, int i2, float f4, int i3) {
        Intrinsics.m32179h(itemSize, "itemSize");
        IndicatorParams.ItemSize.Circle circle = (IndicatorParams.ItemSize.Circle) itemSize;
        this.f34085b.setColor(i2);
        RectF rectF = this.f34086c;
        float f5 = circle.f34034a;
        rectF.left = f2 - f5;
        rectF.top = f3 - f5;
        rectF.right = f2 + f5;
        rectF.bottom = f3 + f5;
        canvas.drawCircle(rectF.centerX(), this.f34086c.centerY(), circle.f34034a, this.f34085b);
    }
}

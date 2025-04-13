package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextDrawable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "Landroid/graphics/drawable/Drawable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TextDrawable extends Drawable {

    /* renamed from: a */
    @NotNull
    public final SliderTextStyle f34144a;

    /* renamed from: b */
    @NotNull
    public TextDrawDelegate f34145b;

    /* renamed from: c */
    @NotNull
    public final RectF f34146c = new RectF();

    public TextDrawable(@NotNull SliderTextStyle sliderTextStyle) {
        this.f34144a = sliderTextStyle;
        this.f34145b = new TextDrawDelegate(sliderTextStyle);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f34146c.set(getBounds());
        TextDrawDelegate textDrawDelegate = this.f34145b;
        float centerX = this.f34146c.centerX();
        float centerY = this.f34146c.centerY();
        Objects.requireNonNull(textDrawDelegate);
        String str = textDrawDelegate.f34141d;
        if (str == null) {
            return;
        }
        float f2 = centerX - textDrawDelegate.f34142e;
        SliderTextStyle sliderTextStyle = textDrawDelegate.f34138a;
        canvas.drawText(str, f2 + sliderTextStyle.f34097c, centerY + textDrawDelegate.f34143f + sliderTextStyle.f34098d, textDrawDelegate.f34140c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        SliderTextStyle sliderTextStyle = this.f34144a;
        return (int) (Math.abs(sliderTextStyle.f34098d) + sliderTextStyle.f34095a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (Math.abs(this.f34144a.f34097c) + this.f34146c.width());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}

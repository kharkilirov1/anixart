package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextDrawDelegate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/shapes/TextDrawDelegate;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TextDrawDelegate {

    /* renamed from: a */
    @NotNull
    public final SliderTextStyle f34138a;

    /* renamed from: b */
    @NotNull
    public final Rect f34139b = new Rect();

    /* renamed from: c */
    @NotNull
    public final Paint f34140c;

    /* renamed from: d */
    @Nullable
    public String f34141d;

    /* renamed from: e */
    public float f34142e;

    /* renamed from: f */
    public float f34143f;

    public TextDrawDelegate(@NotNull SliderTextStyle sliderTextStyle) {
        this.f34138a = sliderTextStyle;
        Paint paint = new Paint(1);
        paint.setTextSize(sliderTextStyle.f34095a);
        paint.setColor(sliderTextStyle.f34099e);
        paint.setTypeface(sliderTextStyle.f34096b);
        paint.setStyle(Paint.Style.FILL);
        this.f34140c = paint;
    }
}

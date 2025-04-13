package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.shapes.TextDrawDelegate;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderDrawDelegate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/SliderDrawDelegate;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SliderDrawDelegate {

    /* renamed from: a */
    public int f34093a;

    /* renamed from: b */
    public int f34094b;

    /* renamed from: a */
    public final void m17447a(@NotNull Canvas canvas, @Nullable Drawable drawable, int i2) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i2 - intrinsicWidth, (this.f34094b / 2) - (drawable.getIntrinsicHeight() / 2), i2 + intrinsicWidth, (drawable.getIntrinsicHeight() / 2) + (this.f34094b / 2));
        drawable.draw(canvas);
    }

    /* renamed from: b */
    public final void m17448b(@NotNull Canvas canvas, int i2, @Nullable Drawable drawable, int i3, @Nullable TextDrawable textDrawable) {
        m17447a(canvas, drawable, i2);
        if (textDrawable == null) {
            return;
        }
        String text = String.valueOf(i3);
        Intrinsics.m32179h(text, "text");
        TextDrawDelegate textDrawDelegate = textDrawable.f34145b;
        textDrawDelegate.f34141d = text;
        textDrawDelegate.f34140c.getTextBounds(text, 0, text.length(), textDrawDelegate.f34139b);
        textDrawDelegate.f34142e = textDrawDelegate.f34140c.measureText(textDrawDelegate.f34141d) / 2.0f;
        textDrawDelegate.f34143f = textDrawDelegate.f34139b.height() / 2.0f;
        textDrawable.invalidateSelf();
        m17447a(canvas, textDrawable, i2);
    }
}

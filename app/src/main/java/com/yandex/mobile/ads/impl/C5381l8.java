package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.l8 */
/* loaded from: classes3.dex */
public final class C5381l8 extends ImageSpan {

    /* renamed from: a */
    @Nullable
    private WeakReference<Drawable> f52280a;

    /* renamed from: b */
    private final int f52281b;

    public C5381l8(@NonNull Drawable drawable) {
        super(drawable);
        this.f52281b = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, @Nullable CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, @NonNull Paint paint) {
        if (this.f52281b != -1) {
            super.draw(canvas, charSequence, i2, i3, f2, i4, i5, i6, paint);
            return;
        }
        WeakReference<Drawable> weakReference = this.f52280a;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f52280a = new WeakReference<>(drawable);
        }
        canvas.save();
        canvas.translate(f2, Math.round(((i4 + i6) / 2.0f) - (drawable.getBounds().height() / 2.0f)));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, @Nullable CharSequence charSequence, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        WeakReference<Drawable> weakReference = this.f52280a;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f52280a = new WeakReference<>(drawable);
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}

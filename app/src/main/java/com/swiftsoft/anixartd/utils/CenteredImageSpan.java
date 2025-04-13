package com.swiftsoft.anixartd.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class CenteredImageSpan extends ImageSpan {

    /* renamed from: b */
    public WeakReference<Drawable> f30126b;

    public CenteredImageSpan(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    public final Drawable m16295a() {
        WeakReference<Drawable> weakReference = this.f30126b;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f30126b = new WeakReference<>(drawable2);
        return drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, @NonNull Paint paint) {
        Drawable m16295a = m16295a();
        canvas.save();
        int intrinsicHeight = m16295a.getIntrinsicHeight();
        canvas.translate(f2, ((((intrinsicHeight - paint.getFontMetricsInt().descent) + paint.getFontMetricsInt().ascent) / 2) + (i6 - m16295a.getBounds().bottom)) - 12);
        m16295a.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = m16295a().getBounds();
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

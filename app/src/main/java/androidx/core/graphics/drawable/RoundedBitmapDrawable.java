package androidx.core.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class RoundedBitmapDrawable extends Drawable {

    /* renamed from: a */
    public float f3411a;

    /* renamed from: b */
    public boolean f3412b;

    /* renamed from: a */
    public void mo1888a(int i2, int i3, int i4, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void m1889b() {
        if (this.f3412b) {
            mo1888a(0, 0, 0, getBounds(), null);
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f3412b = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        throw null;
    }
}

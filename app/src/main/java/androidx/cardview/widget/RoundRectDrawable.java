package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class RoundRectDrawable extends Drawable {

    /* renamed from: a */
    public float f1769a;

    /* renamed from: c */
    public final RectF f1771c;

    /* renamed from: d */
    public final Rect f1772d;

    /* renamed from: e */
    public float f1773e;

    /* renamed from: h */
    public ColorStateList f1776h;

    /* renamed from: i */
    public PorterDuffColorFilter f1777i;

    /* renamed from: j */
    public ColorStateList f1778j;

    /* renamed from: f */
    public boolean f1774f = false;

    /* renamed from: g */
    public boolean f1775g = true;

    /* renamed from: k */
    public PorterDuff.Mode f1779k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f1770b = new Paint(5);

    public RoundRectDrawable(ColorStateList colorStateList, float f2) {
        this.f1769a = f2;
        m1063b(colorStateList);
        this.f1771c = new RectF();
        this.f1772d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m1062a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void m1063b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1776h = colorStateList;
        this.f1770b.setColor(colorStateList.getColorForState(getState(), this.f1776h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void m1064c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1771c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1772d.set(rect);
        if (this.f1774f) {
            this.f1772d.inset((int) Math.ceil(RoundRectDrawableWithShadow.m1065a(this.f1773e, this.f1769a, this.f1775g)), (int) Math.ceil(RoundRectDrawableWithShadow.m1066b(this.f1773e, this.f1769a, this.f1775g)));
            this.f1771c.set(this.f1772d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1770b;
        if (this.f1777i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1777i);
            z = true;
        }
        RectF rectF = this.f1771c;
        float f2 = this.f1769a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1772d, this.f1769a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1778j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1776h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1064c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1776h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1770b.getColor();
        if (z) {
            this.f1770b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1778j;
        if (colorStateList2 == null || (mode = this.f1779k) == null) {
            return z;
        }
        this.f1777i = m1062a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1770b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1770b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1778j = colorStateList;
        this.f1777i = m1062a(colorStateList, this.f1779k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1779k = mode;
        this.f1777i = m1062a(this.f1778j, mode);
        invalidateSelf();
    }
}

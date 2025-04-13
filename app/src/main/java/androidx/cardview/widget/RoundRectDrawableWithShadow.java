package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class RoundRectDrawableWithShadow extends Drawable {

    /* renamed from: p */
    public static final double f1780p = Math.cos(Math.toRadians(45.0d));

    /* renamed from: q */
    public static RoundRectHelper f1781q;

    /* renamed from: a */
    public final int f1782a;

    /* renamed from: b */
    public Paint f1783b;

    /* renamed from: c */
    public Paint f1784c;

    /* renamed from: d */
    public Paint f1785d;

    /* renamed from: e */
    public final RectF f1786e;

    /* renamed from: f */
    public float f1787f;

    /* renamed from: g */
    public Path f1788g;

    /* renamed from: h */
    public float f1789h;

    /* renamed from: i */
    public float f1790i;

    /* renamed from: j */
    public float f1791j;

    /* renamed from: k */
    public ColorStateList f1792k;

    /* renamed from: l */
    public boolean f1793l;

    /* renamed from: m */
    public final int f1794m;

    /* renamed from: n */
    public final int f1795n;

    /* renamed from: o */
    public boolean f1796o;

    public interface RoundRectHelper {
        /* renamed from: a */
        void mo1056a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    /* renamed from: a */
    public static float m1065a(float f2, float f3, boolean z) {
        if (!z) {
            return f2;
        }
        return (float) (((1.0d - f1780p) * f3) + f2);
    }

    /* renamed from: b */
    public static float m1066b(float f2, float f3, boolean z) {
        if (!z) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f1780p) * f3) + (f2 * 1.5f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i2;
        if (this.f1793l) {
            Rect bounds = getBounds();
            float f2 = this.f1789h;
            float f3 = 1.5f * f2;
            this.f1786e.set(bounds.left + f2, bounds.top + f3, bounds.right - f2, bounds.bottom - f3);
            float f4 = this.f1787f;
            float f5 = -f4;
            RectF rectF = new RectF(f5, f5, f4, f4);
            RectF rectF2 = new RectF(rectF);
            float f6 = -this.f1790i;
            rectF2.inset(f6, f6);
            Path path = this.f1788g;
            if (path == null) {
                this.f1788g = new Path();
            } else {
                path.reset();
            }
            this.f1788g.setFillType(Path.FillType.EVEN_ODD);
            this.f1788g.moveTo(-this.f1787f, 0.0f);
            this.f1788g.rLineTo(-this.f1790i, 0.0f);
            this.f1788g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1788g.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1788g.close();
            float f7 = this.f1787f;
            float f8 = f7 / (this.f1790i + f7);
            Paint paint = this.f1784c;
            float f9 = this.f1787f + this.f1790i;
            int i3 = this.f1794m;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{i3, i3, this.f1795n}, new float[]{0.0f, f8, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f1785d;
            float f10 = -this.f1787f;
            float f11 = this.f1790i;
            float f12 = f10 + f11;
            float f13 = f10 - f11;
            int i4 = this.f1794m;
            paint2.setShader(new LinearGradient(0.0f, f12, 0.0f, f13, new int[]{i4, i4, this.f1795n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1785d.setAntiAlias(false);
            this.f1793l = false;
        }
        canvas.translate(0.0f, this.f1791j / 2.0f);
        float f14 = this.f1787f;
        float f15 = (-f14) - this.f1790i;
        float f16 = (this.f1791j / 2.0f) + f14 + this.f1782a;
        float f17 = f16 * 2.0f;
        boolean z = this.f1786e.width() - f17 > 0.0f;
        boolean z2 = this.f1786e.height() - f17 > 0.0f;
        int save = canvas.save();
        RectF rectF3 = this.f1786e;
        canvas.translate(rectF3.left + f16, rectF3.top + f16);
        canvas.drawPath(this.f1788g, this.f1784c);
        if (z) {
            i2 = save;
            canvas.drawRect(0.0f, f15, this.f1786e.width() - f17, -this.f1787f, this.f1785d);
        } else {
            i2 = save;
        }
        canvas.restoreToCount(i2);
        int save2 = canvas.save();
        RectF rectF4 = this.f1786e;
        canvas.translate(rectF4.right - f16, rectF4.bottom - f16);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1788g, this.f1784c);
        if (z) {
            canvas.drawRect(0.0f, f15, this.f1786e.width() - f17, (-this.f1787f) + this.f1790i, this.f1785d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.f1786e;
        canvas.translate(rectF5.left + f16, rectF5.bottom - f16);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1788g, this.f1784c);
        if (z2) {
            canvas.drawRect(0.0f, f15, this.f1786e.height() - f17, -this.f1787f, this.f1785d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.f1786e;
        canvas.translate(rectF6.right - f16, rectF6.top + f16);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1788g, this.f1784c);
        if (z2) {
            canvas.drawRect(0.0f, f15, this.f1786e.height() - f17, -this.f1787f, this.f1785d);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1791j) / 2.0f);
        f1781q.mo1056a(canvas, this.f1786e, this.f1787f, this.f1783b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m1066b(this.f1789h, this.f1787f, this.f1796o));
        int ceil2 = (int) Math.ceil(m1065a(this.f1789h, this.f1787f, this.f1796o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1792k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1793l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1792k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1783b.getColor() == colorForState) {
            return false;
        }
        this.f1783b.setColor(colorForState);
        this.f1793l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1783b.setAlpha(i2);
        this.f1784c.setAlpha(i2);
        this.f1785d.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1783b.setColorFilter(colorFilter);
    }
}

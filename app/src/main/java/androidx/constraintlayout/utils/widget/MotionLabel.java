package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;

/* loaded from: classes.dex */
public class MotionLabel extends View implements FloatLayout {

    /* renamed from: b */
    public Path f2709b;

    /* renamed from: c */
    public int f2710c;

    /* renamed from: d */
    public boolean f2711d;

    /* renamed from: e */
    public float f2712e;

    /* renamed from: f */
    public float f2713f;

    /* renamed from: g */
    public ViewOutlineProvider f2714g;

    /* renamed from: h */
    public RectF f2715h;

    /* renamed from: i */
    public float f2716i;

    /* renamed from: j */
    public float f2717j;

    /* renamed from: k */
    public String f2718k;

    /* renamed from: l */
    public int f2719l;

    /* renamed from: m */
    public int f2720m;

    /* renamed from: n */
    public int f2721n;

    /* renamed from: o */
    public float f2722o;

    /* renamed from: p */
    public Matrix f2723p;

    /* renamed from: q */
    public float f2724q;

    /* renamed from: r */
    public float f2725r;

    /* renamed from: s */
    public float f2726s;

    /* renamed from: t */
    public float f2727t;

    /* renamed from: u */
    public float f2728u;

    /* renamed from: v */
    public float f2729v;

    /* renamed from: w */
    public float f2730w;

    /* renamed from: x */
    public float f2731x;

    private float getHorizontalOffset() {
        Float.isNaN(this.f2717j);
        this.f2718k.length();
        throw null;
    }

    private float getVerticalOffset() {
        Float.isNaN(this.f2717j);
        throw null;
    }

    /* renamed from: a */
    public void m1415a(float f2) {
        if (this.f2711d || f2 != 1.0f) {
            this.f2709b.reset();
            this.f2718k.length();
            throw null;
        }
    }

    /* renamed from: b */
    public final void m1416b() {
        Float.isNaN(this.f2728u);
        Float.isNaN(this.f2729v);
        Float.isNaN(this.f2730w);
        Float.isNaN(this.f2731x);
        throw null;
    }

    public float getRound() {
        return this.f2713f;
    }

    public float getRoundPercent() {
        return this.f2712e;
    }

    public float getScaleFromTextSize() {
        return this.f2717j;
    }

    public float getTextBackgroundPanX() {
        return this.f2728u;
    }

    public float getTextBackgroundPanY() {
        return this.f2729v;
    }

    public float getTextBackgroundRotate() {
        return this.f2731x;
    }

    public float getTextBackgroundZoom() {
        return this.f2730w;
    }

    public int getTextOutlineColor() {
        return this.f2710c;
    }

    public float getTextPanX() {
        return this.f2726s;
    }

    public float getTextPanY() {
        return this.f2727t;
    }

    public float getTextureHeight() {
        return this.f2724q;
    }

    public float getTextureWidth() {
        return this.f2725r;
    }

    public Typeface getTypeface() {
        throw null;
    }

    @Override // android.view.View
    public void layout(int i2, int i3, int i4, int i5) {
        super.layout(i2, i3, i4, i5);
        boolean isNaN = Float.isNaN(this.f2717j);
        float f2 = isNaN ? 1.0f : this.f2716i / this.f2717j;
        if (this.f2711d || !isNaN) {
            m1415a(f2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2 = Float.isNaN(this.f2717j) ? 1.0f : this.f2716i / this.f2717j;
        super.onDraw(canvas);
        if (!this.f2711d && f2 == 1.0f) {
            canvas.drawText(this.f2718k, this.f2722o + this.f2719l + getHorizontalOffset(), this.f2720m + getVerticalOffset(), null);
            return;
        }
        if (this.f2723p == null) {
            this.f2723p = new Matrix();
        }
        if (this.f2711d) {
            throw null;
        }
        float horizontalOffset = this.f2719l + getHorizontalOffset();
        float verticalOffset = this.f2720m + getVerticalOffset();
        this.f2723p.reset();
        this.f2723p.preTranslate(horizontalOffset, verticalOffset);
        this.f2709b.transform(this.f2723p);
        throw null;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        this.f2719l = getPaddingLeft();
        getPaddingRight();
        this.f2720m = getPaddingTop();
        getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            Objects.requireNonNull(this.f2718k);
            throw null;
        }
    }

    @SuppressLint
    public void setGravity(int i2) {
        if ((i2 & 8388615) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i2 |= 48;
        }
        if (i2 != this.f2721n) {
            invalidate();
        }
        this.f2721n = i2;
        int i3 = i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i3 == 48) {
            this.f2727t = -1.0f;
        } else if (i3 != 80) {
            this.f2727t = 0.0f;
        } else {
            this.f2727t = 1.0f;
        }
        int i4 = i2 & 8388615;
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 8388611) {
                    if (i4 != 8388613) {
                        this.f2726s = 0.0f;
                        return;
                    }
                }
            }
            this.f2726s = 1.0f;
            return;
        }
        this.f2726s = -1.0f;
    }

    @RequiresApi
    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.f2713f = f2;
            float f3 = this.f2712e;
            this.f2712e = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z = this.f2713f != f2;
        this.f2713f = f2;
        if (f2 != 0.0f) {
            if (this.f2709b == null) {
                this.f2709b = new Path();
            }
            if (this.f2715h == null) {
                this.f2715h = new RectF();
            }
            if (this.f2714g == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f2713f);
                    }
                };
                this.f2714g = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f2715h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2709b.reset();
            Path path = this.f2709b;
            RectF rectF = this.f2715h;
            float f4 = this.f2713f;
            path.addRoundRect(rectF, f4, f4, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi
    public void setRoundPercent(float f2) {
        boolean z = this.f2712e != f2;
        this.f2712e = f2;
        if (f2 != 0.0f) {
            if (this.f2709b == null) {
                this.f2709b = new Path();
            }
            if (this.f2715h == null) {
                this.f2715h = new RectF();
            }
            if (this.f2714g == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.f2712e) / 2.0f);
                    }
                };
                this.f2714g = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f2712e) / 2.0f;
            this.f2715h.set(0.0f, 0.0f, width, height);
            this.f2709b.reset();
            this.f2709b.addRoundRect(this.f2715h, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f2) {
        this.f2717j = f2;
    }

    public void setText(CharSequence charSequence) {
        this.f2718k = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f2) {
        this.f2728u = f2;
        m1416b();
        throw null;
    }

    public void setTextBackgroundPanY(float f2) {
        this.f2729v = f2;
        m1416b();
        throw null;
    }

    public void setTextBackgroundRotate(float f2) {
        this.f2731x = f2;
        m1416b();
        throw null;
    }

    public void setTextBackgroundZoom(float f2) {
        this.f2730w = f2;
        m1416b();
        throw null;
    }

    public void setTextFillColor(int i2) {
        invalidate();
    }

    public void setTextOutlineColor(int i2) {
        this.f2710c = i2;
        this.f2711d = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f2) {
        this.f2711d = true;
        if (Float.isNaN(f2)) {
            this.f2711d = false;
        }
        invalidate();
    }

    public void setTextPanX(float f2) {
        this.f2726s = f2;
        invalidate();
    }

    public void setTextPanY(float f2) {
        this.f2727t = f2;
        invalidate();
    }

    public void setTextSize(float f2) {
        this.f2716i = f2;
        Log.v("MotionLabel", Debug.m1387a() + "  " + f2 + " / " + this.f2717j);
        Float.isNaN(this.f2717j);
        throw null;
    }

    public void setTextureHeight(float f2) {
        this.f2724q = f2;
        m1416b();
        throw null;
    }

    public void setTextureWidth(float f2) {
        this.f2725r = f2;
        m1416b();
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}

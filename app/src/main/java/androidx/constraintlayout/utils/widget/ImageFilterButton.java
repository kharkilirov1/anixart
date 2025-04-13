package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: e */
    public float f2669e;

    /* renamed from: f */
    public float f2670f;

    /* renamed from: g */
    public float f2671g;

    /* renamed from: h */
    public Path f2672h;

    /* renamed from: i */
    public ViewOutlineProvider f2673i;

    /* renamed from: j */
    public RectF f2674j;

    /* renamed from: k */
    public Drawable f2675k;

    /* renamed from: l */
    public float f2676l;

    /* renamed from: m */
    public float f2677m;

    /* renamed from: n */
    public float f2678n;

    /* renamed from: o */
    public float f2679o;

    private void setOverlay(boolean z) {
    }

    /* renamed from: a */
    public final void m1411a() {
        if (Float.isNaN(this.f2676l) && Float.isNaN(this.f2677m) && Float.isNaN(this.f2678n) && Float.isNaN(this.f2679o)) {
            return;
        }
        float f2 = Float.isNaN(this.f2676l) ? 0.0f : this.f2676l;
        float f3 = Float.isNaN(this.f2677m) ? 0.0f : this.f2677m;
        float f4 = Float.isNaN(this.f2678n) ? 1.0f : this.f2678n;
        float f5 = Float.isNaN(this.f2679o) ? 0.0f : this.f2679o;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f6 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f6, f6);
        float f7 = intrinsicWidth * f6;
        float f8 = f6 * intrinsicHeight;
        matrix.postTranslate(((((width - f7) * f2) + width) - f7) * 0.5f, ((((height - f8) * f3) + height) - f8) * 0.5f);
        matrix.postRotate(f5, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: b */
    public final void m1412b() {
        if (Float.isNaN(this.f2676l) && Float.isNaN(this.f2677m) && Float.isNaN(this.f2678n) && Float.isNaN(this.f2679o)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m1411a();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f2669e;
    }

    public float getImagePanX() {
        return this.f2676l;
    }

    public float getImagePanY() {
        return this.f2677m;
    }

    public float getImageRotate() {
        return this.f2679o;
    }

    public float getImageZoom() {
        return this.f2678n;
    }

    public float getRound() {
        return this.f2671g;
    }

    public float getRoundPercent() {
        return this.f2670f;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    @Override // android.view.View
    public void layout(int i2, int i3, int i4, int i5) {
        super.layout(i2, i3, i4, i5);
        m1411a();
    }

    public void setAltImageResource(int i2) {
        this.f2675k = AppCompatResources.m497b(getContext(), i2).mutate();
        throw null;
    }

    public void setBrightness(float f2) {
        throw null;
    }

    public void setContrast(float f2) {
        throw null;
    }

    public void setCrossfade(float f2) {
        this.f2669e = f2;
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2675k == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f2) {
        this.f2676l = f2;
        m1412b();
    }

    public void setImagePanY(float f2) {
        this.f2677m = f2;
        m1412b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.f2675k == null) {
            super.setImageResource(i2);
        } else {
            AppCompatResources.m497b(getContext(), i2).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f2) {
        this.f2679o = f2;
        m1412b();
    }

    public void setImageZoom(float f2) {
        this.f2678n = f2;
        m1412b();
    }

    @RequiresApi
    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.f2671g = f2;
            float f3 = this.f2670f;
            this.f2670f = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z = this.f2671g != f2;
        this.f2671g = f2;
        if (f2 != 0.0f) {
            if (this.f2672h == null) {
                this.f2672h = new Path();
            }
            if (this.f2674j == null) {
                this.f2674j = new RectF();
            }
            if (this.f2673i == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2671g);
                    }
                };
                this.f2673i = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f2674j.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2672h.reset();
            Path path = this.f2672h;
            RectF rectF = this.f2674j;
            float f4 = this.f2671g;
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
        boolean z = this.f2670f != f2;
        this.f2670f = f2;
        if (f2 != 0.0f) {
            if (this.f2672h == null) {
                this.f2672h = new Path();
            }
            if (this.f2674j == null) {
                this.f2674j = new RectF();
            }
            if (this.f2673i == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterButton.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f2670f) / 2.0f);
                    }
                };
                this.f2673i = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f2670f) / 2.0f;
            this.f2674j.set(0.0f, 0.0f, width, height);
            this.f2672h.reset();
            this.f2672h.addRoundRect(this.f2674j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f2) {
        throw null;
    }

    public void setWarmth(float f2) {
        throw null;
    }
}

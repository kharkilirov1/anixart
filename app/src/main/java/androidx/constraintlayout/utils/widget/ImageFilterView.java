package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
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
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: e */
    public Drawable f2682e;

    /* renamed from: f */
    public float f2683f;

    /* renamed from: g */
    public float f2684g;

    /* renamed from: h */
    public float f2685h;

    /* renamed from: i */
    public Path f2686i;

    /* renamed from: j */
    public ViewOutlineProvider f2687j;

    /* renamed from: k */
    public RectF f2688k;

    /* renamed from: l */
    public float f2689l;

    /* renamed from: m */
    public float f2690m;

    /* renamed from: n */
    public float f2691n;

    /* renamed from: o */
    public float f2692o;

    public static class ImageMatrix {

        /* renamed from: a */
        public float[] f2695a = new float[20];

        /* renamed from: b */
        public ColorMatrix f2696b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f2697c = new ColorMatrix();

        /* renamed from: d */
        public float f2698d = 1.0f;

        /* renamed from: e */
        public float f2699e = 1.0f;

        /* renamed from: f */
        public float f2700f = 1.0f;

        /* renamed from: g */
        public float f2701g = 1.0f;
    }

    private void setOverlay(boolean z) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: g */
    public final void m1413g() {
        if (Float.isNaN(this.f2689l) && Float.isNaN(this.f2690m) && Float.isNaN(this.f2691n) && Float.isNaN(this.f2692o)) {
            return;
        }
        float f2 = Float.isNaN(this.f2689l) ? 0.0f : this.f2689l;
        float f3 = Float.isNaN(this.f2690m) ? 0.0f : this.f2690m;
        float f4 = Float.isNaN(this.f2691n) ? 1.0f : this.f2691n;
        float f5 = Float.isNaN(this.f2692o) ? 0.0f : this.f2692o;
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

    public float getBrightness() {
        throw null;
    }

    public float getContrast() {
        throw null;
    }

    public float getCrossfade() {
        return this.f2683f;
    }

    public float getImagePanX() {
        return this.f2689l;
    }

    public float getImagePanY() {
        return this.f2690m;
    }

    public float getImageRotate() {
        return this.f2692o;
    }

    public float getImageZoom() {
        return this.f2691n;
    }

    public float getRound() {
        return this.f2685h;
    }

    public float getRoundPercent() {
        return this.f2684g;
    }

    public float getSaturation() {
        throw null;
    }

    public float getWarmth() {
        throw null;
    }

    /* renamed from: i */
    public final void m1414i() {
        if (Float.isNaN(this.f2689l) && Float.isNaN(this.f2690m) && Float.isNaN(this.f2691n) && Float.isNaN(this.f2692o)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            m1413g();
        }
    }

    @Override // android.view.View
    public void layout(int i2, int i3, int i4, int i5) {
        super.layout(i2, i3, i4, i5);
        m1413g();
    }

    public void setAltImageResource(int i2) {
        this.f2682e = AppCompatResources.m497b(getContext(), i2).mutate();
        throw null;
    }

    public void setBrightness(float f2) {
        throw null;
    }

    public void setContrast(float f2) {
        throw null;
    }

    public void setCrossfade(float f2) {
        this.f2683f = f2;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f2682e == null || drawable == null) {
            super.setImageDrawable(drawable);
        } else {
            drawable.mutate();
            throw null;
        }
    }

    public void setImagePanX(float f2) {
        this.f2689l = f2;
        m1414i();
    }

    public void setImagePanY(float f2) {
        this.f2690m = f2;
        m1414i();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        if (this.f2682e == null) {
            super.setImageResource(i2);
        } else {
            AppCompatResources.m497b(getContext(), i2).mutate();
            throw null;
        }
    }

    public void setImageRotate(float f2) {
        this.f2692o = f2;
        m1414i();
    }

    public void setImageZoom(float f2) {
        this.f2691n = f2;
        m1414i();
    }

    @RequiresApi
    public void setRound(float f2) {
        if (Float.isNaN(f2)) {
            this.f2685h = f2;
            float f3 = this.f2684g;
            this.f2684g = -1.0f;
            setRoundPercent(f3);
            return;
        }
        boolean z = this.f2685h != f2;
        this.f2685h = f2;
        if (f2 != 0.0f) {
            if (this.f2686i == null) {
                this.f2686i = new Path();
            }
            if (this.f2688k == null) {
                this.f2688k = new RectF();
            }
            if (this.f2687j == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2685h);
                    }
                };
                this.f2687j = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.f2688k.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2686i.reset();
            Path path = this.f2686i;
            RectF rectF = this.f2688k;
            float f4 = this.f2685h;
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
        boolean z = this.f2684g != f2;
        this.f2684g = f2;
        if (f2 != 0.0f) {
            if (this.f2686i == null) {
                this.f2686i = new Path();
            }
            if (this.f2688k == null) {
                this.f2688k = new RectF();
            }
            if (this.f2687j == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f2684g) / 2.0f);
                    }
                };
                this.f2687j = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f2684g) / 2.0f;
            this.f2688k.set(0.0f, 0.0f, width, height);
            this.f2686i.reset();
            this.f2686i.addRoundRect(this.f2688k, min, min, Path.Direction.CW);
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

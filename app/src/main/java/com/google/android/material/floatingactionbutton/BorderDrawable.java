package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

@RestrictTo
/* loaded from: classes.dex */
class BorderDrawable extends Drawable {

    /* renamed from: b */
    @NonNull
    public final Paint f18085b;

    /* renamed from: h */
    @Dimension
    public float f18091h;

    /* renamed from: i */
    @ColorInt
    public int f18092i;

    /* renamed from: j */
    @ColorInt
    public int f18093j;

    /* renamed from: k */
    @ColorInt
    public int f18094k;

    /* renamed from: l */
    @ColorInt
    public int f18095l;

    /* renamed from: m */
    @ColorInt
    public int f18096m;

    /* renamed from: o */
    public ShapeAppearanceModel f18098o;

    /* renamed from: p */
    @Nullable
    public ColorStateList f18099p;

    /* renamed from: a */
    public final ShapeAppearancePathProvider f18084a = ShapeAppearancePathProvider.m10326c();

    /* renamed from: c */
    public final Path f18086c = new Path();

    /* renamed from: d */
    public final Rect f18087d = new Rect();

    /* renamed from: e */
    public final RectF f18088e = new RectF();

    /* renamed from: f */
    public final RectF f18089f = new RectF();

    /* renamed from: g */
    public final BorderState f18090g = new BorderState(null);

    /* renamed from: n */
    public boolean f18097n = true;

    public class BorderState extends Drawable.ConstantState {
        public BorderState(C12971 c12971) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return BorderDrawable.this;
        }
    }

    public BorderDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this.f18098o = shapeAppearanceModel;
        Paint paint = new Paint(1);
        this.f18085b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    /* renamed from: a */
    public RectF m10051a() {
        this.f18089f.set(getBounds());
        return this.f18089f;
    }

    /* renamed from: b */
    public void m10052b(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f18096m = colorStateList.getColorForState(getState(), this.f18096m);
        }
        this.f18099p = colorStateList;
        this.f18097n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f18097n) {
            Paint paint = this.f18085b;
            copyBounds(this.f18087d);
            float height = this.f18091h / r1.height();
            paint.setShader(new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{ColorUtils.m1773b(this.f18092i, this.f18096m), ColorUtils.m1773b(this.f18093j, this.f18096m), ColorUtils.m1773b(ColorUtils.m1776e(this.f18093j, 0), this.f18096m), ColorUtils.m1773b(ColorUtils.m1776e(this.f18095l, 0), this.f18096m), ColorUtils.m1773b(this.f18095l, this.f18096m), ColorUtils.m1773b(this.f18094k, this.f18096m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f18097n = false;
        }
        float strokeWidth = this.f18085b.getStrokeWidth() / 2.0f;
        copyBounds(this.f18087d);
        this.f18088e.set(this.f18087d);
        float min = Math.min(this.f18098o.f18688e.mo10265a(m10051a()), this.f18088e.width() / 2.0f);
        if (this.f18098o.m10316f(m10051a())) {
            this.f18088e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f18088e, min, min, this.f18085b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f18090g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f18091h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi
    public void getOutline(@NonNull Outline outline) {
        if (this.f18098o.m10316f(m10051a())) {
            outline.setRoundRect(getBounds(), this.f18098o.f18688e.mo10265a(m10051a()));
            return;
        }
        copyBounds(this.f18087d);
        this.f18088e.set(this.f18087d);
        this.f18084a.m10327a(this.f18098o, 1.0f, this.f18088e, this.f18086c);
        if (this.f18086c.isConvex()) {
            outline.setConvexPath(this.f18086c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f18098o.m10316f(m10051a())) {
            return true;
        }
        int round = Math.round(this.f18091h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f18099p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f18097n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f18099p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f18096m)) != this.f18096m) {
            this.f18097n = true;
            this.f18096m = colorForState;
        }
        if (this.f18097n) {
            invalidateSelf();
        }
        return this.f18097n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange int i2) {
        this.f18085b.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f18085b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

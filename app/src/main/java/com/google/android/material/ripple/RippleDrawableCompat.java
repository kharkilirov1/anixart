package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo
/* loaded from: classes.dex */
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {

    /* renamed from: b */
    public RippleDrawableCompatState f18606b;

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this.f18606b = new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.f18606b;
        if (rippleDrawableCompatState.f18608b) {
            rippleDrawableCompatState.f18607a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f18606b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f18606b.f18607a.getOpacity();
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f18606b.f18607a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f18606b = new RippleDrawableCompatState(this.f18606b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f18606b.f18607a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f18606b.f18607a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m10259e = RippleUtils.m10259e(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.f18606b;
        if (rippleDrawableCompatState.f18608b == m10259e) {
            return onStateChange;
        }
        rippleDrawableCompatState.f18608b = m10259e;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f18606b.f18607a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f18606b.f18607a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f18606b.f18607a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i2) {
        this.f18606b.f18607a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f18606b.f18607a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f18606b.f18607a.setTintMode(mode);
    }

    public static final class RippleDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a */
        @NonNull
        public MaterialShapeDrawable f18607a;

        /* renamed from: b */
        public boolean f18608b;

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.f18607a = materialShapeDrawable;
            this.f18608b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this), null);
        }

        public RippleDrawableCompatState(@NonNull RippleDrawableCompatState rippleDrawableCompatState) {
            this.f18607a = (MaterialShapeDrawable) rippleDrawableCompatState.f18607a.getConstantState().newDrawable();
            this.f18608b = rippleDrawableCompatState.f18608b;
        }
    }

    public RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState, C13641 c13641) {
        this.f18606b = rippleDrawableCompatState;
    }
}

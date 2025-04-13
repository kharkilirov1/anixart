package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes.dex */
public class FixedSizeDrawable extends Drawable {

    /* renamed from: a */
    public final Matrix f8792a;

    /* renamed from: b */
    public final RectF f8793b;

    /* renamed from: c */
    public final RectF f8794c;

    /* renamed from: d */
    public Drawable f8795d;

    /* renamed from: e */
    public State f8796e;

    /* renamed from: f */
    public boolean f8797f;

    public static final class State extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f8798a;

        /* renamed from: b */
        public final int f8799b;

        /* renamed from: c */
        public final int f8800c;

        public State(State state) {
            Drawable.ConstantState constantState = state.f8798a;
            int i2 = state.f8799b;
            int i3 = state.f8800c;
            this.f8798a = constantState;
            this.f8799b = i2;
            this.f8800c = i3;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new FixedSizeDrawable(this, this.f8798a.newDrawable());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new FixedSizeDrawable(this, this.f8798a.newDrawable(resources));
        }

        public State(Drawable.ConstantState constantState, int i2, int i3) {
            this.f8798a = constantState;
            this.f8799b = i2;
            this.f8800c = i3;
        }
    }

    public FixedSizeDrawable(State state, Drawable drawable) {
        this.f8796e = state;
        Objects.requireNonNull(drawable, "Argument must not be null");
        this.f8795d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f8792a = new Matrix();
        this.f8793b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f8794c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f8795d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.concat(this.f8792a);
        this.f8795d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public int getAlpha() {
        return this.f8795d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f8795d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f8795d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8796e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f8795d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8796e.f8800c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8796e.f8799b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f8795d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f8795d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f8795d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f8795d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f8795d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f8797f && super.mutate() == this) {
            this.f8795d = this.f8795d.mutate();
            this.f8796e = new State(this.f8796e);
            this.f8797f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j2) {
        super.scheduleSelf(runnable, j2);
        this.f8795d.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f8795d.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        this.f8794c.set(i2, i3, i4, i5);
        this.f8792a.setRectToRect(this.f8793b, this.f8794c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f8795d.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i2, @NonNull PorterDuff.Mode mode) {
        this.f8795d.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.f8795d.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f8795d.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.f8795d.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f8795d.unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8795d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        this.f8794c.set(rect);
        this.f8792a.setRectToRect(this.f8793b, this.f8794c, Matrix.ScaleToFit.CENTER);
    }
}

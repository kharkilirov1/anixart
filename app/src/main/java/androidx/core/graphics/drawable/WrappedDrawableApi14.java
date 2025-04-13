package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;

/* loaded from: classes.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* renamed from: h */
    public static final PorterDuff.Mode f3413h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f3414b;

    /* renamed from: c */
    public PorterDuff.Mode f3415c;

    /* renamed from: d */
    public boolean f3416d;

    /* renamed from: e */
    public WrappedDrawableState f3417e;

    /* renamed from: f */
    public boolean f3418f;

    /* renamed from: g */
    public Drawable f3419g;

    public WrappedDrawableApi14(@NonNull WrappedDrawableState wrappedDrawableState, @Nullable Resources resources) {
        Drawable.ConstantState constantState;
        this.f3417e = wrappedDrawableState;
        if (wrappedDrawableState == null || (constantState = wrappedDrawableState.f3422b) == null) {
            return;
        }
        mo1890a(constantState.newDrawable(resources));
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    /* renamed from: a */
    public final void mo1890a(Drawable drawable) {
        Drawable drawable2 = this.f3419g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3419g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.f3417e;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.f3422b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    /* renamed from: b */
    public final Drawable mo1891b() {
        return this.f3419g;
    }

    /* renamed from: c */
    public boolean mo1892c() {
        return true;
    }

    /* renamed from: d */
    public final boolean m1893d(int[] iArr) {
        if (!mo1892c()) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.f3417e;
        ColorStateList colorStateList = wrappedDrawableState.f3423c;
        PorterDuff.Mode mode = wrappedDrawableState.f3424d;
        if (colorStateList == null || mode == null) {
            this.f3416d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f3416d || colorForState != this.f3414b || mode != this.f3415c) {
                setColorFilter(colorForState, mode);
                this.f3414b = colorForState;
                this.f3415c = mode;
                this.f3416d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f3419g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.f3417e;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.f3419g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.f3417e;
        if (wrappedDrawableState == null) {
            return null;
        }
        if (!(wrappedDrawableState.f3422b != null)) {
            return null;
        }
        wrappedDrawableState.f3421a = getChangingConfigurations();
        return this.f3417e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f3419g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3419g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3419g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public int getLayoutDirection() {
        return DrawableCompat.m1834f(this.f3419g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f3419g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f3419g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f3419g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f3419g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
        return this.f3419g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f3419g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public boolean isAutoMirrored() {
        return DrawableCompat.Api19Impl.m1849d(this.f3419g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = (!mo1892c() || (wrappedDrawableState = this.f3417e) == null) ? null : wrappedDrawableState.f3423c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3419g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f3419g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f3418f && super.mutate() == this) {
            this.f3417e = new WrappedDrawableState(this.f3417e);
            Drawable drawable = this.f3419g;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState = this.f3417e;
            if (wrappedDrawableState != null) {
                Drawable drawable2 = this.f3419g;
                wrappedDrawableState.f3422b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3418f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3419g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public boolean onLayoutDirectionChanged(int i2) {
        return DrawableCompat.m1840l(this.f3419g, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        return this.f3419g.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f3419g.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi
    public void setAutoMirrored(boolean z) {
        DrawableCompat.Api19Impl.m1850e(this.f3419g, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f3419g.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3419g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f3419g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f3419g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        return m1893d(iArr) || this.f3419g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3417e.f3423c = colorStateList;
        m1893d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f3417e.f3424d = mode;
        m1893d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3419g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public WrappedDrawableApi14(@Nullable Drawable drawable) {
        this.f3417e = new WrappedDrawableState(this.f3417e);
        mo1890a(drawable);
    }
}

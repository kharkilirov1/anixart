package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.C1195R;
import com.yandex.mobile.ads.C4632R;

@RestrictTo
/* loaded from: classes.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: q */
    @Nullable
    public Drawable f18303q;

    /* renamed from: r */
    public final Rect f18304r;

    /* renamed from: s */
    public final Rect f18305s;

    /* renamed from: t */
    public int f18306t;

    /* renamed from: u */
    public boolean f18307u;

    /* renamed from: v */
    public boolean f18308v;

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f18303q;
        if (drawable != null) {
            if (this.f18308v) {
                this.f18308v = false;
                Rect rect = this.f18304r;
                Rect rect2 = this.f18305s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f18307u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f18306t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi
    @TargetApi
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f18303q;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f18303q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f18303q.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f18303q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f18306t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18303q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f18308v = z | this.f18308v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f18308v = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f18303q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f18303q);
            }
            this.f18303q = drawable;
            this.f18308v = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f18306t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f18306t != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i2 |= 48;
            }
            this.f18306t = i2;
            if (i2 == 119 && this.f18303q != null) {
                this.f18303q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f18303q;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18304r = new Rect();
        this.f18305s = new Rect();
        this.f18306t = C4632R.styleable.AppCompatTheme_windowActionModeOverlay;
        this.f18307u = true;
        this.f18308v = false;
        int[] iArr = C1195R.styleable.f17332q;
        ThemeEnforcement.m10156a(context, attributeSet, i2, 0);
        ThemeEnforcement.m10157b(context, attributeSet, iArr, i2, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        this.f18306t = obtainStyledAttributes.getInt(1, this.f18306t);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f18307u = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }
}

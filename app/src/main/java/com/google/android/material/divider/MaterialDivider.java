package com.google.android.material.divider;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class MaterialDivider extends View {

    /* renamed from: b */
    public int f18069b;

    /* renamed from: c */
    @ColorInt
    public int f18070c;

    /* renamed from: d */
    public int f18071d;

    /* renamed from: e */
    public int f18072e;

    public int getDividerColor() {
        return this.f18070c;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f18072e;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f18071d;
    }

    public int getDividerThickness() {
        return this.f18069b;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (ViewCompat.m2231w(this) != 1) {
        }
        getWidth();
        getBottom();
        getTop();
        throw null;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i4 = this.f18069b;
            if (i4 > 0 && measuredHeight != i4) {
                measuredHeight = i4;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i2) {
        if (this.f18070c == i2) {
            return;
        }
        this.f18070c = i2;
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setDividerColorResource(@ColorRes int i2) {
        setDividerColor(ContextCompat.m1670c(getContext(), i2));
    }

    public void setDividerInsetEnd(@Px int i2) {
        this.f18072e = i2;
    }

    public void setDividerInsetEndResource(@DimenRes int i2) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerInsetStart(@Px int i2) {
        this.f18071d = i2;
    }

    public void setDividerInsetStartResource(@DimenRes int i2) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i2));
    }

    public void setDividerThickness(@Px int i2) {
        if (this.f18069b != i2) {
            this.f18069b = i2;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i2) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i2));
    }
}

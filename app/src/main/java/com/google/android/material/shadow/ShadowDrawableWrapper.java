package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapper;

@Deprecated
/* loaded from: classes.dex */
public class ShadowDrawableWrapper extends DrawableWrapper {

    /* renamed from: d */
    public static final double f18614d = Math.cos(Math.toRadians(45.0d));

    /* renamed from: c */
    public boolean f18615c;

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f18615c) {
            int i2 = getBounds().left;
            throw null;
        }
        canvas.save();
        throw null;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil(0.0f);
        int ceil2 = (int) Math.ceil(0.0f);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f18615c = true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f668b.setAlpha(i2);
        throw null;
    }
}

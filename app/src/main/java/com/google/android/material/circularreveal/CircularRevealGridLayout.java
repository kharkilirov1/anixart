package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.GridLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.CircularRevealWidget;
import java.util.Objects;

/* loaded from: classes.dex */
public class CircularRevealGridLayout extends GridLayout implements CircularRevealWidget {
    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    /* renamed from: a */
    public void mo9965a() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    /* renamed from: b */
    public void mo9966b() {
        Objects.requireNonNull(null);
        throw null;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(@ColorInt int i2) {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        throw null;
    }
}

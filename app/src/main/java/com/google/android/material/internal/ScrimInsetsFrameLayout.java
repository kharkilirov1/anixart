package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

@RestrictTo
/* loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: b */
    @Nullable
    public Drawable f18326b;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$1 */
    class C13251 implements OnApplyWindowInsetsListener {
        @Override // androidx.core.view.OnApplyWindowInsetsListener
        /* renamed from: a */
        public WindowInsetsCompat mo433a(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            throw null;
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f18326b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f18326b;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
    }

    public void setDrawTopInsetForeground(boolean z) {
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f18326b = drawable;
    }
}

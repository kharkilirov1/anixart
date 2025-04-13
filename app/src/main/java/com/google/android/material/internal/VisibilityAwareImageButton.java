package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: b */
    public int f18376b;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18376b = getVisibility();
    }

    /* renamed from: b */
    public final void m10174b(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f18376b = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f18376b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.f18376b = i2;
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18376b = getVisibility();
    }
}

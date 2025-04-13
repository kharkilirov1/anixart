package com.google.android.material.internal;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        if (((Float) valueAnimator.getAnimatedValue()).floatValue() > 0.5f) {
            throw null;
        }
        throw null;
    }
}

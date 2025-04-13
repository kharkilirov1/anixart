package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {
    /* renamed from: c */
    public static Animator m10581c(final View view, final float f2, final float f3, @FloatRange final float f4, @FloatRange final float f5, final float f6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.FadeThroughProvider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(TransitionUtils.m10602d(f2, f3, f4, f5, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.FadeThroughProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(f6);
            }
        });
        return ofFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: a */
    public Animator mo10579a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m10581c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: b */
    public Animator mo10580b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m10581c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}

package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* loaded from: classes.dex */
public final class CircularRevealCompat {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: a */
    public static Animator m9963a(@NonNull CircularRevealWidget circularRevealWidget, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(circularRevealWidget, (Property<CircularRevealWidget, V>) CircularRevealWidget.CircularRevealProperty.f17877a, (TypeEvaluator) CircularRevealWidget.CircularRevealEvaluator.f17875b, (Object[]) new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(f2, f3, f4)});
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f2, (int) f3, revealInfo.f17881c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @NonNull
    /* renamed from: b */
    public static Animator.AnimatorListener m9964b(@NonNull final CircularRevealWidget circularRevealWidget) {
        return new AnimatorListenerAdapter() { // from class: com.google.android.material.circularreveal.CircularRevealCompat.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CircularRevealWidget.this.mo9966b();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularRevealWidget.this.mo9965a();
            }
        };
    }
}

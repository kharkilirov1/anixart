package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f19440a = 1.0f;

    /* renamed from: b */
    public float f19441b = 1.1f;

    /* renamed from: c */
    public float f19442c = 0.8f;

    /* renamed from: d */
    public float f19443d = 1.0f;

    /* renamed from: f */
    public boolean f19445f = true;

    /* renamed from: e */
    public boolean f19444e = true;

    /* renamed from: c */
    public static Animator m10598c(final View view, float f2, float f3) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f2, scaleX * f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2 * scaleY, f3 * scaleY));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: a */
    public Animator mo10579a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f19444e ? m10598c(view, this.f19442c, this.f19443d) : m10598c(view, this.f19441b, this.f19440a);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: b */
    public Animator mo10580b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f19445f) {
            return this.f19444e ? m10598c(view, this.f19440a, this.f19441b) : m10598c(view, this.f19443d, this.f19442c);
        }
        return null;
    }
}

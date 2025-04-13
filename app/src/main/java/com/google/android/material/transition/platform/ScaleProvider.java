package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f19571a = 1.0f;

    /* renamed from: b */
    public float f19572b = 1.1f;

    /* renamed from: c */
    public float f19573c = 0.8f;

    /* renamed from: d */
    public float f19574d = 1.0f;

    /* renamed from: f */
    public boolean f19576f = true;

    /* renamed from: e */
    public boolean f19575e = true;

    /* renamed from: c */
    public static Animator m10632c(final View view, float f2, float f3) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f2, scaleX * f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f2 * scaleY, f3 * scaleY));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: a */
    public Animator mo10611a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f19575e ? m10632c(view, this.f19573c, this.f19574d) : m10632c(view, this.f19572b, this.f19571a);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: b */
    public Animator mo10612b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f19576f) {
            return this.f19575e ? m10632c(view, this.f19571a, this.f19572b) : m10632c(view, this.f19574d, this.f19573c);
        }
        return null;
    }
}

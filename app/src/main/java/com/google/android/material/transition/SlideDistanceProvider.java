package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$1 */
    class C14641 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f19449a;

        /* renamed from: b */
        public final /* synthetic */ float f19450b;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19449a.setTranslationX(this.f19450b);
        }
    }

    /* renamed from: com.google.android.material.transition.SlideDistanceProvider$2 */
    class C14652 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f19451a;

        /* renamed from: b */
        public final /* synthetic */ float f19452b;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19451a.setTranslationY(this.f19452b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: a */
    public Animator mo10579a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        view.getContext();
        view.getTranslationX();
        view.getTranslationY();
        throw new IllegalArgumentException("Invalid slide direction: 0");
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: b */
    public Animator mo10580b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        view.getContext();
        view.getTranslationX();
        view.getTranslationY();
        throw new IllegalArgumentException("Invalid slide direction: 0");
    }
}

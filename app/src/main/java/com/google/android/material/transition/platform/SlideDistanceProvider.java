package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi
/* loaded from: classes.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* renamed from: com.google.android.material.transition.platform.SlideDistanceProvider$1 */
    class C14851 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f19580a;

        /* renamed from: b */
        public final /* synthetic */ float f19581b;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19580a.setTranslationX(this.f19581b);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.SlideDistanceProvider$2 */
    class C14862 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f19582a;

        /* renamed from: b */
        public final /* synthetic */ float f19583b;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19582a.setTranslationY(this.f19583b);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: a */
    public Animator mo10611a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        view.getContext();
        view.getTranslationX();
        view.getTranslationY();
        throw new IllegalArgumentException("Invalid slide direction: 0");
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    /* renamed from: b */
    public Animator mo10612b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        view.getContext();
        view.getTranslationX();
        view.getTranslationY();
        throw new IllegalArgumentException("Invalid slide direction: 0");
    }
}

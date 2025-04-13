package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class Fade extends Visibility {

    public static class FadeAnimatorListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f6204a;

        /* renamed from: b */
        public boolean f6205b = false;

        public FadeAnimatorListener(View view) {
            this.f6204a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewUtils.f6341a.mo4277f(this.f6204a, 1.0f);
            if (this.f6205b) {
                this.f6204a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (ViewCompat.m2171K(this.f6204a) && this.f6204a.getLayerType() == 0) {
                this.f6205b = true;
                this.f6204a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i2) {
        m4287U(i2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Float f2;
        float floatValue = (transitionValues == null || (f2 = (Float) transitionValues.f6317a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f2.floatValue();
        return m4207V(view, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: S */
    public Animator mo4205S(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ViewUtils.f6341a.mo4276c(view);
        Float f2 = (Float) transitionValues.f6317a.get("android:fade:transitionAlpha");
        return m4207V(view, f2 != null ? f2.floatValue() : 1.0f, 0.0f);
    }

    /* renamed from: V */
    public final Animator m4207V(final View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        ViewUtils.f6341a.mo4277f(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ViewUtils.f6342b, f3);
        ofFloat.addListener(new FadeAnimatorListener(view));
        mo4237a(new TransitionListenerAdapter(this) { // from class: androidx.transition.Fade.1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NonNull Transition transition) {
                View view2 = view;
                ViewUtilsBase viewUtilsBase = ViewUtils.f6341a;
                viewUtilsBase.mo4277f(view2, 1.0f);
                viewUtilsBase.mo4274a(view);
                transition.mo4255z(this);
            }
        });
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
        transitionValues.f6317a.put("android:fade:transitionAlpha", Float.valueOf(ViewUtils.m4272a(transitionValues.f6318b)));
    }

    public Fade() {
    }
}

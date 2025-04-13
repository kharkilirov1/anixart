package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
class TranslationAnimationCreator {

    public static class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a */
        public final View f6324a;

        /* renamed from: b */
        public final View f6325b;

        /* renamed from: c */
        public final int f6326c;

        /* renamed from: d */
        public final int f6327d;

        /* renamed from: e */
        public int[] f6328e;

        /* renamed from: f */
        public float f6329f;

        /* renamed from: g */
        public float f6330g;

        /* renamed from: h */
        public final float f6331h;

        /* renamed from: i */
        public final float f6332i;

        public TransitionPositionListener(View view, View view2, int i2, int i3, float f2, float f3) {
            this.f6325b = view;
            this.f6324a = view2;
            this.f6326c = i2 - Math.round(view.getTranslationX());
            this.f6327d = i3 - Math.round(view.getTranslationY());
            this.f6331h = f2;
            this.f6332i = f3;
            int[] iArr = (int[]) view2.getTag(C2507R.id.transition_position);
            this.f6328e = iArr;
            if (iArr != null) {
                view2.setTag(C2507R.id.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: a */
        public void mo4211a(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: b */
        public void mo4191b(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: c */
        public void mo4192c(@NonNull Transition transition) {
            this.f6325b.setTranslationX(this.f6331h);
            this.f6325b.setTranslationY(this.f6332i);
            transition.mo4255z(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: d */
        public void mo4193d(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: e */
        public void mo4194e(@NonNull Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6328e == null) {
                this.f6328e = new int[2];
            }
            this.f6328e[0] = Math.round(this.f6325b.getTranslationX() + this.f6326c);
            this.f6328e[1] = Math.round(this.f6325b.getTranslationY() + this.f6327d);
            this.f6324a.setTag(C2507R.id.transition_position, this.f6328e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f6329f = this.f6325b.getTranslationX();
            this.f6330g = this.f6325b.getTranslationY();
            this.f6325b.setTranslationX(this.f6331h);
            this.f6325b.setTranslationY(this.f6332i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f6325b.setTranslationX(this.f6329f);
            this.f6325b.setTranslationY(this.f6330g);
        }
    }

    @Nullable
    /* renamed from: a */
    public static Animator m4270a(@NonNull View view, @NonNull TransitionValues transitionValues, int i2, int i3, float f2, float f3, float f4, float f5, @Nullable TimeInterpolator timeInterpolator, @NonNull Transition transition) {
        float f6;
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.f6318b.getTag(C2507R.id.transition_position)) != null) {
            f6 = (r4[0] - i2) + translationX;
            f7 = (r4[1] - i3) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int round = Math.round(f6 - translationX) + i2;
        int round2 = Math.round(f7 - translationY) + i3;
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f7, f5));
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view, transitionValues.f6318b, round, round2, translationX, translationY);
        transition.mo4237a(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addPauseListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}

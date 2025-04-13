package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class Slide extends Visibility {

    /* renamed from: F */
    public static final TimeInterpolator f6253F = new DecelerateInterpolator();

    /* renamed from: G */
    public static final TimeInterpolator f6254G = new AccelerateInterpolator();

    /* renamed from: H */
    public static final CalculateSlide f6255H = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.1
        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: b */
        public float mo4221b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };

    /* renamed from: I */
    public static final CalculateSlide f6256I = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.2
        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: b */
        public float mo4221b(ViewGroup viewGroup, View view) {
            return ViewCompat.m2231w(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    };

    /* renamed from: J */
    public static final CalculateSlide f6257J = new CalculateSlideVertical() { // from class: androidx.transition.Slide.3
        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: a */
        public float mo4222a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };

    /* renamed from: K */
    public static final CalculateSlide f6258K = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.4
        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: b */
        public float mo4221b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };

    /* renamed from: L */
    public static final CalculateSlide f6259L = new CalculateSlideHorizontal() { // from class: androidx.transition.Slide.5
        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: b */
        public float mo4221b(ViewGroup viewGroup, View view) {
            return ViewCompat.m2231w(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    };

    /* renamed from: M */
    public static final CalculateSlide f6260M = new CalculateSlideVertical() { // from class: androidx.transition.Slide.6
        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: a */
        public float mo4222a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };

    /* renamed from: E */
    public CalculateSlide f6261E;

    public interface CalculateSlide {
        /* renamed from: a */
        float mo4222a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo4221b(ViewGroup viewGroup, View view);
    }

    public static abstract class CalculateSlideHorizontal implements CalculateSlide {
        public CalculateSlideHorizontal() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: a */
        public float mo4222a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public CalculateSlideHorizontal(C06321 c06321) {
        }
    }

    public static abstract class CalculateSlideVertical implements CalculateSlide {
        public CalculateSlideVertical() {
        }

        @Override // androidx.transition.Slide.CalculateSlide
        /* renamed from: b */
        public float mo4221b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public CalculateSlideVertical(C06321 c06321) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface GravityFlag {
    }

    public Slide() {
        CalculateSlide calculateSlide = f6260M;
        this.f6261E = calculateSlide;
        this.f6261E = calculateSlide;
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.f6252b = 80;
        this.f6286w = sidePropagation;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int[] iArr = (int[]) transitionValues2.f6317a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return TranslationAnimationCreator.m4270a(view, transitionValues2, iArr[0], iArr[1], this.f6261E.mo4221b(viewGroup, view), this.f6261E.mo4222a(viewGroup, view), translationX, translationY, f6253F, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: S */
    public Animator mo4205S(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int[] iArr = (int[]) transitionValues.f6317a.get("android:slide:screenPosition");
        return TranslationAnimationCreator.m4270a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f6261E.mo4221b(viewGroup, view), this.f6261E.mo4222a(viewGroup, view), f6254G, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
        int[] iArr = new int[2];
        transitionValues.f6318b.getLocationOnScreen(iArr);
        transitionValues.f6317a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4283O(transitionValues);
        int[] iArr = new int[2];
        transitionValues.f6318b.getLocationOnScreen(iArr);
        transitionValues.f6317a.put("android:slide:screenPosition", iArr);
    }
}

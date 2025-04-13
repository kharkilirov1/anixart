package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.view2.animations.Slide;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slide.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Slide;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "Companion", "HorizontalSlideCalculator", "SlideCalculator", "TransitionPositionListener", "VerticalSlideCalculator", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Slide extends OutlineAwareVisibility {

    /* renamed from: G */
    @NotNull
    public static final Companion f31760G = new Companion(null);

    /* renamed from: H */
    @NotNull
    public static final Slide$Companion$calculatorLeft$1 f31761H = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorLeft$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        /* renamed from: b */
        public float mo16896b(@NotNull ViewGroup viewGroup, @NotNull View view, int i2) {
            float translationX = view.getTranslationX();
            Slide.Companion companion = Slide.f31760G;
            int right = view.getRight();
            if (i2 == -1) {
                i2 = right;
            }
            return translationX - i2;
        }
    };

    /* renamed from: I */
    @NotNull
    public static final Slide$Companion$calculatorTop$1 f31762I = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorTop$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        /* renamed from: a */
        public float mo16895a(@NotNull ViewGroup viewGroup, @NotNull View view, int i2) {
            float translationY = view.getTranslationY();
            Slide.Companion companion = Slide.f31760G;
            int bottom = view.getBottom();
            if (i2 == -1) {
                i2 = bottom;
            }
            return translationY - i2;
        }
    };

    /* renamed from: J */
    @NotNull
    public static final Slide$Companion$calculatorRight$1 f31763J = new HorizontalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorRight$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        /* renamed from: b */
        public float mo16896b(@NotNull ViewGroup viewGroup, @NotNull View view, int i2) {
            float translationX = view.getTranslationX();
            Slide.Companion companion = Slide.f31760G;
            int width = viewGroup.getWidth() - view.getLeft();
            if (i2 == -1) {
                i2 = width;
            }
            return translationX + i2;
        }
    };

    /* renamed from: K */
    @NotNull
    public static final Slide$Companion$calculatorBottom$1 f31764K = new VerticalSlideCalculator() { // from class: com.yandex.div.core.view2.animations.Slide$Companion$calculatorBottom$1
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        /* renamed from: a */
        public float mo16895a(@NotNull ViewGroup viewGroup, @NotNull View view, int i2) {
            float translationY = view.getTranslationY();
            Slide.Companion companion = Slide.f31760G;
            int height = viewGroup.getHeight() - view.getTop();
            if (i2 == -1) {
                i2 = height;
            }
            return translationY + i2;
        }
    };

    /* renamed from: E */
    public final int f31765E;

    /* renamed from: F */
    @NotNull
    public final SlideCalculator f31766F;

    /* compiled from: Slide.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004*\u0004\b\u000b\u000e\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Slide$Companion;", "", "", "DISTANCE_TO_EDGE", "I", "", "PROPNAME_SCREEN_POSITION", "Ljava/lang/String;", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorBottom$1", "calculatorBottom", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorBottom$1;", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorLeft$1", "calculatorLeft", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorLeft$1;", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorRight$1", "calculatorRight", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorRight$1;", "com/yandex/div/core/view2/animations/Slide$Companion$calculatorTop$1", "calculatorTop", "Lcom/yandex/div/core/view2/animations/Slide$Companion$calculatorTop$1;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Slide$HorizontalSlideCalculator;", "Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class HorizontalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        /* renamed from: a */
        public float mo16895a(@NotNull ViewGroup viewGroup, @NotNull View view, int i2) {
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface SlideCalculator {
        /* renamed from: a */
        float mo16895a(@NotNull ViewGroup viewGroup, @NotNull View view, int i2);

        /* renamed from: b */
        float mo16896b(@NotNull ViewGroup viewGroup, @NotNull View view, int i2);
    }

    /* compiled from: Slide.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Slide$TransitionPositionListener;", "Landroid/animation/AnimatorListenerAdapter;", "Landroidx/transition/Transition$TransitionListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class TransitionPositionListener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a */
        @NotNull
        public final View f31767a;

        /* renamed from: b */
        @NotNull
        public final View f31768b;

        /* renamed from: c */
        public final float f31769c;

        /* renamed from: d */
        public final float f31770d;

        /* renamed from: e */
        public final int f31771e;

        /* renamed from: f */
        public final int f31772f;

        /* renamed from: g */
        @Nullable
        public int[] f31773g;

        /* renamed from: h */
        public float f31774h;

        /* renamed from: i */
        public float f31775i;

        public TransitionPositionListener(@NotNull View view, @NotNull View view2, int i2, int i3, float f2, float f3) {
            this.f31767a = view;
            this.f31768b = view2;
            this.f31769c = f2;
            this.f31770d = f3;
            this.f31771e = i2 - MathKt.m32223c(view2.getTranslationX());
            this.f31772f = i3 - MathKt.m32223c(view2.getTranslationY());
            Object tag = view.getTag(C2507R.id.div_transition_position);
            int[] iArr = tag instanceof int[] ? (int[]) tag : null;
            this.f31773g = iArr;
            if (iArr != null) {
                view.setTag(C2507R.id.div_transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: a */
        public void mo4211a(@NotNull Transition transition) {
            Intrinsics.m32179h(transition, "transition");
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: b */
        public void mo4191b(@NotNull Transition transition) {
            Intrinsics.m32179h(transition, "transition");
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: c */
        public void mo4192c(@NotNull Transition transition) {
            Intrinsics.m32179h(transition, "transition");
            this.f31768b.setTranslationX(this.f31769c);
            this.f31768b.setTranslationY(this.f31770d);
            transition.mo4255z(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: d */
        public void mo4193d(@NotNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        /* renamed from: e */
        public void mo4194e(@NotNull Transition transition) {
            Intrinsics.m32179h(transition, "transition");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.m32179h(animation, "animation");
            if (this.f31773g == null) {
                this.f31773g = new int[]{MathKt.m32223c(this.f31768b.getTranslationX()) + this.f31771e, MathKt.m32223c(this.f31768b.getTranslationY()) + this.f31772f};
            }
            this.f31767a.setTag(C2507R.id.div_transition_position, this.f31773g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@NotNull Animator animator) {
            Intrinsics.m32179h(animator, "animator");
            this.f31774h = this.f31768b.getTranslationX();
            this.f31775i = this.f31768b.getTranslationY();
            this.f31768b.setTranslationX(this.f31769c);
            this.f31768b.setTranslationY(this.f31770d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@NotNull Animator animator) {
            Intrinsics.m32179h(animator, "animator");
            this.f31768b.setTranslationX(this.f31774h);
            this.f31768b.setTranslationY(this.f31775i);
        }
    }

    /* compiled from: Slide.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Slide$VerticalSlideCalculator;", "Lcom/yandex/div/core/view2/animations/Slide$SlideCalculator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class VerticalSlideCalculator implements SlideCalculator {
        @Override // com.yandex.div.core.view2.animations.Slide.SlideCalculator
        /* renamed from: b */
        public float mo16896b(@NotNull ViewGroup viewGroup, @NotNull View view, int i2) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this(-1, 80);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Intrinsics.m32179h(view, "view");
        Object obj = transitionValues2.f6317a.get("yandex:slide:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return m16894V(ViewCopiesKt.m16906a(view, sceneRoot, this, iArr), this, transitionValues2, iArr[0], iArr[1], this.f31766F.mo16896b(sceneRoot, view, this.f31765E), this.f31766F.mo16895a(sceneRoot, view, this.f31765E), view.getTranslationX(), view.getTranslationY(), this.f6268e);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: S */
    public Animator mo4205S(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Object obj = transitionValues.f6317a.get("yandex:slide:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        return m16894V(UtilsKt.m16902e(this, view, sceneRoot, transitionValues, "yandex:slide:screenPosition"), this, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f31766F.mo16896b(sceneRoot, view, this.f31765E), this.f31766F.mo16895a(sceneRoot, view, this.f31765E), this.f6268e);
    }

    /* renamed from: V */
    public final Animator m16894V(View view, Transition transition, TransitionValues transitionValues, int i2, int i3, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        float f6;
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        Object tag = transitionValues.f6318b.getTag(C2507R.id.div_transition_position);
        if ((tag instanceof int[] ? (int[]) tag : null) != null) {
            f6 = (r4[0] - i2) + translationX;
            f7 = (r4[1] - i3) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int m32223c = MathKt.m32223c(f6 - translationX) + i2;
        int m32223c2 = MathKt.m32223c(f7 - translationY) + i3;
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4) {
            if (f7 == f5) {
                return null;
            }
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f7, f5));
        Intrinsics.m32178g(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…, startY, endY)\n        )");
        View view2 = transitionValues.f6318b;
        Intrinsics.m32178g(view2, "values.view");
        TransitionPositionListener transitionPositionListener = new TransitionPositionListener(view2, view, m32223c, m32223c2, translationX, translationY);
        transition.mo4237a(transitionPositionListener);
        ofPropertyValuesHolder.addListener(transitionPositionListener);
        ofPropertyValuesHolder.addPauseListener(transitionPositionListener);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        m4283O(transitionValues);
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Slide$captureEndValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map, "transitionValues.values");
                map.put("yandex:slide:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        m4283O(transitionValues);
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Slide$captureStartValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map, "transitionValues.values");
                map.put("yandex:slide:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    public Slide(int i2, int i3) {
        this.f31765E = i2;
        this.f31766F = i3 != 3 ? i3 != 5 ? i3 != 48 ? f31764K : f31762I : f31763J : f31761H;
    }
}

package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.core.view.ViewCompat;
import androidx.transition.TransitionValues;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Fade.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Fade;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "Companion", "FadeAnimatorListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Fade extends OutlineAwareVisibility {

    /* renamed from: E */
    public final float f31740E;

    /* compiled from: Fade.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Fade$Companion;", "", "", "PROPNAME_ALPHA", "Ljava/lang/String;", "PROPNAME_SCREEN_POSITION", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: Fade.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Fade$FadeAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class FadeAnimatorListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        @NotNull
        public final View f31741a;

        /* renamed from: b */
        public final float f31742b;

        /* renamed from: c */
        public boolean f31743c;

        public FadeAnimatorListener(@NotNull View view, float f2) {
            this.f31741a = view;
            this.f31742b = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.m32179h(animation, "animation");
            this.f31741a.setAlpha(this.f31742b);
            if (this.f31743c) {
                this.f31741a.setLayerType(0, null);
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.m32179h(animation, "animation");
            this.f31741a.setVisibility(0);
            if (ViewCompat.m2171K(this.f31741a) && this.f31741a.getLayerType() == 0) {
                this.f31743c = true;
                this.f31741a.setLayerType(2, null);
            }
        }
    }

    public Fade() {
        this.f31740E = 0.0f;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(@NotNull ViewGroup sceneRoot, @Nullable View view, @Nullable TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        if (view == null) {
            return null;
        }
        float m16890W = m16890W(transitionValues, this.f31740E);
        float m16890W2 = m16890W(transitionValues2, 1.0f);
        Object obj = transitionValues2.f6317a.get("yandex:fade:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return m16889V(ViewCopiesKt.m16906a(view, sceneRoot, this, (int[]) obj), m16890W, m16890W2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: S */
    public Animator mo4205S(@NotNull ViewGroup sceneRoot, @Nullable View view, @NotNull TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        return m16889V(UtilsKt.m16902e(this, view, sceneRoot, transitionValues, "yandex:fade:screenPosition"), m16890W(transitionValues, 1.0f), m16890W(transitionValues2, this.f31740E));
    }

    /* renamed from: V */
    public final Animator m16889V(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        view.setVisibility(4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f2, f3);
        ofFloat.addListener(new FadeAnimatorListener(view, view.getAlpha()));
        return ofFloat;
    }

    /* renamed from: W */
    public final float m16890W(TransitionValues transitionValues, float f2) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.f6317a) == null) ? null : map.get("yandex:fade:alpha");
        Float f3 = obj instanceof Float ? (Float) obj : null;
        return f3 == null ? f2 : f3.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        m4283O(transitionValues);
        int i2 = this.f6356C;
        if (i2 == 1) {
            Map<String, Object> map = transitionValues.f6317a;
            Intrinsics.m32178g(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(transitionValues.f6318b.getAlpha()));
        } else if (i2 == 2) {
            Map<String, Object> map2 = transitionValues.f6317a;
            Intrinsics.m32178g(map2, "transitionValues.values");
            map2.put("yandex:fade:alpha", Float.valueOf(this.f31740E));
        }
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Fade$captureEndValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map3 = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map3, "transitionValues.values");
                map3.put("yandex:fade:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        m4283O(transitionValues);
        int i2 = this.f6356C;
        if (i2 == 1) {
            Map<String, Object> map = transitionValues.f6317a;
            Intrinsics.m32178g(map, "transitionValues.values");
            map.put("yandex:fade:alpha", Float.valueOf(this.f31740E));
        } else if (i2 == 2) {
            Map<String, Object> map2 = transitionValues.f6317a;
            Intrinsics.m32178g(map2, "transitionValues.values");
            map2.put("yandex:fade:alpha", Float.valueOf(transitionValues.f6318b.getAlpha()));
        }
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Fade$captureStartValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map3 = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map3, "transitionValues.values");
                map3.put("yandex:fade:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    public Fade(@FloatRange float f2) {
        this.f31740E = f2;
    }
}

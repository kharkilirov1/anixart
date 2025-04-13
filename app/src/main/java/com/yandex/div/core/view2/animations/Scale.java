package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.transition.TransitionValues;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scale.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Scale;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "Companion", "ScaleAnimatorListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Scale extends OutlineAwareVisibility {

    /* renamed from: E */
    public final float f31750E;

    /* renamed from: F */
    public final float f31751F;

    /* renamed from: G */
    public final float f31752G;

    /* compiled from: Scale.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Scale$Companion;", "", "", "NO_SCALE", "F", "PIVOT_CENTER", "", "PROPNAME_SCALE_X", "Ljava/lang/String;", "PROPNAME_SCALE_Y", "PROPNAME_SCREEN_POSITION", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: Scale.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/Scale$ScaleAnimatorListener;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class ScaleAnimatorListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        @NotNull
        public final View f31753a;

        /* renamed from: b */
        public final float f31754b;

        /* renamed from: c */
        public final float f31755c;

        /* renamed from: d */
        public boolean f31756d;

        public ScaleAnimatorListener(@NotNull View view, float f2, float f3) {
            this.f31753a = view;
            this.f31754b = f2;
            this.f31755c = f3;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.m32179h(animation, "animation");
            this.f31753a.setScaleX(this.f31754b);
            this.f31753a.setScaleY(this.f31755c);
            if (this.f31756d) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f31753a.resetPivot();
                } else {
                    this.f31753a.setPivotX(r0.getWidth() * 0.5f);
                    this.f31753a.setPivotY(r0.getHeight() * 0.5f);
                }
            }
            animation.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.m32179h(animation, "animation");
            this.f31753a.setVisibility(0);
            Scale scale = Scale.this;
            if (scale.f31751F == 0.5f) {
                if (scale.f31752G == 0.5f) {
                    return;
                }
            }
            this.f31756d = true;
            this.f31753a.setPivotX(r5.getWidth() * Scale.this.f31751F);
            this.f31753a.setPivotY(r5.getHeight() * Scale.this.f31752G);
        }
    }

    public Scale(@FloatRange float f2, @FloatRange float f3, @FloatRange float f4) {
        this.f31750E = f2;
        this.f31751F = f3;
        this.f31752G = f4;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: Q */
    public Animator mo4204Q(@NotNull ViewGroup sceneRoot, @Nullable View view, @Nullable TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        if (view == null) {
            return null;
        }
        float m16892W = m16892W(transitionValues, this.f31750E);
        float m16893X = m16893X(transitionValues, this.f31750E);
        float m16892W2 = m16892W(transitionValues2, 1.0f);
        float m16893X2 = m16893X(transitionValues2, 1.0f);
        Object obj = transitionValues2.f6317a.get("yandex:scale:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return m16891V(ViewCopiesKt.m16906a(view, sceneRoot, this, (int[]) obj), m16892W, m16893X, m16892W2, m16893X2);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: S */
    public Animator mo4205S(@NotNull ViewGroup sceneRoot, @Nullable View view, @NotNull TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        return m16891V(UtilsKt.m16902e(this, view, sceneRoot, transitionValues, "yandex:scale:screenPosition"), m16892W(transitionValues, 1.0f), m16893X(transitionValues, 1.0f), m16892W(transitionValues2, this.f31750E), m16893X(transitionValues2, this.f31750E));
    }

    /* renamed from: V */
    public final Animator m16891V(View view, float f2, float f3, float f4, float f5) {
        if (f2 == f4) {
            if (f3 == f5) {
                return null;
            }
        }
        view.setVisibility(4);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f2, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f3, f5));
        ofPropertyValuesHolder.addListener(new ScaleAnimatorListener(view, view.getScaleX(), view.getScaleY()));
        return ofPropertyValuesHolder;
    }

    /* renamed from: W */
    public final float m16892W(TransitionValues transitionValues, float f2) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.f6317a) == null) ? null : map.get("yandex:scale:scaleX");
        Float f3 = obj instanceof Float ? (Float) obj : null;
        return f3 == null ? f2 : f3.floatValue();
    }

    /* renamed from: X */
    public final float m16893X(TransitionValues transitionValues, float f2) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.f6317a) == null) ? null : map.get("yandex:scale:scaleY");
        Float f3 = obj instanceof Float ? (Float) obj : null;
        return f3 == null ? f2 : f3.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        float scaleX = transitionValues.f6318b.getScaleX();
        float scaleY = transitionValues.f6318b.getScaleY();
        View view = transitionValues.f6318b;
        Float valueOf = Float.valueOf(1.0f);
        view.setScaleX(1.0f);
        transitionValues.f6318b.setScaleY(1.0f);
        m4283O(transitionValues);
        transitionValues.f6318b.setScaleX(scaleX);
        transitionValues.f6318b.setScaleY(scaleY);
        int i2 = this.f6356C;
        if (i2 == 1) {
            Map<String, Object> map = transitionValues.f6317a;
            Intrinsics.m32178g(map, "transitionValues.values");
            map.put("yandex:scale:scaleX", valueOf);
            Map<String, Object> map2 = transitionValues.f6317a;
            Intrinsics.m32178g(map2, "transitionValues.values");
            map2.put("yandex:scale:scaleY", valueOf);
        } else if (i2 == 2) {
            Map<String, Object> map3 = transitionValues.f6317a;
            Intrinsics.m32178g(map3, "transitionValues.values");
            map3.put("yandex:scale:scaleX", Float.valueOf(this.f31750E));
            Map<String, Object> map4 = transitionValues.f6317a;
            Intrinsics.m32178g(map4, "transitionValues.values");
            map4.put("yandex:scale:scaleY", Float.valueOf(this.f31750E));
        }
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Scale$captureEndValues$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map5 = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map5, "transitionValues.values");
                map5.put("yandex:scale:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        float scaleX = transitionValues.f6318b.getScaleX();
        float scaleY = transitionValues.f6318b.getScaleY();
        transitionValues.f6318b.setScaleX(1.0f);
        transitionValues.f6318b.setScaleY(1.0f);
        m4283O(transitionValues);
        transitionValues.f6318b.setScaleX(scaleX);
        transitionValues.f6318b.setScaleY(scaleY);
        View view = transitionValues.f6318b;
        int i2 = this.f6356C;
        if (i2 == 1) {
            Map<String, Object> map = transitionValues.f6317a;
            Intrinsics.m32178g(map, "transitionValues.values");
            map.put("yandex:scale:scaleX", Float.valueOf(this.f31750E));
            Map<String, Object> map2 = transitionValues.f6317a;
            Intrinsics.m32178g(map2, "transitionValues.values");
            map2.put("yandex:scale:scaleY", Float.valueOf(this.f31750E));
        } else if (i2 == 2) {
            Map<String, Object> map3 = transitionValues.f6317a;
            Intrinsics.m32178g(map3, "transitionValues.values");
            map3.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            Map<String, Object> map4 = transitionValues.f6317a;
            Intrinsics.m32178g(map4, "transitionValues.values");
            map4.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.Scale$captureStartValues$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map5 = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map5, "transitionValues.values");
                map5.put("yandex:scale:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    public Scale(float f2, float f3, float f4, int i2) {
        f3 = (i2 & 2) != 0 ? 0.5f : f3;
        f4 = (i2 & 4) != 0 ? 0.5f : f4;
        this.f31750E = f2;
        this.f31751F = f3;
        this.f31752G = f4;
    }
}

package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
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

/* compiled from: VerticalTranslation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation;", "Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "AnimationEndListener", "Companion", "TranslationYClipBounds", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class VerticalTranslation extends OutlineAwareVisibility {

    /* renamed from: E */
    public final float f31781E;

    /* renamed from: F */
    public final float f31782F;

    /* compiled from: VerticalTranslation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$AnimationEndListener;", "Landroid/animation/AnimatorListenerAdapter;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class AnimationEndListener extends AnimatorListenerAdapter {

        /* renamed from: a */
        @NotNull
        public final View f31783a;

        public AnimationEndListener(@NotNull View view) {
            this.f31783a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.m32179h(animation, "animation");
            this.f31783a.setTranslationY(0.0f);
            ViewCompat.m2210l0(this.f31783a, null);
        }
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$Companion;", "", "", "DEFAULT_STABLE_VALUE", "F", "DEFAULT_TRANSLATED_VALUE", "", "PROPNAME_SCREEN_POSITION", "Ljava/lang/String;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: VerticalTranslation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/VerticalTranslation$TranslationYClipBounds;", "Landroid/util/Property;", "Landroid/view/View;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    @VisibleForTesting
    public static final class TranslationYClipBounds extends Property<View, Float> {

        /* renamed from: a */
        @NotNull
        public final Rect f31784a;

        /* renamed from: b */
        public float f31785b;

        public TranslationYClipBounds(@NotNull View view) {
            super(Float.TYPE, "ClipBoundsTop");
            this.f31784a = new Rect(0, 0, view.getWidth(), view.getHeight());
        }

        /* renamed from: a */
        public void m16905a(@NotNull View view, float f2) {
            Intrinsics.m32179h(view, "view");
            this.f31785b = f2;
            if (f2 < 0.0f) {
                this.f31784a.set(0, (int) ((-f2) * (view.getHeight() - 1)), view.getWidth(), view.getHeight());
            } else if (f2 > 0.0f) {
                float f3 = 1;
                this.f31784a.set(0, 0, view.getWidth(), (int) (((f3 - this.f31785b) * view.getHeight()) + f3));
            } else {
                this.f31784a.set(0, 0, view.getWidth(), view.getHeight());
            }
            ViewCompat.m2210l0(view, this.f31784a);
        }

        @Override // android.util.Property
        public Float get(View view) {
            View view2 = view;
            Intrinsics.m32179h(view2, "view");
            return Float.valueOf(this.f31785b);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(View view, Float f2) {
            m16905a(view, f2.floatValue());
        }
    }

    public VerticalTranslation() {
        this.f31781E = -1.0f;
        this.f31782F = 0.0f;
    }

    @Override // androidx.transition.Visibility
    @NotNull
    /* renamed from: Q */
    public Animator mo4204Q(@NotNull ViewGroup sceneRoot, @NotNull View view, @Nullable TransitionValues transitionValues, @NotNull TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Intrinsics.m32179h(view, "view");
        float height = view.getHeight();
        float f2 = this.f31781E * height;
        float f3 = this.f31782F * height;
        Object obj = transitionValues2.f6317a.get("yandex:verticalTranslation:screenPosition");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        View m16906a = ViewCopiesKt.m16906a(view, sceneRoot, this, (int[]) obj);
        m16906a.setTranslationY(f2);
        TranslationYClipBounds translationYClipBounds = new TranslationYClipBounds(m16906a);
        translationYClipBounds.m16905a(m16906a, this.f31781E);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(m16906a, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f3), PropertyValuesHolder.ofFloat(translationYClipBounds, this.f31781E, this.f31782F));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility
    @NotNull
    /* renamed from: S */
    public Animator mo4205S(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(UtilsKt.m16902e(this, view, sceneRoot, transitionValues, "yandex:verticalTranslation:screenPosition"), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, this.f31782F, this.f31781E * view.getHeight()), PropertyValuesHolder.ofFloat(new TranslationYClipBounds(view), this.f31782F, this.f31781E));
        ofPropertyValuesHolder.addListener(new AnimationEndListener(view));
        return ofPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        m4283O(transitionValues);
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureEndValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map, "transitionValues.values");
                map.put("yandex:verticalTranslation:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NotNull final TransitionValues transitionValues) {
        Intrinsics.m32179h(transitionValues, "transitionValues");
        m4283O(transitionValues);
        UtilsKt.m16900c(transitionValues, new Function1<int[], Unit>() { // from class: com.yandex.div.core.view2.animations.VerticalTranslation$captureStartValues$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(int[] iArr) {
                int[] position = iArr;
                Intrinsics.m32179h(position, "position");
                Map<String, Object> map = TransitionValues.this.f6317a;
                Intrinsics.m32178g(map, "transitionValues.values");
                map.put("yandex:verticalTranslation:screenPosition", position);
                return Unit.f63088a;
            }
        });
    }

    public VerticalTranslation(float f2, float f3) {
        this.f31781E = f2;
        this.f31782F = f3;
    }
}

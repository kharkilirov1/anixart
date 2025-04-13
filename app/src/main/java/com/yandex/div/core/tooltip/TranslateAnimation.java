package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div2.DivTooltip;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivTooltipAnimation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/tooltip/TranslateAnimation;", "Landroid/transition/Visibility;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class TranslateAnimation extends Visibility {

    /* renamed from: b */
    @NotNull
    public final DivTooltip.Position f31436b;

    /* renamed from: c */
    @Nullable
    public final Float f31437c;

    /* renamed from: d */
    public final float f31438d;

    /* compiled from: DivTooltipAnimation.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            DivTooltip.Position position = DivTooltip.Position.TOP_LEFT;
            iArr[1] = 1;
            DivTooltip.Position position2 = DivTooltip.Position.LEFT;
            iArr[0] = 2;
            DivTooltip.Position position3 = DivTooltip.Position.BOTTOM_LEFT;
            iArr[7] = 3;
            DivTooltip.Position position4 = DivTooltip.Position.TOP_RIGHT;
            iArr[3] = 4;
            DivTooltip.Position position5 = DivTooltip.Position.RIGHT;
            iArr[4] = 5;
            DivTooltip.Position position6 = DivTooltip.Position.BOTTOM_RIGHT;
            iArr[5] = 6;
            DivTooltip.Position position7 = DivTooltip.Position.TOP;
            iArr[2] = 7;
            DivTooltip.Position position8 = DivTooltip.Position.BOTTOM;
            iArr[6] = 8;
        }
    }

    public TranslateAnimation(DivTooltip.Position position, Float f2, int i2) {
        Intrinsics.m32179h(position, "position");
        this.f31436b = position;
        this.f31437c = null;
        this.f31438d = SizeKt.m17395a(10.0f);
    }

    /* renamed from: a */
    public final int m16749a(DivTooltip.Position position) {
        switch (position) {
            case LEFT:
            case TOP_LEFT:
            case BOTTOM_LEFT:
                return 1;
            case TOP:
            case BOTTOM:
                return 0;
            case TOP_RIGHT:
            case RIGHT:
            case BOTTOM_RIGHT:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public final int m16750b(DivTooltip.Position position) {
        switch (position) {
            case LEFT:
            case RIGHT:
                return 0;
            case TOP_LEFT:
            case TOP:
            case TOP_RIGHT:
                return 1;
            case BOTTOM_RIGHT:
            case BOTTOM:
            case BOTTOM_LEFT:
                return -1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onAppear(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(startValues, "startValues");
        Intrinsics.m32179h(endValues, "endValues");
        int m16749a = m16749a(this.f31436b);
        int m16750b = m16750b(this.f31436b);
        view.setTranslationX(m16749a * (this.f31437c != null ? this.f31437c.floatValue() * view.getWidth() : this.f31438d));
        view.setTranslationY(m16750b * (this.f31437c != null ? this.f31437c.floatValue() * view.getHeight() : this.f31438d));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
        Intrinsics.m32178g(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…f\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    @NotNull
    public Animator onDisappear(@NotNull ViewGroup sceneRoot, @NotNull View view, @NotNull TransitionValues startValues, @NotNull TransitionValues endValues) {
        float f2;
        float f3;
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(startValues, "startValues");
        Intrinsics.m32179h(endValues, "endValues");
        int m16749a = m16749a(this.f31436b);
        int m16750b = m16750b(this.f31436b);
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[2];
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[2];
        fArr[0] = 0.0f;
        float f4 = m16749a;
        if (this.f31437c != null) {
            f2 = this.f31437c.floatValue() * view.getWidth();
        } else {
            f2 = this.f31438d;
        }
        fArr[1] = f4 * f2;
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat((Property<?, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[2];
        fArr2[0] = 0.0f;
        float f5 = m16750b;
        if (this.f31437c != null) {
            f3 = this.f31437c.floatValue() * view.getHeight();
        } else {
            f3 = this.f31438d;
        }
        fArr2[1] = f5 * f3;
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat((Property<?, Float>) property2, fArr2);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        Intrinsics.m32178g(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…n\n            )\n        )");
        return ofPropertyValuesHolder;
    }

    public TranslateAnimation(@NotNull DivTooltip.Position position, @Nullable Float f2) {
        Intrinsics.m32179h(position, "position");
        this.f31436b = position;
        this.f31437c = f2;
        this.f31438d = SizeKt.m17395a(10.0f);
    }
}

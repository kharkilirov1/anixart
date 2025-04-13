package com.yandex.div.internal.widget.indicator.animations;

import android.animation.ArgbEvaluator;
import android.graphics.RectF;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScaleIndicatorAnimator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/animations/ScaleIndicatorAnimator;", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ScaleIndicatorAnimator implements IndicatorAnimator {

    /* renamed from: a */
    @NotNull
    public final IndicatorParams.Style f34070a;

    /* renamed from: b */
    @NotNull
    public final ArgbEvaluator f34071b = new ArgbEvaluator();

    /* renamed from: c */
    @NotNull
    public final SparseArray<Float> f34072c = new SparseArray<>();

    /* renamed from: d */
    public int f34073d;

    public ScaleIndicatorAnimator(@NotNull IndicatorParams.Style style) {
        this.f34070a = style;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    /* renamed from: a */
    public IndicatorParams.ItemSize mo17430a(int i2) {
        IndicatorParams.Style style = this.f34070a;
        IndicatorParams.Shape shape = style.f34045b;
        if (shape instanceof IndicatorParams.Shape.Circle) {
            float f2 = ((IndicatorParams.Shape.Circle) style.f34046c).f34039b.f34034a;
            return new IndicatorParams.ItemSize.Circle((m17441l(i2) * (((IndicatorParams.Shape.Circle) shape).f34039b.f34034a - f2)) + f2);
        }
        if (!(shape instanceof IndicatorParams.Shape.RoundedRect)) {
            throw new NoWhenBranchMatchedException();
        }
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) style.f34046c;
        float f3 = roundedRect.f34041b.f34035a;
        IndicatorParams.Shape.RoundedRect roundedRect2 = (IndicatorParams.Shape.RoundedRect) shape;
        float m17441l = (m17441l(i2) * (roundedRect2.f34041b.f34035a - f3)) + f3;
        float f4 = roundedRect.f34041b.f34036b;
        float m17441l2 = (m17441l(i2) * (roundedRect2.f34041b.f34036b - f4)) + f4;
        float f5 = roundedRect.f34041b.f34037c;
        return new IndicatorParams.ItemSize.RoundedRect(m17441l, m17441l2, (m17441l(i2) * (roundedRect2.f34041b.f34037c - f5)) + f5);
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: b */
    public void mo17431b(int i2) {
        this.f34072c.clear();
        this.f34072c.put(i2, Float.valueOf(1.0f));
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: c */
    public /* synthetic */ void mo17432c(float f2) {
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: d */
    public int mo17433d(int i2) {
        IndicatorParams.Style style = this.f34070a;
        IndicatorParams.Shape shape = style.f34045b;
        if (!(shape instanceof IndicatorParams.Shape.RoundedRect)) {
            return 0;
        }
        return m17440k(m17441l(i2), ((IndicatorParams.Shape.RoundedRect) style.f34046c).f34043d, ((IndicatorParams.Shape.RoundedRect) shape).f34043d);
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: e */
    public void mo17434e(int i2) {
        this.f34073d = i2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: f */
    public /* synthetic */ void mo17435f(float f2) {
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: g */
    public int mo17436g(int i2) {
        return m17440k(m17441l(i2), this.f34070a.f34046c.getF34040a(), this.f34070a.f34045b.getF34040a());
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: h */
    public void mo17437h(int i2, float f2) {
        m17442m(i2, 1.0f - f2);
        if (i2 < this.f34073d - 1) {
            m17442m(i2 + 1, f2);
        } else {
            m17442m(0, f2);
        }
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @Nullable
    /* renamed from: i */
    public RectF mo17438i(float f2, float f3) {
        return null;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: j */
    public float mo17439j(int i2) {
        IndicatorParams.Style style = this.f34070a;
        IndicatorParams.Shape shape = style.f34045b;
        if (!(shape instanceof IndicatorParams.Shape.RoundedRect)) {
            return 0.0f;
        }
        float f2 = ((IndicatorParams.Shape.RoundedRect) style.f34046c).f34042c;
        return (m17441l(i2) * (((IndicatorParams.Shape.RoundedRect) shape).f34042c - f2)) + f2;
    }

    @ColorInt
    /* renamed from: k */
    public final int m17440k(@FloatRange float f2, int i2, int i3) {
        Object evaluate = this.f34071b.evaluate(f2, Integer.valueOf(i2), Integer.valueOf(i3));
        Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) evaluate).intValue();
    }

    /* renamed from: l */
    public final float m17441l(int i2) {
        Float f2 = this.f34072c.get(i2, Float.valueOf(0.0f));
        Intrinsics.m32178g(f2, "itemsScale.get(position, 0f)");
        return f2.floatValue();
    }

    /* renamed from: m */
    public final void m17442m(int i2, float f2) {
        if (f2 == 0.0f) {
            this.f34072c.remove(i2);
        } else {
            this.f34072c.put(i2, Float.valueOf(Math.abs(f2)));
        }
    }
}

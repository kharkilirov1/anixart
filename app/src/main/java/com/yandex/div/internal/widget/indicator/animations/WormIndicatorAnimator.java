package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: WormIndicatorAnimator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/animations/WormIndicatorAnimator;", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class WormIndicatorAnimator implements IndicatorAnimator {

    /* renamed from: a */
    @NotNull
    public final IndicatorParams.Style f34079a;

    /* renamed from: b */
    public float f34080b;

    /* renamed from: c */
    @NotNull
    public final RectF f34081c = new RectF();

    /* renamed from: d */
    public float f34082d;

    /* renamed from: e */
    public float f34083e;

    public WormIndicatorAnimator(@NotNull IndicatorParams.Style style) {
        this.f34079a = style;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    /* renamed from: a */
    public IndicatorParams.ItemSize mo17430a(int i2) {
        return this.f34079a.f34046c.mo17424b();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: b */
    public void mo17431b(int i2) {
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: c */
    public void mo17432c(float f2) {
        this.f34082d = f2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: d */
    public int mo17433d(int i2) {
        IndicatorParams.Shape shape = this.f34079a.f34046c;
        Objects.requireNonNull(shape);
        if (shape instanceof IndicatorParams.Shape.RoundedRect) {
            return ((IndicatorParams.Shape.RoundedRect) shape).f34043d;
        }
        return 0;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: e */
    public void mo17434e(int i2) {
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: f */
    public void mo17435f(float f2) {
        this.f34083e = f2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: g */
    public int mo17436g(int i2) {
        return this.f34079a.f34046c.getF34040a();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: h */
    public void mo17437h(int i2, float f2) {
        this.f34080b = f2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    /* renamed from: i */
    public RectF mo17438i(float f2, float f3) {
        float f4 = this.f34083e;
        if (f4 == 0.0f) {
            f4 = this.f34079a.f34045b.mo17424b().m17422b();
        }
        this.f34081c.top = f3 - (this.f34079a.f34045b.mo17424b().m17421a() / 2.0f);
        RectF rectF = this.f34081c;
        float f5 = this.f34082d;
        float f6 = f4 / 2.0f;
        rectF.right = RangesKt.m32236c(this.f34080b * f5 * 2.0f, f5) + f2 + f6;
        this.f34081c.bottom = (this.f34079a.f34045b.mo17424b().m17421a() / 2.0f) + f3;
        this.f34081c.left = (RangesKt.m32234a(((this.f34080b - 0.5f) * this.f34082d) * 2.0f, 0.0f) + f2) - f6;
        return this.f34081c;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: j */
    public float mo17439j(int i2) {
        IndicatorParams.Shape shape = this.f34079a.f34046c;
        Objects.requireNonNull(shape);
        if (shape instanceof IndicatorParams.Shape.RoundedRect) {
            return ((IndicatorParams.Shape.RoundedRect) shape).f34042c;
        }
        return 0.0f;
    }
}

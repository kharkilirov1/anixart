package com.yandex.div.internal.widget.indicator.animations;

import android.graphics.RectF;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: SliderIndicatorAnimator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/animations/SliderIndicatorAnimator;", "Lcom/yandex/div/internal/widget/indicator/animations/IndicatorAnimator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SliderIndicatorAnimator implements IndicatorAnimator {

    /* renamed from: a */
    @NotNull
    public final IndicatorParams.Style f34074a;

    /* renamed from: b */
    public float f34075b;

    /* renamed from: c */
    @NotNull
    public final RectF f34076c = new RectF();

    /* renamed from: d */
    public float f34077d;

    /* renamed from: e */
    public float f34078e;

    public SliderIndicatorAnimator(@NotNull IndicatorParams.Style style) {
        this.f34074a = style;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    /* renamed from: a */
    public IndicatorParams.ItemSize mo17430a(int i2) {
        return this.f34074a.f34046c.mo17424b();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: b */
    public void mo17431b(int i2) {
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: c */
    public void mo17432c(float f2) {
        this.f34077d = f2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: d */
    public int mo17433d(int i2) {
        IndicatorParams.Shape shape = this.f34074a.f34046c;
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
        this.f34078e = f2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: g */
    public int mo17436g(int i2) {
        return this.f34074a.f34046c.getF34040a();
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: h */
    public void mo17437h(int i2, float f2) {
        this.f34075b = f2;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    @NotNull
    /* renamed from: i */
    public RectF mo17438i(float f2, float f3) {
        float f4 = this.f34078e;
        if (f4 == 0.0f) {
            f4 = this.f34074a.f34045b.mo17424b().m17422b();
        }
        float f5 = f4 / 2.0f;
        this.f34076c.left = (RangesKt.m32234a(this.f34077d * this.f34075b, 0.0f) + f2) - f5;
        this.f34076c.top = f3 - (this.f34074a.f34045b.mo17424b().m17421a() / 2.0f);
        RectF rectF = this.f34076c;
        float f6 = this.f34077d;
        rectF.right = RangesKt.m32236c(this.f34075b * f6, f6) + f2 + f5;
        this.f34076c.bottom = (this.f34074a.f34045b.mo17424b().m17421a() / 2.0f) + f3;
        return this.f34076c;
    }

    @Override // com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator
    /* renamed from: j */
    public float mo17439j(int i2) {
        IndicatorParams.Shape shape = this.f34074a.f34046c;
        Objects.requireNonNull(shape);
        if (shape instanceof IndicatorParams.Shape.RoundedRect) {
            return ((IndicatorParams.Shape.RoundedRect) shape).f34042c;
        }
        return 0.0f;
    }
}

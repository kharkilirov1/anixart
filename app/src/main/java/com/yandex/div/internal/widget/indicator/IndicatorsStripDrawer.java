package com.yandex.div.internal.widget.indicator;

import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* compiled from: IndicatorsStripDrawer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/IndicatorsStripDrawer;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class IndicatorsStripDrawer {

    /* renamed from: a */
    @NotNull
    public final IndicatorParams.Style f34049a;

    /* renamed from: b */
    @NotNull
    public final SingleIndicatorDrawer f34050b;

    /* renamed from: c */
    @NotNull
    public final IndicatorAnimator f34051c;

    /* renamed from: d */
    public int f34052d;

    /* renamed from: f */
    public float f34054f;

    /* renamed from: g */
    public float f34055g;

    /* renamed from: h */
    public float f34056h;

    /* renamed from: j */
    public int f34058j;

    /* renamed from: k */
    public int f34059k;

    /* renamed from: l */
    public int f34060l;

    /* renamed from: m */
    public float f34061m;

    /* renamed from: n */
    public float f34062n;

    /* renamed from: o */
    public int f34063o;

    /* renamed from: i */
    public float f34057i = 1.0f;

    /* renamed from: e */
    public int f34053e;

    /* renamed from: p */
    public int f34064p = this.f34053e - 1;

    public IndicatorsStripDrawer(@NotNull IndicatorParams.Style style, @NotNull SingleIndicatorDrawer singleIndicatorDrawer, @NotNull IndicatorAnimator indicatorAnimator) {
        this.f34049a = style;
        this.f34050b = singleIndicatorDrawer;
        this.f34051c = indicatorAnimator;
        this.f34054f = style.f34046c.mo17424b().m17422b();
        this.f34055g = style.f34046c.mo17424b().m17422b() / 2;
    }

    /* renamed from: a */
    public final void m17425a(int i2, float f2) {
        float m17428d;
        int i3;
        int i4 = this.f34052d;
        int i5 = this.f34053e;
        float f3 = 0.0f;
        if (i4 <= i5) {
            this.f34062n = 0.0f;
        } else {
            int i6 = i5 / 2;
            int i7 = (i4 - (i5 / 2)) - (i5 % 2);
            float f4 = i5 % 2 == 0 ? this.f34056h / 2 : 0.0f;
            if (i4 > i5) {
                if (i2 < i6) {
                    m17428d = m17428d(i6);
                    i3 = this.f34058j / 2;
                } else if (i2 >= i7) {
                    m17428d = m17428d(i7);
                    i3 = this.f34058j / 2;
                } else {
                    float f5 = this.f34055g;
                    float f6 = this.f34056h;
                    f3 = (((f6 * f2) + ((i2 * f6) + f5)) - (this.f34058j / 2)) - f4;
                }
                f3 = (m17428d - i3) - f4;
            }
            this.f34062n = f3;
        }
        float f7 = this.f34062n - this.f34055g;
        float f8 = this.f34056h;
        int i8 = (int) (f7 / f8);
        if (i8 < 0) {
            i8 = 0;
        }
        this.f34063o = i8;
        int i9 = (int) ((this.f34058j / f8) + i8 + 1);
        int i10 = this.f34052d - 1;
        if (i9 > i10) {
            i9 = i10;
        }
        this.f34064p = i9;
    }

    /* renamed from: b */
    public final void m17426b() {
        int i2;
        IndicatorParams.Style style = this.f34049a;
        IndicatorParams.ItemPlacement itemPlacement = style.f34048e;
        if (itemPlacement instanceof IndicatorParams.ItemPlacement.Default) {
            i2 = (int) ((this.f34058j - style.f34045b.mo17424b().m17422b()) / ((IndicatorParams.ItemPlacement.Default) itemPlacement).f34031a);
        } else {
            if (!(itemPlacement instanceof IndicatorParams.ItemPlacement.Stretch)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = ((IndicatorParams.ItemPlacement.Stretch) itemPlacement).f34033b;
        }
        int i3 = this.f34052d;
        if (i2 > i3) {
            i2 = i3;
        }
        this.f34053e = i2;
    }

    /* renamed from: c */
    public final void m17427c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return;
        }
        this.f34058j = i2;
        this.f34059k = i3;
        m17426b();
        IndicatorParams.Style style = this.f34049a;
        IndicatorParams.ItemPlacement itemPlacement = style.f34048e;
        if (itemPlacement instanceof IndicatorParams.ItemPlacement.Default) {
            this.f34056h = ((IndicatorParams.ItemPlacement.Default) itemPlacement).f34031a;
            this.f34057i = 1.0f;
        } else if (itemPlacement instanceof IndicatorParams.ItemPlacement.Stretch) {
            float f2 = this.f34058j;
            float f3 = ((IndicatorParams.ItemPlacement.Stretch) itemPlacement).f34032a;
            float f4 = (f2 + f3) / this.f34053e;
            this.f34056h = f4;
            this.f34057i = (f4 - f3) / style.f34045b.mo17424b().m17422b();
        }
        this.f34051c.mo17432c(this.f34056h);
        this.f34055g = (i2 - (this.f34056h * (this.f34053e - 1))) / 2.0f;
        this.f34054f = i3 / 2.0f;
        m17425a(this.f34060l, this.f34061m);
    }

    /* renamed from: d */
    public final float m17428d(int i2) {
        return (this.f34056h * i2) + this.f34055g;
    }
}

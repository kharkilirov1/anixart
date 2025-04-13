package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivSlider;
import java.util.ListIterator;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivSliderBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivSliderBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivSlider;", "Lcom/yandex/div/core/view2/divs/widgets/DivSliderView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivSliderBinder implements DivViewBinder<DivSlider, DivSliderView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32336a;

    /* renamed from: b */
    @NotNull
    public final Div2Logger f32337b;

    /* renamed from: c */
    @NotNull
    public final DivTypefaceProvider f32338c;

    /* renamed from: d */
    @NotNull
    public final TwoWayIntegerVariableBinder f32339d;

    /* renamed from: e */
    @NotNull
    public final ErrorCollectors f32340e;

    /* renamed from: f */
    public final boolean f32341f;

    /* renamed from: g */
    @Nullable
    public ErrorCollector f32342g;

    @Inject
    public DivSliderBinder(@NotNull DivBaseBinder baseBinder, @NotNull Div2Logger logger, @NotNull DivTypefaceProvider typefaceProvider, @NotNull TwoWayIntegerVariableBinder variableBinder, @NotNull ErrorCollectors errorCollectors, @ExperimentFlag boolean z) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(logger, "logger");
        Intrinsics.m32179h(typefaceProvider, "typefaceProvider");
        Intrinsics.m32179h(variableBinder, "variableBinder");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32336a = baseBinder;
        this.f32337b = logger;
        this.f32338c = typefaceProvider;
        this.f32339d = variableBinder;
        this.f32340e = errorCollectors;
        this.f32341f = z;
    }

    /* renamed from: a */
    public final void m17027a(SliderView sliderView, ExpressionResolver expressionResolver, DivSlider.TextStyle textStyle) {
        TextDrawable textDrawable;
        if (textStyle == null) {
            textDrawable = null;
        } else {
            DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            textDrawable = new TextDrawable(DivSliderBinderKt.m17033a(textStyle, displayMetrics, this.f32338c, expressionResolver));
        }
        sliderView.setThumbSecondTextDrawable(textDrawable);
    }

    /* renamed from: b */
    public final void m17028b(SliderView sliderView, ExpressionResolver expressionResolver, DivSlider.TextStyle textStyle) {
        TextDrawable textDrawable;
        if (textStyle == null) {
            textDrawable = null;
        } else {
            DisplayMetrics displayMetrics = sliderView.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            textDrawable = new TextDrawable(DivSliderBinderKt.m17033a(textStyle, displayMetrics, this.f32338c, expressionResolver));
        }
        sliderView.setThumbTextDrawable(textDrawable);
    }

    /* renamed from: c */
    public void m17029c(@NotNull final DivSliderView view, @NotNull DivSlider div, @NotNull final Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivSlider div2 = view.getDiv();
        this.f32342g = this.f32340e.m17115a(divView.getDataTag(), divView.getDivData());
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32336a.m16988i(view, div2, divView);
        }
        this.f32336a.m16984e(view, div, div2, divView);
        C6855a.m34405a(view, div.f38963o.mo17538f(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bindView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                DivSliderView.this.setMinValue(l2.longValue());
                this.m17030d(DivSliderView.this);
                return Unit.f63088a;
            }
        }));
        C6855a.m34405a(view, div.f38962n.mo17538f(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$bindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                DivSliderView.this.setMaxValue(l2.longValue());
                this.m17030d(DivSliderView.this);
                return Unit.f63088a;
            }
        }));
        ObserverList<SliderView.ChangedListener> observerList = view.f34102c;
        observerList.f30992d = 0;
        Unit unit = null;
        if (observerList.f30991c == 0) {
            observerList.f30990b.clear();
        } else {
            int size = observerList.f30990b.size();
            observerList.f30993e |= size != 0;
            for (int i2 = 0; i2 < size; i2++) {
                observerList.f30990b.set(i2, null);
            }
        }
        String str = div.f38972x;
        if (str != null) {
            C6855a.m34405a(view, this.f32339d.m16683a(divView, str, new TwoWayIntegerVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1
                @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
                /* renamed from: a */
                public void mo16684a(Long l2) {
                    DivSliderView.this.m17461q(l2 == null ? 0.0f : r4.longValue(), false, true);
                }

                @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
                /* renamed from: b */
                public void mo16685b(@NotNull final Function1<? super Long, Unit> function1) {
                    final DivSliderView divSliderView = DivSliderView.this;
                    final DivSliderBinder divSliderBinder = this;
                    final Div2View div2View = divView;
                    SliderView.ChangedListener changedListener = new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbValue$callbacks$1$setViewStateChangeListener$1
                        @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                        /* renamed from: a */
                        public /* synthetic */ void mo17031a(Float f2) {
                        }

                        @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                        /* renamed from: b */
                        public void mo17032b(float f2) {
                            DivSliderBinder.this.f32337b.mo16578m(div2View, divSliderView, Float.valueOf(f2));
                            function1.invoke(Long.valueOf(MathKt.m32224d(f2)));
                        }
                    };
                    Objects.requireNonNull(divSliderView);
                    divSliderView.f34102c.m16613d(changedListener);
                }
            }));
        }
        BaseDivViewExtensionsKt.m16922L(view, expressionResolver, div.f38970v, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivDrawable divDrawable) {
                DivDrawable style = divDrawable;
                Intrinsics.m32179h(style, "style");
                DivSliderBinder divSliderBinder = DivSliderBinder.this;
                DivSliderView divSliderView = view;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Objects.requireNonNull(divSliderBinder);
                DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                divSliderView.setThumbDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                return Unit.f63088a;
            }
        });
        final DivSlider.TextStyle textStyle = div.f38971w;
        m17028b(view, expressionResolver, textStyle);
        if (textStyle != null) {
            C6855a.m34405a(view, textStyle.f38991e.mo17537e(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Integer num) {
                    num.intValue();
                    DivSliderBinder.this.m17028b(view, expressionResolver, textStyle);
                    return Unit.f63088a;
                }
            }));
        }
        String str2 = div.f38969u;
        if (str2 == null) {
            view.setThumbSecondaryDrawable(null);
            view.m17460p(null, false, true);
        } else {
            C6855a.m34405a(view, this.f32339d.m16683a(divView, str2, new TwoWayIntegerVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1
                @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
                /* renamed from: a */
                public void mo16684a(Long l2) {
                    DivSliderView.this.m17460p(l2 == null ? null : Float.valueOf(r4.longValue()), false, true);
                }

                @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
                /* renamed from: b */
                public void mo16685b(@NotNull final Function1<? super Long, Unit> function1) {
                    final DivSliderView divSliderView = DivSliderView.this;
                    final DivSliderBinder divSliderBinder = this;
                    final Div2View div2View = divView;
                    SliderView.ChangedListener changedListener = new SliderView.ChangedListener() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryValue$callbacks$1$setViewStateChangeListener$1
                        @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                        /* renamed from: a */
                        public void mo17031a(@Nullable Float f2) {
                            DivSliderBinder.this.f32337b.mo16578m(div2View, divSliderView, f2);
                            function1.invoke(Long.valueOf(f2 == null ? 0L : MathKt.m32224d(f2.floatValue())));
                        }

                        @Override // com.yandex.div.internal.widget.slider.SliderView.ChangedListener
                        /* renamed from: b */
                        public /* synthetic */ void mo17032b(float f2) {
                        }
                    };
                    Objects.requireNonNull(divSliderView);
                    divSliderView.f34102c.m16613d(changedListener);
                }
            }));
            DivDrawable divDrawable = div.f38967s;
            if (divDrawable != null) {
                BaseDivViewExtensionsKt.m16922L(view, expressionResolver, divDrawable, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(DivDrawable divDrawable2) {
                        DivDrawable style = divDrawable2;
                        Intrinsics.m32179h(style, "style");
                        DivSliderBinder divSliderBinder = DivSliderBinder.this;
                        DivSliderView divSliderView = view;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        Objects.requireNonNull(divSliderBinder);
                        DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                        Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                        divSliderView.setThumbSecondaryDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                        return Unit.f63088a;
                    }
                });
                unit = Unit.f63088a;
            }
            if (unit == null) {
                BaseDivViewExtensionsKt.m16922L(view, expressionResolver, div.f38970v, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(DivDrawable divDrawable2) {
                        DivDrawable style = divDrawable2;
                        Intrinsics.m32179h(style, "style");
                        DivSliderBinder divSliderBinder = DivSliderBinder.this;
                        DivSliderView divSliderView = view;
                        ExpressionResolver expressionResolver2 = expressionResolver;
                        Objects.requireNonNull(divSliderBinder);
                        DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                        Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                        divSliderView.setThumbSecondaryDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                        return Unit.f63088a;
                    }
                });
            }
            final DivSlider.TextStyle textStyle2 = div.f38968t;
            m17027a(view, expressionResolver, textStyle2);
            if (textStyle2 != null) {
                C6855a.m34405a(view, textStyle2.f38991e.mo17537e(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeThumbSecondaryTextStyle$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Integer num) {
                        num.intValue();
                        DivSliderBinder.this.m17027a(view, expressionResolver, textStyle2);
                        return Unit.f63088a;
                    }
                }));
            }
        }
        BaseDivViewExtensionsKt.m16922L(view, expressionResolver, div.f38938B, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackActiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivDrawable divDrawable2) {
                DivDrawable style = divDrawable2;
                Intrinsics.m32179h(style, "style");
                DivSliderBinder divSliderBinder = DivSliderBinder.this;
                DivSliderView divSliderView = view;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Objects.requireNonNull(divSliderBinder);
                DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                divSliderView.setActiveTrackDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                return Unit.f63088a;
            }
        });
        BaseDivViewExtensionsKt.m16922L(view, expressionResolver, div.f38939C, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTrackInactiveStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivDrawable divDrawable2) {
                DivDrawable style = divDrawable2;
                Intrinsics.m32179h(style, "style");
                DivSliderBinder divSliderBinder = DivSliderBinder.this;
                DivSliderView divSliderView = view;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Objects.requireNonNull(divSliderBinder);
                DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                divSliderView.setInactiveTrackDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                return Unit.f63088a;
            }
        });
        DivDrawable divDrawable2 = div.f38973y;
        if (divDrawable2 != null) {
            BaseDivViewExtensionsKt.m16922L(view, expressionResolver, divDrawable2, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkActiveStyle$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(DivDrawable divDrawable3) {
                    DivDrawable style = divDrawable3;
                    Intrinsics.m32179h(style, "style");
                    DivSliderBinder divSliderBinder = DivSliderBinder.this;
                    DivSliderView divSliderView = view;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    Objects.requireNonNull(divSliderBinder);
                    DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                    Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                    divSliderView.setActiveTickMarkDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                    divSliderBinder.m17030d(divSliderView);
                    return Unit.f63088a;
                }
            });
        }
        DivDrawable divDrawable3 = div.f38974z;
        if (divDrawable3 == null) {
            return;
        }
        BaseDivViewExtensionsKt.m16922L(view, expressionResolver, divDrawable3, new Function1<DivDrawable, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$observeTickMarkInactiveStyle$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivDrawable divDrawable4) {
                DivDrawable style = divDrawable4;
                Intrinsics.m32179h(style, "style");
                DivSliderBinder divSliderBinder = DivSliderBinder.this;
                DivSliderView divSliderView = view;
                ExpressionResolver expressionResolver2 = expressionResolver;
                Objects.requireNonNull(divSliderBinder);
                DisplayMetrics displayMetrics = divSliderView.getResources().getDisplayMetrics();
                Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                divSliderView.setInactiveTickMarkDrawable(BaseDivViewExtensionsKt.m16929S(style, displayMetrics, expressionResolver2));
                divSliderBinder.m17030d(divSliderView);
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: d */
    public final void m17030d(final DivSliderView divSliderView) {
        if (!this.f32341f || this.f32342g == null) {
            return;
        }
        OneShotPreDrawListener.m2149a(divSliderView, new Runnable(divSliderView, divSliderView, this) { // from class: com.yandex.div.core.view2.divs.DivSliderBinder$checkSliderTicks$$inlined$doOnPreDraw$1

            /* renamed from: b */
            public final /* synthetic */ DivSliderView f32343b;

            /* renamed from: c */
            public final /* synthetic */ DivSliderBinder f32344c;

            {
                this.f32343b = divSliderView;
                this.f32344c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ErrorCollector errorCollector;
                ErrorCollector errorCollector2;
                if (this.f32343b.getActiveTickMarkDrawable() == null && this.f32343b.getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = this.f32343b.getMaxValue() - this.f32343b.getMinValue();
                Drawable activeTickMarkDrawable = this.f32343b.getActiveTickMarkDrawable();
                boolean z = false;
                int intrinsicWidth = activeTickMarkDrawable == null ? 0 : activeTickMarkDrawable.getIntrinsicWidth();
                if (Math.max(intrinsicWidth, this.f32343b.getInactiveTickMarkDrawable() == null ? 0 : r3.getIntrinsicWidth()) * maxValue <= this.f32343b.getWidth() || (errorCollector = this.f32344c.f32342g) == null) {
                    return;
                }
                ListIterator<Throwable> listIterator = errorCollector.f32879e.listIterator();
                while (listIterator.hasNext()) {
                    if (Intrinsics.m32174c(listIterator.next().getMessage(), "Slider ticks overlap each other.")) {
                        z = true;
                    }
                }
                if (z || (errorCollector2 = this.f32344c.f32342g) == null) {
                    return;
                }
                errorCollector2.f32879e.add(new Throwable("Slider ticks overlap each other."));
                errorCollector2.m17114c();
            }
        });
    }
}

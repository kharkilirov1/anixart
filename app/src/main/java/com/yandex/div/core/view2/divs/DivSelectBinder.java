package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import com.fasterxml.jackson.core.JsonFactory;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSizeUnit;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivSelectBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivSelectBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivSelect;", "Lcom/yandex/div/core/view2/divs/widgets/DivSelectView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivSelectBinder implements DivViewBinder<DivSelect, DivSelectView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32297a;

    /* renamed from: b */
    @NotNull
    public final DivTypefaceResolver f32298b;

    /* renamed from: c */
    @NotNull
    public final TwoWayStringVariableBinder f32299c;

    /* renamed from: d */
    @NotNull
    public final ErrorCollectors f32300d;

    @Inject
    public DivSelectBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivTypefaceResolver typefaceResolver, @NotNull TwoWayStringVariableBinder variableBinder, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(typefaceResolver, "typefaceResolver");
        Intrinsics.m32179h(variableBinder, "variableBinder");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32297a = baseBinder;
        this.f32298b = typefaceResolver;
        this.f32299c = variableBinder;
        this.f32300d = errorCollectors;
    }

    /* renamed from: a */
    public void m17025a(@NotNull final DivSelectView view, @NotNull final DivSelect div, @NotNull Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivSelect div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        final ErrorCollector m17115a = this.f32300d.m17115a(divView.getDataTag(), divView.getDivData());
        view.setDiv(div);
        if (div2 != null) {
            this.f32297a.m16988i(view, div2, divView);
        }
        this.f32297a.m16984e(view, div, div2, divView);
        view.setTextAlignment(5);
        final ExpressionResolver expressionResolver2 = divView.getExpressionResolver();
        BaseDivViewExtensionsKt.m16926P(view, divView, UtilsKt.f31778a, null);
        ExpressionResolver expressionResolver3 = divView.getExpressionResolver();
        final ArrayList arrayList = new ArrayList();
        final int i2 = 0;
        for (Object obj : div.f38337v) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            DivSelect.Option option = (DivSelect.Option) obj;
            Expression<String> expression = option.f38351a;
            if (expression == null) {
                expression = option.f38352b;
            }
            arrayList.add(expression.mo17535b(expressionResolver3));
            expression.mo17537e(expressionResolver3, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$createObservedItemList$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(String str) {
                    String it = str;
                    Intrinsics.m32179h(it, "it");
                    arrayList.set(i2, it);
                    view.setItems(arrayList);
                    return Unit.f63088a;
                }
            });
            i2 = i3;
        }
        view.setItems(arrayList);
        view.setOnItemSelectedListener(new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$applyOptions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                int intValue = num.intValue();
                DivSelectView.this.setText(arrayList.get(intValue));
                Function1<String, Unit> valueUpdater = DivSelectView.this.getValueUpdater();
                if (valueUpdater != null) {
                    valueUpdater.invoke(div.f38337v.get(intValue).f38352b.mo17535b(expressionResolver2));
                }
                return Unit.f63088a;
            }
        });
        final ExpressionResolver expressionResolver4 = divView.getExpressionResolver();
        this.f32299c.m16683a(divView, div.f38311G, new TwoWayStringVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            /* renamed from: a */
            public void mo16684a(String str) {
                String mo17535b;
                final String str2 = str;
                Sequence m32028k = CollectionsKt.m32028k(DivSelect.this.f38337v);
                final ExpressionResolver expressionResolver5 = expressionResolver4;
                FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1((FilteringSequence) SequencesKt.m33841i(m32028k, new Function1<DivSelect.Option, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$1$onVariableChanged$matchingOptionsSequence$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Boolean invoke(DivSelect.Option option2) {
                        DivSelect.Option it = option2;
                        Intrinsics.m32179h(it, "it");
                        return Boolean.valueOf(Intrinsics.m32174c(it.f38352b.mo17535b(ExpressionResolver.this), str2));
                    }
                }));
                DivSelectView divSelectView = view;
                if (filteringSequence$iterator$1.hasNext()) {
                    DivSelect.Option option2 = (DivSelect.Option) filteringSequence$iterator$1.next();
                    if (filteringSequence$iterator$1.hasNext()) {
                        m17115a.m17113b(new Throwable("Multiple options found with value = \"" + ((Object) str2) + "\", selecting first one"));
                    }
                    Expression<String> expression2 = option2.f38351a;
                    if (expression2 == null) {
                        expression2 = option2.f38352b;
                    }
                    mo17535b = expression2.mo17535b(expressionResolver4);
                } else {
                    m17115a.m17113b(new Throwable("No option found with value = \"" + ((Object) str2) + JsonFactory.DEFAULT_QUOTE_CHAR));
                    mo17535b = "";
                }
                divSelectView.setText(mo17535b);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            /* renamed from: b */
            public void mo16685b(@NotNull Function1<? super String, Unit> function1) {
                view.setValueUpdater(function1);
            }
        });
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeFontSize$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                int i4;
                Intrinsics.m32179h(noName_0, "$noName_0");
                long longValue = DivSelect.this.f38327l.mo17535b(expressionResolver).longValue();
                long j2 = longValue >> 31;
                if (j2 == 0 || j2 == -1) {
                    i4 = (int) longValue;
                } else {
                    int i5 = Assert.f33709a;
                    i4 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                BaseDivViewExtensionsKt.m16943d(view, i4, DivSelect.this.f38328m.mo17535b(expressionResolver));
                BaseDivViewExtensionsKt.m16947g(view, DivSelect.this.f38334s.mo17535b(expressionResolver).doubleValue(), i4);
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f38327l.mo17538f(expressionResolver, function1));
        C6855a.m34405a(view, div.f38334s.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f38328m.mo17537e(expressionResolver, function1));
        Function1<? super DivFontFamily, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeTypeface$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivSelectView.this.setTypeface(this.f32298b.m16865a(div.f38326k.mo17535b(expressionResolver), div.f38329n.mo17535b(expressionResolver)));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f38326k.mo17538f(expressionResolver, function12));
        C6855a.m34405a(view, div.f38329n.mo17537e(expressionResolver, function12));
        C6855a.m34405a(view, div.f38341z.mo17538f(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeTextColor$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                DivSelectView.this.setTextColor(num.intValue());
                return Unit.f63088a;
            }
        }));
        final Expression<Long> expression2 = div.f38335t;
        if (expression2 == null) {
            BaseDivViewExtensionsKt.m16948h(view, null, div.f38328m.mo17535b(expressionResolver));
        } else {
            Function1<? super Long, Unit> function13 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeLineHeight$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    long longValue = expression2.mo17535b(expressionResolver).longValue();
                    DivSizeUnit mo17535b = div.f38328m.mo17535b(expressionResolver);
                    DivSelectView divSelectView = view;
                    Long valueOf = Long.valueOf(longValue);
                    DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                    Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
                    divSelectView.setLineHeight(BaseDivViewExtensionsKt.m16942c0(valueOf, displayMetrics, mo17535b));
                    BaseDivViewExtensionsKt.m16948h(view, Long.valueOf(longValue), mo17535b);
                    return Unit.f63088a;
                }
            };
            C6855a.m34405a(view, expression2.mo17538f(expressionResolver, function13));
            C6855a.m34405a(view, div.f38328m.mo17537e(expressionResolver, function13));
        }
        Expression<String> expression3 = div.f38332q;
        if (expression3 != null) {
            C6855a.m34405a(view, expression3.mo17538f(expressionResolver, new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintText$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(String str) {
                    String hint = str;
                    Intrinsics.m32179h(hint, "hint");
                    DivSelectView.this.setHint(hint);
                    return Unit.f63088a;
                }
            }));
        }
        C6855a.m34405a(view, div.f38331p.mo17538f(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintColor$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                DivSelectView.this.setHintTextColor(num.intValue());
                return Unit.f63088a;
            }
        }));
    }
}

package com.yandex.div.core.view2.divs;

import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivSeparator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivSeparatorBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivSeparatorBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivSeparator;", "Lcom/yandex/div/core/view2/divs/widgets/DivSeparatorView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivSeparatorBinder implements DivViewBinder<DivSeparator, DivSeparatorView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32332a;

    @Inject
    public DivSeparatorBinder(@NotNull DivBaseBinder baseBinder) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        this.f32332a = baseBinder;
    }

    /* renamed from: a */
    public void m17026a(@NotNull final DivSeparatorView view, @NotNull DivSeparator div, @NotNull Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        DivSeparator div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32332a.m16988i(view, div2, divView);
        }
        this.f32332a.m16984e(view, div, div2, divView);
        BaseDivViewExtensionsKt.m16941c(view, divView, div.f38572b, div.f38574d, div.f38588r, div.f38583m, div.f38573c);
        DivSeparator.DelimiterStyle delimiterStyle = div.f38581k;
        Expression<Integer> expression = delimiterStyle == null ? null : delimiterStyle.f38606a;
        if (expression == null) {
            view.setDividerColor(0);
        } else {
            C6855a.m34405a(view, expression.mo17538f(expressionResolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$applyStyle$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Integer num) {
                    DivSeparatorView.this.setDividerColor(num.intValue());
                    return Unit.f63088a;
                }
            }));
        }
        Expression<DivSeparator.DelimiterStyle.Orientation> expression2 = delimiterStyle != null ? delimiterStyle.f38607b : null;
        if (expression2 == null) {
            view.setHorizontal(false);
        } else {
            C6855a.m34405a(view, expression2.mo17538f(expressionResolver, new Function1<DivSeparator.DelimiterStyle.Orientation, Unit>() { // from class: com.yandex.div.core.view2.divs.DivSeparatorBinder$applyStyle$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(DivSeparator.DelimiterStyle.Orientation orientation) {
                    DivSeparator.DelimiterStyle.Orientation orientation2 = orientation;
                    Intrinsics.m32179h(orientation2, "orientation");
                    DivSeparatorView.this.setHorizontal(orientation2 == DivSeparator.DelimiterStyle.Orientation.HORIZONTAL);
                    return Unit.f63088a;
                }
            }));
        }
        view.setDividerHeightResource(C2507R.dimen.div_separator_delimiter_height);
        view.setDividerGravity(17);
    }
}

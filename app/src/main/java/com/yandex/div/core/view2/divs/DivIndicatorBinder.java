package com.yandex.div.core.view2.divs;

import android.util.DisplayMetrics;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDefaultIndicatorItemPlacement;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivRoundedRectangleShape;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivIndicatorBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivIndicatorBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivIndicator;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerIndicatorView;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivIndicatorBinder implements DivViewBinder<DivIndicator, DivPagerIndicatorView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32157a;

    /* renamed from: b */
    @NotNull
    public final PagerIndicatorConnector f32158b;

    @Inject
    public DivIndicatorBinder(@NotNull DivBaseBinder baseBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(pagerIndicatorConnector, "pagerIndicatorConnector");
        this.f32157a = baseBinder;
        this.f32158b = pagerIndicatorConnector;
    }

    /* renamed from: e */
    public static /* synthetic */ IndicatorParams.Shape m17006e(DivIndicatorBinder divIndicatorBinder, DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression expression, float f2, int i2) {
        return divIndicatorBinder.m17010d(divRoundedRectangleShape, displayMetrics, expressionResolver, expression, (i2 & 8) != 0 ? 1.0f : f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17007a(com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView r21, com.yandex.div.json.expressions.ExpressionResolver r22, com.yandex.div2.DivIndicator r23) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivIndicatorBinder.m17007a(com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div2.DivIndicator):void");
    }

    /* renamed from: b */
    public void m17008b(@NotNull final DivPagerIndicatorView view, @NotNull final DivIndicator div, @NotNull Div2View divView) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        String str = div.f37083x;
        if (str != null) {
            PagerIndicatorConnector pagerIndicatorConnector = this.f32158b;
            Objects.requireNonNull(pagerIndicatorConnector);
            WeakHashMap<String, List<DivPagerIndicatorView>> weakHashMap = pagerIndicatorConnector.f32535b;
            List<DivPagerIndicatorView> list = weakHashMap.get(str);
            if (list == null) {
                list = new ArrayList<>();
                weakHashMap.put(str, list);
            }
            list.add(view);
        }
        DivIndicator div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            return;
        }
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32157a.m16988i(view, div2, divView);
        }
        this.f32157a.m16984e(view, div, div2, divView);
        m17007a(view, expressionResolver, div);
        Function1<? super DivIndicator.Animation, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivIndicatorBinder$observeStyle$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivIndicatorBinder.this.m17007a(view, expressionResolver, div);
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, div.f37067h.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f37061b.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f37062c.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f37076q.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, div.f37081v.mo17537e(expressionResolver, function1));
        BaseDivViewExtensionsKt.m16924N(view, expressionResolver, div.f37048A, function1);
        DivRoundedRectangleShape divRoundedRectangleShape = div.f37063d;
        if (divRoundedRectangleShape != null) {
            BaseDivViewExtensionsKt.m16923M(view, expressionResolver, divRoundedRectangleShape, function1);
        }
        DivRoundedRectangleShape divRoundedRectangleShape2 = div.f37078s;
        if (divRoundedRectangleShape2 != null) {
            BaseDivViewExtensionsKt.m16923M(view, expressionResolver, divRoundedRectangleShape2, function1);
        }
        DivRoundedRectangleShape divRoundedRectangleShape3 = div.f37077r;
        if (divRoundedRectangleShape3 != null) {
            BaseDivViewExtensionsKt.m16923M(view, expressionResolver, divRoundedRectangleShape3, function1);
        }
        JSONSerializable jSONSerializable = div.f37079t;
        if (jSONSerializable == null) {
            jSONSerializable = new DivIndicatorItemPlacement.Default(new DivDefaultIndicatorItemPlacement(div.f37049B));
        }
        if (jSONSerializable instanceof DivIndicatorItemPlacement.Default) {
            DivIndicatorItemPlacement.Default r0 = (DivIndicatorItemPlacement.Default) jSONSerializable;
            C6855a.m34405a(view, r0.f37102c.f35509a.f35795b.mo17537e(expressionResolver, function1));
            C6855a.m34405a(view, r0.f37102c.f35509a.f35794a.mo17537e(expressionResolver, function1));
        } else if (jSONSerializable instanceof DivIndicatorItemPlacement.Stretch) {
            DivIndicatorItemPlacement.Stretch stretch = (DivIndicatorItemPlacement.Stretch) jSONSerializable;
            C6855a.m34405a(view, stretch.f37103c.f39419a.f35795b.mo17537e(expressionResolver, function1));
            C6855a.m34405a(view, stretch.f37103c.f39419a.f35794a.mo17537e(expressionResolver, function1));
            C6855a.m34405a(view, stretch.f37103c.f39420b.mo17537e(expressionResolver, function1));
        }
        Objects.requireNonNull(this.f32157a);
        if (div.getF39961Z() instanceof DivSize.Fixed) {
            view.mo16763e(((DivFixedSize) div.getF39961Z().m17697a()).f35795b.mo17537e(expressionResolver, function1));
        }
        if (div.getF39983v() instanceof DivSize.Fixed) {
            view.mo16763e(((DivFixedSize) div.getF39983v().m17697a()).f35795b.mo17537e(expressionResolver, function1));
        }
    }

    /* renamed from: c */
    public final IndicatorParams.Shape m17009c(IndicatorParams.Shape shape, float f2, Integer num) {
        if (!(shape instanceof IndicatorParams.Shape.RoundedRect)) {
            if (shape instanceof IndicatorParams.Shape.Circle) {
                return new IndicatorParams.Shape.Circle(num == null ? shape.getF34040a() : num.intValue(), new IndicatorParams.ItemSize.Circle(((IndicatorParams.Shape.Circle) shape).f34039b.f34034a * f2));
            }
            throw new NoWhenBranchMatchedException();
        }
        int f34040a = num == null ? shape.getF34040a() : num.intValue();
        IndicatorParams.Shape.RoundedRect roundedRect = (IndicatorParams.Shape.RoundedRect) shape;
        IndicatorParams.ItemSize.RoundedRect roundedRect2 = roundedRect.f34041b;
        return BaseDivViewExtensionsKt.m16960t(f34040a, roundedRect2.f34035a, roundedRect2.f34036b, roundedRect2.f34037c, f2, Float.valueOf(roundedRect.f34042c), Integer.valueOf(roundedRect.f34043d));
    }

    /* renamed from: d */
    public final IndicatorParams.Shape m17010d(DivRoundedRectangleShape divRoundedRectangleShape, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, Expression<Integer> expression, float f2) {
        Expression<DivSizeUnit> expression2;
        Expression<Long> expression3;
        Long mo17535b;
        Expression<Integer> expression4;
        DivStroke divStroke = divRoundedRectangleShape.f38183e;
        Integer num = null;
        DivSizeUnit mo17535b2 = (divStroke == null || (expression2 = divStroke.f39441b) == null) ? null : expression2.mo17535b(expressionResolver);
        if (mo17535b2 == null) {
            mo17535b2 = DivSizeUnit.DP;
        }
        DivStroke divStroke2 = divRoundedRectangleShape.f38183e;
        Integer valueOf = (divStroke2 == null || (expression3 = divStroke2.f39442c) == null || (mo17535b = expression3.mo17535b(expressionResolver)) == null) ? null : Integer.valueOf(BaseDivViewExtensionsKt.m16942c0(mo17535b, displayMetrics, mo17535b2));
        Expression<Integer> expression5 = divRoundedRectangleShape.f38179a;
        if (expression5 != null) {
            expression = expression5;
        }
        int intValue = expression.mo17535b(expressionResolver).intValue();
        float m16938a0 = BaseDivViewExtensionsKt.m16938a0(divRoundedRectangleShape.f38182d, displayMetrics, expressionResolver);
        float m16938a02 = BaseDivViewExtensionsKt.m16938a0(divRoundedRectangleShape.f38181c, displayMetrics, expressionResolver);
        float m16938a03 = BaseDivViewExtensionsKt.m16938a0(divRoundedRectangleShape.f38180b, displayMetrics, expressionResolver);
        Float valueOf2 = valueOf == null ? null : Float.valueOf(valueOf.intValue());
        DivStroke divStroke3 = divRoundedRectangleShape.f38183e;
        if (divStroke3 != null && (expression4 = divStroke3.f39440a) != null) {
            num = expression4.mo17535b(expressionResolver);
        }
        return BaseDivViewExtensionsKt.m16960t(intValue, m16938a0, m16938a02, m16938a03, f2, valueOf2, num);
    }
}

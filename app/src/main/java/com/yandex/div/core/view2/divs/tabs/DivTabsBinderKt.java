package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import androidx.core.view.ViewCompat;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivTabs;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTabsBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTabsBinderKt {

    /* compiled from: DivTabsBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivFontWeight.values().length];
            DivFontWeight divFontWeight = DivFontWeight.MEDIUM;
            iArr[1] = 1;
            DivFontWeight divFontWeight2 = DivFontWeight.REGULAR;
            iArr[2] = 2;
            DivFontWeight divFontWeight3 = DivFontWeight.LIGHT;
            iArr[0] = 3;
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            iArr[3] = 4;
        }
    }

    /* renamed from: a */
    public static final DivTypefaceType m17079a(DivFontWeight divFontWeight) {
        int ordinal = divFontWeight.ordinal();
        if (ordinal == 0) {
            return DivTypefaceType.LIGHT;
        }
        if (ordinal == 1) {
            return DivTypefaceType.MEDIUM;
        }
        if (ordinal == 2) {
            return DivTypefaceType.REGULAR;
        }
        if (ordinal == 3) {
            return DivTypefaceType.BOLD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final void m17080b(@NotNull final TabView tabView, @NotNull final DivTabs.TabTitleStyle style, @NotNull final ExpressionResolver resolver, @NotNull ExpressionSubscriber subscriber) {
        Disposable mo17537e;
        Intrinsics.m32179h(tabView, "<this>");
        Intrinsics.m32179h(style, "style");
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(subscriber, "subscriber");
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                int i2;
                long longValue = DivTabs.TabTitleStyle.this.f39576h.mo17535b(resolver).longValue();
                long j2 = longValue >> 31;
                if (j2 == 0 || j2 == -1) {
                    i2 = (int) longValue;
                } else {
                    int i3 = Assert.f33709a;
                    i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                BaseDivViewExtensionsKt.m16943d(tabView, i2, DivTabs.TabTitleStyle.this.f39577i.mo17535b(resolver));
                BaseDivViewExtensionsKt.m16947g(tabView, DivTabs.TabTitleStyle.this.f39583o.mo17535b(resolver).doubleValue(), i2);
                TabView tabView2 = tabView;
                Expression<Long> expression = DivTabs.TabTitleStyle.this.f39584p;
                BaseDivViewExtensionsKt.m16948h(tabView2, expression == null ? null : expression.mo17535b(resolver), DivTabs.TabTitleStyle.this.f39577i.mo17535b(resolver));
                return Unit.f63088a;
            }
        };
        subscriber.mo16763e(style.f39576h.mo17537e(resolver, function1));
        subscriber.mo16763e(style.f39577i.mo17537e(resolver, function1));
        Expression<Long> expression = style.f39584p;
        if (expression != null && (mo17537e = expression.mo17537e(resolver, function1)) != null) {
            subscriber.mo16763e(mo17537e);
        }
        function1.invoke(null);
        tabView.setIncludeFontPadding(false);
        final DivEdgeInsets divEdgeInsets = style.f39585q;
        final DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        Function1<? super Long, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyTabPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                TabView tabView2 = TabView.this;
                Long mo17535b = divEdgeInsets.f35620b.mo17535b(resolver);
                DisplayMetrics metrics = displayMetrics;
                Intrinsics.m32178g(metrics, "metrics");
                int m16961u = BaseDivViewExtensionsKt.m16961u(mo17535b, metrics);
                Long mo17535b2 = divEdgeInsets.f35622d.mo17535b(resolver);
                DisplayMetrics metrics2 = displayMetrics;
                Intrinsics.m32178g(metrics2, "metrics");
                int m16961u2 = BaseDivViewExtensionsKt.m16961u(mo17535b2, metrics2);
                Long mo17535b3 = divEdgeInsets.f35621c.mo17535b(resolver);
                DisplayMetrics metrics3 = displayMetrics;
                Intrinsics.m32178g(metrics3, "metrics");
                int m16961u3 = BaseDivViewExtensionsKt.m16961u(mo17535b3, metrics3);
                Long mo17535b4 = divEdgeInsets.f35619a.mo17535b(resolver);
                DisplayMetrics metrics4 = displayMetrics;
                Intrinsics.m32178g(metrics4, "metrics");
                int m16961u4 = BaseDivViewExtensionsKt.m16961u(mo17535b4, metrics4);
                Objects.requireNonNull(tabView2);
                ViewCompat.m2226t0(tabView2, m16961u, m16961u2, m16961u3, m16961u4);
                return Unit.f63088a;
            }
        };
        subscriber.mo16763e(divEdgeInsets.f35620b.mo17537e(resolver, function12));
        subscriber.mo16763e(divEdgeInsets.f35621c.mo17537e(resolver, function12));
        subscriber.mo16763e(divEdgeInsets.f35622d.mo17537e(resolver, function12));
        subscriber.mo16763e(divEdgeInsets.f35619a.mo17537e(resolver, function12));
        function12.invoke(null);
        Expression<DivFontWeight> expression2 = style.f39580l;
        if (expression2 == null) {
            expression2 = style.f39578j;
        }
        subscriber.mo16763e(expression2.mo17538f(resolver, new Function1<DivFontWeight, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivFontWeight divFontWeight) {
                DivFontWeight divFontWeight2 = divFontWeight;
                Intrinsics.m32179h(divFontWeight2, "divFontWeight");
                TabView.this.setInactiveTypefaceType(DivTabsBinderKt.m17079a(divFontWeight2));
                return Unit.f63088a;
            }
        }));
        Expression<DivFontWeight> expression3 = style.f39570b;
        if (expression3 == null) {
            expression3 = style.f39578j;
        }
        subscriber.mo16763e(expression3.mo17538f(resolver, new Function1<DivFontWeight, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivFontWeight divFontWeight) {
                DivFontWeight divFontWeight2 = divFontWeight;
                Intrinsics.m32179h(divFontWeight2, "divFontWeight");
                TabView.this.setActiveTypefaceType(DivTabsBinderKt.m17079a(divFontWeight2));
                return Unit.f63088a;
            }
        }));
    }
}

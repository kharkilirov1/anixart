package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivGrid;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivGridBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivGridBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivGrid;", "Lcom/yandex/div/core/view2/divs/widgets/DivGridLayout;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivGridBinder implements DivViewBinder<DivGrid, DivGridLayout> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32092a;

    /* renamed from: b */
    @NotNull
    public final DivPatchManager f32093b;

    /* renamed from: c */
    @NotNull
    public final DivPatchCache f32094c;

    /* renamed from: d */
    @NotNull
    public final Provider<DivBinder> f32095d;

    @Inject
    public DivGridBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Provider<DivBinder> divBinder) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(divPatchManager, "divPatchManager");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        Intrinsics.m32179h(divBinder, "divBinder");
        this.f32092a = baseBinder;
        this.f32093b = divPatchManager;
        this.f32094c = divPatchCache;
        this.f32095d = divBinder;
    }

    /* renamed from: a */
    public final void m16998a(View view, ExpressionResolver expressionResolver, DivBase divBase) {
        Long mo17535b;
        int i2;
        Long mo17535b2;
        Expression<Long> mo17572f = divBase.mo17572f();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        int i3 = 1;
        if (divLayoutParams != null) {
            if (mo17572f == null || (mo17535b2 = mo17572f.mo17535b(expressionResolver)) == null) {
                i2 = 1;
            } else {
                long longValue = mo17535b2.longValue();
                long j2 = longValue >> 31;
                if (j2 == 0 || j2 == -1) {
                    i2 = (int) longValue;
                } else {
                    int i4 = Assert.f33709a;
                    i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            if (divLayoutParams.f33960e != i2) {
                divLayoutParams.f33960e = i2;
                view.requestLayout();
            }
        }
        Expression<Long> mo17575i = divBase.mo17575i();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        DivLayoutParams divLayoutParams2 = layoutParams2 instanceof DivLayoutParams ? (DivLayoutParams) layoutParams2 : null;
        if (divLayoutParams2 == null) {
            return;
        }
        if (mo17575i != null && (mo17535b = mo17575i.mo17535b(expressionResolver)) != null) {
            long longValue2 = mo17535b.longValue();
            long j3 = longValue2 >> 31;
            if (j3 == 0 || j3 == -1) {
                i3 = (int) longValue2;
            } else {
                int i5 = Assert.f33709a;
                i3 = longValue2 <= 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        if (divLayoutParams2.f33961f != i3) {
            divLayoutParams2.f33961f = i3;
            view.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m16999b(final View view, final DivBase divBase, final ExpressionResolver expressionResolver) {
        this.f32092a.m16983d(view, divBase, null, expressionResolver);
        m16998a(view, expressionResolver, divBase);
        if (view instanceof ExpressionSubscriber) {
            Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindLayoutParams$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object noName_0) {
                    Intrinsics.m32179h(noName_0, "$noName_0");
                    DivGridBinder.this.m16998a(view, expressionResolver, divBase);
                    return Unit.f63088a;
                }
            };
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            Expression<Long> mo17572f = divBase.mo17572f();
            Disposable mo17537e = mo17572f == null ? null : mo17572f.mo17537e(expressionResolver, function1);
            if (mo17537e == null) {
                mo17537e = C2814a.f31000b;
            }
            expressionSubscriber.mo16763e(mo17537e);
            Expression<Long> mo17575i = divBase.mo17575i();
            Disposable mo17537e2 = mo17575i != null ? mo17575i.mo17537e(expressionResolver, function1) : null;
            if (mo17537e2 == null) {
                mo17537e2 = C2814a.f31000b;
            }
            expressionSubscriber.mo16763e(mo17537e2);
        }
    }

    /* renamed from: c */
    public void m17000c(@NotNull final DivGridLayout view, @NotNull DivGrid div, @NotNull Div2View divView, @NotNull DivStatePath path) {
        int size;
        int m32047x;
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(path, "path");
        DivGrid div2 = view.getDiv();
        Intrinsics.m32174c(div, div2);
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        C6855a.m34406b(view);
        view.setDiv$div_release(div);
        view.setReleaseViewVisitor$div_release(divView.getReleaseViewVisitor$div_release());
        if (div2 != null) {
            this.f32092a.m16988i(view, div2, divView);
        }
        this.f32092a.m16984e(view, div, div2, divView);
        BaseDivViewExtensionsKt.m16941c(view, divView, div.f36463b, div.f36465d, div.f36482u, div.f36476o, div.f36464c);
        C6855a.m34405a(view, div.f36471j.mo17538f(expressionResolver, new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$bindView$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l2) {
                int i2;
                long longValue = l2.longValue();
                DivGridLayout divGridLayout = DivGridLayout.this;
                long j2 = longValue >> 31;
                if (j2 == 0 || j2 == -1) {
                    i2 = (int) longValue;
                } else {
                    int i3 = Assert.f33709a;
                    i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                divGridLayout.setColumnCount(i2);
                return Unit.f63088a;
            }
        }));
        final Expression<DivAlignmentHorizontal> expression = div.f36473l;
        final Expression<DivAlignmentVertical> expression2 = div.f36474m;
        view.setGravity(BaseDivViewExtensionsKt.m16964x(expression.mo17535b(expressionResolver), expression2.mo17535b(expressionResolver)));
        Function1<? super DivAlignmentHorizontal, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivGridBinder$observeContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivGridLayout.this.setGravity(BaseDivViewExtensionsKt.m16964x(expression.mo17535b(expressionResolver), expression2.mo17535b(expressionResolver)));
                return Unit.f63088a;
            }
        };
        C6855a.m34405a(view, expression.mo17537e(expressionResolver, function1));
        C6855a.m34405a(view, expression2.mo17537e(expressionResolver, function1));
        if (div2 != null && (size = div.f36481t.size()) <= (m32047x = CollectionsKt.m32047x(div2.f36481t))) {
            while (true) {
                int i2 = size + 1;
                View childAt = view.getChildAt(size);
                Intrinsics.m32178g(childAt, "view.getChildAt(i)");
                divView.m16809G(childAt);
                if (size == m32047x) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        int size2 = div.f36481t.size();
        int i3 = 0;
        while (i3 < size2) {
            int i4 = i3 + 1;
            DivBase m17557a = div.f36481t.get(i3).m17557a();
            View childAt2 = view.getChildAt(i3 + 0);
            String f38960l = m17557a.getF38960l();
            if (f38960l != null) {
                this.f32093b.m16668a(divView, f38960l);
                this.f32094c.m16666a(divView.getDataTag(), f38960l);
            }
            childAt2.setLayoutParams(new DivLayoutParams(-2, -2));
            this.f32095d.get().m16852b(childAt2, div.f36481t.get(i3), divView, path);
            m16999b(childAt2, m17557a, expressionResolver);
            if (BaseDivViewExtensionsKt.m16912B(m17557a)) {
                divView.m16814o(childAt2, div.f36481t.get(i3));
            } else {
                divView.m16809G(childAt2);
            }
            i3 = i4;
        }
        BaseDivViewExtensionsKt.m16940b0(view, div.f36481t, div2 == null ? null : div2.f36481t, divView);
    }
}

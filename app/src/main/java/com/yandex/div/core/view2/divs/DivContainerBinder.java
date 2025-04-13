package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchManager;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.C3033a;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivMatchParentSize;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivWrapContentSize;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: DivContainerBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivContainerBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivContainer;", "Landroid/view/ViewGroup;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivContainerBinder implements DivViewBinder<DivContainer, ViewGroup> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32007a;

    /* renamed from: b */
    @NotNull
    public final Provider<DivViewCreator> f32008b;

    /* renamed from: c */
    @NotNull
    public final DivPatchManager f32009c;

    /* renamed from: d */
    @NotNull
    public final DivPatchCache f32010d;

    /* renamed from: e */
    @NotNull
    public final Provider<DivBinder> f32011e;

    /* renamed from: f */
    @NotNull
    public final ErrorCollectors f32012f;

    @Inject
    public DivContainerBinder(@NotNull DivBaseBinder baseBinder, @NotNull Provider<DivViewCreator> divViewCreator, @NotNull DivPatchManager divPatchManager, @NotNull DivPatchCache divPatchCache, @NotNull Provider<DivBinder> divBinder, @NotNull ErrorCollectors errorCollectors) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(divViewCreator, "divViewCreator");
        Intrinsics.m32179h(divPatchManager, "divPatchManager");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        Intrinsics.m32179h(divBinder, "divBinder");
        Intrinsics.m32179h(errorCollectors, "errorCollectors");
        this.f32007a = baseBinder;
        this.f32008b = divViewCreator;
        this.f32009c = divPatchManager;
        this.f32010d = divPatchCache;
        this.f32011e = divBinder;
        this.f32012f = errorCollectors;
    }

    /* renamed from: a */
    public final void m16989a(ErrorCollector errorCollector, String str, String str2) {
        String str3;
        if (str == null || (str3 = C0000a.m15l(" with id='", str, '\'')) == null) {
            str3 = "";
        }
        errorCollector.f32879e.add(new Throwable(C3033a.m17745g(new Object[]{str3, str2}, 2, "Incorrect child size. Container with wrap layout mode contains child%s with %s size along the cross axis.", "format(this, *args)")));
        errorCollector.m17114c();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0271 A[LOOP:3: B:45:0x01e4->B:52:0x0271, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0280 A[EDGE_INSN: B:53:0x0280->B:54:0x0280 BREAK  A[LOOP:3: B:45:0x01e4->B:52:0x0271], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m16990b(@org.jetbrains.annotations.NotNull android.view.ViewGroup r23, @org.jetbrains.annotations.NotNull final com.yandex.div2.DivContainer r24, @org.jetbrains.annotations.NotNull com.yandex.div.core.view2.Div2View r25, @org.jetbrains.annotations.NotNull com.yandex.div.core.state.DivStatePath r26) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.DivContainerBinder.m16990b(android.view.ViewGroup, com.yandex.div2.DivContainer, com.yandex.div.core.view2.Div2View, com.yandex.div.core.state.DivStatePath):void");
    }

    /* renamed from: c */
    public final void m16991c(DivSize divSize, DivBase divBase, ExpressionResolver expressionResolver, ErrorCollector errorCollector) {
        Object m17697a = divSize.m17697a();
        if (m17697a instanceof DivMatchParentSize) {
            m16989a(errorCollector, divBase.getF36229t(), "match parent");
            return;
        }
        if (m17697a instanceof DivWrapContentSize) {
            Expression<Boolean> expression = ((DivWrapContentSize) m17697a).f40995a;
            boolean z = false;
            if (expression != null && expression.mo17535b(expressionResolver).booleanValue()) {
                z = true;
            }
            if (z) {
                m16989a(errorCollector, divBase.getF36229t(), "wrap content with constrained=true");
            }
        }
    }

    /* renamed from: d */
    public final void m16992d(final DivContainer divContainer, final DivBase divBase, final View view, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Function1<? super DivContentAlignmentHorizontal, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$observeChildViewAlignment$applyAlignments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                DivAlignmentHorizontal divAlignmentHorizontal;
                Intrinsics.m32179h(noName_0, "$noName_0");
                Expression<DivAlignmentHorizontal> mo17579m = DivBase.this.mo17579m();
                DivAlignmentVertical divAlignmentVertical = null;
                if (mo17579m != null) {
                    divAlignmentHorizontal = mo17579m.mo17535b(expressionResolver);
                } else if (BaseDivViewExtensionsKt.m16918H(divContainer, expressionResolver)) {
                    divAlignmentHorizontal = null;
                } else {
                    DivContentAlignmentHorizontal mo17535b = divContainer.f34945l.mo17535b(expressionResolver);
                    Intrinsics.m32179h(mo17535b, "<this>");
                    int ordinal = mo17535b.ordinal();
                    divAlignmentHorizontal = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? DivAlignmentHorizontal.LEFT : DivAlignmentHorizontal.RIGHT : DivAlignmentHorizontal.CENTER : DivAlignmentHorizontal.LEFT;
                }
                Expression<DivAlignmentVertical> mo17583q = DivBase.this.mo17583q();
                if (mo17583q != null) {
                    divAlignmentVertical = mo17583q.mo17535b(expressionResolver);
                } else if (!BaseDivViewExtensionsKt.m16918H(divContainer, expressionResolver)) {
                    DivContentAlignmentVertical mo17535b2 = divContainer.f34946m.mo17535b(expressionResolver);
                    Intrinsics.m32179h(mo17535b2, "<this>");
                    int ordinal2 = mo17535b2.ordinal();
                    divAlignmentVertical = ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? DivAlignmentVertical.TOP : DivAlignmentVertical.BASELINE : DivAlignmentVertical.BOTTOM : DivAlignmentVertical.CENTER : DivAlignmentVertical.TOP;
                }
                BaseDivViewExtensionsKt.m16937a(view, divAlignmentHorizontal, divAlignmentVertical);
                return Unit.f63088a;
            }
        };
        expressionSubscriber.mo16763e(divContainer.f34945l.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(divContainer.f34946m.mo17537e(expressionResolver, function1));
        expressionSubscriber.mo16763e(divContainer.f34958y.mo17537e(expressionResolver, function1));
        function1.invoke(view);
    }

    /* renamed from: e */
    public final void m16993e(ExpressionSubscriber expressionSubscriber, final DivContainer divContainer, final ExpressionResolver expressionResolver, final Function1<? super Integer, Unit> function1) {
        expressionSubscriber.mo16763e(divContainer.f34945l.mo17538f(expressionResolver, new Function1<DivContentAlignmentHorizontal, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$observeContentAlignment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
                DivContentAlignmentHorizontal it = divContentAlignmentHorizontal;
                Intrinsics.m32179h(it, "it");
                function1.invoke(Integer.valueOf(BaseDivViewExtensionsKt.m16965y(it, divContainer.f34946m.mo17535b(expressionResolver))));
                return Unit.f63088a;
            }
        }));
        expressionSubscriber.mo16763e(divContainer.f34946m.mo17538f(expressionResolver, new Function1<DivContentAlignmentVertical, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$observeContentAlignment$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivContentAlignmentVertical divContentAlignmentVertical) {
                DivContentAlignmentVertical it = divContentAlignmentVertical;
                Intrinsics.m32179h(it, "it");
                function1.invoke(Integer.valueOf(BaseDivViewExtensionsKt.m16965y(divContainer.f34945l.mo17535b(expressionResolver), it)));
                return Unit.f63088a;
            }
        }));
    }

    /* renamed from: f */
    public final void m16994f(ExpressionSubscriber expressionSubscriber, final DivContainer.Separator separator, final ExpressionResolver expressionResolver, final Function1<? super Integer, Unit> function1) {
        Function1<? super Boolean, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivContainerBinder$observeSeparatorShowMode$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                boolean booleanValue = DivContainer.Separator.this.f34990b.mo17535b(expressionResolver).booleanValue();
                boolean z = booleanValue;
                if (DivContainer.Separator.this.f34991c.mo17535b(expressionResolver).booleanValue()) {
                    z = (booleanValue ? 1 : 0) | 2;
                }
                int i2 = z;
                if (DivContainer.Separator.this.f34989a.mo17535b(expressionResolver).booleanValue()) {
                    i2 = (z ? 1 : 0) | 4;
                }
                function1.invoke(Integer.valueOf(i2));
                return Unit.f63088a;
            }
        };
        expressionSubscriber.mo16763e(separator.f34990b.mo17537e(expressionResolver, function12));
        expressionSubscriber.mo16763e(separator.f34991c.mo17537e(expressionResolver, function12));
        expressionSubscriber.mo16763e(separator.f34989a.mo17537e(expressionResolver, function12));
        function12.invoke(Unit.f63088a);
    }
}

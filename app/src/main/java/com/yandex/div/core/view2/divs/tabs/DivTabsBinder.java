package com.yandex.div.core.view2.divs.tabs;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.downloader.DivPatchMap;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.C2856b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.histogram.RunnableC2899a;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031j.C6523a;
import p035l.C6855a;

/* compiled from: DivTabsBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder;", "", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivTabsBinder {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32641a;

    /* renamed from: b */
    @NotNull
    public final DivViewCreator f32642b;

    /* renamed from: c */
    @NotNull
    public final ViewPool f32643c;

    /* renamed from: d */
    @NotNull
    public final TabTextStyleProvider f32644d;

    /* renamed from: e */
    @NotNull
    public final DivActionBinder f32645e;

    /* renamed from: f */
    @NotNull
    public final Div2Logger f32646f;

    /* renamed from: g */
    @NotNull
    public final DivVisibilityActionTracker f32647g;

    /* renamed from: h */
    @NotNull
    public final DivPatchCache f32648h;

    /* renamed from: i */
    @NotNull
    public final Context f32649i;

    /* renamed from: j */
    @Nullable
    public Long f32650j;

    /* compiled from: DivTabsBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsBinder$Companion;", "", "", "DEFAULT_LINE_HEIGHT_COEFFICIENT", "F", "", "TAG_TAB_HEADER", "Ljava/lang/String;", "TAG_TAB_ITEM", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: DivTabsBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivTabs.TabTitleStyle.AnimationType.values().length];
            DivTabs.TabTitleStyle.AnimationType animationType = DivTabs.TabTitleStyle.AnimationType.SLIDE;
            iArr[0] = 1;
            DivTabs.TabTitleStyle.AnimationType animationType2 = DivTabs.TabTitleStyle.AnimationType.FADE;
            iArr[1] = 2;
            DivTabs.TabTitleStyle.AnimationType animationType3 = DivTabs.TabTitleStyle.AnimationType.NONE;
            iArr[2] = 3;
        }
    }

    @Inject
    public DivTabsBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull ViewPool viewPool, @NotNull TabTextStyleProvider textStyleProvider, @NotNull DivActionBinder actionBinder, @NotNull Div2Logger div2Logger, @NotNull DivVisibilityActionTracker visibilityActionTracker, @NotNull DivPatchCache divPatchCache, @Named @NotNull Context context) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(viewCreator, "viewCreator");
        Intrinsics.m32179h(viewPool, "viewPool");
        Intrinsics.m32179h(textStyleProvider, "textStyleProvider");
        Intrinsics.m32179h(actionBinder, "actionBinder");
        Intrinsics.m32179h(div2Logger, "div2Logger");
        Intrinsics.m32179h(visibilityActionTracker, "visibilityActionTracker");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        Intrinsics.m32179h(context, "context");
        this.f32641a = baseBinder;
        this.f32642b = viewCreator;
        this.f32643c = viewPool;
        this.f32644d = textStyleProvider;
        this.f32645e = actionBinder;
        this.f32646f = div2Logger;
        this.f32647g = visibilityActionTracker;
        this.f32648h = divPatchCache;
        this.f32649i = context;
        viewPool.mo17401b("DIV2.TAB_HEADER_VIEW", new TabTitlesLayoutView.TabViewFactory(context), 12);
        viewPool.mo17401b("DIV2.TAB_ITEM_VIEW", new C2856b(this, 17), 2);
    }

    /* renamed from: b */
    public static final void m17075b(DivTabsBinder divTabsBinder, Div2View div2View, DivTabs divTabs, ExpressionResolver expressionResolver, TabsLayout tabsLayout, DivBinder divBinder, DivStatePath divStatePath, List<DivSimpleTab> list, int i2) {
        final DivTabsEventManager divTabsEventManager = new DivTabsEventManager(div2View, divTabsBinder.f32645e, divTabsBinder.f32646f, divTabsBinder.f32647g, tabsLayout, divTabs);
        boolean booleanValue = divTabs.f39516i.mo17535b(expressionResolver).booleanValue();
        C6523a c6523a = booleanValue ? C6523a.f63006A : C6523a.f63007B;
        int currentItem = tabsLayout.getViewPager().getCurrentItem();
        final int currentItem2 = tabsLayout.getViewPager().getCurrentItem();
        if (currentItem2 == currentItem) {
            UiThreadHandler uiThreadHandler = UiThreadHandler.f33903a;
            UiThreadHandler.f33904b.post(new RunnableC2899a(new Function0<Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$createAdapter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public Unit invoke() {
                    DivTabsEventManager.this.m17083f(currentItem2);
                    return Unit.f63088a;
                }
            }, 1));
        }
        DivTabsAdapter divTabsAdapter = new DivTabsAdapter(divTabsBinder.f32643c, tabsLayout, new BaseDivTabbedCardUi.TabbedCardConfig(C2507R.id.base_tabbed_title_container_scroller, C2507R.id.div_tabs_pager_container, C2507R.id.div_tabs_container_helper, true, false, "DIV2.TAB_HEADER_VIEW", "DIV2.TAB_ITEM_VIEW"), c6523a, booleanValue, div2View, divTabsBinder.f32644d, divTabsBinder.f32642b, divBinder, divTabsEventManager, divStatePath, divTabsBinder.f32648h);
        divTabsAdapter.m17074e(new C2877a(list, 1), i2);
        tabsLayout.setDivTabsAdapter(divTabsAdapter);
    }

    /* renamed from: d */
    public static final void m17076d(Expression<?> expression, ExpressionSubscriber expressionSubscriber, final ExpressionResolver expressionResolver, final DivTabsBinder divTabsBinder, final TabsLayout tabsLayout, final DivTabs.TabTitleStyle tabTitleStyle) {
        Disposable mo17537e = expression == null ? null : expression.mo17537e(expressionResolver, new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeStyle$addToSubscriber$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                DivTabsBinder.this.m17077a(tabsLayout.getTitleLayout(), expressionResolver, tabTitleStyle);
                return Unit.f63088a;
            }
        });
        if (mo17537e == null) {
            mo17537e = C2814a.f31000b;
        }
        expressionSubscriber.mo16763e(mo17537e);
    }

    /* renamed from: a */
    public final void m17077a(TabTitlesLayoutView<?> tabTitlesLayoutView, ExpressionResolver expressionResolver, DivTabs.TabTitleStyle tabTitleStyle) {
        Integer mo17535b;
        BaseIndicatorTabLayout.AnimationType animationType;
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        int intValue = tabTitleStyle.f39571c.mo17535b(expressionResolver).intValue();
        int intValue2 = tabTitleStyle.f39569a.mo17535b(expressionResolver).intValue();
        int intValue3 = tabTitleStyle.f39581m.mo17535b(expressionResolver).intValue();
        Expression<Integer> expression5 = tabTitleStyle.f39579k;
        int intValue4 = (expression5 == null || (mo17535b = expression5.mo17535b(expressionResolver)) == null) ? 0 : mo17535b.intValue();
        Objects.requireNonNull(tabTitlesLayoutView);
        tabTitlesLayoutView.setTabTextColors(BaseIndicatorTabLayout.m17477l(intValue3, intValue));
        tabTitlesLayoutView.setSelectedTabIndicatorColor(intValue2);
        tabTitlesLayoutView.setTabBackgroundColor(intValue4);
        DisplayMetrics metrics = tabTitlesLayoutView.getResources().getDisplayMetrics();
        Intrinsics.m32178g(metrics, "metrics");
        Float valueOf = tabTitleStyle.f39574f == null ? null : Float.valueOf(BaseDivViewExtensionsKt.m16961u(r1.mo17535b(expressionResolver), metrics));
        float floatValue = valueOf == null ? tabTitleStyle.f39575g == null ? -1.0f : 0.0f : valueOf.floatValue();
        DivCornersRadius divCornersRadius = tabTitleStyle.f39575g;
        float m16961u = (divCornersRadius == null || (expression4 = divCornersRadius.f35220c) == null) ? floatValue : BaseDivViewExtensionsKt.m16961u(expression4.mo17535b(expressionResolver), metrics);
        DivCornersRadius divCornersRadius2 = tabTitleStyle.f39575g;
        float m16961u2 = (divCornersRadius2 == null || (expression3 = divCornersRadius2.f35221d) == null) ? floatValue : BaseDivViewExtensionsKt.m16961u(expression3.mo17535b(expressionResolver), metrics);
        DivCornersRadius divCornersRadius3 = tabTitleStyle.f39575g;
        float m16961u3 = (divCornersRadius3 == null || (expression2 = divCornersRadius3.f35218a) == null) ? floatValue : BaseDivViewExtensionsKt.m16961u(expression2.mo17535b(expressionResolver), metrics);
        DivCornersRadius divCornersRadius4 = tabTitleStyle.f39575g;
        if (divCornersRadius4 != null && (expression = divCornersRadius4.f35219b) != null) {
            floatValue = BaseDivViewExtensionsKt.m16961u(expression.mo17535b(expressionResolver), metrics);
        }
        tabTitlesLayoutView.setTabIndicatorCornersRadii(new float[]{m16961u, m16961u, m16961u2, m16961u2, floatValue, floatValue, m16961u3, m16961u3});
        tabTitlesLayoutView.setTabItemSpacing(BaseDivViewExtensionsKt.m16961u(tabTitleStyle.f39582n.mo17535b(expressionResolver), metrics));
        int ordinal = tabTitleStyle.f39573e.mo17535b(expressionResolver).ordinal();
        if (ordinal == 0) {
            animationType = BaseIndicatorTabLayout.AnimationType.SLIDE;
        } else if (ordinal == 1) {
            animationType = BaseIndicatorTabLayout.AnimationType.FADE;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            animationType = BaseIndicatorTabLayout.AnimationType.NONE;
        }
        tabTitlesLayoutView.setAnimationType(animationType);
        tabTitlesLayoutView.setAnimationDuration(tabTitleStyle.f39572d.mo17535b(expressionResolver).longValue());
        tabTitlesLayoutView.setTabTitleStyle(tabTitleStyle);
    }

    /* renamed from: c */
    public final void m17078c(@NotNull final TabsLayout view, @NotNull final DivTabs div, @NotNull final Div2View divView, @NotNull final DivBinder divBinder, @NotNull final DivStatePath path) {
        ArrayList arrayList;
        ExpressionSubscriber expressionSubscriber;
        Long l2;
        DivTabsAdapter divTabsAdapter;
        DivTabs divTabs;
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(path, "path");
        DivTabs div2 = view.getDiv();
        final ExpressionResolver resolver = divView.getExpressionResolver();
        view.setDiv(div);
        if (div2 != null) {
            this.f32641a.m16988i(view, div2, divView);
            if (Intrinsics.m32174c(div2, div) && (divTabsAdapter = view.getDivTabsAdapter()) != null) {
                Intrinsics.m32179h(resolver, "resolver");
                DivPatchCache divPatchCache = divTabsAdapter.f32638u;
                DivDataTag tag = divTabsAdapter.f32633p.getDataTag();
                Objects.requireNonNull(divPatchCache);
                Intrinsics.m32179h(tag, "tag");
                DivPatchMap divPatchMap = divPatchCache.f31158a.get(tag);
                if (divPatchMap == null) {
                    divTabs = null;
                } else {
                    divTabs = (DivTabs) new DivPatchApply(divPatchMap).m16663a(new Div.Tabs(div), resolver).get(0).m17557a();
                    DisplayMetrics displayMetrics = divTabsAdapter.f32633p.getResources().getDisplayMetrics();
                    List<DivTabs.Item> list = divTabs.f39522o;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
                    for (DivTabs.Item item : list) {
                        Intrinsics.m32178g(displayMetrics, "displayMetrics");
                        arrayList2.add(new DivSimpleTab(item, displayMetrics, resolver));
                    }
                    divTabsAdapter.m17074e(new C2877a(arrayList2, 0), divTabsAdapter.f34155c.getCurrentItem());
                }
                if (divTabs != null) {
                    view.setDiv(divTabs);
                    return;
                }
            }
        }
        C6855a.m34406b(view);
        ExpressionSubscriber m16765a = ReleasablesKt.m16765a(view);
        this.f32641a.m16984e(view, div, div2, divView);
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindView$applyPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                BaseDivViewExtensionsKt.m16954n(TabsLayout.this.getTitleLayout(), div.f39533z, resolver);
                return Unit.f63088a;
            }
        };
        function1.invoke(null);
        div.f39533z.f35620b.mo17537e(resolver, function1);
        div.f39533z.f35621c.mo17537e(resolver, function1);
        div.f39533z.f35622d.mo17537e(resolver, function1);
        div.f39533z.f35619a.mo17537e(resolver, function1);
        final TabTitlesLayoutView<?> titleLayout = view.getTitleLayout();
        Function1<? super Long, Unit> function12 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$observeHeight$applyHeight$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                DivTabs divTabs2 = DivTabs.this;
                DivTabs.TabTitleStyle tabTitleStyle = divTabs2.f39532y;
                DivEdgeInsets divEdgeInsets = tabTitleStyle.f39585q;
                DivEdgeInsets divEdgeInsets2 = divTabs2.f39533z;
                Expression<Long> expression = tabTitleStyle.f39584p;
                Long mo17535b = expression == null ? null : expression.mo17535b(resolver);
                long longValue = divEdgeInsets2.f35619a.mo17535b(resolver).longValue() + divEdgeInsets2.f35622d.mo17535b(resolver).longValue() + divEdgeInsets.f35619a.mo17535b(resolver).longValue() + divEdgeInsets.f35622d.mo17535b(resolver).longValue() + (mo17535b == null ? (long) (DivTabs.this.f39532y.f39576h.mo17535b(resolver).floatValue() * 1.3f) : mo17535b.longValue());
                DisplayMetrics metrics = titleLayout.getResources().getDisplayMetrics();
                ViewGroup.LayoutParams layoutParams = titleLayout.getLayoutParams();
                Long valueOf = Long.valueOf(longValue);
                Intrinsics.m32178g(metrics, "metrics");
                layoutParams.height = BaseDivViewExtensionsKt.m16927Q(valueOf, metrics);
                return Unit.f63088a;
            }
        };
        function12.invoke(null);
        ExpressionSubscriber m16765a2 = ReleasablesKt.m16765a(titleLayout);
        Expression<Long> expression = div.f39532y.f39584p;
        if (expression != null) {
            m16765a2.mo16763e(expression.mo17537e(resolver, function12));
        }
        m16765a2.mo16763e(div.f39532y.f39576h.mo17537e(resolver, function12));
        m16765a2.mo16763e(div.f39532y.f39585q.f35622d.mo17537e(resolver, function12));
        m16765a2.mo16763e(div.f39532y.f39585q.f35619a.mo17537e(resolver, function12));
        m16765a2.mo16763e(div.f39533z.f35622d.mo17537e(resolver, function12));
        m16765a2.mo16763e(div.f39533z.f35619a.mo17537e(resolver, function12));
        DivTabs.TabTitleStyle tabTitleStyle = div.f39532y;
        m17077a(view.getTitleLayout(), resolver, tabTitleStyle);
        ExpressionSubscriber m16765a3 = ReleasablesKt.m16765a(view);
        m17076d(tabTitleStyle.f39571c, m16765a3, resolver, this, view, tabTitleStyle);
        m17076d(tabTitleStyle.f39569a, m16765a3, resolver, this, view, tabTitleStyle);
        m17076d(tabTitleStyle.f39581m, m16765a3, resolver, this, view, tabTitleStyle);
        m17076d(tabTitleStyle.f39579k, m16765a3, resolver, this, view, tabTitleStyle);
        Expression<Long> expression2 = tabTitleStyle.f39574f;
        if (expression2 != null) {
            m17076d(expression2, m16765a3, resolver, this, view, tabTitleStyle);
        }
        DivCornersRadius divCornersRadius = tabTitleStyle.f39575g;
        m17076d(divCornersRadius == null ? null : divCornersRadius.f35220c, m16765a3, resolver, this, view, tabTitleStyle);
        DivCornersRadius divCornersRadius2 = tabTitleStyle.f39575g;
        m17076d(divCornersRadius2 == null ? null : divCornersRadius2.f35221d, m16765a3, resolver, this, view, tabTitleStyle);
        DivCornersRadius divCornersRadius3 = tabTitleStyle.f39575g;
        m17076d(divCornersRadius3 == null ? null : divCornersRadius3.f35219b, m16765a3, resolver, this, view, tabTitleStyle);
        DivCornersRadius divCornersRadius4 = tabTitleStyle.f39575g;
        m17076d(divCornersRadius4 == null ? null : divCornersRadius4.f35218a, m16765a3, resolver, this, view, tabTitleStyle);
        m17076d(tabTitleStyle.f39582n, m16765a3, resolver, this, view, tabTitleStyle);
        m17076d(tabTitleStyle.f39573e, m16765a3, resolver, this, view, tabTitleStyle);
        m17076d(tabTitleStyle.f39572d, m16765a3, resolver, this, view, tabTitleStyle);
        view.getPagerLayout().setClipToPadding(false);
        DivEdgeInsets divEdgeInsets = div.f39530w;
        Function1<? super Long, Unit> function13 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                BaseDivViewExtensionsKt.m16949i(TabsLayout.this.getDivider(), div.f39530w, resolver);
                return Unit.f63088a;
            }
        };
        m16765a.mo16763e(divEdgeInsets.f35620b.mo17537e(resolver, function13));
        m16765a.mo16763e(divEdgeInsets.f35621c.mo17537e(resolver, function13));
        m16765a.mo16763e(divEdgeInsets.f35622d.mo17537e(resolver, function13));
        m16765a.mo16763e(divEdgeInsets.f35619a.mo17537e(resolver, function13));
        DivTabsAdapter divTabsAdapter2 = null;
        function13.invoke(null);
        m16765a.mo16763e(div.f39529v.mo17538f(resolver, new Function1<Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindView$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                TabsLayout.this.getDivider().setBackgroundColor(num.intValue());
                return Unit.f63088a;
            }
        }));
        m16765a.mo16763e(div.f39519l.mo17538f(resolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindView$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Boolean bool) {
                TabsLayout.this.getDivider().setVisibility(bool.booleanValue() ? 0 : 8);
                return Unit.f63088a;
            }
        }));
        view.getTitleLayout().setOnScrollChangedListener(new C0919e(this, divView, 19));
        List<DivTabs.Item> list2 = div.f39522o;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(list2, 10));
        for (DivTabs.Item item2 : list2) {
            DisplayMetrics displayMetrics2 = view.getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics2, "view.resources.displayMetrics");
            arrayList3.add(new DivSimpleTab(item2, displayMetrics2, resolver));
        }
        DivTabsAdapter divTabsAdapter3 = view.getDivTabsAdapter();
        if (divTabsAdapter3 != null && divTabsAdapter3.f32632o == div.f39516i.mo17535b(resolver).booleanValue()) {
            divTabsAdapter2 = divTabsAdapter3;
        }
        if (divTabsAdapter2 != null) {
            divTabsAdapter2.f32637t = path;
            DivTabsEventManager divTabsEventManager = divTabsAdapter2.f32636s;
            Objects.requireNonNull(divTabsEventManager);
            divTabsEventManager.f32706f = div;
            if (Intrinsics.m32174c(div2, div)) {
                divTabsAdapter2.m17073d();
            } else {
                divTabsAdapter2.m17466b(new C2877a(arrayList3, 2), resolver, m16765a);
            }
            arrayList = arrayList3;
            expressionSubscriber = m16765a;
        } else {
            long longValue = div.f39528u.mo17535b(resolver).longValue();
            long j2 = longValue >> 31;
            arrayList = arrayList3;
            expressionSubscriber = m16765a;
            m17075b(this, divView, div, resolver, view, divBinder, path, arrayList3, (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        List<DivTabs.Item> list3 = div.f39522o;
        Function1<? super DivSizeUnit, Unit> function14 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object obj) {
                DivTabsAdapter divTabsAdapter4 = TabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter4 != null) {
                    divTabsAdapter4.m17073d();
                }
                return Unit.f63088a;
            }
        };
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            DivSize f40705p = ((DivTabs.Item) it.next()).f39540a.m17557a().getF40705p();
            if (f40705p instanceof DivSize.Fixed) {
                DivSize.Fixed fixed = (DivSize.Fixed) f40705p;
                expressionSubscriber.mo16763e(fixed.f38836c.f35794a.mo17537e(resolver, function14));
                expressionSubscriber.mo16763e(fixed.f38836c.f35795b.mo17537e(resolver, function14));
            }
        }
        Function1<Long, Unit> function15 = new Function1<Long, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$selectTab$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l3) {
                PagerController pagerController;
                int i2;
                long longValue2 = l3.longValue();
                DivTabsBinder.this.f32650j = Long.valueOf(longValue2);
                DivTabsAdapter divTabsAdapter4 = view.getDivTabsAdapter();
                if (divTabsAdapter4 != null && (pagerController = divTabsAdapter4.f32640w) != null) {
                    long j3 = longValue2 >> 31;
                    if (j3 == 0 || j3 == -1) {
                        i2 = (int) longValue2;
                    } else {
                        int i3 = Assert.f33709a;
                        i2 = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    if (pagerController.f32708a.getCurrentItem() != i2) {
                        ScrollableViewPager scrollableViewPager = pagerController.f32708a;
                        scrollableViewPager.f6573w = false;
                        scrollableViewPager.m4371y(i2, true, false, 0);
                    }
                }
                return Unit.f63088a;
            }
        };
        final ArrayList arrayList4 = arrayList;
        expressionSubscriber.mo16763e(div.f39516i.mo17537e(resolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Boolean bool) {
                int intValue;
                int i2;
                PagerController pagerController;
                boolean booleanValue = bool.booleanValue();
                DivTabsAdapter divTabsAdapter4 = TabsLayout.this.getDivTabsAdapter();
                boolean z = false;
                if (divTabsAdapter4 != null && divTabsAdapter4.f32632o == booleanValue) {
                    z = true;
                }
                if (!z) {
                    DivTabsBinder divTabsBinder = this;
                    Div2View div2View = divView;
                    DivTabs divTabs2 = div;
                    ExpressionResolver expressionResolver = resolver;
                    TabsLayout tabsLayout = TabsLayout.this;
                    DivBinder divBinder2 = divBinder;
                    DivStatePath divStatePath = path;
                    List<DivSimpleTab> list4 = arrayList4;
                    DivTabsAdapter divTabsAdapter5 = tabsLayout.getDivTabsAdapter();
                    Integer num = null;
                    if (divTabsAdapter5 != null && (pagerController = divTabsAdapter5.f32640w) != null) {
                        num = Integer.valueOf(pagerController.f32708a.getCurrentItem());
                    }
                    if (num == null) {
                        long longValue2 = div.f39528u.mo17535b(resolver).longValue();
                        long j3 = longValue2 >> 31;
                        if (j3 == 0 || j3 == -1) {
                            i2 = (int) longValue2;
                            DivTabsBinder.m17075b(divTabsBinder, div2View, divTabs2, expressionResolver, tabsLayout, divBinder2, divStatePath, list4, i2);
                        } else {
                            int i3 = Assert.f33709a;
                            intValue = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                        }
                    } else {
                        intValue = num.intValue();
                    }
                    i2 = intValue;
                    DivTabsBinder.m17075b(divTabsBinder, div2View, divTabs2, expressionResolver, tabsLayout, divBinder2, divStatePath, list4, i2);
                }
                return Unit.f63088a;
            }
        }));
        expressionSubscriber.mo16763e(div.f39528u.mo17537e(resolver, function15));
        boolean z = Intrinsics.m32174c(divView.getPrevDataTag(), DivDataTag.f30858b) || Intrinsics.m32174c(divView.getDataTag(), divView.getPrevDataTag());
        long longValue2 = div.f39528u.mo17535b(resolver).longValue();
        if (!(z && (l2 = this.f32650j) != null && l2.longValue() == longValue2)) {
            function15.invoke(Long.valueOf(longValue2));
        }
        expressionSubscriber.mo16763e(div.f39531x.mo17538f(resolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindAdapter$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                DivTabsAdapter divTabsAdapter4 = TabsLayout.this.getDivTabsAdapter();
                if (divTabsAdapter4 != null) {
                    DivTabsBinder divTabsBinder = this;
                    int size = div.f39522o.size() - 1;
                    Objects.requireNonNull(divTabsBinder);
                    divTabsAdapter4.f34155c.setDisabledScrollPages(booleanValue ? new LinkedHashSet<>() : CollectionsKt.m32033m0(new IntRange(0, size)));
                }
                return Unit.f63088a;
            }
        }));
        expressionSubscriber.mo16763e(div.f39525r.mo17538f(resolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinder$bindView$6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Boolean bool) {
                TabsLayout.this.getViewPager().setOnInterceptTouchEventListener(bool.booleanValue() ? new ParentScrollRestrictor(1) : null);
                return Unit.f63088a;
            }
        }));
    }
}

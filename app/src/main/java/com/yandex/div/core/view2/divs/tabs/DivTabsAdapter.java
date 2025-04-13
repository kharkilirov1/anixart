package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import com.yandex.div.internal.widget.tabs.TabTextStyleProvider;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTabsAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "Lcom/yandex/div/internal/widget/tabs/BaseDivTabbedCardUi;", "Lcom/yandex/div/core/view2/divs/tabs/DivSimpleTab;", "Landroid/view/ViewGroup;", "Lcom/yandex/div2/DivAction;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivTabsAdapter extends BaseDivTabbedCardUi<DivSimpleTab, ViewGroup, DivAction> {

    /* renamed from: o */
    public final boolean f32632o;

    /* renamed from: p */
    @NotNull
    public final Div2View f32633p;

    /* renamed from: q */
    @NotNull
    public final DivViewCreator f32634q;

    /* renamed from: r */
    @NotNull
    public final DivBinder f32635r;

    /* renamed from: s */
    @NotNull
    public final DivTabsEventManager f32636s;

    /* renamed from: t */
    @NotNull
    public DivStatePath f32637t;

    /* renamed from: u */
    @NotNull
    public final DivPatchCache f32638u;

    /* renamed from: v */
    @NotNull
    public final Map<ViewGroup, TabModel> f32639v;

    /* renamed from: w */
    @NotNull
    public final PagerController f32640w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTabsAdapter(@NotNull ViewPool viewPool, @NotNull View view, @NotNull BaseDivTabbedCardUi.TabbedCardConfig tabbedCardConfig, @NotNull HeightCalculatorFactory heightCalculatorFactory, boolean z, @NotNull Div2View div2View, @NotNull TabTextStyleProvider textStyleProvider, @NotNull DivViewCreator viewCreator, @NotNull DivBinder divBinder, @NotNull DivTabsEventManager divTabsEventManager, @NotNull DivStatePath path, @NotNull DivPatchCache divPatchCache) {
        super(viewPool, view, tabbedCardConfig, heightCalculatorFactory, textStyleProvider, divTabsEventManager, divTabsEventManager);
        Intrinsics.m32179h(viewPool, "viewPool");
        Intrinsics.m32179h(textStyleProvider, "textStyleProvider");
        Intrinsics.m32179h(viewCreator, "viewCreator");
        Intrinsics.m32179h(divBinder, "divBinder");
        Intrinsics.m32179h(path, "path");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        this.f32632o = z;
        this.f32633p = div2View;
        this.f32634q = viewCreator;
        this.f32635r = divBinder;
        this.f32636s = divTabsEventManager;
        this.f32637t = path;
        this.f32638u = divPatchCache;
        this.f32639v = new LinkedHashMap();
        ScrollableViewPager mPager = this.f34155c;
        Intrinsics.m32178g(mPager, "mPager");
        this.f32640w = new PagerController(mPager);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    /* renamed from: a */
    public ViewGroup mo17071a(ViewGroup tabView, DivSimpleTab divSimpleTab, int i2) {
        DivSimpleTab tab = divSimpleTab;
        Intrinsics.m32179h(tabView, "tabView");
        Intrinsics.m32179h(tab, "tab");
        ReleaseUtils.f32861a.m17110a(tabView, this.f32633p);
        Div div = tab.f32629a.f39540a;
        View m16868n = this.f32634q.m16868n(div, this.f32633p.getExpressionResolver());
        m16868n.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f32635r.m16852b(m16868n, div, this.f32633p, this.f32637t);
        this.f32639v.put(tabView, new TabModel(i2, div, m16868n));
        tabView.addView(m16868n);
        return tabView;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi
    /* renamed from: c */
    public void mo17072c(ViewGroup viewGroup) {
        ViewGroup tabView = viewGroup;
        Intrinsics.m32179h(tabView, "tabView");
        this.f32639v.remove(tabView);
        ReleaseUtils.f32861a.m17110a(tabView, this.f32633p);
    }

    /* renamed from: d */
    public final void m17073d() {
        for (Map.Entry<ViewGroup, TabModel> entry : this.f32639v.entrySet()) {
            ViewGroup key = entry.getKey();
            TabModel value = entry.getValue();
            this.f32635r.m16852b(value.f32710b, value.f32709a, this.f32633p, this.f32637t);
            key.requestLayout();
        }
    }

    /* renamed from: e */
    public final void m17074e(@NotNull BaseDivTabbedCardUi.Input<DivSimpleTab> input, int i2) {
        m17466b(input, this.f32633p.getExpressionResolver(), ReleasablesKt.m16765a(this.f32633p));
        this.f32639v.clear();
        ScrollableViewPager scrollableViewPager = this.f34155c;
        scrollableViewPager.f6573w = false;
        scrollableViewPager.m4371y(i2, true, false, 0);
    }
}

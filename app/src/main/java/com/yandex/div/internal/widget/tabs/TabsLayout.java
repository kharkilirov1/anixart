package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.tabs.DivTabsAdapter;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: TabsLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001e\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u00104\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, m31884d2 = {"Lcom/yandex/div/internal/widget/tabs/TabsLayout;", "Landroid/widget/LinearLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "b", "Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "getTitleLayout", "()Lcom/yandex/div/internal/widget/tabs/TabTitlesLayoutView;", "titleLayout", "Landroid/view/View;", "c", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "divider", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "d", "Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "getPagerLayout", "()Lcom/yandex/div/internal/widget/tabs/ViewPagerFixedSizeLayout;", "pagerLayout", "Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "e", "Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "getViewPager", "()Lcom/yandex/div/internal/widget/tabs/ScrollableViewPager;", "viewPager", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "f", "Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "getDivTabsAdapter", "()Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;", "setDivTabsAdapter", "(Lcom/yandex/div/core/view2/divs/tabs/DivTabsAdapter;)V", "divTabsAdapter", "Lcom/yandex/div2/DivTabs;", "g", "Lcom/yandex/div2/DivTabs;", "getDiv", "()Lcom/yandex/div2/DivTabs;", "setDiv", "(Lcom/yandex/div2/DivTabs;)V", "div", "", "Lcom/yandex/div/core/Disposable;", "i", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class TabsLayout extends LinearLayout implements DivBorderSupports, ExpressionSubscriber {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TabTitlesLayoutView<?> titleLayout;

    /* renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final View divider;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ViewPagerFixedSizeLayout pagerLayout;

    /* renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ScrollableViewPager viewPager;

    /* renamed from: f, reason: from kotlin metadata */
    @Nullable
    public DivTabsAdapter divTabsAdapter;

    /* renamed from: g, reason: from kotlin metadata */
    @Nullable
    public DivTabs div;

    /* renamed from: h */
    @Nullable
    public DivBorderDrawer f34298h;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: j */
    public boolean f34300j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, null);
        Intrinsics.m32179h(context, "context");
        this.subscriptions = new ArrayList();
        setId(C2507R.id.div_tabs_block);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        TabTitlesLayoutView<?> tabTitlesLayoutView = new TabTitlesLayoutView<>(context, null, C2507R.attr.divTabIndicatorLayoutStyle);
        tabTitlesLayoutView.setId(C2507R.id.base_tabbed_title_container_scroller);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C2507R.dimen.title_tab_title_height));
        layoutParams.gravity = 8388611;
        tabTitlesLayoutView.setLayoutParams(layoutParams);
        int dimensionPixelSize = tabTitlesLayoutView.getResources().getDimensionPixelSize(C2507R.dimen.title_tab_title_margin_vertical);
        int dimensionPixelSize2 = tabTitlesLayoutView.getResources().getDimensionPixelSize(C2507R.dimen.title_tab_title_margin_horizontal);
        tabTitlesLayoutView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        tabTitlesLayoutView.setClipToPadding(false);
        this.titleLayout = tabTitlesLayoutView;
        View view = new View(context);
        view.setId(C2507R.id.div_tabs_divider);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C2507R.dimen.div_separator_delimiter_height));
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(C2507R.dimen.div_horizontal_padding);
        layoutParams2.leftMargin = dimensionPixelSize3;
        layoutParams2.rightMargin = dimensionPixelSize3;
        layoutParams2.topMargin = getResources().getDimensionPixelSize(C2507R.dimen.title_tab_title_separator_margin_top);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(C2507R.dimen.title_tab_title_margin_vertical);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundResource(C2507R.color.div_separator_color);
        this.divider = view;
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context);
        scrollableViewPager.setId(C2507R.id.div_tabs_pager_container);
        scrollableViewPager.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        scrollableViewPager.setOverScrollMode(2);
        ViewCompat.m2222r0(scrollableViewPager, true);
        this.viewPager = scrollableViewPager;
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = new ViewPagerFixedSizeLayout(context, null, 0, 6);
        viewPagerFixedSizeLayout.setId(C2507R.id.div_tabs_container_helper);
        viewPagerFixedSizeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewPagerFixedSizeLayout.setCollapsiblePaddingBottom(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        viewPagerFixedSizeLayout.addView(getViewPager());
        viewPagerFixedSizeLayout.addView(frameLayout);
        this.pagerLayout = viewPagerFixedSizeLayout;
        addView(getTitleLayout());
        addView(getDivider());
        addView(getPagerLayout());
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f34298h = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        DivBorderDrawer f32775l;
        Intrinsics.m32179h(canvas, "canvas");
        Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(this)).iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) it.next();
            DivBorderSupports divBorderSupports = callback instanceof DivBorderSupports ? (DivBorderSupports) callback : null;
            if (divBorderSupports != null && (f32775l = divBorderSupports.getF32775l()) != null) {
                f32775l.m17089f(canvas);
            }
        }
        if (this.f34300j) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f34298h;
        if (divBorderDrawer == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.m17087c(canvas);
            super.dispatchDraw(canvas);
            divBorderDrawer.m17088d(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f34300j = true;
        DivBorderDrawer divBorderDrawer = this.f34298h;
        if (divBorderDrawer != null) {
            int save = canvas.save();
            try {
                divBorderDrawer.m17087c(canvas);
                super.draw(canvas);
                divBorderDrawer.m17088d(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.draw(canvas);
        }
        this.f34300j = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f34298h;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Nullable
    public DivTabs getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF32775l() {
        return this.f34298h;
    }

    @Nullable
    public DivTabsAdapter getDivTabsAdapter() {
        return this.divTabsAdapter;
    }

    @NotNull
    public View getDivider() {
        return this.divider;
    }

    @NotNull
    public ViewPagerFixedSizeLayout getPagerLayout() {
        return this.pagerLayout;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @NotNull
    public TabTitlesLayoutView<?> getTitleLayout() {
        return this.titleLayout;
    }

    @NotNull
    public ScrollableViewPager getViewPager() {
        return this.viewPager;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f34298h;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f34298h;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    public void setDiv(@Nullable DivTabs divTabs) {
        this.div = divTabs;
    }

    public void setDivTabsAdapter(@Nullable DivTabsAdapter divTabsAdapter) {
        this.divTabsAdapter = divTabsAdapter;
    }
}

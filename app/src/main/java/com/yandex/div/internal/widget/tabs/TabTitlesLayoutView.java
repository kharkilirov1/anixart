package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.viewpool.PseudoViewPool;
import com.yandex.div.internal.viewpool.ViewFactory;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTabs;
import java.util.List;

/* loaded from: classes2.dex */
public class TabTitlesLayoutView<ACTION> extends BaseIndicatorTabLayout implements BaseDivTabbedCardUi.AbstractTabBar<ACTION> {

    /* renamed from: H */
    @Nullable
    public BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> f34272H;

    /* renamed from: I */
    @Nullable
    public List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> f34273I;

    /* renamed from: J */
    @NonNull
    public ViewPool f34274J;

    /* renamed from: K */
    @NonNull
    public String f34275K;

    /* renamed from: L */
    @Nullable
    public DivTabs.TabTitleStyle f34276L;

    /* renamed from: M */
    @Nullable
    public OnScrollChangedListener f34277M;

    /* renamed from: N */
    public boolean f34278N;

    public interface OnScrollChangedListener {
        /* renamed from: d */
        void mo5567d();
    }

    public static class TabViewFactory implements ViewFactory<TabView> {

        /* renamed from: a */
        @NonNull
        public final Context f34280a;

        public TabViewFactory(@NonNull Context context) {
            this.f34280a = context;
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NonNull
        /* renamed from: a */
        public TabView mo16909a() {
            return new TabView(this.f34280a);
        }
    }

    public TabTitlesLayoutView(Context context, AttributeSet attributeSet, int i2) {
        super(context, null, i2);
        this.f34278N = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new BaseIndicatorTabLayout.OnTabSelectedListener() { // from class: com.yandex.div.internal.widget.tabs.TabTitlesLayoutView.1
            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            /* renamed from: a */
            public void mo17491a(BaseIndicatorTabLayout.Tab tab) {
                TabTitlesLayoutView tabTitlesLayoutView = TabTitlesLayoutView.this;
                if (tabTitlesLayoutView.f34272H == null) {
                    return;
                }
                int i3 = tab.f34250b;
                List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> list = tabTitlesLayoutView.f34273I;
                if (list != null) {
                    BaseDivTabbedCardUi.Input.TabBase<ACTION> tabBase = list.get(i3);
                    ACTION mo17069a = tabBase == null ? null : tabBase.mo17069a();
                    if (mo17069a != null) {
                        TabTitlesLayoutView.this.f34272H.mo17472a(mo17069a, i3);
                    }
                }
            }

            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            /* renamed from: b */
            public void mo17492b(BaseIndicatorTabLayout.Tab tab) {
            }

            @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
            /* renamed from: c */
            public void mo17493c(BaseIndicatorTabLayout.Tab tab) {
                BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> host = TabTitlesLayoutView.this.f34272H;
                if (host == null) {
                    return;
                }
                host.mo17473b(tab.f34250b, false);
            }
        });
        PseudoViewPool pseudoViewPool = new PseudoViewPool();
        pseudoViewPool.f33924a.put("TabTitlesLayoutView.TAB_HEADER", new TabViewFactory(getContext()));
        this.f34274J = pseudoViewPool;
        this.f34275K = "TabTitlesLayoutView.TAB_HEADER";
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    /* renamed from: a */
    public void mo17467a(@NonNull List<? extends BaseDivTabbedCardUi.Input.TabBase<ACTION>> list, int i2, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        this.f34273I = list;
        m17487q();
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            i2 = 0;
        }
        int i3 = 0;
        while (i3 < size) {
            BaseIndicatorTabLayout.Tab m17485o = m17485o();
            m17485o.m17502b(list.get(i3).getTitle());
            TabView tabView = m17485o.f34252d;
            DivTabs.TabTitleStyle tabTitleStyle = this.f34276L;
            if (tabTitleStyle != null) {
                DivTabsBinderKt.m17080b(tabView, tabTitleStyle, expressionResolver, expressionSubscriber);
            }
            m17478g(m17485o, i3 == i2);
            i3++;
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    /* renamed from: b */
    public void mo17468b(int i2, float f2) {
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    /* renamed from: c */
    public void mo17469c(int i2) {
        BaseIndicatorTabLayout.Tab tab;
        if (getSelectedTabPosition() == i2 || (tab = this.f34192b.get(i2)) == null) {
            return;
        }
        tab.m17501a();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    /* renamed from: d */
    public void mo17470d(int i2) {
        BaseIndicatorTabLayout.Tab tab;
        if (getSelectedTabPosition() == i2 || (tab = this.f34192b.get(i2)) == null) {
            return;
        }
        tab.m17501a();
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f34278N = true;
        }
        return dispatchTouchEvent;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    /* renamed from: e */
    public void mo17471e(@NonNull ViewPool viewPool, @NonNull String str) {
        this.f34274J = viewPool;
        this.f34275K = str;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    @Nullable
    public ViewPager.OnPageChangeListener getCustomPageChangeListener() {
        BaseIndicatorTabLayout.TabLayoutOnPageChangeListener pageChangeListener = getPageChangeListener();
        pageChangeListener.f34255c = 0;
        pageChangeListener.f34254b = 0;
        return pageChangeListener;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout
    /* renamed from: m */
    public TabView mo17483m(@NonNull Context context) {
        return (TabView) this.f34274J.mo17400a(this.f34275K);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout, android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        OnScrollChangedListener onScrollChangedListener = this.f34277M;
        if (onScrollChangedListener == null || !this.f34278N) {
            return;
        }
        onScrollChangedListener.mo5567d();
        this.f34278N = false;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setHost(@NonNull BaseDivTabbedCardUi.AbstractTabBar.Host<ACTION> host) {
        this.f34272H = host;
    }

    public void setOnScrollChangedListener(@Nullable OnScrollChangedListener onScrollChangedListener) {
        this.f34277M = onScrollChangedListener;
    }

    public void setTabTitleStyle(@Nullable DivTabs.TabTitleStyle tabTitleStyle) {
        this.f34276L = tabTitleStyle;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar
    public void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        this.f34201k = divTypefaceProvider;
    }
}

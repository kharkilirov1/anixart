package com.yandex.div.internal.widget.tabs;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.Views;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.Input.TabBase;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class BaseDivTabbedCardUi<TAB_DATA extends Input.TabBase<ACTION>, TAB_VIEW, ACTION> {

    /* renamed from: a */
    @NonNull
    public final ViewPool f34153a;

    /* renamed from: b */
    @NonNull
    public final AbstractTabBar<ACTION> f34154b;

    /* renamed from: c */
    @NonNull
    public final ScrollableViewPager f34155c;

    /* renamed from: d */
    @NonNull
    public HeightCalculatorFactory f34156d;

    /* renamed from: e */
    @Nullable
    public final ViewPagerFixedSizeLayout f34157e;

    /* renamed from: f */
    @Nullable
    public ViewPagerFixedSizeLayout.HeightCalculator f34158f;

    /* renamed from: i */
    @NonNull
    public final String f34161i;

    /* renamed from: j */
    @NonNull
    public final ActiveTabClickListener<ACTION> f34162j;

    /* renamed from: g */
    @NonNull
    public final Map<ViewGroup, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> f34159g = new ArrayMap();

    /* renamed from: h */
    @NonNull
    public final Map<Integer, BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding> f34160h = new ArrayMap();

    /* renamed from: k */
    public final PagerAdapter f34163k = new PagerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.1

        /* renamed from: c */
        @Nullable
        public SparseArray<Parcelable> f34167c;

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: a */
        public void mo3073a(ViewGroup viewGroup, int i2, Object obj) {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding remove = BaseDivTabbedCardUi.this.f34159g.remove(viewGroup2);
            TAB_VIEW tab_view = remove.f34173d;
            if (tab_view != null) {
                BaseDivTabbedCardUi.this.mo17072c(tab_view);
                remove.f34173d = null;
            }
            BaseDivTabbedCardUi.this.f34160h.remove(Integer.valueOf(i2));
            viewGroup.removeView(viewGroup2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: c */
        public int mo4336c() {
            Input<TAB_DATA> input = BaseDivTabbedCardUi.this.f34165m;
            if (input == null) {
                return 0;
            }
            return input.mo17084a().size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: d */
        public int mo4337d(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: f */
        public Object mo3075f(ViewGroup viewGroup, int i2) {
            ViewGroup viewGroup2;
            BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding = BaseDivTabbedCardUi.this.f34160h.get(Integer.valueOf(i2));
            if (binding != null) {
                viewGroup2 = binding.f34170a;
                viewGroup2.getParent();
            } else {
                BaseDivTabbedCardUi baseDivTabbedCardUi = BaseDivTabbedCardUi.this;
                ViewGroup viewGroup3 = (ViewGroup) baseDivTabbedCardUi.f34153a.mo17400a(baseDivTabbedCardUi.f34161i);
                TAB_DATA tab_data = BaseDivTabbedCardUi.this.f34165m.mo17084a().get(i2);
                BaseDivTabbedCardUi baseDivTabbedCardUi2 = BaseDivTabbedCardUi.this;
                BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding2 = new Binding(viewGroup3, tab_data, i2, null);
                baseDivTabbedCardUi2.f34160h.put(Integer.valueOf(i2), binding2);
                viewGroup2 = viewGroup3;
                binding = binding2;
            }
            viewGroup.addView(viewGroup2);
            BaseDivTabbedCardUi.this.f34159g.put(viewGroup2, binding);
            if (i2 == BaseDivTabbedCardUi.this.f34155c.getCurrentItem()) {
                binding.m17474a();
            }
            SparseArray<Parcelable> sparseArray = this.f34167c;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: g */
        public boolean mo3076g(View view, Object obj) {
            return obj == view;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* renamed from: h */
        public void mo3077h(@Nullable Parcelable parcelable, @Nullable ClassLoader classLoader) {
            if (!(parcelable instanceof Bundle)) {
                this.f34167c = null;
                return;
            }
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(getClass().getClassLoader());
            this.f34167c = bundle.getSparseParcelableArray("div_tabs_child_states");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        /* renamed from: i */
        public Parcelable mo3078i() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>(BaseDivTabbedCardUi.this.f34159g.size());
            Iterator<ViewGroup> it = BaseDivTabbedCardUi.this.f34159g.keySet().iterator();
            while (it.hasNext()) {
                it.next().saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    };

    /* renamed from: l */
    public boolean f34164l = false;

    /* renamed from: m */
    public Input<TAB_DATA> f34165m = null;

    /* renamed from: n */
    public boolean f34166n = false;

    public interface AbstractTabBar<ACTION> {

        public interface Host<ACTION> {
            /* renamed from: a */
            void mo17472a(@NonNull ACTION action, int i2);

            /* renamed from: b */
            void mo17473b(int i2, boolean z);
        }

        /* renamed from: a */
        void mo17467a(@NonNull List<? extends Input.TabBase<ACTION>> list, int i2, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber);

        /* renamed from: b */
        void mo17468b(int i2, float f2);

        /* renamed from: c */
        void mo17469c(int i2);

        /* renamed from: d */
        void mo17470d(int i2);

        /* renamed from: e */
        void mo17471e(@NonNull ViewPool viewPool, @NonNull String str);

        @Nullable
        ViewPager.OnPageChangeListener getCustomPageChangeListener();

        void setHost(@NonNull Host<ACTION> host);

        void setTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider);
    }

    public interface ActiveTabClickListener<ACTION> {
        /* renamed from: a */
        void mo17081a(@NonNull ACTION action, int i2);
    }

    public class BaseTabTitleBarHost implements AbstractTabBar.Host<ACTION> {
        public BaseTabTitleBarHost(C29101 c29101) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        /* renamed from: a */
        public void mo17472a(@NonNull ACTION action, int i2) {
            BaseDivTabbedCardUi.this.f34162j.mo17081a(action, i2);
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseDivTabbedCardUi.AbstractTabBar.Host
        /* renamed from: b */
        public void mo17473b(int i2, boolean z) {
            if (z) {
                BaseDivTabbedCardUi.this.f34164l = true;
            }
            BaseDivTabbedCardUi.this.f34155c.setCurrentItem(i2);
        }
    }

    public class Binding {

        /* renamed from: a */
        @NonNull
        public final ViewGroup f34170a;

        /* renamed from: b */
        @NonNull
        public final TAB_DATA f34171b;

        /* renamed from: c */
        public final int f34172c;

        /* renamed from: d */
        @Nullable
        public TAB_VIEW f34173d;

        /* JADX WARN: Multi-variable type inference failed */
        public Binding(ViewGroup viewGroup, Input.TabBase tabBase, int i2, C29101 c29101) {
            this.f34170a = viewGroup;
            this.f34171b = tabBase;
            this.f34172c = i2;
        }

        /* renamed from: a */
        public void m17474a() {
            if (this.f34173d != null) {
                return;
            }
            this.f34173d = (TAB_VIEW) BaseDivTabbedCardUi.this.mo17071a(this.f34170a, this.f34171b, this.f34172c);
        }
    }

    public class DataBindingTransformer implements ViewPager.PageTransformer {
        public DataBindingTransformer(C29101 c29101) {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        /* renamed from: a */
        public void mo4373a(View view, float f2) {
            BaseDivTabbedCardUi<TAB_DATA, TAB_VIEW, ACTION>.Binding binding;
            BaseDivTabbedCardUi baseDivTabbedCardUi = BaseDivTabbedCardUi.this;
            if (!baseDivTabbedCardUi.f34166n && f2 > -1.0f && f2 < 1.0f && (binding = baseDivTabbedCardUi.f34159g.get(view)) != null) {
                binding.m17474a();
            }
        }
    }

    public interface Input<TAB extends TabBase> {

        public interface SimpleTab<ITM, ACTION> extends TabBase<ACTION> {
        }

        public interface TabBase<ACTION> {
            @Nullable
            /* renamed from: a */
            ACTION mo17069a();

            @Nullable
            /* renamed from: b */
            Integer mo17070b();

            String getTitle();
        }

        @NonNull
        /* renamed from: a */
        List<? extends TAB> mo17084a();
    }

    public class PagerChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public int f34176a = 0;

        public PagerChangeListener(C29101 c29101) {
        }

        /* renamed from: a */
        public final void m17475a(int i2) {
            BaseDivTabbedCardUi baseDivTabbedCardUi = BaseDivTabbedCardUi.this;
            ViewPagerFixedSizeLayout.HeightCalculator heightCalculator = baseDivTabbedCardUi.f34158f;
            if (heightCalculator == null || baseDivTabbedCardUi.f34157e == null) {
                return;
            }
            heightCalculator.mo17462a(i2, 0.0f);
            BaseDivTabbedCardUi.this.f34157e.requestLayout();
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: b */
        public void mo4343b(int i2) {
            BaseDivTabbedCardUi baseDivTabbedCardUi = BaseDivTabbedCardUi.this;
            if (baseDivTabbedCardUi.f34158f == null) {
                baseDivTabbedCardUi.f34155c.requestLayout();
            } else if (this.f34176a == 0) {
                m17475a(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: c */
        public void mo4344c(int i2, float f2, int i3) {
            ViewPagerFixedSizeLayout.HeightCalculator heightCalculator;
            if (this.f34176a != 0) {
                BaseDivTabbedCardUi baseDivTabbedCardUi = BaseDivTabbedCardUi.this;
                if (baseDivTabbedCardUi.f34157e != null && (heightCalculator = baseDivTabbedCardUi.f34158f) != null && heightCalculator.mo17503b(i2, f2)) {
                    BaseDivTabbedCardUi.this.f34158f.mo17462a(i2, f2);
                    if (BaseDivTabbedCardUi.this.f34157e.isInLayout()) {
                        final ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = BaseDivTabbedCardUi.this.f34157e;
                        Objects.requireNonNull(viewPagerFixedSizeLayout);
                        viewPagerFixedSizeLayout.post(new Runnable() { // from class: com.yandex.div.internal.widget.tabs.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                ViewPagerFixedSizeLayout.this.requestLayout();
                            }
                        });
                    } else {
                        BaseDivTabbedCardUi.this.f34157e.requestLayout();
                    }
                }
            }
            BaseDivTabbedCardUi baseDivTabbedCardUi2 = BaseDivTabbedCardUi.this;
            if (baseDivTabbedCardUi2.f34164l) {
                return;
            }
            baseDivTabbedCardUi2.f34154b.mo17468b(i2, f2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        /* renamed from: d */
        public void mo4345d(int i2) {
            this.f34176a = i2;
            if (i2 == 0) {
                int currentItem = BaseDivTabbedCardUi.this.f34155c.getCurrentItem();
                m17475a(currentItem);
                BaseDivTabbedCardUi baseDivTabbedCardUi = BaseDivTabbedCardUi.this;
                if (!baseDivTabbedCardUi.f34164l) {
                    baseDivTabbedCardUi.f34154b.mo17469c(currentItem);
                }
                BaseDivTabbedCardUi.this.f34164l = false;
            }
        }
    }

    public static class TabbedCardConfig {

        /* renamed from: a */
        @IdRes
        public final int f34178a;

        /* renamed from: b */
        @IdRes
        public final int f34179b;

        /* renamed from: c */
        @IdRes
        public final int f34180c;

        /* renamed from: d */
        public final boolean f34181d;

        /* renamed from: e */
        public final boolean f34182e;

        /* renamed from: f */
        @NonNull
        public final String f34183f;

        /* renamed from: g */
        @NonNull
        public final String f34184g;

        public TabbedCardConfig(@IdRes int i2, @IdRes int i3, @IdRes int i4, boolean z, boolean z2, @NonNull String str, @NonNull String str2) {
            this.f34178a = i2;
            this.f34179b = i3;
            this.f34180c = i4;
            this.f34181d = z;
            this.f34182e = z2;
            this.f34183f = str;
            this.f34184g = str2;
        }
    }

    public BaseDivTabbedCardUi(@NonNull ViewPool viewPool, @NonNull View view, @NonNull TabbedCardConfig tabbedCardConfig, @NonNull HeightCalculatorFactory heightCalculatorFactory, @NonNull TabTextStyleProvider tabTextStyleProvider, @Nullable ViewPager.OnPageChangeListener onPageChangeListener, @NonNull ActiveTabClickListener<ACTION> activeTabClickListener) {
        this.f34153a = viewPool;
        this.f34156d = heightCalculatorFactory;
        this.f34162j = activeTabClickListener;
        BaseTabTitleBarHost baseTabTitleBarHost = new BaseTabTitleBarHost(null);
        String str = tabbedCardConfig.f34183f;
        String str2 = tabbedCardConfig.f34184g;
        this.f34161i = str2;
        AbstractTabBar<ACTION> abstractTabBar = (AbstractTabBar) Views.m17399a(view, tabbedCardConfig.f34178a);
        this.f34154b = abstractTabBar;
        abstractTabBar.setHost(baseTabTitleBarHost);
        abstractTabBar.setTypefaceProvider(tabTextStyleProvider.f34271a);
        abstractTabBar.mo17471e(viewPool, str);
        ScrollableViewPager scrollableViewPager = (ScrollableViewPager) Views.m17399a(view, tabbedCardConfig.f34179b);
        this.f34155c = scrollableViewPager;
        scrollableViewPager.setAdapter(null);
        List<ViewPager.OnPageChangeListener> list = scrollableViewPager.f6542S;
        if (list != null) {
            list.clear();
        }
        scrollableViewPager.m4348b(new PagerChangeListener(null));
        ViewPager.OnPageChangeListener customPageChangeListener = abstractTabBar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            scrollableViewPager.m4348b(customPageChangeListener);
        }
        scrollableViewPager.m4348b(onPageChangeListener);
        scrollableViewPager.setScrollEnabled(tabbedCardConfig.f34181d);
        scrollableViewPager.setEdgeScrollEnabled(tabbedCardConfig.f34182e);
        scrollableViewPager.m4372z(false, new DataBindingTransformer(null));
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = (ViewPagerFixedSizeLayout) Views.m17399a(view, tabbedCardConfig.f34180c);
        this.f34157e = viewPagerFixedSizeLayout;
        ViewPagerFixedSizeLayout.HeightCalculator mo17504b = this.f34156d.mo17504b((ViewGroup) viewPool.mo17400a(str2), new C2917b(this), new C2917b(this));
        this.f34158f = mo17504b;
        viewPagerFixedSizeLayout.setHeightCalculator(mo17504b);
    }

    @NonNull
    /* renamed from: a */
    public abstract TAB_VIEW mo17071a(@NonNull ViewGroup viewGroup, @NonNull TAB_DATA tab_data, int i2);

    /* renamed from: b */
    public void m17466b(@Nullable Input<TAB_DATA> input, @NonNull ExpressionResolver expressionResolver, @NonNull ExpressionSubscriber expressionSubscriber) {
        int min = Math.min(this.f34155c.getCurrentItem(), input.mo17084a().size() - 1);
        this.f34160h.clear();
        this.f34165m = input;
        if (this.f34155c.getAdapter() != null) {
            this.f34166n = true;
            try {
                PagerAdapter pagerAdapter = this.f34163k;
                synchronized (pagerAdapter) {
                    DataSetObserver dataSetObserver = pagerAdapter.f6505b;
                    if (dataSetObserver != null) {
                        dataSetObserver.onChanged();
                    }
                }
                pagerAdapter.f6504a.notifyChanged();
            } finally {
                this.f34166n = false;
            }
        }
        List<? extends TAB_DATA> mo17084a = input.mo17084a();
        this.f34154b.mo17467a(mo17084a, min, expressionResolver, expressionSubscriber);
        if (this.f34155c.getAdapter() == null) {
            this.f34155c.setAdapter(this.f34163k);
        } else if (!mo17084a.isEmpty() && min != -1) {
            this.f34155c.setCurrentItem(min);
            this.f34154b.mo17470d(min);
        }
        ViewPagerFixedSizeLayout.HeightCalculator heightCalculator = this.f34158f;
        if (heightCalculator != null) {
            heightCalculator.mo17464d();
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = this.f34157e;
        if (viewPagerFixedSizeLayout != null) {
            viewPagerFixedSizeLayout.requestLayout();
        }
    }

    /* renamed from: c */
    public abstract void mo17072c(@NonNull TAB_VIEW tab_view);
}

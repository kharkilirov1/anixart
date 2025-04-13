package com.yandex.div.core.view2.items;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.widget.tabs.ScrollableViewPager;
import com.yandex.div.internal.widget.tabs.TabsLayout;
import com.yandex.div2.DivGallery;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivViewWithItems.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems;", "", "Companion", "Gallery", "Pager", "PagingGallery", "Tabs", "Lcom/yandex/div/core/view2/items/DivViewWithItems$PagingGallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Gallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Pager;", "Lcom/yandex/div/core/view2/items/DivViewWithItems$Tabs;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivViewWithItems {

    /* compiled from: DivViewWithItems.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* compiled from: DivViewWithItems.kt */
        @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 176)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[DivGallery.ScrollMode.values().length];
                DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.DEFAULT;
                iArr[1] = 1;
                DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
                iArr[0] = 2;
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Gallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Gallery extends DivViewWithItems {

        /* renamed from: a */
        @NotNull
        public final DivRecyclerView f32923a;

        /* renamed from: b */
        @NotNull
        public final Direction f32924b;

        public Gallery(@NotNull DivRecyclerView divRecyclerView, @NotNull Direction direction) {
            super(null);
            this.f32923a = divRecyclerView;
            this.f32924b = direction;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: a */
        public int mo17124a() {
            return DivViewWithItemsKt.m17127a(this.f32923a, this.f32924b);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: b */
        public int mo17125b() {
            RecyclerView.LayoutManager layoutManager = this.f32923a.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.m3883a0();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: c */
        public void mo17126c(int i2) {
            int mo17125b = mo17125b();
            if (i2 < 0 || i2 >= mo17125b) {
                int i3 = Assert.f33709a;
                return;
            }
            final Context context = this.f32923a.getContext();
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$currentItem$1$smoothScroller$1

                /* renamed from: q */
                public final float f32925q = 50.0f;

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                /* renamed from: i */
                public float mo3721i(@NotNull DisplayMetrics displayMetrics) {
                    Intrinsics.m32179h(displayMetrics, "displayMetrics");
                    return this.f32925q / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                /* renamed from: l */
                public int mo3724l() {
                    return -1;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                /* renamed from: m */
                public int mo3725m() {
                    return -1;
                }
            };
            linearSmoothScroller.f5606a = i2;
            RecyclerView.LayoutManager layoutManager = this.f32923a.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            layoutManager.m3890e1(linearSmoothScroller);
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Pager;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Pager extends DivViewWithItems {

        /* renamed from: a */
        @NotNull
        public final DivPagerView f32926a;

        public Pager(@NotNull DivPagerView divPagerView) {
            super(null);
            this.f32926a = divPagerView;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: a */
        public int mo17124a() {
            return this.f32926a.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: b */
        public int mo17125b() {
            RecyclerView.Adapter adapter = this.f32926a.getViewPager().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: c */
        public void mo17126c(int i2) {
            int mo17125b = mo17125b();
            if (i2 < 0 || i2 >= mo17125b) {
                int i3 = Assert.f33709a;
            } else {
                this.f32926a.getViewPager().m4391e(i2, true);
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$PagingGallery;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class PagingGallery extends DivViewWithItems {

        /* renamed from: a */
        @NotNull
        public final DivRecyclerView f32927a;

        /* renamed from: b */
        @NotNull
        public final Direction f32928b;

        public PagingGallery(@NotNull DivRecyclerView divRecyclerView, @NotNull Direction direction) {
            super(null);
            this.f32927a = divRecyclerView;
            this.f32928b = direction;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: a */
        public int mo17124a() {
            return DivViewWithItemsKt.m17127a(this.f32927a, this.f32928b);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: b */
        public int mo17125b() {
            RecyclerView.LayoutManager layoutManager = this.f32927a.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.m3883a0();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: c */
        public void mo17126c(int i2) {
            int mo17125b = mo17125b();
            if (i2 < 0 || i2 >= mo17125b) {
                int i3 = Assert.f33709a;
            } else {
                this.f32927a.m3826w0(i2);
            }
        }
    }

    /* compiled from: DivViewWithItems.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/items/DivViewWithItems$Tabs;", "Lcom/yandex/div/core/view2/items/DivViewWithItems;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Tabs extends DivViewWithItems {

        /* renamed from: a */
        @NotNull
        public final TabsLayout f32929a;

        public Tabs(@NotNull TabsLayout tabsLayout) {
            super(null);
            this.f32929a = tabsLayout;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: a */
        public int mo17124a() {
            return this.f32929a.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: b */
        public int mo17125b() {
            PagerAdapter adapter = this.f32929a.getViewPager().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.mo4336c();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        /* renamed from: c */
        public void mo17126c(int i2) {
            int mo17125b = mo17125b();
            if (i2 < 0 || i2 >= mo17125b) {
                int i3 = Assert.f33709a;
                return;
            }
            ScrollableViewPager viewPager = this.f32929a.getViewPager();
            viewPager.f6573w = false;
            viewPager.m4371y(i2, true, false, 0);
        }
    }

    public DivViewWithItems() {
    }

    /* renamed from: a */
    public abstract int mo17124a();

    /* renamed from: b */
    public abstract int mo17125b();

    /* renamed from: c */
    public abstract void mo17126c(int i2);

    public DivViewWithItems(DefaultConstructorMarker defaultConstructorMarker) {
    }
}

package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.PagerState;
import com.yandex.div.core.state.UpdateStateChangePageCallback;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.DivPagerBinder;
import com.yandex.div.core.view2.divs.PagerSelectedActionsDispatcher;
import com.yandex.div.core.view2.divs.PagerSelectedActionsDispatcher.PageSelectionTracker;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.PageItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivPageSize;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
import com.yandex.div2.DivPercentageSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivPagerBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPagerBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivPager;", "Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "PageChangeCallback", "PageLayout", "PagerAdapter", "PagerViewHolder", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivPagerBinder implements DivViewBinder<DivPager, DivPagerView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32236a;

    /* renamed from: b */
    @NotNull
    public final DivViewCreator f32237b;

    /* renamed from: c */
    @NotNull
    public final Provider<DivBinder> f32238c;

    /* renamed from: d */
    @NotNull
    public final DivPatchCache f32239d;

    /* renamed from: e */
    @NotNull
    public final DivActionBinder f32240e;

    /* renamed from: f */
    @NotNull
    public final PagerIndicatorConnector f32241f;

    /* renamed from: g */
    @Nullable
    public ViewPager2.OnPageChangeCallback f32242g;

    /* renamed from: h */
    @Nullable
    public ViewPager2.OnPageChangeCallback f32243h;

    /* renamed from: i */
    @Nullable
    public PagerSelectedActionsDispatcher f32244i;

    /* compiled from: DivPagerBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPagerBinder$PageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class PageChangeCallback extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        @NotNull
        public final DivPager f32248a;

        /* renamed from: b */
        @NotNull
        public final Div2View f32249b;

        /* renamed from: c */
        @NotNull
        public final RecyclerView f32250c;

        /* renamed from: d */
        public int f32251d = -1;

        /* renamed from: e */
        public final int f32252e;

        /* renamed from: f */
        public int f32253f;

        public PageChangeCallback(@NotNull DivPager divPager, @NotNull Div2View div2View, @NotNull RecyclerView recyclerView) {
            this.f32248a = divPager;
            this.f32249b = div2View;
            this.f32250c = recyclerView;
            this.f32252e = div2View.getConfig().mo16606f();
        }

        /* renamed from: a */
        public final void m17018a() {
            Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(this.f32250c)).iterator();
            while (it.hasNext()) {
                View next = it.next();
                int m3782P = this.f32250c.m3782P(next);
                if (m3782P == -1) {
                    int i2 = Assert.f33709a;
                    return;
                }
                Div div = this.f32248a.f37799o.get(m3782P);
                DivVisibilityActionTracker mo16644p = this.f32249b.getDiv2Component().mo16644p();
                Intrinsics.m32178g(mo16644p, "divView.div2Component.visibilityActionTracker");
                mo16644p.m16876d(this.f32249b, next, div, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div.m17557a()) : null);
            }
        }

        /* renamed from: b */
        public final void m17019b() {
            if (SequencesKt.m33837e(ViewGroupKt.m2377b(this.f32250c)) > 0) {
                m17018a();
                return;
            }
            RecyclerView recyclerView = this.f32250c;
            if (!ViewsKt.m16768b(recyclerView) || recyclerView.isLayoutRequested()) {
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivPagerBinder$PageChangeCallback$trackVisibleViews$$inlined$doOnActualLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        Intrinsics.m32179h(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        DivPagerBinder.PageChangeCallback.this.m17018a();
                    }
                });
            } else {
                m17018a();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i2, float f2, int i3) {
            super.onPageScrolled(i2, f2, i3);
            int i4 = this.f32252e;
            if (i4 <= 0) {
                RecyclerView.LayoutManager layoutManager = this.f32250c.getLayoutManager();
                i4 = (layoutManager == null ? 0 : layoutManager.f5577q) / 20;
            }
            int i5 = this.f32253f + i3;
            this.f32253f = i5;
            if (i5 > i4) {
                this.f32253f = 0;
                m17019b();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i2) {
            super.onPageSelected(i2);
            m17019b();
            int i3 = this.f32251d;
            if (i2 == i3) {
                return;
            }
            if (i3 != -1) {
                this.f32249b.m16809G(this.f32250c);
                this.f32249b.getDiv2Component().mo16637i().mo16574i(this.f32249b, this.f32248a, i2, i2 > this.f32251d ? "next" : "back");
            }
            Div div = this.f32248a.f37799o.get(i2);
            if (BaseDivViewExtensionsKt.m16912B(div.m17557a())) {
                this.f32249b.m16814o(this.f32250c, div);
            }
            this.f32251d = i2;
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPagerBinder$PageLayout;", "Landroid/widget/FrameLayout;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class PageLayout extends FrameLayout {
        public PageLayout(@NotNull Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            if (getChildCount() == 0 || getChildAt(0).getLayoutParams().height != -1) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                super.onMeasure(i2, i3);
            }
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPagerBinder$PagerAdapter;", "Lcom/yandex/div/core/view2/divs/DivPatchableAdapter;", "Lcom/yandex/div/core/view2/divs/DivPagerBinder$PagerViewHolder;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class PagerAdapter extends DivPatchableAdapter<PagerViewHolder> {

        /* renamed from: h */
        @NotNull
        public final Div2View f32254h;

        /* renamed from: i */
        @NotNull
        public final DivBinder f32255i;

        /* renamed from: j */
        @NotNull
        public final Function2<PagerViewHolder, Integer, Unit> f32256j;

        /* renamed from: k */
        @NotNull
        public final DivViewCreator f32257k;

        /* renamed from: l */
        @NotNull
        public final DivStatePath f32258l;

        /* renamed from: m */
        @NotNull
        public final ReleaseViewVisitor f32259m;

        /* renamed from: n */
        @NotNull
        public final List<Disposable> f32260n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PagerAdapter(@NotNull List<? extends Div> divs, @NotNull Div2View div2View, @NotNull DivBinder divBinder, @NotNull Function2<? super PagerViewHolder, ? super Integer, Unit> function2, @NotNull DivViewCreator viewCreator, @NotNull DivStatePath divStatePath, @NotNull ReleaseViewVisitor visitor) {
            super(divs, div2View);
            Intrinsics.m32179h(divs, "divs");
            Intrinsics.m32179h(viewCreator, "viewCreator");
            Intrinsics.m32179h(visitor, "visitor");
            this.f32254h = div2View;
            this.f32255i = divBinder;
            this.f32256j = function2;
            this.f32257k = viewCreator;
            this.f32258l = divStatePath;
            this.f32259m = visitor;
            this.f32260n = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f32290c.size();
        }

        @Override // com.yandex.div.internal.core.ExpressionSubscriber
        @NotNull
        public List<Disposable> getSubscriptions() {
            return this.f32260n;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            View m16868n;
            PagerViewHolder holder = (PagerViewHolder) viewHolder;
            Intrinsics.m32179h(holder, "holder");
            Div div = this.f32290c.get(i2);
            Div2View div2View = this.f32254h;
            DivStatePath path = this.f32258l;
            Intrinsics.m32179h(div2View, "div2View");
            Intrinsics.m32179h(div, "div");
            Intrinsics.m32179h(path, "path");
            ExpressionResolver expressionResolver = div2View.getExpressionResolver();
            if (holder.f32264d != null) {
                if ((holder.f32261a.getChildCount() != 0) && DivComparator.f31728a.m16881b(holder.f32264d, div, expressionResolver)) {
                    m16868n = ViewGroupKt.m2376a(holder.f32261a, 0);
                    holder.f32264d = div;
                    holder.f32262b.m16852b(m16868n, div, div2View, path);
                    this.f32256j.invoke(holder, Integer.valueOf(i2));
                }
            }
            m16868n = holder.f32263c.m16868n(div, expressionResolver);
            ReleaseUtils.f32861a.m17110a(holder.f32261a, div2View);
            holder.f32261a.addView(m16868n);
            holder.f32264d = div;
            holder.f32262b.m16852b(m16868n, div, div2View, path);
            this.f32256j.invoke(holder, Integer.valueOf(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
            Intrinsics.m32179h(parent, "parent");
            Context context = this.f32254h.getContext();
            Intrinsics.m32178g(context, "div2View.context");
            PageLayout pageLayout = new PageLayout(context);
            pageLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new PagerViewHolder(pageLayout, this.f32255i, this.f32257k, this.f32259m);
        }
    }

    /* compiled from: DivPagerBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPagerBinder$PagerViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class PagerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        @NotNull
        public final FrameLayout f32261a;

        /* renamed from: b */
        @NotNull
        public final DivBinder f32262b;

        /* renamed from: c */
        @NotNull
        public final DivViewCreator f32263c;

        /* renamed from: d */
        @Nullable
        public Div f32264d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PagerViewHolder(@NotNull FrameLayout frameLayout, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator, @NotNull ReleaseViewVisitor visitor) {
            super(frameLayout);
            Intrinsics.m32179h(divBinder, "divBinder");
            Intrinsics.m32179h(viewCreator, "viewCreator");
            Intrinsics.m32179h(visitor, "visitor");
            this.f32261a = frameLayout;
            this.f32262b = divBinder;
            this.f32263c = viewCreator;
        }
    }

    @Inject
    public DivPagerBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull Provider<DivBinder> divBinder, @NotNull DivPatchCache divPatchCache, @NotNull DivActionBinder divActionBinder, @NotNull PagerIndicatorConnector pagerIndicatorConnector) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(viewCreator, "viewCreator");
        Intrinsics.m32179h(divBinder, "divBinder");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        Intrinsics.m32179h(divActionBinder, "divActionBinder");
        Intrinsics.m32179h(pagerIndicatorConnector, "pagerIndicatorConnector");
        this.f32236a = baseBinder;
        this.f32237b = viewCreator;
        this.f32238c = divBinder;
        this.f32239d = divPatchCache;
        this.f32240e = divActionBinder;
        this.f32241f = pagerIndicatorConnector;
    }

    /* renamed from: a */
    public static final void m17013a(DivPagerBinder divPagerBinder, DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver) {
        Objects.requireNonNull(divPagerBinder);
        DisplayMetrics metrics = divPagerView.getResources().getDisplayMetrics();
        DivFixedSize divFixedSize = divPager.f37798n;
        Intrinsics.m32178g(metrics, "metrics");
        float m16938a0 = BaseDivViewExtensionsKt.m16938a0(divFixedSize, metrics, expressionResolver);
        float m17016d = divPagerBinder.m17016d(divPager, divPagerView, expressionResolver);
        ViewPager2 viewPager = divPagerView.getViewPager();
        PageItemDecoration pageItemDecoration = new PageItemDecoration(BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35620b.mo17535b(expressionResolver), metrics), BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35621c.mo17535b(expressionResolver), metrics), BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35622d.mo17535b(expressionResolver), metrics), BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35619a.mo17535b(expressionResolver), metrics), m17016d, m16938a0, divPager.f37802r.mo17535b(expressionResolver) == DivPager.Orientation.HORIZONTAL ? 0 : 1);
        int itemDecorationCount = viewPager.getItemDecorationCount();
        for (int i2 = 0; i2 < itemDecorationCount; i2++) {
            viewPager.f6649k.m3807m0(i2);
        }
        viewPager.f6649k.mo3802k(pageItemDecoration);
        Integer m17017e = divPagerBinder.m17017e(divPager, expressionResolver);
        if ((!(m17016d == 0.0f) || (m17017e != null && m17017e.intValue() < 100)) && divPagerView.getViewPager().getOffscreenPageLimit() != 1) {
            divPagerView.getViewPager().setOffscreenPageLimit(1);
        }
    }

    /* renamed from: b */
    public static final void m17014b(final DivPagerBinder divPagerBinder, final DivPagerView divPagerView, final DivPager divPager, final ExpressionResolver expressionResolver, final SparseArray sparseArray) {
        Objects.requireNonNull(divPagerBinder);
        DisplayMetrics metrics = divPagerView.getResources().getDisplayMetrics();
        final DivPager.Orientation mo17535b = divPager.f37802r.mo17535b(expressionResolver);
        final Integer m17017e = divPagerBinder.m17017e(divPager, expressionResolver);
        DivFixedSize divFixedSize = divPager.f37798n;
        Intrinsics.m32178g(metrics, "metrics");
        final float m16938a0 = BaseDivViewExtensionsKt.m16938a0(divFixedSize, metrics, expressionResolver);
        DivPager.Orientation orientation = DivPager.Orientation.HORIZONTAL;
        final float m16962v = mo17535b == orientation ? BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35620b.mo17535b(expressionResolver), metrics) : BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35622d.mo17535b(expressionResolver), metrics);
        final float m16962v2 = mo17535b == orientation ? BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35621c.mo17535b(expressionResolver), metrics) : BaseDivViewExtensionsKt.m16962v(divPager.f37803s.f35619a.mo17535b(expressionResolver), metrics);
        divPagerView.getViewPager().setPageTransformer(new ViewPager2.PageTransformer() { // from class: com.yandex.div.core.view2.divs.f
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
            
                if (r21 <= 1.0f) goto L78;
             */
            @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void mo4381a(android.view.View r20, float r21) {
                /*
                    Method dump skipped, instructions count: 367
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.C2876f.mo4381a(android.view.View, float):void");
            }
        });
    }

    /* renamed from: c */
    public void m17015c(@NotNull final DivPagerView view, @NotNull final DivPager div, @NotNull Div2View divView, @NotNull DivStatePath path) {
        int intValue;
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(path, "path");
        String str = div.f37797m;
        if (str != null) {
            PagerIndicatorConnector pagerIndicatorConnector = this.f32241f;
            Objects.requireNonNull(pagerIndicatorConnector);
            pagerIndicatorConnector.f32534a.put(str, view);
        }
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        DivPager div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            RecyclerView.Adapter adapter = view.getViewPager().getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.DivPagerBinder.PagerAdapter");
            PagerAdapter pagerAdapter = (PagerAdapter) adapter;
            pagerAdapter.m17020k(this.f32239d);
            pagerAdapter.notifyItemRangeChanged(0, pagerAdapter.getItemCount());
            return;
        }
        ExpressionSubscriber m16765a = ReleasablesKt.m16765a(view);
        m16765a.mo16764h();
        view.setDiv$div_release(div);
        if (div2 != null) {
            this.f32236a.m16988i(view, div2, divView);
        }
        this.f32236a.m16984e(view, div, div2, divView);
        final SparseArray sparseArray = new SparseArray();
        view.setRecycledViewPool(new ReleasingViewPool(divView.getReleaseViewVisitor$div_release()));
        ViewPager2 viewPager = view.getViewPager();
        List<Div> list = div.f37799o;
        DivBinder divBinder = this.f32238c.get();
        Intrinsics.m32178g(divBinder, "divBinder.get()");
        viewPager.setAdapter(new PagerAdapter(list, divView, divBinder, new Function2<PagerViewHolder, Integer, Unit>() { // from class: com.yandex.div.core.view2.divs.DivPagerBinder$bindView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(DivPagerBinder.PagerViewHolder pagerViewHolder, Integer num) {
                DivPagerBinder.PagerViewHolder holder = pagerViewHolder;
                int intValue2 = num.intValue();
                Intrinsics.m32179h(holder, "holder");
                Float f2 = sparseArray.get(intValue2);
                if (f2 != null) {
                    DivPager divPager = div;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    float floatValue = f2.floatValue();
                    if (divPager.f37802r.mo17535b(expressionResolver2) == DivPager.Orientation.HORIZONTAL) {
                        holder.itemView.setTranslationX(floatValue);
                    } else {
                        holder.itemView.setTranslationY(floatValue);
                    }
                }
                return Unit.f63088a;
            }
        }, this.f32237b, path, divView.getReleaseViewVisitor$div_release()));
        Function1<? super Long, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.DivPagerBinder$bindView$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivPagerBinder.m17013a(DivPagerBinder.this, view, div, expressionResolver);
                DivPagerBinder.m17014b(DivPagerBinder.this, view, div, expressionResolver, sparseArray);
                return Unit.f63088a;
            }
        };
        m16765a.mo16763e(div.f37803s.f35620b.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f37803s.f35621c.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f37803s.f35622d.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f37803s.f35619a.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f37798n.f35795b.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f37798n.f35794a.mo17537e(expressionResolver, function1));
        DivPagerLayoutMode divPagerLayoutMode = div.f37800p;
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.NeighbourPageSize) {
            DivPagerLayoutMode.NeighbourPageSize neighbourPageSize = (DivPagerLayoutMode.NeighbourPageSize) divPagerLayoutMode;
            m16765a.mo16763e(neighbourPageSize.f37826c.f37719a.f35795b.mo17537e(expressionResolver, function1));
            m16765a.mo16763e(neighbourPageSize.f37826c.f37719a.f35794a.mo17537e(expressionResolver, function1));
        } else {
            if (!(divPagerLayoutMode instanceof DivPagerLayoutMode.PageSize)) {
                throw new NoWhenBranchMatchedException();
            }
            m16765a.mo16763e(((DivPagerLayoutMode.PageSize) divPagerLayoutMode).f37827c.f37741a.f38019a.mo17537e(expressionResolver, function1));
            m16765a.mo16763e(new DivPagerBinder$observeWidthChange$1(view.getViewPager(), function1));
        }
        m16765a.mo16763e(div.f37802r.mo17538f(expressionResolver, new Function1<DivPager.Orientation, Unit>() { // from class: com.yandex.div.core.view2.divs.DivPagerBinder$bindView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DivPager.Orientation orientation) {
                DivPager.Orientation it = orientation;
                Intrinsics.m32179h(it, "it");
                DivPagerView.this.setOrientation(it == DivPager.Orientation.HORIZONTAL ? 0 : 1);
                DivPagerBinder.m17014b(this, DivPagerView.this, div, expressionResolver, sparseArray);
                DivPagerBinder.m17013a(this, DivPagerView.this, div, expressionResolver);
                return Unit.f63088a;
            }
        }));
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher = this.f32244i;
        if (pagerSelectedActionsDispatcher != null) {
            ViewPager2 viewPager2 = view.getViewPager();
            Intrinsics.m32179h(viewPager2, "viewPager");
            ViewPager2.OnPageChangeCallback onPageChangeCallback = pagerSelectedActionsDispatcher.f32540d;
            if (onPageChangeCallback != null) {
                viewPager2.m4393g(onPageChangeCallback);
            }
            pagerSelectedActionsDispatcher.f32540d = null;
        }
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = new PagerSelectedActionsDispatcher(divView, div, this.f32240e);
        ViewPager2 viewPager3 = view.getViewPager();
        Intrinsics.m32179h(viewPager3, "viewPager");
        PagerSelectedActionsDispatcher.PageSelectionTracker pageSelectionTracker = pagerSelectedActionsDispatcher2.new PageSelectionTracker();
        viewPager3.m4389c(pageSelectionTracker);
        pagerSelectedActionsDispatcher2.f32540d = pageSelectionTracker;
        this.f32244i = pagerSelectedActionsDispatcher2;
        if (this.f32243h != null) {
            ViewPager2 viewPager4 = view.getViewPager();
            ViewPager2.OnPageChangeCallback onPageChangeCallback2 = this.f32243h;
            Intrinsics.m32176e(onPageChangeCallback2);
            viewPager4.m4393g(onPageChangeCallback2);
        }
        View childAt = view.getViewPager().getChildAt(0);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.f32243h = new PageChangeCallback(div, divView, (RecyclerView) childAt);
        ViewPager2 viewPager5 = view.getViewPager();
        ViewPager2.OnPageChangeCallback onPageChangeCallback3 = this.f32243h;
        Intrinsics.m32176e(onPageChangeCallback3);
        viewPager5.m4389c(onPageChangeCallback3);
        DivViewState currentState = divView.getCurrentState();
        if (currentState != null) {
            String str2 = div.f37797m;
            if (str2 == null) {
                str2 = String.valueOf(div.hashCode());
            }
            PagerState pagerState = (PagerState) currentState.m16721a(str2);
            if (this.f32242g != null) {
                ViewPager2 viewPager6 = view.getViewPager();
                ViewPager2.OnPageChangeCallback onPageChangeCallback4 = this.f32242g;
                Intrinsics.m32176e(onPageChangeCallback4);
                viewPager6.m4393g(onPageChangeCallback4);
            }
            this.f32242g = new UpdateStateChangePageCallback(str2, currentState);
            ViewPager2 viewPager7 = view.getViewPager();
            ViewPager2.OnPageChangeCallback onPageChangeCallback5 = this.f32242g;
            Intrinsics.m32176e(onPageChangeCallback5);
            viewPager7.m4389c(onPageChangeCallback5);
            Integer valueOf = pagerState != null ? Integer.valueOf(pagerState.f31339a) : null;
            if (valueOf == null) {
                long longValue = div.f37792h.mo17535b(expressionResolver).longValue();
                long j2 = longValue >> 31;
                intValue = (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                intValue = valueOf.intValue();
            }
            view.setCurrentItem$div_release(intValue);
        }
        m16765a.mo16763e(div.f37804t.mo17538f(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivPagerBinder$bindView$7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Boolean bool) {
                DivPagerView.this.setOnInterceptTouchEventListener(bool.booleanValue() ? new ParentScrollRestrictor(1) : null);
                return Unit.f63088a;
            }
        }));
    }

    /* renamed from: d */
    public final float m17016d(DivPager divPager, DivPagerView divPagerView, ExpressionResolver expressionResolver) {
        DisplayMetrics metrics = divPagerView.getResources().getDisplayMetrics();
        DivPagerLayoutMode divPagerLayoutMode = divPager.f37800p;
        if (!(divPagerLayoutMode instanceof DivPagerLayoutMode.PageSize)) {
            if (!(divPagerLayoutMode instanceof DivPagerLayoutMode.NeighbourPageSize)) {
                throw new NoWhenBranchMatchedException();
            }
            DivFixedSize divFixedSize = ((DivPagerLayoutMode.NeighbourPageSize) divPagerLayoutMode).f37826c.f37719a;
            Intrinsics.m32178g(metrics, "metrics");
            return BaseDivViewExtensionsKt.m16938a0(divFixedSize, metrics, expressionResolver);
        }
        int width = divPager.f37802r.mo17535b(expressionResolver) == DivPager.Orientation.HORIZONTAL ? divPagerView.getViewPager().getWidth() : divPagerView.getViewPager().getHeight();
        int doubleValue = (int) ((DivPagerLayoutMode.PageSize) divPagerLayoutMode).f37827c.f37741a.f38019a.mo17535b(expressionResolver).doubleValue();
        DivFixedSize divFixedSize2 = divPager.f37798n;
        Intrinsics.m32178g(metrics, "metrics");
        float m16938a0 = BaseDivViewExtensionsKt.m16938a0(divFixedSize2, metrics, expressionResolver);
        float f2 = (1 - (doubleValue / 100.0f)) * width;
        float f3 = 2;
        return (f2 - (m16938a0 * f3)) / f3;
    }

    /* renamed from: e */
    public final Integer m17017e(DivPager divPager, ExpressionResolver expressionResolver) {
        DivPageSize divPageSize;
        DivPercentageSize divPercentageSize;
        Expression<Double> expression;
        Double mo17535b;
        DivPagerLayoutMode divPagerLayoutMode = divPager.f37800p;
        DivPagerLayoutMode.PageSize pageSize = divPagerLayoutMode instanceof DivPagerLayoutMode.PageSize ? (DivPagerLayoutMode.PageSize) divPagerLayoutMode : null;
        if (pageSize == null || (divPageSize = pageSize.f37827c) == null || (divPercentageSize = divPageSize.f37741a) == null || (expression = divPercentageSize.f38019a) == null || (mo17535b = expression.mo17535b(expressionResolver)) == null) {
            return null;
        }
        return Integer.valueOf((int) mo17535b.doubleValue());
    }
}

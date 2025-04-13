package com.yandex.div.core.view2.divs.gallery;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.GalleryState;
import com.yandex.div.core.state.UpdateStateScrollListener;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivPatchableAdapter;
import com.yandex.div.core.view2.divs.PagerSnapStartHelper;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitor;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.util.SizeKt;
import com.yandex.div.internal.widget.PaddingItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivGallery;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivGalleryBinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lcom/yandex/div2/DivGallery;", "Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "GalleryAdapter", "GalleryViewHolder", "ScrollListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@DivScope
/* loaded from: classes2.dex */
public final class DivGalleryBinder implements DivViewBinder<DivGallery, DivRecyclerView> {

    /* renamed from: a */
    @NotNull
    public final DivBaseBinder f32583a;

    /* renamed from: b */
    @NotNull
    public final DivViewCreator f32584b;

    /* renamed from: c */
    @NotNull
    public final Provider<DivBinder> f32585c;

    /* renamed from: d */
    @NotNull
    public final DivPatchCache f32586d;

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder$GalleryAdapter;", "Lcom/yandex/div/core/view2/divs/DivPatchableAdapter;", "Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder$GalleryViewHolder;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class GalleryAdapter extends DivPatchableAdapter<GalleryViewHolder> {

        /* renamed from: h */
        @NotNull
        public final Div2View f32587h;

        /* renamed from: i */
        @NotNull
        public final DivBinder f32588i;

        /* renamed from: j */
        @NotNull
        public final DivViewCreator f32589j;

        /* renamed from: k */
        @NotNull
        public final Function2<View, Div, Unit> f32590k;

        /* renamed from: l */
        @NotNull
        public final DivStatePath f32591l;

        /* renamed from: m */
        @NotNull
        public final WeakHashMap<Div, Long> f32592m;

        /* renamed from: n */
        public long f32593n;

        /* renamed from: o */
        @NotNull
        public final List<Disposable> f32594o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public GalleryAdapter(@NotNull List<? extends Div> divs, @NotNull Div2View div2View, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator, @NotNull Function2<? super View, ? super Div, Unit> function2, @NotNull DivStatePath divStatePath) {
            super(divs, div2View);
            Intrinsics.m32179h(divs, "divs");
            Intrinsics.m32179h(viewCreator, "viewCreator");
            this.f32587h = div2View;
            this.f32588i = divBinder;
            this.f32589j = viewCreator;
            this.f32590k = function2;
            this.f32591l = divStatePath;
            this.f32592m = new WeakHashMap<>();
            this.f32594o = new ArrayList();
            setHasStableIds(true);
            m17021l();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f32292e.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i2) {
            Div div = this.f32292e.get(i2);
            Long l2 = this.f32592m.get(div);
            if (l2 != null) {
                return l2.longValue();
            }
            long j2 = this.f32593n;
            this.f32593n = 1 + j2;
            this.f32592m.put(div, Long.valueOf(j2));
            return j2;
        }

        @Override // com.yandex.div.internal.core.ExpressionSubscriber
        @NotNull
        public List<Disposable> getSubscriptions() {
            return this.f32594o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            View m16868n;
            GalleryViewHolder holder = (GalleryViewHolder) viewHolder;
            Intrinsics.m32179h(holder, "holder");
            Div2View div2View = this.f32587h;
            Div div = this.f32292e.get(i2);
            DivStatePath path = this.f32591l;
            Intrinsics.m32179h(div2View, "div2View");
            Intrinsics.m32179h(div, "div");
            Intrinsics.m32179h(path, "path");
            ExpressionResolver expressionResolver = div2View.getExpressionResolver();
            if (holder.f32598d == null || holder.f32595a.getChild() == null || !DivComparator.f31728a.m16881b(holder.f32598d, div, expressionResolver)) {
                m16868n = holder.f32597c.m16868n(div, expressionResolver);
                ReleaseUtils.f32861a.m17110a(holder.f32595a, div2View);
                holder.f32595a.addView(m16868n);
            } else {
                m16868n = holder.f32595a.getChild();
                Intrinsics.m32176e(m16868n);
            }
            holder.f32598d = div;
            holder.f32596b.m16852b(m16868n, div, div2View, path);
            holder.f32595a.setTag(C2507R.id.div_gallery_item_index, Integer.valueOf(i2));
            this.f32588i.m16851a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
            Intrinsics.m32179h(parent, "parent");
            Context context = this.f32587h.getContext();
            Intrinsics.m32178g(context, "div2View.context");
            return new GalleryViewHolder(new DivViewWrapper(context, null, 0, 6), this.f32588i, this.f32589j);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            GalleryViewHolder holder = (GalleryViewHolder) viewHolder;
            Intrinsics.m32179h(holder, "holder");
            super.onViewAttachedToWindow(holder);
            Div div = holder.f32598d;
            if (div == null) {
                return;
            }
            this.f32590k.invoke(holder.f32595a, div);
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder$GalleryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class GalleryViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        @NotNull
        public final DivViewWrapper f32595a;

        /* renamed from: b */
        @NotNull
        public final DivBinder f32596b;

        /* renamed from: c */
        @NotNull
        public final DivViewCreator f32597c;

        /* renamed from: d */
        @Nullable
        public Div f32598d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GalleryViewHolder(@NotNull DivViewWrapper divViewWrapper, @NotNull DivBinder divBinder, @NotNull DivViewCreator viewCreator) {
            super(divViewWrapper);
            Intrinsics.m32179h(divBinder, "divBinder");
            Intrinsics.m32179h(viewCreator, "viewCreator");
            this.f32595a = divViewWrapper;
            this.f32596b = divBinder;
            this.f32597c = viewCreator;
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGalleryBinder$ScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class ScrollListener extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        @NotNull
        public final Div2View f32599a;

        /* renamed from: b */
        @NotNull
        public final DivRecyclerView f32600b;

        /* renamed from: c */
        @NotNull
        public final DivGalleryItemHelper f32601c;

        /* renamed from: d */
        @NotNull
        public final DivGallery f32602d;

        /* renamed from: e */
        public final int f32603e;

        /* renamed from: f */
        public int f32604f;

        /* renamed from: g */
        public boolean f32605g;

        /* renamed from: h */
        @NotNull
        public String f32606h = "next";

        public ScrollListener(@NotNull Div2View div2View, @NotNull DivRecyclerView divRecyclerView, @NotNull DivGalleryItemHelper divGalleryItemHelper, @NotNull DivGallery divGallery) {
            this.f32599a = div2View;
            this.f32600b = divRecyclerView;
            this.f32601c = divGalleryItemHelper;
            this.f32602d = divGallery;
            this.f32603e = div2View.getConfig().mo16606f();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        /* renamed from: a */
        public void mo3914a(@NotNull RecyclerView recyclerView, int i2) {
            if (i2 == 1) {
                this.f32605g = false;
            }
            if (i2 == 0) {
                this.f32599a.getDiv2Component().mo16637i().mo16580o(this.f32599a, this.f32602d, this.f32601c.mo3565j(), this.f32601c.mo3560d(), this.f32606h);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        /* renamed from: c */
        public void mo3586c(@NotNull RecyclerView recyclerView, int i2, int i3) {
            Intrinsics.m32179h(recyclerView, "recyclerView");
            int i4 = this.f32603e;
            if (!(i4 > 0)) {
                i4 = this.f32601c.mo3568n() / 20;
            }
            int abs = Math.abs(i3) + Math.abs(i2) + this.f32604f;
            this.f32604f = abs;
            if (abs <= i4) {
                return;
            }
            this.f32604f = 0;
            if (!this.f32605g) {
                this.f32605g = true;
                this.f32599a.getDiv2Component().mo16637i().mo16571f(this.f32599a);
                this.f32606h = (i2 > 0 || i3 > 0) ? "next" : "back";
            }
            Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(this.f32600b)).iterator();
            while (true) {
                ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                if (!viewGroupKt$iterator$1.hasNext()) {
                    return;
                }
                View view = (View) viewGroupKt$iterator$1.next();
                int m3782P = this.f32600b.m3782P(view);
                RecyclerView.Adapter adapter = this.f32600b.getAdapter();
                Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
                Div div = ((GalleryAdapter) adapter).f32290c.get(m3782P);
                DivVisibilityActionTracker mo16644p = this.f32599a.getDiv2Component().mo16644p();
                Intrinsics.m32178g(mo16644p, "divView.div2Component.visibilityActionTracker");
                mo16644p.m16876d(this.f32599a, view, div, (r5 & 8) != 0 ? BaseDivViewExtensionsKt.m16911A(div.m17557a()) : null);
            }
        }
    }

    /* compiled from: DivGalleryBinder.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DivGallery.ScrollMode.values().length];
            DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.DEFAULT;
            iArr[1] = 1;
            DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.PAGING;
            iArr[0] = 2;
            int[] iArr2 = new int[DivGallery.Orientation.values().length];
            DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
            iArr2[0] = 1;
            DivGallery.Orientation orientation2 = DivGallery.Orientation.VERTICAL;
            iArr2[1] = 2;
        }
    }

    @Inject
    public DivGalleryBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivViewCreator viewCreator, @NotNull Provider<DivBinder> divBinder, @NotNull DivPatchCache divPatchCache) {
        Intrinsics.m32179h(baseBinder, "baseBinder");
        Intrinsics.m32179h(viewCreator, "viewCreator");
        Intrinsics.m32179h(divBinder, "divBinder");
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        this.f32583a = baseBinder;
        this.f32584b = viewCreator;
        this.f32585c = divBinder;
        this.f32586d = divPatchCache;
    }

    /* renamed from: a */
    public final void m17054a(View view, List<? extends Div> list, Div2View div2View) {
        Div div;
        final ArrayList<DivStateLayout> arrayList = new ArrayList();
        DivViewVisitorKt.m17105a(new DivViewVisitor() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bindStates$divStateVisitor$1
            @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
            /* renamed from: n */
            public void mo16846n(@NotNull DivStateLayout divStateLayout) {
                arrayList.add(divStateLayout);
            }
        }, view);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DivStateLayout divStateLayout : arrayList) {
            DivStatePath path = divStateLayout.getPath();
            if (path != null) {
                Object obj = linkedHashMap.get(path);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(path, obj);
                }
                ((Collection) obj).add(divStateLayout);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivStatePath path2 = ((DivStateLayout) it.next()).getPath();
            if (path2 != null) {
                arrayList2.add(path2);
            }
        }
        for (DivStatePath divStatePath : DivPathUtils.f31323a.m16706a(arrayList2)) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    div = null;
                    break;
                }
                div = DivPathUtils.f31323a.m16708c((Div) it2.next(), divStatePath);
                if (div != null) {
                    break;
                }
            }
            List list2 = (List) linkedHashMap.get(divStatePath);
            if (div != null && list2 != null) {
                DivBinder divBinder = this.f32585c.get();
                DivStatePath m16719d = divStatePath.m16719d();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    divBinder.m16852b((DivStateLayout) it3.next(), div, div2View, m16719d);
                }
            }
        }
    }

    @SuppressLint
    /* renamed from: b */
    public void m17055b(@NotNull final DivRecyclerView view, @NotNull final DivGallery div, @NotNull final Div2View divView, @NotNull DivStatePath path) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(div, "div");
        Intrinsics.m32179h(divView, "divView");
        Intrinsics.m32179h(path, "path");
        DivGallery div2 = view.getDiv();
        if (Intrinsics.m32174c(div, div2)) {
            RecyclerView.Adapter adapter = view.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.GalleryAdapter");
            GalleryAdapter galleryAdapter = (GalleryAdapter) adapter;
            galleryAdapter.m17020k(this.f32586d);
            C6855a.m34406b(galleryAdapter);
            galleryAdapter.m17021l();
            m17054a(view, div.f35956r, divView);
            return;
        }
        if (div2 != null) {
            this.f32583a.m16988i(view, div2, divView);
        }
        ExpressionSubscriber m16765a = ReleasablesKt.m16765a(view);
        m16765a.mo16764h();
        this.f32583a.m16984e(view, div, div2, divView);
        final ExpressionResolver expressionResolver = divView.getExpressionResolver();
        Function1<? super DivGallery.Orientation, Unit> function1 = new Function1<Object, Unit>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bindView$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                DivGalleryBinder.this.m17056c(view, div, divView, expressionResolver);
                return Unit.f63088a;
            }
        };
        m16765a.mo16763e(div.f35958t.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f35962x.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f35955q.mo17537e(expressionResolver, function1));
        m16765a.mo16763e(div.f35960v.mo17537e(expressionResolver, function1));
        Expression<Long> expression = div.f35945g;
        if (expression != null) {
            m16765a.mo16763e(expression.mo17537e(expressionResolver, function1));
        }
        view.setRecycledViewPool(new ReleasingViewPool(divView.getReleaseViewVisitor$div_release()));
        view.setScrollingTouchSlop(1);
        view.setClipToPadding(false);
        view.setOverScrollMode(2);
        Function2<View, Div, Unit> function2 = new Function2<View, Div, Unit>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bindView$itemStateBinder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public Unit invoke(View view2, Div div3) {
                View itemView = view2;
                Div div4 = div3;
                Intrinsics.m32179h(itemView, "itemView");
                Intrinsics.m32179h(div4, "div");
                DivGalleryBinder.this.m17054a(itemView, CollectionsKt.m31993F(div4), divView);
                return Unit.f63088a;
            }
        };
        List<Div> list = div.f35956r;
        DivBinder divBinder = this.f32585c.get();
        Intrinsics.m32178g(divBinder, "divBinder.get()");
        view.setAdapter(new GalleryAdapter(list, divView, divBinder, this.f32584b, function2, path));
        view.setDiv(div);
        m17056c(view, div, divView, expressionResolver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView, com.yandex.div.core.view2.divs.widgets.DivRecyclerView] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.recyclerview.widget.DivLinearLayoutManager] */
    /* renamed from: c */
    public final void m17056c(DivRecyclerView divRecyclerView, DivGallery divGallery, Div2View div2View, ExpressionResolver expressionResolver) {
        Long mo17535b;
        PaddingItemDecoration paddingItemDecoration;
        int intValue;
        PagerSnapStartHelper pagerSnapStartHelper;
        DisplayMetrics metrics = divRecyclerView.getResources().getDisplayMetrics();
        DivGallery.Orientation mo17535b2 = divGallery.f35958t.mo17535b(expressionResolver);
        int i2 = 1;
        int i3 = mo17535b2 == DivGallery.Orientation.HORIZONTAL ? 0 : 1;
        Expression<Long> expression = divGallery.f35945g;
        long longValue = (expression == null || (mo17535b = expression.mo17535b(expressionResolver)) == null) ? 1L : mo17535b.longValue();
        divRecyclerView.setClipChildren(false);
        if (longValue == 1) {
            Long mo17535b3 = divGallery.f35955q.mo17535b(expressionResolver);
            Intrinsics.m32178g(metrics, "metrics");
            paddingItemDecoration = new PaddingItemDecoration(0, BaseDivViewExtensionsKt.m16961u(mo17535b3, metrics), 0, 0, 0, 0, i3, 61);
        } else {
            Long mo17535b4 = divGallery.f35955q.mo17535b(expressionResolver);
            Intrinsics.m32178g(metrics, "metrics");
            int m16961u = BaseDivViewExtensionsKt.m16961u(mo17535b4, metrics);
            Expression<Long> expression2 = divGallery.f35948j;
            if (expression2 == null) {
                expression2 = divGallery.f35955q;
            }
            paddingItemDecoration = new PaddingItemDecoration(0, m16961u, BaseDivViewExtensionsKt.m16961u(expression2.mo17535b(expressionResolver), metrics), 0, 0, 0, i3, 57);
        }
        PaddingItemDecoration paddingItemDecoration2 = paddingItemDecoration;
        int itemDecorationCount = divRecyclerView.getItemDecorationCount() - 1;
        if (itemDecorationCount >= 0) {
            while (true) {
                int i4 = itemDecorationCount - 1;
                divRecyclerView.m3807m0(itemDecorationCount);
                if (i4 < 0) {
                    break;
                } else {
                    itemDecorationCount = i4;
                }
            }
        }
        divRecyclerView.mo3802k(paddingItemDecoration2);
        int ordinal = divGallery.f35962x.mo17535b(expressionResolver).ordinal();
        ParentScrollRestrictor parentScrollRestrictor = null;
        if (ordinal == 0) {
            PagerSnapStartHelper pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 == null) {
                pagerSnapStartHelper2 = new PagerSnapStartHelper();
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.m3952b(divRecyclerView);
            pagerSnapStartHelper2.f32546f = MathKt.m32223c(divGallery.f35955q.mo17535b(expressionResolver).longValue() * SizeKt.f33901a.density);
        } else if (ordinal == 1 && (pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper()) != null) {
            pagerSnapStartHelper.m3952b(null);
        }
        DivGridLayoutManager divLinearLayoutManager = longValue == 1 ? new DivLinearLayoutManager(div2View, divRecyclerView, divGallery, i3) : new DivGridLayoutManager(div2View, divRecyclerView, divGallery, i3);
        divRecyclerView.setLayoutManager(divLinearLayoutManager);
        List<RecyclerView.OnScrollListener> list = divRecyclerView.f5514k0;
        if (list != null) {
            list.clear();
        }
        DivViewState currentState = div2View.getCurrentState();
        if (currentState != null) {
            String str = divGallery.f35954p;
            if (str == null) {
                str = String.valueOf(divGallery.hashCode());
            }
            GalleryState galleryState = (GalleryState) currentState.m16721a(str);
            Integer valueOf = galleryState == null ? null : Integer.valueOf(galleryState.f31337a);
            if (valueOf == null) {
                long longValue2 = divGallery.f35949k.mo17535b(expressionResolver).longValue();
                long j2 = longValue2 >> 31;
                if (j2 == 0 || j2 == -1) {
                    intValue = (int) longValue2;
                } else {
                    int i5 = Assert.f33709a;
                    intValue = longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                intValue = valueOf.intValue();
            }
            Integer valueOf2 = galleryState == null ? null : Integer.valueOf(galleryState.f31338b);
            Object layoutManager = divRecyclerView.getLayoutManager();
            DivGalleryItemHelper divGalleryItemHelper = layoutManager instanceof DivGalleryItemHelper ? (DivGalleryItemHelper) layoutManager : null;
            if (valueOf2 == null && intValue == 0) {
                if (divGalleryItemHelper != null) {
                    divGalleryItemHelper.mo3562g(intValue);
                }
            } else if (valueOf2 != null) {
                if (divGalleryItemHelper != null) {
                    divGalleryItemHelper.mo3558b(intValue, valueOf2.intValue());
                }
            } else if (divGalleryItemHelper != null) {
                divGalleryItemHelper.mo3562g(intValue);
            }
            divRecyclerView.m3806m(new UpdateStateScrollListener(str, currentState, divLinearLayoutManager));
        }
        divRecyclerView.m3806m(new ScrollListener(div2View, divRecyclerView, divLinearLayoutManager, divGallery));
        if (divGallery.f35960v.mo17535b(expressionResolver).booleanValue()) {
            int ordinal2 = mo17535b2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2;
            }
            parentScrollRestrictor = new ParentScrollRestrictor(i2);
        }
        divRecyclerView.setOnInterceptTouchEventListener(parentScrollRestrictor);
    }
}

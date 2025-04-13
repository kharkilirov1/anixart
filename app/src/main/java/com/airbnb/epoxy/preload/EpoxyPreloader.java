package com.airbnb.epoxy.preload;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.airbnb.epoxy.BoundViewHolders;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.preload.PreloadRequestHolder;
import com.airbnb.epoxy.preload.PreloadableViewDataProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.BrittleContainsOptimizationKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* compiled from: EpoxyPreloader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "P", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Companion", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class EpoxyPreloader<P extends PreloadRequestHolder> extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public IntRange f7054a;

    /* renamed from: b */
    public IntProgression f7055b;

    /* renamed from: c */
    public int f7056c;

    /* renamed from: d */
    public final Map<Class<? extends EpoxyModel<?>>, EpoxyModelPreloader<?, ?, ? extends P>> f7057d;

    /* renamed from: e */
    public final PreloadTargetProvider<P> f7058e;

    /* renamed from: f */
    public final PreloadableViewDataProvider f7059f;

    /* renamed from: g */
    public final BaseEpoxyAdapter f7060g;

    /* renamed from: h */
    public final int f7061h;

    /* compiled from: EpoxyPreloader.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader$Companion;", "", "", "FLING_THRESHOLD_PX", "I", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class Companion {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: a */
    public void mo3914a(@NotNull RecyclerView recyclerView, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: c */
    public void mo3586c(@NotNull RecyclerView recyclerView, int i2, int i3) {
        EpoxyViewHolder epoxyViewHolder;
        Intrinsics.m32179h(recyclerView, "recyclerView");
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (Math.abs(i2) > 75) {
            return;
        }
        if (Math.abs(i3) > 75) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        this.f7056c = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int m3695r1 = linearLayoutManager.m3695r1();
        int m3697s1 = linearLayoutManager.m3697s1();
        if (!(m3695r1 == -1 || m3695r1 >= this.f7056c)) {
            if (!(m3697s1 == -1 || m3697s1 >= this.f7056c)) {
                IntRange intRange = new IntRange(m3695r1, m3697s1);
                if (Intrinsics.m32174c(intRange, this.f7054a)) {
                    return;
                }
                IntRange intRange2 = this.f7054a;
                boolean z = m3695r1 > intRange2.f63380b || intRange.f63381c > intRange2.f63381c;
                int i4 = z ? m3697s1 + 1 : m3695r1 - 1;
                int i5 = this.f7061h;
                IntProgression intProgression = new IntProgression(Math.min(this.f7056c - 1, Math.max(i4, 0)), Math.min(this.f7056c - 1, Math.max((z ? i5 - 1 : 1 - i5) + i4, 0)), z ? 1 : -1);
                IntProgression other = this.f7055b;
                Intrinsics.m32179h(other, "other");
                Set m32033m0 = CollectionsKt.m32033m0(intProgression);
                TypeIntrinsics.m32212a(m32033m0).removeAll(BrittleContainsOptimizationKt.m31985c(other, m32033m0));
                Iterator it = m32033m0.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    BaseEpoxyAdapter getModelForPositionInternal = this.f7060g;
                    Intrinsics.m32179h(getModelForPositionInternal, "$this$getModelForPositionInternal");
                    EpoxyModel<?> mo4482m = getModelForPositionInternal.mo4482m(intValue);
                    if (!(mo4482m instanceof EpoxyModel)) {
                        mo4482m = null;
                    }
                    if (mo4482m != null) {
                        EpoxyModelPreloader<?, ?, ? extends P> epoxyModelPreloader = this.f7057d.get(mo4482m.getClass());
                        if (!(epoxyModelPreloader instanceof EpoxyModelPreloader)) {
                            epoxyModelPreloader = null;
                        }
                        EpoxyModelPreloader<?, ?, ? extends P> epoxyModelPreloader2 = epoxyModelPreloader;
                        if (epoxyModelPreloader2 != null) {
                            PreloadableViewDataProvider preloadableViewDataProvider = this.f7059f;
                            Objects.requireNonNull(preloadableViewDataProvider);
                            PreloadableViewDataProvider.CacheKey m4632a = preloadableViewDataProvider.m4632a(epoxyModelPreloader2, mo4482m, intValue);
                            Map<PreloadableViewDataProvider.CacheKey, List<ViewData<?>>> map = preloadableViewDataProvider.f7063a;
                            List<ViewData<?>> list = map.get(m4632a);
                            if (list == null) {
                                BaseEpoxyAdapter boundViewHoldersInternal = preloadableViewDataProvider.f7064b;
                                Intrinsics.m32179h(boundViewHoldersInternal, "$this$boundViewHoldersInternal");
                                BoundViewHolders mo4480k = boundViewHoldersInternal.mo4480k();
                                Intrinsics.m32178g(mo4480k, "adapter.boundViewHoldersInternal()");
                                Iterator<EpoxyViewHolder> it2 = mo4480k.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        epoxyViewHolder = null;
                                        break;
                                    }
                                    epoxyViewHolder = it2.next();
                                    EpoxyViewHolder it3 = epoxyViewHolder;
                                    Intrinsics.m32178g(it3, "it");
                                    it3.m4576a();
                                    EpoxyModel epoxyModel = it3.f6963a;
                                    if (Intrinsics.m32174c(Reflection.m32193a(epoxyModel.getClass()), Reflection.m32193a(mo4482m.getClass())) && ViewCompat.m2173M(it3.itemView) && ViewCompat.m2174N(it3.itemView) && Intrinsics.m32174c(preloadableViewDataProvider.m4632a(epoxyModelPreloader2, epoxyModel, it3.getAdapterPosition()), m4632a)) {
                                        break;
                                    }
                                }
                                EpoxyViewHolder epoxyViewHolder2 = epoxyViewHolder;
                                if (epoxyViewHolder2 != null && epoxyViewHolder2.itemView != null) {
                                    Intrinsics.m32178g(epoxyViewHolder2.m4578c(), "objectToBind()");
                                    throw null;
                                }
                                map.put(m4632a, null);
                                list = null;
                            }
                            List<ViewData<?>> list2 = list instanceof List ? list : null;
                            if (list2 == null) {
                                list2 = EmptyList.f63144b;
                            }
                            Iterator<T> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                ViewData<? extends Object> viewData = (ViewData) it4.next();
                                PreloadTargetProvider<P> preloadTargetProvider = this.f7058e;
                                P poll = preloadTargetProvider.f7062a.poll();
                                preloadTargetProvider.f7062a.offer(poll);
                                poll.clear();
                                epoxyModelPreloader2.mo4630a(mo4482m, poll, viewData);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                this.f7054a = intRange;
                this.f7055b = intProgression;
                return;
            }
        }
        IntRange.Companion companion = IntRange.f63387e;
        IntRange intRange3 = IntRange.f63388f;
        this.f7054a = intRange3;
        this.f7055b = intRange3;
    }
}

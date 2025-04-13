package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div2.Div;
import com.yandex.div2.DivVisibility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p035l.C6855a;

/* compiled from: DivPatchableAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPatchableAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Companion", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivPatchableAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements ExpressionSubscriber {

    /* renamed from: g */
    @NotNull
    public static final Companion f32288g = new Companion(null);

    /* renamed from: b */
    @NotNull
    public final Div2View f32289b;

    /* renamed from: c */
    @NotNull
    public final List<Div> f32290c;

    /* renamed from: d */
    @NotNull
    public final List<IndexedValue<Div>> f32291d;

    /* renamed from: e */
    @NotNull
    public final List<Div> f32292e;

    /* renamed from: f */
    @NotNull
    public final Map<Div, Boolean> f32293f;

    /* compiled from: DivPatchableAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/DivPatchableAdapter$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static final boolean m17023a(Companion companion, Div div, Div2View div2View) {
            return div.m17557a().getVisibility().mo17535b(div2View.getExpressionResolver()) != DivVisibility.GONE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivPatchableAdapter(@NotNull List<? extends Div> list, @NotNull Div2View div2View) {
        this.f32289b = div2View;
        this.f32290c = CollectionsKt.m32031l0(list);
        final ArrayList arrayList = new ArrayList();
        this.f32291d = arrayList;
        this.f32292e = new AbstractList<Object>() { // from class: com.yandex.div.core.view2.divs.DivPatchableAdapter$Companion$dropIndex$1
            @Override // kotlin.collections.AbstractCollection
            /* renamed from: b */
            public int getF63156f() {
                return arrayList.size();
            }

            @Override // kotlin.collections.AbstractList, java.util.List
            @NotNull
            public Object get(int i2) {
                return arrayList.get(i2).f63148b;
            }
        };
        this.f32293f = new LinkedHashMap();
        m17022m();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    /* renamed from: k */
    public final boolean m17020k(@NotNull DivPatchCache divPatchCache) {
        Intrinsics.m32179h(divPatchCache, "divPatchCache");
        DivDataTag tag = this.f32289b.getDataTag();
        Intrinsics.m32179h(tag, "tag");
        if (divPatchCache.f31158a.get(tag) == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.f32290c.size(); i2++) {
            Div div = this.f32290c.get(i2);
            String f36229t = div.m17557a().getF36229t();
            if (f36229t != null) {
                divPatchCache.m16666a(this.f32289b.getDataTag(), f36229t);
            }
            Intrinsics.m32174c(this.f32293f.get(div), Boolean.TRUE);
        }
        m17022m();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m17021l() {
        Iterator it = ((IndexingIterable) CollectionsKt.m32037o0(this.f32290c)).iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.hasNext()) {
                return;
            }
            final IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            C6855a.m34405a(this, ((Div) indexedValue.f63148b).m17557a().getVisibility().mo17537e(this.f32289b.getExpressionResolver(), new Function1<DivVisibility, Unit>(this) { // from class: com.yandex.div.core.view2.divs.DivPatchableAdapter$subscribeOnElements$1$subscription$1

                /* renamed from: b */
                public final /* synthetic */ DivPatchableAdapter<VH> f32295b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.f32295b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(DivVisibility divVisibility) {
                    DivVisibility it2 = divVisibility;
                    Intrinsics.m32179h(it2, "it");
                    DivPatchableAdapter<VH> divPatchableAdapter = this.f32295b;
                    IndexedValue<Div> indexedValue2 = indexedValue;
                    Boolean bool = divPatchableAdapter.f32293f.get(indexedValue2.f63148b);
                    boolean booleanValue = bool == null ? false : bool.booleanValue();
                    boolean z = it2 != DivVisibility.GONE;
                    if (!booleanValue && z) {
                        List<IndexedValue<Div>> list = divPatchableAdapter.f32291d;
                        Iterator<IndexedValue<Div>> it3 = list.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (it3.next().f63147a > indexedValue2.f63147a) {
                                break;
                            }
                            i2++;
                        }
                        Integer valueOf = Integer.valueOf(i2);
                        if (valueOf.intValue() == -1) {
                            valueOf = null;
                        }
                        int size = valueOf == null ? list.size() : valueOf.intValue();
                        list.add(size, indexedValue2);
                        divPatchableAdapter.notifyItemInserted(size);
                    } else if (booleanValue && !z) {
                        int indexOf = divPatchableAdapter.f32291d.indexOf(indexedValue2);
                        divPatchableAdapter.f32291d.remove(indexOf);
                        divPatchableAdapter.notifyItemRemoved(indexOf);
                    }
                    divPatchableAdapter.f32293f.put(indexedValue2.f63148b, Boolean.valueOf(z));
                    return Unit.f63088a;
                }
            }));
        }
    }

    /* renamed from: m */
    public final void m17022m() {
        this.f32291d.clear();
        this.f32293f.clear();
        Iterator it = ((IndexingIterable) CollectionsKt.m32037o0(this.f32290c)).iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.hasNext()) {
                return;
            }
            IndexedValue<Div> indexedValue = (IndexedValue) indexingIterator.next();
            boolean m17023a = Companion.m17023a(f32288g, indexedValue.f63148b, this.f32289b);
            this.f32293f.put(indexedValue.f63148b, Boolean.valueOf(m17023a));
            if (m17023a) {
                this.f32291d.add(indexedValue);
            }
        }
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
    }
}

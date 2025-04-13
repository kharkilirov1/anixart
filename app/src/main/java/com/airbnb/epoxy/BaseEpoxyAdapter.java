package com.airbnb.epoxy;

import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks;
import com.swiftsoft.anixartd.C2507R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class BaseEpoxyAdapter extends RecyclerView.Adapter<EpoxyViewHolder> implements StickyHeaderCallbacks {

    /* renamed from: b */
    public int f6863b = 1;

    /* renamed from: c */
    public final ViewTypeManager f6864c = new ViewTypeManager();

    /* renamed from: d */
    public final BoundViewHolders f6865d = new BoundViewHolders();

    /* renamed from: e */
    public ViewHolderState f6866e = new ViewHolderState();

    /* renamed from: f */
    public final GridLayoutManager.SpanSizeLookup f6867f;

    public BaseEpoxyAdapter() {
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: com.airbnb.epoxy.BaseEpoxyAdapter.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            /* renamed from: e */
            public int mo3627e(int i2) {
                try {
                    EpoxyModel<?> mo4482m = BaseEpoxyAdapter.this.mo4482m(i2);
                    BaseEpoxyAdapter baseEpoxyAdapter = BaseEpoxyAdapter.this;
                    return mo4482m.m4528r2(baseEpoxyAdapter.f6863b, i2, baseEpoxyAdapter.getItemCount());
                } catch (IndexOutOfBoundsException e2) {
                    BaseEpoxyAdapter.this.mo4484o(e2);
                    return 1;
                }
            }
        };
        this.f6867f = spanSizeLookup;
        setHasStableIds(true);
        spanSizeLookup.f5338c = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return mo4481l().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        return mo4481l().get(i2).f6925b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        ViewTypeManager viewTypeManager = this.f6864c;
        EpoxyModel<?> mo4482m = mo4482m(i2);
        viewTypeManager.f7045a = mo4482m;
        return ViewTypeManager.m4627a(mo4482m);
    }

    /* renamed from: k */
    public BoundViewHolders mo4480k() {
        return this.f6865d;
    }

    /* renamed from: l */
    public abstract List<? extends EpoxyModel<?>> mo4481l();

    /* renamed from: m */
    public EpoxyModel<?> mo4482m(int i2) {
        return mo4481l().get(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(EpoxyViewHolder epoxyViewHolder, int i2, List<Object> list) {
        EpoxyModel<?> mo4482m = mo4482m(i2);
        boolean z = this instanceof EpoxyControllerAdapter;
        EpoxyModel<?> epoxyModel = null;
        if (z) {
            long itemId = getItemId(i2);
            if (!list.isEmpty()) {
                Iterator<Object> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DiffPayload diffPayload = (DiffPayload) it.next();
                    EpoxyModel<?> epoxyModel2 = diffPayload.f6893a;
                    if (epoxyModel2 == null) {
                        EpoxyModel<?> m1095i = diffPayload.f6894b.m1095i(itemId, null);
                        if (m1095i != null) {
                            epoxyModel = m1095i;
                            break;
                        }
                    } else if (epoxyModel2.f6925b == itemId) {
                        epoxyModel = epoxyModel2;
                        break;
                    }
                }
            }
        }
        epoxyViewHolder.m4577b(mo4482m, epoxyModel, list, i2);
        if (list.isEmpty()) {
            ViewHolderState viewHolderState = this.f6866e;
            Objects.requireNonNull(viewHolderState);
            epoxyViewHolder.m4576a();
            if (epoxyViewHolder.f6963a.mo4527q2()) {
                ViewHolderState.ViewState m1094h = viewHolderState.m1094h(epoxyViewHolder.getItemId());
                if (m1094h != null) {
                    m1094h.m4624a(epoxyViewHolder.itemView);
                } else {
                    ViewHolderState.ViewState viewState = epoxyViewHolder.f6966d;
                    if (viewState != null) {
                        viewState.m4624a(epoxyViewHolder.itemView);
                    }
                }
            }
        }
        this.f6865d.f6869b.m1098m(epoxyViewHolder.getItemId(), epoxyViewHolder);
        if (z) {
            mo4485p(epoxyViewHolder, mo4482m, i2, epoxyModel);
        }
    }

    /* renamed from: o */
    public void mo4484o(RuntimeException runtimeException) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(EpoxyViewHolder epoxyViewHolder, int i2) {
        onBindViewHolder(epoxyViewHolder, i2, Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public EpoxyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        EpoxyModel<?> epoxyModel;
        ViewTypeManager viewTypeManager = this.f6864c;
        EpoxyModel<?> epoxyModel2 = viewTypeManager.f7045a;
        if (epoxyModel2 == null || ViewTypeManager.m4627a(epoxyModel2) != i2) {
            mo4484o(new IllegalStateException("Last model did not match expected view type"));
            Iterator<? extends EpoxyModel<?>> it = mo4481l().iterator();
            while (true) {
                if (it.hasNext()) {
                    EpoxyModel<?> next = it.next();
                    if (ViewTypeManager.m4627a(next) == i2) {
                        epoxyModel = next;
                        break;
                    }
                } else {
                    HiddenEpoxyModel hiddenEpoxyModel = new HiddenEpoxyModel();
                    if (i2 != C2507R.layout.view_holder_empty_view) {
                        throw new IllegalStateException(C0000a.m7d("Could not find model for view type: ", i2));
                    }
                    epoxyModel = hiddenEpoxyModel;
                }
            }
        } else {
            epoxyModel = viewTypeManager.f7045a;
        }
        return new EpoxyViewHolder(viewGroup, epoxyModel.mo4498c2(viewGroup), epoxyModel.mo4527q2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f6864c.f7045a = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public boolean onFailedToRecycleView(EpoxyViewHolder epoxyViewHolder) {
        EpoxyViewHolder epoxyViewHolder2 = epoxyViewHolder;
        epoxyViewHolder2.m4576a();
        return epoxyViewHolder2.f6963a.mo4523k2(epoxyViewHolder2.m4578c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(EpoxyViewHolder epoxyViewHolder) {
        EpoxyViewHolder epoxyViewHolder2 = epoxyViewHolder;
        this.f6866e.m4623q(epoxyViewHolder2);
        this.f6865d.f6869b.m1099n(epoxyViewHolder2.getItemId());
        epoxyViewHolder2.m4576a();
        EpoxyModel<?> epoxyModel = epoxyViewHolder2.f6963a;
        epoxyViewHolder2.m4576a();
        epoxyViewHolder2.f6963a.mo4506s2(epoxyViewHolder2.m4578c());
        epoxyViewHolder2.f6963a = null;
        mo4486q(epoxyViewHolder2, epoxyModel);
    }

    /* renamed from: p */
    public void mo4485p(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i2, @Nullable EpoxyModel<?> epoxyModel2) {
    }

    /* renamed from: q */
    public void mo4486q(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.m4576a();
        epoxyViewHolder.f6963a.mo4525m2(epoxyViewHolder.m4578c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.m4576a();
        epoxyViewHolder.f6963a.mo4526n2(epoxyViewHolder.m4578c());
    }
}

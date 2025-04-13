package com.airbnb.epoxy;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.AdapterListUpdateCallback;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.AsyncEpoxyDiffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class EpoxyControllerAdapter extends BaseEpoxyAdapter implements AsyncEpoxyDiffer.ResultCallback {

    /* renamed from: l */
    public static final DiffUtil.ItemCallback<EpoxyModel<?>> f6907l = new DiffUtil.ItemCallback<EpoxyModel<?>>() { // from class: com.airbnb.epoxy.EpoxyControllerAdapter.1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a */
        public boolean mo3542a(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
            return epoxyModel.equals(epoxyModel2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b */
        public boolean mo3543b(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
            return epoxyModel.f6925b == epoxyModel2.f6925b;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: c */
        public Object mo3544c(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
            return new DiffPayload(epoxyModel);
        }
    };

    /* renamed from: g */
    public final NotifyBlocker f6908g;

    /* renamed from: h */
    public final AsyncEpoxyDiffer f6909h;

    /* renamed from: i */
    public final EpoxyController f6910i;

    /* renamed from: j */
    public int f6911j;

    /* renamed from: k */
    public final List<OnModelBuildFinishedListener> f6912k;

    public EpoxyControllerAdapter(@NonNull EpoxyController epoxyController, Handler handler) {
        NotifyBlocker notifyBlocker = new NotifyBlocker();
        this.f6908g = notifyBlocker;
        this.f6912k = new ArrayList();
        this.f6910i = epoxyController;
        this.f6909h = new AsyncEpoxyDiffer(handler, this, f6907l);
        registerAdapterDataObserver(notifyBlocker);
    }

    @Override // com.airbnb.epoxy.AsyncEpoxyDiffer.ResultCallback
    /* renamed from: g */
    public void mo4479g(@NonNull DiffResult diffResult) {
        this.f6911j = diffResult.f6896b.size();
        this.f6908g.f7034a = true;
        AdapterListUpdateCallback adapterListUpdateCallback = new AdapterListUpdateCallback(this);
        DiffUtil.DiffResult diffResult2 = diffResult.f6897c;
        if (diffResult2 != null) {
            diffResult2.m3541a(adapterListUpdateCallback);
        } else if (diffResult.f6896b.isEmpty() && !diffResult.f6895a.isEmpty()) {
            adapterListUpdateCallback.mo3490c(0, diffResult.f6895a.size());
        } else if (!diffResult.f6896b.isEmpty() && diffResult.f6895a.isEmpty()) {
            adapterListUpdateCallback.mo3489b(0, diffResult.f6896b.size());
        }
        this.f6908g.f7034a = false;
        for (int size = this.f6912k.size() - 1; size >= 0; size--) {
            this.f6912k.get(size).m4621a(diffResult);
        }
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f6911j;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    @NonNull
    /* renamed from: k */
    public BoundViewHolders mo4480k() {
        return this.f6865d;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    @NonNull
    /* renamed from: l */
    public List<? extends EpoxyModel<?>> mo4481l() {
        return this.f6909h.f6848f;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: o */
    public void mo4484o(@NonNull RuntimeException runtimeException) {
        this.f6910i.onExceptionSwallowed(runtimeException);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f6910i.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.f6864c.f7045a = null;
        this.f6910i.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull EpoxyViewHolder epoxyViewHolder) {
        EpoxyViewHolder epoxyViewHolder2 = epoxyViewHolder;
        epoxyViewHolder2.m4576a();
        epoxyViewHolder2.f6963a.mo4525m2(epoxyViewHolder2.m4578c());
        EpoxyController epoxyController = this.f6910i;
        epoxyViewHolder2.m4576a();
        epoxyController.onViewAttachedToWindow(epoxyViewHolder2, epoxyViewHolder2.f6963a);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull EpoxyViewHolder epoxyViewHolder) {
        EpoxyViewHolder epoxyViewHolder2 = epoxyViewHolder;
        epoxyViewHolder2.m4576a();
        epoxyViewHolder2.f6963a.mo4526n2(epoxyViewHolder2.m4578c());
        EpoxyController epoxyController = this.f6910i;
        epoxyViewHolder2.m4576a();
        epoxyController.onViewDetachedFromWindow(epoxyViewHolder2, epoxyViewHolder2.f6963a);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: p */
    public void mo4485p(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel, int i2, @Nullable EpoxyModel<?> epoxyModel2) {
        this.f6910i.onModelBound(epoxyViewHolder, epoxyModel, i2, epoxyModel2);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: q */
    public void mo4486q(@NonNull EpoxyViewHolder epoxyViewHolder, @NonNull EpoxyModel<?> epoxyModel) {
        this.f6910i.onModelUnbound(epoxyViewHolder, epoxyModel);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: r */
    public void onViewAttachedToWindow(@NonNull EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.m4576a();
        epoxyViewHolder.f6963a.mo4525m2(epoxyViewHolder.m4578c());
        EpoxyController epoxyController = this.f6910i;
        epoxyViewHolder.m4576a();
        epoxyController.onViewAttachedToWindow(epoxyViewHolder, epoxyViewHolder.f6963a);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: s */
    public void onViewDetachedFromWindow(@NonNull EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.m4576a();
        epoxyViewHolder.f6963a.mo4526n2(epoxyViewHolder.m4578c());
        EpoxyController epoxyController = this.f6910i;
        epoxyViewHolder.m4576a();
        epoxyController.onViewDetachedFromWindow(epoxyViewHolder, epoxyViewHolder.f6963a);
    }
}

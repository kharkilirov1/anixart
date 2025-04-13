package com.airbnb.epoxy;

import java.util.List;

/* loaded from: classes.dex */
public abstract class EpoxyAdapter extends BaseEpoxyAdapter {

    /* renamed from: g */
    public final HiddenEpoxyModel f6898g = new HiddenEpoxyModel();

    /* renamed from: h */
    public final List<EpoxyModel<?>> f6899h = new ModelList();

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: l */
    public List<EpoxyModel<?>> mo4481l() {
        return this.f6899h;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    /* renamed from: m */
    public EpoxyModel<?> mo4482m(int i2) {
        EpoxyModel<?> epoxyModel = this.f6899h.get(i2);
        return epoxyModel.f6926c ? epoxyModel : this.f6898g;
    }
}

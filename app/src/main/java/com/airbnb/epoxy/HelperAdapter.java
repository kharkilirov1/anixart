package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModelGroupHolder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/airbnb/epoxy/HelperAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
final class HelperAdapter extends RecyclerView.Adapter<EpoxyViewHolder> {

    /* renamed from: a */
    public EpoxyModel<?> f6999a;

    /* renamed from: b */
    public ViewParent f7000b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(EpoxyViewHolder epoxyViewHolder, int i2) {
        EpoxyViewHolder holder = epoxyViewHolder;
        Intrinsics.m32179h(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public EpoxyViewHolder onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.m32179h(parent, "parent");
        ViewParent viewParent = this.f7000b;
        EpoxyModel<?> epoxyModel = this.f6999a;
        Intrinsics.m32176e(epoxyModel);
        View mo4498c2 = epoxyModel.mo4498c2(parent);
        EpoxyModel<?> epoxyModel2 = this.f6999a;
        Intrinsics.m32176e(epoxyModel2);
        return new EpoxyViewHolder(viewParent, mo4498c2, epoxyModel2.mo4527q2());
    }
}

package com.yandex.div.core.state;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UpdateStateScrollListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/state/UpdateStateScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UpdateStateScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    @NotNull
    public final String f31344a;

    /* renamed from: b */
    @NotNull
    public final DivViewState f31345b;

    /* renamed from: c */
    @NotNull
    public final DivGalleryItemHelper f31346c;

    public UpdateStateScrollListener(@NotNull String blockId, @NotNull DivViewState divViewState, @NotNull DivGalleryItemHelper divGalleryItemHelper) {
        Intrinsics.m32179h(blockId, "blockId");
        this.f31344a = blockId;
        this.f31345b = divViewState;
        this.f31346c = divGalleryItemHelper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: c */
    public void mo3586c(@NotNull RecyclerView recyclerView, int i2, int i3) {
        int left;
        int paddingLeft;
        Intrinsics.m32179h(recyclerView, "recyclerView");
        int mo3565j = this.f31346c.mo3565j();
        int i4 = 0;
        RecyclerView.ViewHolder m3779M = recyclerView.m3779M(mo3565j, false);
        if (m3779M != null) {
            if (this.f31346c.mo3571p() == 1) {
                left = m3779M.itemView.getTop();
                paddingLeft = this.f31346c.getView().getPaddingTop();
            } else {
                left = m3779M.itemView.getLeft();
                paddingLeft = this.f31346c.getView().getPaddingLeft();
            }
            i4 = left - paddingLeft;
        }
        DivViewState divViewState = this.f31345b;
        divViewState.f31336b.put(this.f31344a, new GalleryState(mo3565j, i4));
    }
}

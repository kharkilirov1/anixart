package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EpoxyTouchHelperCallback.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/EpoxyTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public abstract class EpoxyTouchHelperCallback extends ItemTouchHelper.Callback {
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: b */
    public boolean mo3647b(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder current, @NotNull RecyclerView.ViewHolder target) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(current, "current");
        Intrinsics.m32179h(target, "target");
        return mo4552r(recyclerView, (EpoxyViewHolder) current, (EpoxyViewHolder) target);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: c */
    public RecyclerView.ViewHolder mo3648c(RecyclerView.ViewHolder viewHolder, List list, int i2, int i3) {
        RecyclerView.ViewHolder mo3648c = super.mo3648c((EpoxyViewHolder) viewHolder, list, i2, i3);
        if (!(mo3648c instanceof EpoxyViewHolder)) {
            mo3648c = null;
        }
        return (EpoxyViewHolder) mo3648c;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: d */
    public void mo3649d(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(viewHolder, "viewHolder");
        mo4553s(recyclerView, (EpoxyViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: h */
    public float mo3652h(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.m32179h(viewHolder, "viewHolder");
        return 0.5f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: i */
    public int mo3653i(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(viewHolder, "viewHolder");
        return mo4554t(recyclerView, (EpoxyViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: j */
    public float mo3654j(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.m32179h(viewHolder, "viewHolder");
        return 0.5f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: l */
    public void mo3656l(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(viewHolder, "viewHolder");
        mo4555u(canvas, recyclerView, (EpoxyViewHolder) viewHolder, f2, f3, i2, z);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: m */
    public void mo3657m(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @Nullable RecyclerView.ViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        if (!(viewHolder instanceof EpoxyViewHolder)) {
            viewHolder = null;
        }
        View view = ((EpoxyViewHolder) viewHolder).itemView;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: n */
    public boolean mo3658n(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        return mo4556v(recyclerView, (EpoxyViewHolder) viewHolder, (EpoxyViewHolder) viewHolder2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: o */
    public void mo3659o(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, int i2, @NotNull RecyclerView.ViewHolder viewHolder2, int i3, int i4, int i5) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        super.mo3659o(recyclerView, (EpoxyViewHolder) viewHolder, i2, (EpoxyViewHolder) viewHolder2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: p */
    public void mo3660p(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        mo4557w((EpoxyViewHolder) viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    /* renamed from: q */
    public void mo3661q(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        Intrinsics.m32179h(viewHolder, "viewHolder");
        mo4558x((EpoxyViewHolder) viewHolder, i2);
    }

    /* renamed from: r */
    public boolean mo4552r(@NotNull RecyclerView recyclerView, @NotNull EpoxyViewHolder epoxyViewHolder, @NotNull EpoxyViewHolder epoxyViewHolder2) {
        return true;
    }

    /* renamed from: s */
    public void mo4553s(@NotNull RecyclerView recyclerView, @NotNull EpoxyViewHolder viewHolder) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(viewHolder, "viewHolder");
        super.mo3649d(recyclerView, viewHolder);
    }

    /* renamed from: t */
    public abstract int mo4554t(@NotNull RecyclerView recyclerView, @NotNull EpoxyViewHolder epoxyViewHolder);

    /* renamed from: u */
    public void mo4555u(@NotNull Canvas c2, @NotNull RecyclerView recyclerView, @NotNull EpoxyViewHolder viewHolder, float f2, float f3, int i2, boolean z) {
        Intrinsics.m32179h(c2, "c");
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(viewHolder, "viewHolder");
        super.mo3656l(c2, recyclerView, viewHolder, f2, f3, i2, z);
    }

    /* renamed from: v */
    public abstract boolean mo4556v(@NotNull RecyclerView recyclerView, @NotNull EpoxyViewHolder epoxyViewHolder, @NotNull EpoxyViewHolder epoxyViewHolder2);

    /* renamed from: w */
    public void mo4557w(@Nullable EpoxyViewHolder epoxyViewHolder, int i2) {
    }

    /* renamed from: x */
    public abstract void mo4558x(@NotNull EpoxyViewHolder epoxyViewHolder, int i2);
}

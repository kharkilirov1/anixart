package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnboundedViewPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/airbnb/epoxy/UnboundedViewPool;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class UnboundedViewPool extends RecyclerView.RecycledViewPool {

    /* renamed from: c */
    public final SparseArray<Queue<RecyclerView.ViewHolder>> f7040c = new SparseArray<>();

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    /* renamed from: a */
    public void mo3915a() {
        this.f7040c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    @Nullable
    /* renamed from: b */
    public RecyclerView.ViewHolder mo3916b(int i2) {
        Queue<RecyclerView.ViewHolder> queue = this.f7040c.get(i2);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    /* renamed from: d */
    public void mo3918d(@NotNull RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        Queue<RecyclerView.ViewHolder> queue = this.f7040c.get(itemViewType);
        if (queue == null) {
            queue = new LinkedList<>();
            this.f7040c.put(itemViewType, queue);
        }
        queue.add(viewHolder);
    }
}

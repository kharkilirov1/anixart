package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {

    /* renamed from: g */
    public boolean f5646g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: a */
    public boolean mo3847a(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2;
        int i3;
        return (itemHolderInfo == null || ((i2 = itemHolderInfo.f5559a) == (i3 = itemHolderInfo2.f5559a) && itemHolderInfo.f5560b == itemHolderInfo2.f5560b)) ? mo3528o(viewHolder) : mo3530q(viewHolder, i2, itemHolderInfo.f5560b, i3, itemHolderInfo2.f5560b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: b */
    public boolean mo3848b(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2;
        int i3;
        int i4 = itemHolderInfo.f5559a;
        int i5 = itemHolderInfo.f5560b;
        if (viewHolder2.shouldIgnore()) {
            int i6 = itemHolderInfo.f5559a;
            i3 = itemHolderInfo.f5560b;
            i2 = i6;
        } else {
            i2 = itemHolderInfo2.f5559a;
            i3 = itemHolderInfo2.f5560b;
        }
        return mo3529p(viewHolder, viewHolder2, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: c */
    public boolean mo3849c(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2 = itemHolderInfo.f5559a;
        int i3 = itemHolderInfo.f5560b;
        View view = viewHolder.itemView;
        int left = itemHolderInfo2 == null ? view.getLeft() : itemHolderInfo2.f5559a;
        int top = itemHolderInfo2 == null ? view.getTop() : itemHolderInfo2.f5560b;
        if (viewHolder.isRemoved() || (i2 == left && i3 == top)) {
            return mo3531r(viewHolder);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo3530q(viewHolder, i2, i3, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: d */
    public boolean mo3850d(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i2 = itemHolderInfo.f5559a;
        int i3 = itemHolderInfo2.f5559a;
        if (i2 != i3 || itemHolderInfo.f5560b != itemHolderInfo2.f5560b) {
            return mo3530q(viewHolder, i2, itemHolderInfo.f5560b, i3, itemHolderInfo2.f5560b);
        }
        RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.f5553a;
        if (itemAnimatorListener == null) {
            return false;
        }
        itemAnimatorListener.mo3856a(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: f */
    public boolean mo3851f(@NonNull RecyclerView.ViewHolder viewHolder) {
        return !this.f5646g || viewHolder.isInvalid();
    }

    /* renamed from: o */
    public abstract boolean mo3528o(RecyclerView.ViewHolder viewHolder);

    /* renamed from: p */
    public abstract boolean mo3529p(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5);

    /* renamed from: q */
    public abstract boolean mo3530q(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5);

    /* renamed from: r */
    public abstract boolean mo3531r(RecyclerView.ViewHolder viewHolder);

    /* renamed from: s */
    public final void m3951s(RecyclerView.ViewHolder viewHolder, boolean z) {
        RecyclerView.ItemAnimator.ItemAnimatorListener itemAnimatorListener = this.f5553a;
        if (itemAnimatorListener != null) {
            itemAnimatorListener.mo3856a(viewHolder);
        }
    }
}

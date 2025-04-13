package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class AdapterListUpdateCallback implements ListUpdateCallback {

    /* renamed from: b */
    @NonNull
    public final RecyclerView.Adapter f5177b;

    public AdapterListUpdateCallback(@NonNull RecyclerView.Adapter adapter) {
        this.f5177b = adapter;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: a */
    public void mo3488a(int i2, int i3) {
        this.f5177b.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: b */
    public void mo3489b(int i2, int i3) {
        this.f5177b.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: c */
    public void mo3490c(int i2, int i3) {
        this.f5177b.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: d */
    public void mo3491d(int i2, int i3, Object obj) {
        this.f5177b.notifyItemRangeChanged(i2, i3, obj);
    }
}

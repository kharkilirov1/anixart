package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleasingViewPool.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/ReleasingViewPool;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ReleasingViewPool extends RecyclerView.RecycledViewPool {

    /* renamed from: c */
    @NotNull
    public final ReleaseViewVisitor f32549c;

    /* renamed from: d */
    @NotNull
    public final Set<RecyclerView.ViewHolder> f32550d;

    public ReleasingViewPool(@NotNull ReleaseViewVisitor releaseViewVisitor) {
        Intrinsics.m32179h(releaseViewVisitor, "releaseViewVisitor");
        this.f32549c = releaseViewVisitor;
        this.f32550d = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    /* renamed from: a */
    public void mo3915a() {
        super.mo3915a();
        for (RecyclerView.ViewHolder viewHolder : this.f32550d) {
            ReleaseViewVisitor releaseViewVisitor = this.f32549c;
            View view = viewHolder.itemView;
            Intrinsics.m32178g(view, "viewHolder.itemView");
            DivViewVisitorKt.m17105a(releaseViewVisitor, view);
        }
        this.f32550d.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    @Nullable
    /* renamed from: b */
    public RecyclerView.ViewHolder mo3916b(int i2) {
        RecyclerView.ViewHolder mo3916b = super.mo3916b(i2);
        if (mo3916b == null) {
            return null;
        }
        this.f32550d.remove(mo3916b);
        return mo3916b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    /* renamed from: d */
    public void mo3918d(@Nullable RecyclerView.ViewHolder viewHolder) {
        super.mo3918d(viewHolder);
        this.f32550d.add(viewHolder);
    }
}

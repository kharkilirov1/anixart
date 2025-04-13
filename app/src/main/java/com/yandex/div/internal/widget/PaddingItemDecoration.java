package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Px;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PaddingItemDecoration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/PaddingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PaddingItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    @Px
    public final int f33988a;

    /* renamed from: b */
    @Px
    public final int f33989b;

    /* renamed from: c */
    @Px
    public final int f33990c;

    /* renamed from: d */
    @Px
    public final int f33991d;

    /* renamed from: e */
    @Px
    public final int f33992e;

    /* renamed from: f */
    @Px
    public final int f33993f;

    /* renamed from: g */
    public final int f33994g;

    @JvmOverloads
    public PaddingItemDecoration() {
        this(0, 0, 0, 0, 0, 0, 0, 127);
    }

    public PaddingItemDecoration(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        i2 = (i9 & 1) != 0 ? 0 : i2;
        i3 = (i9 & 2) != 0 ? 0 : i3;
        i4 = (i9 & 4) != 0 ? 0 : i4;
        i5 = (i9 & 8) != 0 ? 0 : i5;
        i6 = (i9 & 16) != 0 ? 0 : i6;
        i7 = (i9 & 32) != 0 ? 0 : i7;
        i8 = (i9 & 64) != 0 ? 0 : i8;
        this.f33988a = i2;
        this.f33989b = i3;
        this.f33990c = i4;
        this.f33991d = i5;
        this.f33992e = i6;
        this.f33993f = i7;
        this.f33994g = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: f */
    public void mo3404f(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        int i2;
        Intrinsics.m32179h(outRect, "outRect");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(parent, "parent");
        Intrinsics.m32179h(state, "state");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i2 = ((StaggeredGridLayoutManager) layoutManager).f5668s;
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                int i3 = Assert.f33709a;
            }
            i2 = 1;
        }
        if (i2 != 1) {
            int i4 = this.f33989b / 2;
            int i5 = this.f33990c / 2;
            int i6 = this.f33994g;
            if (i6 == 0) {
                outRect.set(i4, i5, i4, i5);
                return;
            } else if (i6 != 1) {
                int i7 = Assert.f33709a;
                return;
            } else {
                outRect.set(i5, i4, i5, i4);
                return;
            }
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        Integer valueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
        Integer valueOf2 = layoutManager2 != null ? Integer.valueOf(layoutManager2.m3894i0(view)) : null;
        if (valueOf2 == null) {
            return;
        }
        int intValue2 = valueOf2.intValue();
        boolean z = intValue2 == 0;
        boolean z2 = intValue2 == intValue - 1;
        int i8 = this.f33994g;
        if (i8 == 0) {
            outRect.set(z ? this.f33988a : 0, this.f33992e, z2 ? this.f33991d : this.f33989b, this.f33993f);
        } else if (i8 != 1) {
            int i9 = Assert.f33709a;
        } else {
            outRect.set(this.f33988a, z ? this.f33992e : 0, this.f33991d, z2 ? this.f33993f : this.f33989b);
        }
    }
}

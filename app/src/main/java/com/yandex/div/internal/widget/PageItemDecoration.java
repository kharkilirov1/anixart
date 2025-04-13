package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Px;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.internal.Assert;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PageItemDecoration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/PageItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PageItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public float f33995a;

    /* renamed from: b */
    public final int f33996b;

    /* renamed from: c */
    public final int f33997c;

    /* renamed from: d */
    public final int f33998d;

    /* renamed from: e */
    public final int f33999e;

    /* renamed from: f */
    public final int f34000f;

    /* renamed from: g */
    public final int f34001g;

    /* renamed from: h */
    public final int f34002h;

    /* renamed from: i */
    public final int f34003i;

    @JvmOverloads
    public PageItemDecoration() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: f */
    public void mo3404f(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.m32179h(outRect, "outRect");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(parent, "parent");
        Intrinsics.m32179h(state, "state");
        RecyclerView.Adapter adapter = parent.getAdapter();
        boolean z = false;
        boolean z2 = adapter != null && adapter.getItemCount() == 2;
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        boolean z3 = layoutManager != null && layoutManager.m3894i0(view) == 0;
        RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
        if (layoutManager2 != null) {
            int m3894i0 = layoutManager2.m3894i0(view);
            RecyclerView.Adapter adapter2 = parent.getAdapter();
            Intrinsics.m32176e(adapter2);
            if (m3894i0 == adapter2.getItemCount() - 1) {
                z = true;
            }
        }
        int i2 = this.f33996b;
        if (i2 == 0) {
            outRect.set(z3 ? this.f33997c : (!z || z2) ? this.f34001g : this.f34003i, this.f33999e, z ? this.f33998d : (!z3 || z2) ? this.f34001g : this.f34002h, this.f34000f);
        } else if (i2 != 1) {
            int i3 = Assert.f33709a;
        } else {
            outRect.set(this.f33997c, z3 ? this.f33999e : (!z || z2) ? this.f34001g : this.f34003i, this.f33998d, z ? this.f34000f : (!z3 || z2) ? this.f34001g : this.f34002h);
        }
    }

    @JvmOverloads
    public PageItemDecoration(@Px float f2, @Px float f3, @Px float f4, @Px float f5, @Px float f6, @Px float f7, int i2) {
        this.f33995a = f6;
        this.f33996b = i2;
        this.f33997c = MathKt.m32223c(f2);
        this.f33998d = MathKt.m32223c(f3);
        this.f33999e = MathKt.m32223c(f4);
        this.f34000f = MathKt.m32223c(f5);
        this.f34001g = MathKt.m32223c(this.f33995a + f7);
        int i3 = 0;
        this.f34002h = i2 != 0 ? i2 != 1 ? 0 : MathKt.m32223c(((this.f33995a + f7) * 2) - f5) : MathKt.m32223c(((this.f33995a + f7) * 2) - f2);
        if (i2 == 0) {
            i3 = MathKt.m32223c(((this.f33995a + f7) * 2) - f3);
        } else if (i2 == 1) {
            i3 = MathKt.m32223c(((this.f33995a + f7) * 2) - f4);
        }
        this.f34003i = i3;
    }
}

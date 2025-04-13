package com.yandex.div.core.view2;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivLogScrollListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/DivLogScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivLogScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public int f31653a;

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: c */
    public void mo3586c(@NotNull RecyclerView recyclerView, int i2, int i3) {
        Intrinsics.m32179h(recyclerView, "recyclerView");
        this.f31653a = Math.abs(i2) + this.f31653a;
        throw null;
    }
}

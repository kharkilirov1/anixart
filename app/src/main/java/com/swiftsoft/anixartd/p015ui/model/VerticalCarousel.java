package com.swiftsoft.anixartd.p015ui.model;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Carousel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VerticalCarousel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/VerticalCarousel;", "Lcom/airbnb/epoxy/Carousel;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class VerticalCarousel extends Carousel {
    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    @NotNull
    /* renamed from: D0 */
    public RecyclerView.LayoutManager mo4564D0() {
        getContext();
        return new LinearLayoutManager(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: k */
    public void mo3802k(@NotNull RecyclerView.ItemDecoration decoration) {
        Intrinsics.m32179h(decoration, "decoration");
        setPaddingDp(0);
        super.mo3802k(decoration);
    }
}

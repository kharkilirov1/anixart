package com.swiftsoft.anixartd.p015ui.model;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Carousel;
import com.swiftsoft.anixartd.utils.DigitsKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HorizontalCarousel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/HorizontalCarousel;", "Lcom/airbnb/epoxy/Carousel;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class HorizontalCarousel extends Carousel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalCarousel(@NotNull Context context) {
        super(context);
        new LinkedHashMap();
        Carousel.setDefaultGlobalSnapHelperFactory(null);
        setNestedScrollingEnabled(false);
    }

    @Override // com.airbnb.epoxy.EpoxyRecyclerView
    @NotNull
    /* renamed from: D0 */
    public RecyclerView.LayoutManager mo4564D0() {
        getContext();
        return new LinearLayoutManager(0, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: k */
    public void mo3802k(@NotNull RecyclerView.ItemDecoration decoration) {
        Intrinsics.m32179h(decoration, "decoration");
        setClipToPadding(false);
        Context context = getContext();
        Intrinsics.m32178g(context, "context");
        setLeft(DigitsKt.m16320a(12.0f, context));
        Context context2 = getContext();
        Intrinsics.m32178g(context2, "context");
        setRight(DigitsKt.m16320a(12.0f, context2));
        super.mo3802k(decoration);
    }
}

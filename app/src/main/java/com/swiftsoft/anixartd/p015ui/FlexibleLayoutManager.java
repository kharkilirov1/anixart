package com.swiftsoft.anixartd.p015ui;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FlexibleLayoutManager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/FlexibleLayoutManager;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FlexibleLayoutManager {

    /* renamed from: a */
    @NotNull
    public static final FlexibleLayoutManager f27405a = new FlexibleLayoutManager();

    @NotNull
    /* renamed from: a */
    public final RecyclerView.LayoutManager m15321a(@NotNull Context context, int i2, @NotNull EpoxyController epoxyController) {
        Intrinsics.m32179h(epoxyController, "epoxyController");
        if (i2 != 1) {
            return new LinearLayoutManager(1, false);
        }
        int i3 = (int) ((context.getResources().getDisplayMetrics().widthPixels / (context.getResources().getDisplayMetrics().densityDpi / 160)) / 125);
        if (i3 < 3) {
            i3 = 3;
        }
        epoxyController.setSpanCount(i3);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i3);
        gridLayoutManager.f5332N = epoxyController.getSpanSizeLookup();
        return gridLayoutManager;
    }
}

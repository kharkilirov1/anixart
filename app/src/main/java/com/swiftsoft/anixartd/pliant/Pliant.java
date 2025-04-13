package com.swiftsoft.anixartd.pliant;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pliant.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/pliant/Pliant;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class Pliant extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    @NotNull
    public Map<KClass<? extends EpoxyModel<? extends Object>>, Function3<Rect, Integer, Integer, Unit>> f25807a = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    public Map<KClass<? extends EpoxyModel<? extends Object>>, Function5<Canvas, RecyclerView, RecyclerView.Adapter<?>, View, RecyclerView.LayoutParams, Unit>> f25808b = new LinkedHashMap();

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: f */
    public final void mo3404f(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int itemCount;
        Function3<Rect, Integer, Integer, Unit> function3;
        Intrinsics.m32179h(rect, "rect");
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(recyclerView, "recyclerView");
        Intrinsics.m32179h(state, "state");
        ((RecyclerView.LayoutParams) view.getLayoutParams()).m3910a();
        rect.set(0, 0, 0, 0);
        RecyclerView.ViewHolder m3783Q = recyclerView.m3783Q(view);
        Intrinsics.m32177f(m3783Q, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyViewHolder");
        EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) m3783Q;
        epoxyViewHolder.m4576a();
        EpoxyModel epoxyModel = epoxyViewHolder.f6963a;
        int m3782P = recyclerView.m3782P(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || m3782P >= (itemCount = adapter.getItemCount()) || (function3 = this.f25807a.get(Reflection.m32193a(epoxyModel.getClass()))) == null) {
            return;
        }
        function3.mo16505k(rect, Integer.valueOf(m3782P), Integer.valueOf(itemCount));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: h */
    public final void mo3405h(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        RecyclerView.Adapter<?> adapter;
        Intrinsics.m32179h(canvas, "canvas");
        Intrinsics.m32179h(state, "state");
        int childCount = recyclerView.getChildCount() - 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            RecyclerView.ViewHolder m3783Q = recyclerView.m3783Q(childAt);
            Intrinsics.m32177f(m3783Q, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyViewHolder");
            EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) m3783Q;
            epoxyViewHolder.m4576a();
            EpoxyModel epoxyModel = epoxyViewHolder.f6963a;
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.m32177f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            Function5<Canvas, RecyclerView, RecyclerView.Adapter<?>, View, RecyclerView.LayoutParams, Unit> function5 = this.f25808b.get(Reflection.m32193a(epoxyModel.getClass()));
            if (function5 != null && (adapter = recyclerView.getAdapter()) != null) {
                function5.mo32151v(canvas, recyclerView, adapter, childAt, layoutParams2);
            }
        }
    }
}

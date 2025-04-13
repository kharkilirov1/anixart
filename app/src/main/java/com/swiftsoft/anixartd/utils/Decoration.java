package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: Decoration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Decoration;", "", "Builder", "ComplexBuilder", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Decoration {

    /* compiled from: Decoration.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Decoration$Builder;", "", "ItemDecoration", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Builder {

        /* renamed from: a */
        @NotNull
        public final Context f30132a;

        /* renamed from: b */
        public int f30133b;

        /* renamed from: d */
        public int f30135d;

        /* renamed from: e */
        public int f30136e;

        /* renamed from: c */
        public int f30134c = 1;

        /* renamed from: f */
        public int f30137f = 1;

        /* compiled from: Decoration.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Decoration$Builder$ItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public final class ItemDecoration extends RecyclerView.ItemDecoration {
            public ItemDecoration() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            /* renamed from: f */
            public void mo3404f(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                Intrinsics.m32179h(outRect, "outRect");
                Intrinsics.m32179h(view, "view");
                Intrinsics.m32179h(parent, "parent");
                Intrinsics.m32179h(state, "state");
                ((RecyclerView.LayoutParams) view.getLayoutParams()).m3910a();
                outRect.set(0, 0, 0, 0);
                int m3782P = parent.m3782P(view);
                RecyclerView.Adapter adapter = parent.getAdapter();
                if (adapter != null) {
                    Builder builder = Builder.this;
                    int itemCount = adapter.getItemCount();
                    int i2 = builder.f30133b;
                    if (i2 == 0) {
                        outRect.top = 0;
                        outRect.left = 0;
                        outRect.right = 0;
                        if (m3782P == 0) {
                            outRect.top = builder.f30135d;
                        }
                        int i3 = itemCount - 1;
                        if (m3782P < i3) {
                            outRect.bottom = 0;
                        }
                        if (m3782P == i3) {
                            outRect.bottom = builder.f30136e;
                            return;
                        }
                        return;
                    }
                    if (i2 == 1) {
                        outRect.left = 0;
                        if (m3782P == 0) {
                            outRect.left = builder.f30135d;
                        }
                        int i4 = itemCount - 1;
                        if (m3782P < i4) {
                            outRect.right = 0;
                        }
                        if (m3782P == i4) {
                            outRect.right = builder.f30136e;
                            return;
                        }
                        return;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        int i5 = builder.f30134c;
                        if (m3782P < i5) {
                            outRect.left = builder.f30135d;
                        }
                        if ((m3782P + 1) % i5 == 1) {
                            outRect.bottom = 0;
                        }
                        outRect.right = 0;
                        return;
                    }
                    outRect.top = 0;
                    int i6 = builder.f30134c;
                    if (m3782P < i6) {
                        outRect.top = builder.f30135d;
                    }
                    if (m3782P >= i6) {
                        outRect.top = 0;
                    }
                    if ((m3782P + 1) % i6 != 0) {
                        outRect.right = 0;
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            /* renamed from: h */
            public void mo3405h(@NotNull Canvas c2, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
                Intrinsics.m32179h(c2, "c");
                Intrinsics.m32179h(state, "state");
                Objects.requireNonNull(Builder.this);
            }
        }

        public Builder(@NotNull Context context) {
            this.f30132a = context;
        }
    }

    /* compiled from: Decoration.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Decoration$ComplexBuilder;", "", "InnerBuilder", "ItemDecoration", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class ComplexBuilder {

        /* renamed from: a */
        @NotNull
        public final Context f30139a;

        /* renamed from: b */
        @NotNull
        public Map<KClass<? extends EpoxyModel<? extends Object>>, InnerBuilder> f30140b = new LinkedHashMap();

        /* compiled from: Decoration.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Decoration$ComplexBuilder$InnerBuilder;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class InnerBuilder {

            /* renamed from: a */
            public float f30141a;
        }

        /* compiled from: Decoration.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Decoration$ComplexBuilder$ItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public final class ItemDecoration extends RecyclerView.ItemDecoration {
            public ItemDecoration() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            /* renamed from: f */
            public void mo3404f(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
                InnerBuilder innerBuilder;
                Intrinsics.m32179h(outRect, "outRect");
                Intrinsics.m32179h(view, "view");
                Intrinsics.m32179h(parent, "parent");
                Intrinsics.m32179h(state, "state");
                ((RecyclerView.LayoutParams) view.getLayoutParams()).m3910a();
                outRect.set(0, 0, 0, 0);
                int m3782P = parent.m3782P(view);
                RecyclerView.ViewHolder m3783Q = parent.m3783Q(view);
                EpoxyModel epoxyModel = null;
                EpoxyViewHolder epoxyViewHolder = m3783Q instanceof EpoxyViewHolder ? (EpoxyViewHolder) m3783Q : null;
                if (epoxyViewHolder != null) {
                    epoxyViewHolder.m4576a();
                    epoxyModel = epoxyViewHolder.f6963a;
                }
                if (epoxyModel == null || (innerBuilder = ComplexBuilder.this.f30140b.get(Reflection.m32193a(epoxyModel.getClass()))) == null) {
                    return;
                }
                ComplexBuilder complexBuilder = ComplexBuilder.this;
                if (m3782P == 0) {
                    float f2 = innerBuilder.f30141a;
                    if (!(f2 == 0.0f)) {
                        outRect.left = DigitsKt.m16320a(f2, complexBuilder.f30139a);
                        outRect.right = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
                        outRect.top = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
                        outRect.bottom = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
                    }
                }
                outRect.left = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
                outRect.right = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
                outRect.top = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
                outRect.bottom = DigitsKt.m16320a(0.0f, complexBuilder.f30139a);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            /* renamed from: h */
            public void mo3405h(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
                Intrinsics.m32179h(canvas, "canvas");
                Intrinsics.m32179h(state, "state");
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    RecyclerView.ViewHolder m3783Q = recyclerView.m3783Q(recyclerView.getChildAt(i2));
                    EpoxyModel epoxyModel = null;
                    EpoxyViewHolder epoxyViewHolder = m3783Q instanceof EpoxyViewHolder ? (EpoxyViewHolder) m3783Q : null;
                    if (epoxyViewHolder != null) {
                        epoxyViewHolder.m4576a();
                        epoxyModel = epoxyViewHolder.f6963a;
                    }
                    if (epoxyModel == null || ComplexBuilder.this.f30140b.get(Reflection.m32193a(epoxyModel.getClass())) == null) {
                        return;
                    }
                }
            }
        }

        public ComplexBuilder(@NotNull Context context) {
            this.f30139a = context;
        }
    }
}

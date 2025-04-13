package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class EpoxyTouchHelper {

    public static class DragBuilder {
    }

    public static class DragBuilder2 {
    }

    public static class DragBuilder3 {
    }

    public static class DragBuilder4<U extends EpoxyModel> {

        /* renamed from: a */
        public final EpoxyController f6956a;

        /* renamed from: b */
        public final RecyclerView f6957b;

        /* renamed from: c */
        public final int f6958c;

        /* renamed from: d */
        public final Class<U> f6959d;

        /* renamed from: e */
        public final List<Class<? extends EpoxyModel>> f6960e;

        public DragBuilder4(EpoxyController epoxyController, RecyclerView recyclerView, int i2, Class cls, List list, C07141 c07141) {
            this.f6956a = epoxyController;
            this.f6957b = recyclerView;
            this.f6958c = i2;
            this.f6959d = cls;
            this.f6960e = list;
        }

        /* renamed from: a */
        public ItemTouchHelper m4572a(final DragCallbacks<U> dragCallbacks) {
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new EpoxyModelTouchCallback<U>(this.f6956a, this.f6959d) { // from class: com.airbnb.epoxy.EpoxyTouchHelper.DragBuilder4.1
                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                /* renamed from: A */
                public void mo4545A(U u, View view) {
                    dragCallbacks.mo4573b(u, view);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                /* renamed from: B */
                public void mo4546B(U u, View view, int i2) {
                    dragCallbacks.mo4574c(u, view, i2);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                /* renamed from: C */
                public void mo4547C(int i2, int i3, U u, View view) {
                    dragCallbacks.mo4575d(i2, i3, u, view);
                }

                @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
                /* renamed from: a */
                public int mo4489a(U u, int i2) {
                    return DragBuilder4.this.f6958c;
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                /* renamed from: y */
                public void mo4559y(U u, View view) {
                    Objects.requireNonNull(dragCallbacks);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                /* renamed from: z */
                public boolean mo4560z(EpoxyModel<?> epoxyModel) {
                    if (!(DragBuilder4.this.f6960e.size() == 1 ? this.f6938e.isInstance(epoxyModel) : DragBuilder4.this.f6960e.contains(epoxyModel.getClass()))) {
                        return false;
                    }
                    Objects.requireNonNull(dragCallbacks);
                    return true;
                }
            });
            itemTouchHelper.m3634i(this.f6957b);
            return itemTouchHelper;
        }
    }

    public static abstract class DragCallbacks<T extends EpoxyModel> implements EpoxyDragCallback<T> {
        /* renamed from: b */
        public void mo4573b(T t, View view) {
        }

        /* renamed from: c */
        public void mo4574c(T t, View view, int i2) {
        }

        /* renamed from: d */
        public abstract void mo4575d(int i2, int i3, T t, View view);
    }

    public static class SwipeBuilder {
    }

    public static class SwipeBuilder2 {
    }

    public static class SwipeBuilder3<U extends EpoxyModel> {

        /* renamed from: com.airbnb.epoxy.EpoxyTouchHelper$SwipeBuilder3$1 */
        class C07161 extends EpoxyModelTouchCallback<EpoxyModel> {
            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            /* renamed from: D */
            public void mo4548D(EpoxyModel epoxyModel, View view, int i2, int i3) {
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            /* renamed from: E */
            public void mo4549E(EpoxyModel epoxyModel, View view, float f2, Canvas canvas) {
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            /* renamed from: F */
            public void mo4550F(EpoxyModel epoxyModel, View view) {
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            /* renamed from: G */
            public void mo4551G(EpoxyModel epoxyModel, View view, int i2) {
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
            /* renamed from: a */
            public int mo4489a(EpoxyModel epoxyModel, int i2) {
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            /* renamed from: y */
            public void mo4559y(EpoxyModel epoxyModel, View view) {
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
            /* renamed from: z */
            public boolean mo4560z(EpoxyModel<?> epoxyModel) {
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    public static abstract class SwipeCallbacks<T extends EpoxyModel> implements EpoxySwipeCallback<T> {
    }
}

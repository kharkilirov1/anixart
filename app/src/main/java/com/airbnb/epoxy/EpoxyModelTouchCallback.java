package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class EpoxyModelTouchCallback<T extends EpoxyModel> extends EpoxyTouchHelperCallback implements EpoxyDragCallback<T>, EpoxySwipeCallback<T> {

    /* renamed from: d */
    @Nullable
    public final EpoxyController f6937d;

    /* renamed from: e */
    public final Class<T> f6938e;

    /* renamed from: f */
    public EpoxyViewHolder f6939f;

    /* renamed from: g */
    public EpoxyViewHolder f6940g;

    public EpoxyModelTouchCallback(@Nullable EpoxyController epoxyController, Class<T> cls) {
        this.f6937d = epoxyController;
        this.f6938e = cls;
    }

    /* renamed from: A */
    public void mo4545A(T t, View view) {
    }

    /* renamed from: B */
    public void mo4546B(T t, View view, int i2) {
    }

    /* renamed from: C */
    public void mo4547C(int i2, int i3, T t, View view) {
    }

    /* renamed from: D */
    public void mo4548D(T t, View view, int i2, int i3) {
    }

    /* renamed from: E */
    public void mo4549E(T t, View view, float f2, Canvas canvas) {
    }

    /* renamed from: F */
    public void mo4550F(T t, View view) {
    }

    /* renamed from: G */
    public void mo4551G(T t, View view, int i2) {
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: r */
    public boolean mo4552r(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, EpoxyViewHolder epoxyViewHolder2) {
        epoxyViewHolder2.m4576a();
        return mo4560z(epoxyViewHolder2.f6963a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: s */
    public void mo4553s(final RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder) {
        super.mo4553s(recyclerView, epoxyViewHolder);
        epoxyViewHolder.m4576a();
        mo4559y(epoxyViewHolder.f6963a, epoxyViewHolder.itemView);
        recyclerView.postDelayed(new Runnable() { // from class: com.airbnb.epoxy.EpoxyModelTouchCallback.1
            @Override // java.lang.Runnable
            public void run() {
                EpoxyModelTouchCallback epoxyModelTouchCallback = EpoxyModelTouchCallback.this;
                RecyclerView recyclerView2 = recyclerView;
                Objects.requireNonNull(epoxyModelTouchCallback);
                recyclerView2.setTag(C2507R.id.epoxy_touch_helper_selection_status, null);
            }
        }, 300L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((r5.getTag(com.swiftsoft.anixartd.C2507R.id.epoxy_touch_helper_selection_status) != null) != false) goto L13;
     */
    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo4554t(androidx.recyclerview.widget.RecyclerView r5, com.airbnb.epoxy.EpoxyViewHolder r6) {
        /*
            r4 = this;
            r6.m4576a()
            com.airbnb.epoxy.EpoxyModel r0 = r6.f6963a
            com.airbnb.epoxy.EpoxyViewHolder r1 = r4.f6939f
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1e
            com.airbnb.epoxy.EpoxyViewHolder r1 = r4.f6940g
            if (r1 != 0) goto L1e
            r1 = 2131362206(0x7f0a019e, float:1.8344186E38)
            java.lang.Object r5 = r5.getTag(r1)
            if (r5 == 0) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 == 0) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 != 0) goto L30
            boolean r5 = r4.mo4560z(r0)
            if (r5 == 0) goto L30
            int r5 = r6.getAdapterPosition()
            int r5 = r4.mo4489a(r0, r5)
            return r5
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyModelTouchCallback.mo4554t(androidx.recyclerview.widget.RecyclerView, com.airbnb.epoxy.EpoxyViewHolder):int");
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: u */
    public void mo4555u(Canvas canvas, RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, float f2, float f3, int i2, boolean z) {
        super.mo4555u(canvas, recyclerView, epoxyViewHolder, f2, f3, i2, z);
        try {
            epoxyViewHolder.m4576a();
            EpoxyModel<?> epoxyModel = epoxyViewHolder.f6963a;
            if (mo4560z(epoxyModel)) {
                mo4549E(epoxyModel, epoxyViewHolder.itemView, Math.max(-1.0f, Math.min(1.0f, Math.abs(f2) > Math.abs(f3) ? f2 / r3.getWidth() : f3 / r3.getHeight())), canvas);
            } else {
                StringBuilder m24u = C0000a.m24u("A model was selected that is not a valid target: ");
                m24u.append(epoxyModel.getClass());
                throw new IllegalStateException(m24u.toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: v */
    public boolean mo4556v(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, EpoxyViewHolder epoxyViewHolder2) {
        if (this.f6937d == null) {
            throw new IllegalStateException("A controller must be provided in the constructor if dragging is enabled");
        }
        int adapterPosition = epoxyViewHolder.getAdapterPosition();
        int adapterPosition2 = epoxyViewHolder2.getAdapterPosition();
        this.f6937d.moveModel(adapterPosition, adapterPosition2);
        epoxyViewHolder.m4576a();
        EpoxyModel<?> epoxyModel = epoxyViewHolder.f6963a;
        if (mo4560z(epoxyModel)) {
            mo4547C(adapterPosition, adapterPosition2, epoxyModel, epoxyViewHolder.itemView);
            return true;
        }
        StringBuilder m24u = C0000a.m24u("A model was dragged that is not a valid target: ");
        m24u.append(epoxyModel.getClass());
        throw new IllegalStateException(m24u.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: w */
    public void mo4557w(@Nullable EpoxyViewHolder epoxyViewHolder, int i2) {
        if (epoxyViewHolder == null) {
            EpoxyViewHolder epoxyViewHolder2 = this.f6939f;
            if (epoxyViewHolder2 != null) {
                epoxyViewHolder2.m4576a();
                mo4545A(epoxyViewHolder2.f6963a, this.f6939f.itemView);
                this.f6939f = null;
                return;
            } else {
                EpoxyViewHolder epoxyViewHolder3 = this.f6940g;
                if (epoxyViewHolder3 != null) {
                    epoxyViewHolder3.m4576a();
                    mo4550F(epoxyViewHolder3.f6963a, this.f6940g.itemView);
                    this.f6940g = null;
                    return;
                }
                return;
            }
        }
        epoxyViewHolder.m4576a();
        EpoxyModel epoxyModel = epoxyViewHolder.f6963a;
        if (!mo4560z(epoxyModel)) {
            StringBuilder m24u = C0000a.m24u("A model was selected that is not a valid target: ");
            m24u.append(epoxyModel.getClass());
            throw new IllegalStateException(m24u.toString());
        }
        ((RecyclerView) epoxyViewHolder.itemView.getParent()).setTag(C2507R.id.epoxy_touch_helper_selection_status, Boolean.TRUE);
        if (i2 == 1) {
            this.f6940g = epoxyViewHolder;
            mo4551G(epoxyModel, epoxyViewHolder.itemView, epoxyViewHolder.getAdapterPosition());
        } else if (i2 == 2) {
            this.f6939f = epoxyViewHolder;
            mo4546B(epoxyModel, epoxyViewHolder.itemView, epoxyViewHolder.getAdapterPosition());
        }
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    /* renamed from: x */
    public void mo4558x(EpoxyViewHolder epoxyViewHolder, int i2) {
        epoxyViewHolder.m4576a();
        EpoxyModel<?> epoxyModel = epoxyViewHolder.f6963a;
        View view = epoxyViewHolder.itemView;
        int adapterPosition = epoxyViewHolder.getAdapterPosition();
        if (mo4560z(epoxyModel)) {
            mo4548D(epoxyModel, view, adapterPosition, i2);
        } else {
            StringBuilder m24u = C0000a.m24u("A model was swiped that is not a valid target: ");
            m24u.append(epoxyModel.getClass());
            throw new IllegalStateException(m24u.toString());
        }
    }

    /* renamed from: y */
    public void mo4559y(T t, View view) {
    }

    /* renamed from: z */
    public boolean mo4560z(EpoxyModel<?> epoxyModel) {
        return this.f6938e.isInstance(epoxyModel);
    }
}

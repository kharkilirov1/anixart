package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes.dex */
public class EpoxyModelGroup extends EpoxyModelWithHolder<ModelGroupHolder> {

    /* renamed from: k */
    public final List<EpoxyModel<?>> f6934k = new ArrayList();

    /* renamed from: l */
    public boolean f6935l;

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$1 */
    public class C07081 implements IterateModelsCallback {
        public C07081(EpoxyModelGroup epoxyModelGroup) {
        }

        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        /* renamed from: a */
        public void mo4544a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i2) {
            EpoxyModelGroup.m4531D2(epoxyModel, epoxyViewHolder);
            epoxyViewHolder.m4577b(epoxyModel, null, Collections.emptyList(), i2);
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$2 */
    class C07092 implements IterateModelsCallback {
        public C07092(EpoxyModelGroup epoxyModelGroup) {
        }

        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        /* renamed from: a */
        public void mo4544a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i2) {
            EpoxyModelGroup.m4531D2(epoxyModel, epoxyViewHolder);
            epoxyViewHolder.m4577b(epoxyModel, null, Collections.emptyList(), i2);
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$4 */
    class C07114 implements IterateModelsCallback {
        public C07114(EpoxyModelGroup epoxyModelGroup) {
        }

        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        /* renamed from: a */
        public void mo4544a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i2) {
            epoxyModel.mo4525m2(epoxyViewHolder.m4578c());
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$5 */
    public class C07125 implements IterateModelsCallback {
        public C07125(EpoxyModelGroup epoxyModelGroup) {
        }

        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        /* renamed from: a */
        public void mo4544a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i2) {
            epoxyModel.mo4526n2(epoxyViewHolder.m4578c());
        }
    }

    public interface IterateModelsCallback {
        /* renamed from: a */
        void mo4544a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i2);
    }

    public EpoxyModelGroup() {
        this.f6935l = false;
        this.f6935l = false;
    }

    /* renamed from: D2 */
    public static void m4531D2(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder) {
        if (epoxyModel.f6926c) {
            epoxyViewHolder.itemView.setVisibility(0);
        } else {
            epoxyViewHolder.itemView.setVisibility(8);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    @CallSuper
    /* renamed from: E2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(@NonNull ModelGroupHolder modelGroupHolder) {
        m4535G2(modelGroupHolder, new C07081(this));
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: F2, reason: merged with bridge method [inline-methods] */
    public void mo4497a2(@NonNull ModelGroupHolder modelGroupHolder, @NonNull EpoxyModel<?> epoxyModel) {
        if (!(epoxyModel instanceof EpoxyModelGroup)) {
            m4535G2(modelGroupHolder, new C07081(this));
        } else {
            final EpoxyModelGroup epoxyModelGroup = (EpoxyModelGroup) epoxyModel;
            m4535G2(modelGroupHolder, new IterateModelsCallback(this) { // from class: com.airbnb.epoxy.EpoxyModelGroup.3
                @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
                /* renamed from: a */
                public void mo4544a(EpoxyModel epoxyModel2, EpoxyViewHolder epoxyViewHolder, int i2) {
                    EpoxyModelGroup.m4531D2(epoxyModel2, epoxyViewHolder);
                    if (i2 < epoxyModelGroup.f6934k.size()) {
                        EpoxyModel<?> epoxyModel3 = epoxyModelGroup.f6934k.get(i2);
                        if (epoxyModel3.f6925b == epoxyModel2.f6925b) {
                            epoxyViewHolder.m4577b(epoxyModel2, epoxyModel3, Collections.emptyList(), i2);
                            return;
                        }
                    }
                    epoxyViewHolder.m4577b(epoxyModel2, null, Collections.emptyList(), i2);
                }
            });
        }
    }

    /* renamed from: G2 */
    public final void m4535G2(ModelGroupHolder modelGroupHolder, IterateModelsCallback iterateModelsCallback) {
        ViewGroup viewGroup;
        List<EpoxyModel<?>> list;
        int size;
        int size2;
        Objects.requireNonNull(modelGroupHolder);
        EpoxyModelGroup epoxyModelGroup = modelGroupHolder.f7009e;
        if (epoxyModelGroup != this) {
            if (epoxyModelGroup != null && epoxyModelGroup.f6934k.size() > this.f6934k.size() && epoxyModelGroup.f6934k.size() - 1 >= (size2 = this.f6934k.size())) {
                while (true) {
                    modelGroupHolder.m4591c(size);
                    if (size == size2) {
                        break;
                    } else {
                        size--;
                    }
                }
            }
            modelGroupHolder.f7009e = this;
            List<EpoxyModel<?>> list2 = this.f6934k;
            int size3 = list2.size();
            if (modelGroupHolder.f7008d == null) {
                Intrinsics.m32189r("stubs");
                throw null;
            }
            if (!r5.isEmpty()) {
                List<ViewStubData> list3 = modelGroupHolder.f7008d;
                if (list3 == null) {
                    Intrinsics.m32189r("stubs");
                    throw null;
                }
                if (list3.size() < size3) {
                    StringBuilder m25v = C0000a.m25v("Insufficient view stubs for EpoxyModelGroup. ", size3, " models were provided but only ");
                    List<ViewStubData> list4 = modelGroupHolder.f7008d;
                    if (list4 == null) {
                        Intrinsics.m32189r("stubs");
                        throw null;
                    }
                    m25v.append(list4.size());
                    m25v.append(" view stubs exist.");
                    throw new IllegalStateException(m25v.toString());
                }
            }
            modelGroupHolder.f7005a.ensureCapacity(size3);
            for (int i2 = 0; i2 < size3; i2++) {
                EpoxyModel<?> model = list2.get(i2);
                EpoxyModel epoxyModel = (epoxyModelGroup == null || (list = epoxyModelGroup.f6934k) == null) ? null : (EpoxyModel) CollectionsKt.m32048y(list, i2);
                List<ViewStubData> list5 = modelGroupHolder.f7008d;
                if (list5 == null) {
                    Intrinsics.m32189r("stubs");
                    throw null;
                }
                ViewStubData viewStubData = (ViewStubData) CollectionsKt.m32048y(list5, i2);
                if ((viewStubData == null || (viewGroup = viewStubData.f7041a) == null) && (viewGroup = modelGroupHolder.f7007c) == null) {
                    Intrinsics.m32189r("childContainer");
                    throw null;
                }
                if (epoxyModel != null) {
                    if (ViewTypeManager.m4627a(epoxyModel) == ViewTypeManager.m4627a(model)) {
                        continue;
                    } else {
                        modelGroupHolder.m4591c(i2);
                    }
                }
                Intrinsics.m32178g(model, "model");
                int m4627a = ViewTypeManager.m4627a(model);
                RecyclerView.ViewHolder mo3916b = modelGroupHolder.f7006b.mo3916b(m4627a);
                if (!(mo3916b instanceof EpoxyViewHolder)) {
                    mo3916b = null;
                }
                EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) mo3916b;
                if (epoxyViewHolder == null) {
                    HelperAdapter helperAdapter = ModelGroupHolder.f7003g;
                    ViewParent modelGroupParent = modelGroupHolder.f7010f;
                    Objects.requireNonNull(helperAdapter);
                    Intrinsics.m32179h(modelGroupParent, "modelGroupParent");
                    helperAdapter.f6999a = model;
                    helperAdapter.f7000b = modelGroupParent;
                    EpoxyViewHolder createViewHolder = helperAdapter.createViewHolder(viewGroup, m4627a);
                    Intrinsics.m32178g(createViewHolder, "createViewHolder(parent, viewType)");
                    helperAdapter.f6999a = null;
                    helperAdapter.f7000b = null;
                    epoxyViewHolder = createViewHolder;
                }
                if (viewStubData == null) {
                    ViewGroup viewGroup2 = modelGroupHolder.f7007c;
                    if (viewGroup2 == null) {
                        Intrinsics.m32189r("childContainer");
                        throw null;
                    }
                    viewGroup2.addView(epoxyViewHolder.itemView, i2);
                } else {
                    View view = epoxyViewHolder.itemView;
                    Intrinsics.m32178g(view, "holder.itemView");
                    viewStubData.m4626a();
                    int inflatedId = viewStubData.f7042b.getInflatedId();
                    if (inflatedId != -1) {
                        view.setId(inflatedId);
                    }
                    viewStubData.f7041a.addView(view, viewStubData.f7043c, viewStubData.f7042b.getLayoutParams());
                }
                modelGroupHolder.f7005a.add(i2, epoxyViewHolder);
            }
        }
        int size4 = this.f6934k.size();
        for (int i3 = 0; i3 < size4; i3++) {
            iterateModelsCallback.mo4544a(this.f6934k.get(i3), modelGroupHolder.f7005a.get(i3), i3);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    @CallSuper
    /* renamed from: H2, reason: merged with bridge method [inline-methods] */
    public void mo4526n2(ModelGroupHolder modelGroupHolder) {
        m4535G2(modelGroupHolder, new C07125(this));
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    @CallSuper
    /* renamed from: I2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NonNull ModelGroupHolder modelGroupHolder) {
        if (modelGroupHolder.f7009e == null) {
            throw new IllegalStateException("Group is not bound");
        }
        int size = modelGroupHolder.f7005a.size();
        for (int i2 = 0; i2 < size; i2++) {
            modelGroupHolder.m4591c(modelGroupHolder.f7005a.size() - 1);
        }
        modelGroupHolder.f7009e = null;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    @CallSuper
    /* renamed from: b2 */
    public void mo4519b2(@NonNull Object obj, @NonNull List list) {
        m4535G2((ModelGroupHolder) obj, new C07092(this));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: d2 */
    public final int mo4499d2() {
        throw new UnsupportedOperationException("You should set a layout with layout(...) instead of using this.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: e2 */
    public int mo4500e2(int i2, int i3, int i4) {
        return this.f6934k.get(0).m4528r2(i2, i3, i4);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EpoxyModelGroup) && super.equals(obj)) {
            return this.f6934k.equals(((EpoxyModelGroup) obj).f6934k);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return this.f6934k.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    @CallSuper
    /* renamed from: m2 */
    public void mo4525m2(Object obj) {
        m4535G2((ModelGroupHolder) obj, new C07114(this));
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    @CallSuper
    /* renamed from: n2 */
    public void mo4526n2(Object obj) {
        m4535G2((ModelGroupHolder) obj, new C07125(this));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: q2 */
    public boolean mo4527q2() {
        return this.f6935l;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    @CallSuper
    /* renamed from: w2 */
    public void mo4519b2(@NonNull ModelGroupHolder modelGroupHolder, @NonNull List list) {
        m4535G2(modelGroupHolder, new C07092(this));
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: x2 */
    public ModelGroupHolder mo4541x2(@NonNull ViewParent viewParent) {
        return new ModelGroupHolder(viewParent);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    @CallSuper
    /* renamed from: y2 */
    public void mo4525m2(ModelGroupHolder modelGroupHolder) {
        m4535G2(modelGroupHolder, new C07114(this));
    }
}

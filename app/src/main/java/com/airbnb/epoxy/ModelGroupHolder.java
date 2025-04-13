package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModelGroupHolder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/airbnb/epoxy/ModelGroupHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "Companion", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class ModelGroupHolder extends EpoxyHolder {

    /* renamed from: a */
    @NotNull
    public final ArrayList<EpoxyViewHolder> f7005a;

    /* renamed from: b */
    @NotNull
    public final RecyclerView.RecycledViewPool f7006b;

    /* renamed from: c */
    public ViewGroup f7007c;

    /* renamed from: d */
    public List<ViewStubData> f7008d;

    /* renamed from: e */
    public EpoxyModelGroup f7009e;

    /* renamed from: f */
    public final ViewParent f7010f;

    /* renamed from: h */
    @NotNull
    public static final Companion f7004h = new Companion(null);

    /* renamed from: g */
    public static final HelperAdapter f7003g = new HelperAdapter();

    /* compiled from: ModelGroupHolder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/airbnb/epoxy/ModelGroupHolder$Companion;", "", "Lcom/airbnb/epoxy/HelperAdapter;", "HELPER_ADAPTER", "Lcom/airbnb/epoxy/HelperAdapter;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final RecyclerView.RecycledViewPool m4592a(ViewParent viewParent) {
            RecyclerView.RecycledViewPool recycledViewPool = null;
            while (recycledViewPool == null) {
                if (viewParent instanceof RecyclerView) {
                    recycledViewPool = ((RecyclerView) viewParent).getRecycledViewPool();
                } else {
                    ViewParent parent = viewParent.getParent();
                    recycledViewPool = parent instanceof ViewParent ? m4592a(parent) : new LocalGroupRecycledViewPool();
                }
            }
            return recycledViewPool;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ModelGroupHolder(@NotNull ViewParent modelGroupParent) {
        Intrinsics.m32179h(modelGroupParent, "modelGroupParent");
        this.f7010f = modelGroupParent;
        this.f7005a = new ArrayList<>(4);
        this.f7006b = f7004h.m4592a(modelGroupParent);
    }

    @Override // com.airbnb.epoxy.EpoxyHolder
    /* renamed from: a */
    public void mo4517a(@NotNull View itemView) {
        List list;
        Intrinsics.m32179h(itemView, "itemView");
        if (!(itemView instanceof ViewGroup)) {
            throw new IllegalStateException("The layout provided to EpoxyModelGroup must be a ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) itemView;
        View findViewById = viewGroup.findViewById(C2507R.id.epoxy_model_group_child_container);
        if (!(findViewById instanceof ViewGroup)) {
            findViewById = null;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        this.f7007c = viewGroup;
        if (viewGroup.getChildCount() != 0) {
            ViewGroup viewGroup3 = this.f7007c;
            if (viewGroup3 == null) {
                Intrinsics.m32189r("childContainer");
                throw null;
            }
            ArrayList<ViewStubData> arrayList = new ArrayList<>(4);
            m4590b(viewGroup3, arrayList);
            boolean isEmpty = arrayList.isEmpty();
            list = arrayList;
            if (isEmpty) {
                throw new IllegalStateException("No view stubs found. If viewgroup is not empty it must contain ViewStubs.");
            }
        } else {
            list = EmptyList.f63144b;
        }
        this.f7008d = list;
    }

    /* renamed from: b */
    public final void m4590b(ViewGroup viewGroup, ArrayList<ViewStubData> arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewGroup) {
                m4590b((ViewGroup) childAt, arrayList);
            } else if (childAt instanceof ViewStub) {
                arrayList.add(new ViewStubData(viewGroup, (ViewStub) childAt, i2));
            }
        }
    }

    /* renamed from: c */
    public final void m4591c(int i2) {
        if (this.f7008d == null) {
            Intrinsics.m32189r("stubs");
            throw null;
        }
        if (!r0.isEmpty()) {
            List<ViewStubData> list = this.f7008d;
            if (list == null) {
                Intrinsics.m32189r("stubs");
                throw null;
            }
            ViewStubData viewStubData = list.get(i2);
            viewStubData.m4626a();
            viewStubData.f7041a.addView(viewStubData.f7042b, viewStubData.f7043c);
        } else {
            ViewGroup viewGroup = this.f7007c;
            if (viewGroup == null) {
                Intrinsics.m32189r("childContainer");
                throw null;
            }
            viewGroup.removeViewAt(i2);
        }
        EpoxyViewHolder remove = this.f7005a.remove(i2);
        Intrinsics.m32178g(remove, "viewHolders.removeAt(modelPosition)");
        EpoxyViewHolder epoxyViewHolder = remove;
        epoxyViewHolder.m4576a();
        epoxyViewHolder.f6963a.mo4506s2(epoxyViewHolder.m4578c());
        epoxyViewHolder.f6963a = null;
        this.f7006b.mo3918d(epoxyViewHolder);
    }
}

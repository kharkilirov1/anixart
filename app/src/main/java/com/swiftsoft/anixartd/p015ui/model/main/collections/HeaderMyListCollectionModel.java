package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import android.widget.RelativeLayout;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderMyListCollectionModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/HeaderMyListCollectionModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class HeaderMyListCollectionModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29539k;

    /* compiled from: HeaderMyListCollectionModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/HeaderMyListCollectionModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: M */
        void mo14533M();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((RelativeLayout) view2.findViewById(C2507R.id.create_or_edit)).setOnClickListener(new ViewOnClickListenerC2744a(this, 5));
    }
}

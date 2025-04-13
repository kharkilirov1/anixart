package com.swiftsoft.anixartd.p015ui.model.main.collections;

import android.view.View;
import android.widget.RelativeLayout;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.collections.HeaderCollectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HeaderCollectionModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/HeaderCollectionModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class HeaderCollectionModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29538k;

    /* compiled from: HeaderCollectionModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/collections/HeaderCollectionModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: M */
        void mo14518M();

        /* renamed from: a1 */
        void mo14520a1();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final int i2 = 0;
        ((RelativeLayout) view2.findViewById(C2507R.id.create_or_edit)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.collections.d

            /* renamed from: c */
            public final /* synthetic */ HeaderCollectionModel f29548c;

            {
                this.f29548c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i2) {
                    case 0:
                        HeaderCollectionModel this$0 = this.f29548c;
                        Intrinsics.m32179h(this$0, "this$0");
                        HeaderCollectionModel.Listener listener = this$0.f29538k;
                        if (listener != null) {
                            listener.mo14518M();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                    default:
                        HeaderCollectionModel this$02 = this.f29548c;
                        Intrinsics.m32179h(this$02, "this$0");
                        HeaderCollectionModel.Listener listener2 = this$02.f29538k;
                        if (listener2 != null) {
                            listener2.mo14520a1();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                }
            }
        });
        final int i3 = 1;
        ((RelativeLayout) view2.findViewById(C2507R.id.myList)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.collections.d

            /* renamed from: c */
            public final /* synthetic */ HeaderCollectionModel f29548c;

            {
                this.f29548c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        HeaderCollectionModel this$0 = this.f29548c;
                        Intrinsics.m32179h(this$0, "this$0");
                        HeaderCollectionModel.Listener listener = this$0.f29538k;
                        if (listener != null) {
                            listener.mo14518M();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                    default:
                        HeaderCollectionModel this$02 = this.f29548c;
                        Intrinsics.m32179h(this$02, "this$0");
                        HeaderCollectionModel.Listener listener2 = this$02.f29538k;
                        if (listener2 != null) {
                            listener2.mo14520a1();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                }
            }
        });
    }
}

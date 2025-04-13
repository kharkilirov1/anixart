package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.ErrorModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p031j.C6523a;

/* compiled from: ErrorModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ErrorModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29383k;

    /* compiled from: ErrorModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/common/ErrorModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: c */
        void mo14387c();
    }

    public ErrorModel() {
        ((ErrorModel_) this).f6932i = C6523a.f63029t;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        AppCompatButton appCompatButton = (AppCompatButton) view2.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(appCompatButton, "view.repeat");
        ViewsKt.m16377j(appCompatButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.common.ErrorModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ErrorModel.Listener listener = ErrorModel.this.f29383k;
                if (listener != null) {
                    listener.mo14387c();
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
    }
}

package com.swiftsoft.anixartd.p015ui.model.main.home;

import android.view.View;
import android.widget.ImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p031j.C6523a;

/* compiled from: CustomFilterHintBigModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/home/CustomFilterHintBigModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class CustomFilterHintBigModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29743k;

    /* compiled from: CustomFilterHintBigModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/home/CustomFilterHintBigModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo14659a();

        /* renamed from: l0 */
        void mo14661l0();
    }

    public CustomFilterHintBigModel() {
        ((CustomFilterHintBigModel_) this).f6932i = C6523a.f63032w;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final int i2 = 0;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.home.a

            /* renamed from: c */
            public final /* synthetic */ CustomFilterHintBigModel f29745c;

            {
                this.f29745c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i2) {
                    case 0:
                        CustomFilterHintBigModel this$0 = this.f29745c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m16010u2().mo14661l0();
                        break;
                    case 1:
                        CustomFilterHintBigModel this$02 = this.f29745c;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m16010u2().mo14661l0();
                        break;
                    default:
                        CustomFilterHintBigModel this$03 = this.f29745c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m16010u2().mo14659a();
                        break;
                }
            }
        });
        final int i3 = 1;
        ((MaterialButton) view2.findViewById(C2507R.id.button)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.home.a

            /* renamed from: c */
            public final /* synthetic */ CustomFilterHintBigModel f29745c;

            {
                this.f29745c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        CustomFilterHintBigModel this$0 = this.f29745c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m16010u2().mo14661l0();
                        break;
                    case 1:
                        CustomFilterHintBigModel this$02 = this.f29745c;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m16010u2().mo14661l0();
                        break;
                    default:
                        CustomFilterHintBigModel this$03 = this.f29745c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m16010u2().mo14659a();
                        break;
                }
            }
        });
        final int i4 = 2;
        ((ImageView) view2.findViewById(C2507R.id.close)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.home.a

            /* renamed from: c */
            public final /* synthetic */ CustomFilterHintBigModel f29745c;

            {
                this.f29745c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i4) {
                    case 0:
                        CustomFilterHintBigModel this$0 = this.f29745c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m16010u2().mo14661l0();
                        break;
                    case 1:
                        CustomFilterHintBigModel this$02 = this.f29745c;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.m16010u2().mo14661l0();
                        break;
                    default:
                        CustomFilterHintBigModel this$03 = this.f29745c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.m16010u2().mo14659a();
                        break;
                }
            }
        });
    }

    @NotNull
    /* renamed from: u2 */
    public final Listener m16010u2() {
        Listener listener = this.f29743k;
        if (listener != null) {
            return listener;
        }
        Intrinsics.m32189r("listener");
        throw null;
    }
}

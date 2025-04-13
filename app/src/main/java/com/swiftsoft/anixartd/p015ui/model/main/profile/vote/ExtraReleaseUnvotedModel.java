package com.swiftsoft.anixartd.p015ui.model.main.profile.vote;

import android.view.View;
import android.widget.RelativeLayout;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.vote.ExtraReleaseUnvotedModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExtraReleaseUnvotedModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/vote/ExtraReleaseUnvotedModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ExtraReleaseUnvotedModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public Listener f29940k;

    /* compiled from: ExtraReleaseUnvotedModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/vote/ExtraReleaseUnvotedModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: h0 */
        void mo14986h0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        final int i2 = 0;
        ((RelativeLayout) view2.findViewById(C2507R.id.unvotedLayout)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.a

            /* renamed from: c */
            public final /* synthetic */ ExtraReleaseUnvotedModel f29973c;

            {
                this.f29973c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i2) {
                    case 0:
                        ExtraReleaseUnvotedModel this$0 = this.f29973c;
                        Intrinsics.m32179h(this$0, "this$0");
                        ExtraReleaseUnvotedModel.Listener listener = this$0.f29940k;
                        if (listener != null) {
                            listener.mo14986h0();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                    default:
                        ExtraReleaseUnvotedModel this$02 = this.f29973c;
                        Intrinsics.m32179h(this$02, "this$0");
                        ExtraReleaseUnvotedModel.Listener listener2 = this$02.f29940k;
                        if (listener2 != null) {
                            listener2.mo14986h0();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                }
            }
        });
        final int i3 = 1;
        ((MaterialButton) view2.findViewById(C2507R.id.btnUnvoted)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.model.main.profile.vote.a

            /* renamed from: c */
            public final /* synthetic */ ExtraReleaseUnvotedModel f29973c;

            {
                this.f29973c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        ExtraReleaseUnvotedModel this$0 = this.f29973c;
                        Intrinsics.m32179h(this$0, "this$0");
                        ExtraReleaseUnvotedModel.Listener listener = this$0.f29940k;
                        if (listener != null) {
                            listener.mo14986h0();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                    default:
                        ExtraReleaseUnvotedModel this$02 = this.f29973c;
                        Intrinsics.m32179h(this$02, "this$0");
                        ExtraReleaseUnvotedModel.Listener listener2 = this$02.f29940k;
                        if (listener2 != null) {
                            listener2.mo14986h0();
                            return;
                        } else {
                            Intrinsics.m32189r("listener");
                            throw null;
                        }
                }
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        ((MaterialButton) view.findViewById(C2507R.id.btnUnvoted)).setOnClickListener(null);
    }
}

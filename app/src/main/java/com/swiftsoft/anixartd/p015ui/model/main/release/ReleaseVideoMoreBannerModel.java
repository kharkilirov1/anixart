package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoMoreBannerModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoMoreBannerModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoMoreBannerModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseVideoMoreBannerModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f30022k;

    /* renamed from: l */
    @EpoxyAttribute
    public Listener f30023l;

    /* compiled from: ReleaseVideoMoreBannerModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoMoreBannerModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: Y0 */
        void mo15030Y0(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.ReleaseVideoMoreBannerModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseVideoMoreBannerModel releaseVideoMoreBannerModel = ReleaseVideoMoreBannerModel.this;
                ReleaseVideoMoreBannerModel.Listener listener = releaseVideoMoreBannerModel.f30023l;
                if (listener != null) {
                    listener.mo15030Y0(releaseVideoMoreBannerModel.f30022k);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}

package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.release.ReleaseVideoCategoryBannerModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseVideoCategoryBannerModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoCategoryBannerModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ReleaseVideoCategoryBannerModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public long f30014k;

    /* renamed from: n */
    @EpoxyAttribute
    public long f30017n;

    /* renamed from: p */
    @EpoxyAttribute
    public boolean f30019p;

    /* renamed from: q */
    @EpoxyAttribute
    public Listener f30020q;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f30015l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f30016m = "";

    /* renamed from: o */
    @EpoxyAttribute
    @NotNull
    public String f30018o = "";

    /* compiled from: ReleaseVideoCategoryBannerModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoCategoryBannerModel$Companion;", "", "", "ACTION_ID_CHANGED", "I", "IMAGE_CHANGED", "NAME_CHANGED", "NEW_CHANGED", "VALUE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseVideoCategoryBannerModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/ReleaseVideoCategoryBannerModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: I0 */
        void mo15028I0(long j2, long j3, @NotNull String str, @NotNull String str2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f30015l);
        TextView textView = (TextView) view2.findViewById(C2507R.id.isNew);
        Intrinsics.m32178g(textView, "view.isNew");
        ViewsKt.m16379l(textView, this.f30019p);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, this.f30016m);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.ReleaseVideoCategoryBannerModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                ReleaseVideoCategoryBannerModel releaseVideoCategoryBannerModel = ReleaseVideoCategoryBannerModel.this;
                ReleaseVideoCategoryBannerModel.Listener listener = releaseVideoCategoryBannerModel.f30020q;
                if (listener != null) {
                    listener.mo15028I0(releaseVideoCategoryBannerModel.f30014k, releaseVideoCategoryBannerModel.f30017n, releaseVideoCategoryBannerModel.f30018o, releaseVideoCategoryBannerModel.f30015l);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ReleaseVideoCategoryBannerModel) {
            ReleaseVideoCategoryBannerModel releaseVideoCategoryBannerModel = (ReleaseVideoCategoryBannerModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f30015l, releaseVideoCategoryBannerModel.f30015l)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f30016m, releaseVideoCategoryBannerModel.f30016m)) {
                m12276k.add(1);
            }
            if (this.f30017n != releaseVideoCategoryBannerModel.f30017n) {
                m12276k.add(2);
            }
            if (!Intrinsics.m32174c(this.f30018o, releaseVideoCategoryBannerModel.f30018o)) {
                m12276k.add(3);
            }
            if (this.f30019p != releaseVideoCategoryBannerModel.f30019p) {
                m12276k.add(4);
            }
            if (!m12276k.isEmpty()) {
                mo4519b2(view2, m12276k);
                return;
            }
        }
        mo4496Z1(view2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NotNull View view, @NotNull List<Object> list) {
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.name)).setText(this.f30015l);
        }
        if (list.contains(1)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16375h(appCompatImageView, this.f30016m);
        }
        if (list.contains(4)) {
            TextView textView = (TextView) view.findViewById(C2507R.id.isNew);
            Intrinsics.m32178g(textView, "view.isNew");
            ViewsKt.m16379l(textView, this.f30019p);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}

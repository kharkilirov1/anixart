package com.swiftsoft.anixartd.p015ui.model.main.release;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ViewOnLongClickListenerC2720d;
import com.swiftsoft.anixartd.p015ui.model.main.release.VideoBannerLargeModel;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VideoBannerLargeModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoBannerLargeModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class VideoBannerLargeModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public int f30040k;

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f30041l = "";

    /* renamed from: m */
    @EpoxyAttribute
    @NotNull
    public String f30042m = "";

    /* renamed from: n */
    @EpoxyAttribute
    @Nullable
    public String f30043n = "";

    /* renamed from: o */
    @EpoxyAttribute
    public Listener f30044o;

    /* compiled from: VideoBannerLargeModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoBannerLargeModel$Companion;", "", "", "HOSTING_ICON_CHANGED", "I", "IMAGE_CHANGED", "NAME_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: VideoBannerLargeModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/release/VideoBannerLargeModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: d */
        void mo15158d(int i2, long j2);

        /* renamed from: f */
        void mo15159f(int i2, long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f30041l);
        View findViewById = view2.findViewById(C2507R.id.shadow);
        Intrinsics.m32178g(findViewById, "view.shadow");
        ViewsKt.m16379l(findViewById, this.f30041l.length() > 0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.image);
        Intrinsics.m32178g(appCompatImageView, "view.image");
        ViewsKt.m16375h(appCompatImageView, this.f30042m);
        ImageView imageView = (ImageView) view2.findViewById(C2507R.id.hostingIcon);
        Intrinsics.m32178g(imageView, "view.hostingIcon");
        ViewsKt.m16375h(imageView, this.f30043n);
        ViewsKt.m16377j(view2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.release.VideoBannerLargeModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                VideoBannerLargeModel videoBannerLargeModel = VideoBannerLargeModel.this;
                VideoBannerLargeModel.Listener listener = videoBannerLargeModel.f30044o;
                if (listener != null) {
                    listener.mo15158d(videoBannerLargeModel.f30040k, videoBannerLargeModel.f6925b);
                    return Unit.f63088a;
                }
                Intrinsics.m32189r("listener");
                throw null;
            }
        });
        view2.setOnLongClickListener(new ViewOnLongClickListenerC2720d(this, 15));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof VideoBannerLargeModel) {
            VideoBannerLargeModel videoBannerLargeModel = (VideoBannerLargeModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f30041l, videoBannerLargeModel.f30041l)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f30042m, videoBannerLargeModel.f30042m)) {
                m12276k.add(1);
            }
            if (!Intrinsics.m32174c(this.f30043n, videoBannerLargeModel.f30043n)) {
                m12276k.add(2);
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
            ((TextView) view.findViewById(C2507R.id.name)).setText(this.f30041l);
            View findViewById = view.findViewById(C2507R.id.shadow);
            Intrinsics.m32178g(findViewById, "view.shadow");
            ViewsKt.m16379l(findViewById, this.f30041l.length() > 0);
        }
        if (list.contains(1)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.image);
            Intrinsics.m32178g(appCompatImageView, "view.image");
            ViewsKt.m16375h(appCompatImageView, this.f30042m);
        }
        if (list.contains(2)) {
            ImageView imageView = (ImageView) view.findViewById(C2507R.id.hostingIcon);
            Intrinsics.m32178g(imageView, "view.hostingIcon");
            ViewsKt.m16375h(imageView, this.f30043n);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}

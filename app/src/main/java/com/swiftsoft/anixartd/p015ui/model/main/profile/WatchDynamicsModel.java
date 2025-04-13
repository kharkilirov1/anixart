package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.DigitsKt;
import com.swiftsoft.anixartd.utils.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WatchDynamicsModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/WatchDynamicsModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class WatchDynamicsModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    public int f29851k;

    /* renamed from: l */
    @EpoxyAttribute
    public int f29852l;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29853m;

    /* compiled from: WatchDynamicsModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/WatchDynamicsModel$Companion;", "", "", "COUNT_CHANGED", "I", "MAX_COUNT_CHANGED", "TIMESTAMP_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.count)).setText(String.valueOf(this.f29851k));
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.progress);
        Intrinsics.m32178g(appCompatImageView, "view.progress");
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = Math.max((int) ((DigitsKt.m16322c(100, view2) * this.f29851k) / this.f29852l), DigitsKt.m16322c(10, view2));
        appCompatImageView.setLayoutParams(layoutParams);
        ((TextView) view2.findViewById(C2507R.id.day)).setText(Time.f30247a.m16358d(this.f29853m));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof WatchDynamicsModel) {
            WatchDynamicsModel watchDynamicsModel = (WatchDynamicsModel) epoxyModel;
            if (this.f29851k != watchDynamicsModel.f29851k) {
                m12276k.add(0);
            }
            if (this.f29852l != watchDynamicsModel.f29852l) {
                m12276k.add(1);
            }
            if (this.f29853m != watchDynamicsModel.f29853m) {
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
            ((TextView) view.findViewById(C2507R.id.count)).setText(String.valueOf(this.f29851k));
        }
        if (list.contains(1)) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.progress);
            Intrinsics.m32178g(appCompatImageView, "view.progress");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = Math.max((int) ((DigitsKt.m16322c(100, view) * this.f29851k) / this.f29852l), DigitsKt.m16322c(10, view));
            appCompatImageView.setLayoutParams(layoutParams);
        }
        if (list.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.day)).setText(Time.f30247a.m16358d(this.f29853m));
        }
    }
}

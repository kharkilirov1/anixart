package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.fragment.main.watching.ViewOnClickListenerC2744a;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProfileModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ProfileModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29830k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @Nullable
    public String f29831l = "";

    /* renamed from: m */
    @EpoxyAttribute
    public boolean f29832m;

    /* renamed from: n */
    @EpoxyAttribute
    public boolean f29833n;

    /* renamed from: o */
    @EpoxyAttribute
    public boolean f29834o;

    /* renamed from: p */
    @EpoxyAttribute
    public Listener f29835p;

    /* compiled from: ProfileModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileModel$Companion;", "", "", "AVATAR_CHANGED", "I", "NICKNAME_CHANGED", "ONLINE_CHANGED", "SPONSOR_CHANGED", "VERIFIED_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: f */
        void mo15220f(long j2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view2.findViewById(C2507R.id.sponsor);
        Intrinsics.m32178g(appCompatImageView, "view.sponsor");
        ViewsKt.m16379l(appCompatImageView, this.f29833n);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view2.findViewById(C2507R.id.verified);
        Intrinsics.m32178g(appCompatImageView2, "view.verified");
        ViewsKt.m16379l(appCompatImageView2, this.f29834o);
        ((TextView) view2.findViewById(C2507R.id.nickname)).setText(this.f29830k);
        String str = this.f29831l;
        if (str != null) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view2.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView3, "view.avatar");
            ViewsKt.m16368a(appCompatImageView3, str);
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) view2.findViewById(C2507R.id.isOnline);
        Intrinsics.m32178g(appCompatImageView4, "view.isOnline");
        ViewsKt.m16379l(appCompatImageView4, this.f29832m);
        view2.setOnClickListener(new ViewOnClickListenerC2744a(this, 11));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ProfileModel) {
            ProfileModel profileModel = (ProfileModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29830k, profileModel.f29830k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29831l, profileModel.f29831l)) {
                m12276k.add(1);
            }
            if (this.f29832m != profileModel.f29832m) {
                m12276k.add(2);
            }
            if (this.f29833n != profileModel.f29833n) {
                m12276k.add(3);
            }
            if (this.f29834o != profileModel.f29834o) {
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
        String str;
        if (C2052a.m12291z(view, "view", list, "payloads", 0)) {
            ((TextView) view.findViewById(C2507R.id.nickname)).setText(this.f29830k);
        }
        if (list.contains(1) && (str = this.f29831l) != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C2507R.id.avatar);
            Intrinsics.m32178g(appCompatImageView, "view.avatar");
            ViewsKt.m16368a(appCompatImageView, str);
        }
        if (list.contains(2)) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C2507R.id.isOnline);
            Intrinsics.m32178g(appCompatImageView2, "view.isOnline");
            ViewsKt.m16379l(appCompatImageView2, this.f29832m);
        }
        if (list.contains(3)) {
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(C2507R.id.sponsor);
            Intrinsics.m32178g(appCompatImageView3, "view.sponsor");
            ViewsKt.m16379l(appCompatImageView3, this.f29833n);
        }
        if (list.contains(4)) {
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) view.findViewById(C2507R.id.verified);
            Intrinsics.m32178g(appCompatImageView4, "view.verified");
            ViewsKt.m16379l(appCompatImageView4, this.f29834o);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}

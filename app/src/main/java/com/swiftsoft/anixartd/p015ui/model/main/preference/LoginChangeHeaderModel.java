package com.swiftsoft.anixartd.p015ui.model.main.preference;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.preference.LoginChangeHeaderModel;
import com.swiftsoft.anixartd.utils.Time;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoginChangeHeaderModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHeaderModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class LoginChangeHeaderModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29809k = "";

    /* renamed from: l */
    @EpoxyAttribute
    public boolean f29810l;

    /* renamed from: m */
    @EpoxyAttribute
    public long f29811m;

    /* renamed from: n */
    @EpoxyAttribute
    public Listener f29812n;

    /* compiled from: LoginChangeHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHeaderModel$Companion;", "", "", "CHANGE_AVAILABLE_CHANGED", "I", "LOGIN_CHANGED", "NEXT_CHANGE_AVAILABLE_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: LoginChangeHeaderModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHeaderModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: F0 */
        void mo14735F0();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        System.out.println((Object) ("changeAvailable 2 " + this.f29810l));
        ((TextView) view2.findViewById(C2507R.id.tvLogin)).setText(this.f29809k);
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C2507R.id.layoutNextChangeAvailableAt);
        Intrinsics.m32178g(linearLayout, "view.layoutNextChangeAvailableAt");
        ViewsKt.m16379l(linearLayout, !this.f29810l);
        MaterialButton materialButton = (MaterialButton) view2.findViewById(C2507R.id.btnChange);
        Intrinsics.m32178g(materialButton, "view.btnChange");
        ViewsKt.m16379l(materialButton, this.f29810l);
        ((TextView) view2.findViewById(C2507R.id.tvNextChangeAvailableAt)).setText(Time.f30247a.m16355a(this.f29811m));
        MaterialButton materialButton2 = (MaterialButton) view2.findViewById(C2507R.id.btnChange);
        Intrinsics.m32178g(materialButton2, "view.btnChange");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.model.main.preference.LoginChangeHeaderModel$bind$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view3) {
                View it = view3;
                Intrinsics.m32179h(it, "it");
                LoginChangeHeaderModel.Listener listener = LoginChangeHeaderModel.this.f29812n;
                if (listener != null) {
                    listener.mo14735F0();
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
        if (epoxyModel instanceof LoginChangeHeaderModel) {
            LoginChangeHeaderModel loginChangeHeaderModel = (LoginChangeHeaderModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29809k, loginChangeHeaderModel.f29809k)) {
                m12276k.add(0);
            }
            if (this.f29810l != loginChangeHeaderModel.f29810l) {
                m12276k.add(1);
            }
            if (this.f29811m != loginChangeHeaderModel.f29811m) {
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
    public void mo4519b2(@NotNull View view, @NotNull List<Object> payloads) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(payloads, "payloads");
        System.out.println((Object) ("changeAvailable 1 " + this.f29810l));
        if (payloads.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.tvLogin)).setText(this.f29809k);
        }
        if (payloads.contains(1)) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C2507R.id.layoutNextChangeAvailableAt);
            Intrinsics.m32178g(linearLayout, "view.layoutNextChangeAvailableAt");
            ViewsKt.m16379l(linearLayout, true ^ this.f29810l);
            MaterialButton materialButton = (MaterialButton) view.findViewById(C2507R.id.btnChange);
            Intrinsics.m32178g(materialButton, "view.btnChange");
            ViewsKt.m16379l(materialButton, this.f29810l);
        }
        if (payloads.contains(2)) {
            ((TextView) view.findViewById(C2507R.id.tvNextChangeAvailableAt)).setText(Time.f30247a.m16355a(this.f29811m));
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        ((MaterialButton) view.findViewById(C2507R.id.btnChange)).setOnClickListener(null);
    }
}

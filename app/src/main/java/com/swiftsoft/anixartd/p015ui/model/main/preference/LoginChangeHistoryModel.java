package com.swiftsoft.anixartd.p015ui.model.main.preference;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.Time;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoginChangeHistoryModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHistoryModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class LoginChangeHistoryModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @Nullable
    public String f29814k;

    /* renamed from: l */
    @EpoxyAttribute
    public long f29815l;

    /* compiled from: LoginChangeHistoryModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/preference/LoginChangeHistoryModel$Companion;", "", "", "LOGIN_CHANGED", "I", "TIME_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((TextView) view2.findViewById(C2507R.id.tvLogin)).setText(this.f29814k);
        if (this.f29815l == 0) {
            ((TextView) view2.findViewById(C2507R.id.tvTime)).setText("при регистрации");
            return;
        }
        TextView textView = (TextView) view2.findViewById(C2507R.id.tvTime);
        Time time = Time.f30247a;
        Context context = view2.getContext();
        Intrinsics.m32178g(context, "view.context");
        textView.setText(time.m16361g(context, this.f29815l));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof LoginChangeHistoryModel) {
            LoginChangeHistoryModel loginChangeHistoryModel = (LoginChangeHistoryModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29814k, loginChangeHistoryModel.f29814k)) {
                m12276k.add(0);
            }
            if (this.f29815l != loginChangeHistoryModel.f29815l) {
                m12276k.add(1);
            }
            if (true ^ m12276k.isEmpty()) {
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
            ((TextView) view.findViewById(C2507R.id.tvLogin)).setText(this.f29814k);
        }
        if (list.contains(1)) {
            if (this.f29815l == 0) {
                ((TextView) view.findViewById(C2507R.id.tvTime)).setText("при регистрации");
                return;
            }
            TextView textView = (TextView) view.findViewById(C2507R.id.tvTime);
            Time time = Time.f30247a;
            Context context = view.getContext();
            Intrinsics.m32178g(context, "view.context");
            textView.setText(time.m16361g(context, this.f29815l));
        }
    }
}

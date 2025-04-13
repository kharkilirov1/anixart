package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelClass;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileRoleModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileRoleModel;", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/View;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class ProfileRoleModel extends EpoxyModel<View> {

    /* renamed from: k */
    @EpoxyAttribute
    @NotNull
    public String f29836k = "";

    /* renamed from: l */
    @EpoxyAttribute
    @NotNull
    public String f29837l = "";

    /* renamed from: m */
    @EpoxyAttribute
    public Listener f29838m;

    /* compiled from: ProfileRoleModel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileRoleModel$Companion;", "", "", "COLOR_CHANGED", "I", "NAME_CHANGED", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ProfileRoleModel.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/model/main/profile/ProfileRoleModel$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: Z1 */
    public void mo4496Z1(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Context context = view2.getContext();
        ((TextView) view2.findViewById(C2507R.id.name)).setText(this.f29836k);
        try {
            Drawable m497b = AppCompatResources.m497b(context, C2507R.drawable.button_role);
            Intrinsics.m32176e(m497b);
            Drawable m1845q = DrawableCompat.m1845q(m497b);
            Intrinsics.m32178g(m1845q, "wrap(unwrappedDrawable!!)");
            DrawableCompat.m1841m(m1845q, Color.parseColor('#' + this.f29837l));
            view2.setBackground(m1845q);
            ((ImageView) view2.findViewById(C2507R.id.dot)).setColorFilter(Color.parseColor('#' + this.f29837l));
            ((TextView) view2.findViewById(C2507R.id.name)).setTextColor(Color.parseColor('#' + this.f29837l));
        } catch (Exception unused) {
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: a2 */
    public void mo4497a2(View view, EpoxyModel epoxyModel) {
        View view2 = view;
        ArrayList m12276k = C2052a.m12276k(view2, "view", epoxyModel, "previouslyBoundModel");
        if (epoxyModel instanceof ProfileRoleModel) {
            ProfileRoleModel profileRoleModel = (ProfileRoleModel) epoxyModel;
            if (!Intrinsics.m32174c(this.f29836k, profileRoleModel.f29836k)) {
                m12276k.add(0);
            }
            if (!Intrinsics.m32174c(this.f29837l, profileRoleModel.f29837l)) {
                m12276k.add(1);
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
        Context m12267b = C2052a.m12267b(view, "view", list, "payloads");
        if (list.contains(0)) {
            ((TextView) view.findViewById(C2507R.id.name)).setText(this.f29836k);
        }
        if (list.contains(1)) {
            try {
                Drawable m497b = AppCompatResources.m497b(m12267b, C2507R.drawable.button_role);
                Intrinsics.m32176e(m497b);
                Drawable m1845q = DrawableCompat.m1845q(m497b);
                Intrinsics.m32178g(m1845q, "wrap(unwrappedDrawable!!)");
                DrawableCompat.m1841m(m1845q, Color.parseColor('#' + this.f29837l));
                view.setBackground(m1845q);
                ((ImageView) view.findViewById(C2507R.id.dot)).setColorFilter(Color.parseColor('#' + this.f29837l));
                ((TextView) view.findViewById(C2507R.id.name)).setTextColor(Color.parseColor('#' + this.f29837l));
            } catch (Exception unused) {
            }
        }
    }
}

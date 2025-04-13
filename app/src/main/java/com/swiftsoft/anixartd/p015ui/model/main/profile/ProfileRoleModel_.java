package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ProfileRoleModel_ extends ProfileRoleModel implements GeneratedModel<View>, ProfileRoleModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModelBuilder
    /* renamed from: O1 */
    public ProfileRoleModelBuilder mo16058O1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29837l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModelBuilder
    /* renamed from: b */
    public ProfileRoleModelBuilder mo16059b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_profile_role;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileRoleModel_) || !super.equals(obj)) {
            return false;
        }
        ProfileRoleModel_ profileRoleModel_ = (ProfileRoleModel_) obj;
        Objects.requireNonNull(profileRoleModel_);
        String str = this.f29836k;
        if (str == null ? profileRoleModel_.f29836k != null : !str.equals(profileRoleModel_.f29836k)) {
            return false;
        }
        String str2 = this.f29837l;
        if (str2 == null ? profileRoleModel_.f29837l == null : str2.equals(profileRoleModel_.f29837l)) {
            return (this.f29838m == null) == (profileRoleModel_.f29838m == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModelBuilder
    /* renamed from: g1 */
    public ProfileRoleModelBuilder mo16060g1(ProfileRoleModel.Listener listener) {
        m4524l2();
        this.f29838m = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29836k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29837l;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29838m != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ void mo4506s2(View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ProfileRoleModel_{name=");
        m24u.append(this.f29836k);
        m24u.append(", color=");
        m24u.append(this.f29837l);
        m24u.append(", listener=");
        m24u.append(this.f29838m);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ProfileRoleModelBuilder
    /* renamed from: z */
    public ProfileRoleModelBuilder mo16061z(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29836k = str;
        return this;
    }
}

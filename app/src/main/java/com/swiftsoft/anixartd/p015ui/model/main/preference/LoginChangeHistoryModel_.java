package com.swiftsoft.anixartd.p015ui.model.main.preference;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class LoginChangeHistoryModel_ extends LoginChangeHistoryModel implements GeneratedModel<View>, LoginChangeHistoryModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_change_login_history;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginChangeHistoryModel_) || !super.equals(obj)) {
            return false;
        }
        LoginChangeHistoryModel_ loginChangeHistoryModel_ = (LoginChangeHistoryModel_) obj;
        Objects.requireNonNull(loginChangeHistoryModel_);
        String str = this.f29814k;
        if (str == null ? loginChangeHistoryModel_.f29814k == null : str.equals(loginChangeHistoryModel_.f29814k)) {
            return this.f29815l == loginChangeHistoryModel_.f29815l;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
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
        String str = this.f29814k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f29815l;
        return hashCode2 + ((int) (j2 ^ (j2 >>> 32)));
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
        StringBuilder m24u = C0000a.m24u("LoginChangeHistoryModel_{login=");
        m24u.append(this.f29814k);
        m24u.append(", time=");
        m24u.append(this.f29815l);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    /* renamed from: v2 */
    public LoginChangeHistoryModelBuilder m16037v2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

package com.swiftsoft.anixartd.p015ui.model.main.profile;

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
public class WatchDynamicsModel_ extends WatchDynamicsModel implements GeneratedModel<View>, WatchDynamicsModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.WatchDynamicsModelBuilder
    /* renamed from: G1 */
    public WatchDynamicsModelBuilder mo16080G1(int i2) {
        m4524l2();
        this.f29852l = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.WatchDynamicsModelBuilder
    /* renamed from: P */
    public WatchDynamicsModelBuilder mo16081P(long j2) {
        m4524l2();
        this.f29853m = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.WatchDynamicsModelBuilder
    /* renamed from: b */
    public WatchDynamicsModelBuilder mo16082b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_watch_dynamics;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WatchDynamicsModel_) || !super.equals(obj)) {
            return false;
        }
        WatchDynamicsModel_ watchDynamicsModel_ = (WatchDynamicsModel_) obj;
        Objects.requireNonNull(watchDynamicsModel_);
        return this.f29851k == watchDynamicsModel_.f29851k && this.f29852l == watchDynamicsModel_.f29852l && this.f29853m == watchDynamicsModel_.f29853m;
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
        int hashCode = ((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29851k) * 31) + this.f29852l) * 31;
        long j2 = this.f29853m;
        return hashCode + ((int) (j2 ^ (j2 >>> 32)));
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
        StringBuilder m24u = C0000a.m24u("WatchDynamicsModel_{count=");
        m24u.append(this.f29851k);
        m24u.append(", maxCount=");
        m24u.append(this.f29852l);
        m24u.append(", timestamp=");
        m24u.append(this.f29853m);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.WatchDynamicsModelBuilder
    /* renamed from: u0 */
    public WatchDynamicsModelBuilder mo16083u0(int i2) {
        m4524l2();
        this.f29851k = i2;
        return this;
    }
}

package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseHistoryCompactModel_ extends ReleaseHistoryCompactModel implements GeneratedModel<View>, ReleaseHistoryCompactModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModelBuilder
    /* renamed from: K0 */
    public ReleaseHistoryCompactModelBuilder mo16064K0(@Nullable String str) {
        m4524l2();
        this.f29841m = str;
        return this;
    }

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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModelBuilder
    /* renamed from: b */
    public ReleaseHistoryCompactModelBuilder mo16065b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModelBuilder
    /* renamed from: c */
    public ReleaseHistoryCompactModelBuilder mo16066c(@Nullable String str) {
        m4524l2();
        this.f29842n = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModelBuilder
    /* renamed from: c1 */
    public ReleaseHistoryCompactModelBuilder mo16067c1(ReleaseHistoryCompactModel.Listener listener) {
        m4524l2();
        this.f29843o = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_history_compact;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModelBuilder
    /* renamed from: e */
    public ReleaseHistoryCompactModelBuilder mo16068e(@Nullable String str) {
        m4524l2();
        this.f29839k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseHistoryCompactModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseHistoryCompactModel_ releaseHistoryCompactModel_ = (ReleaseHistoryCompactModel_) obj;
        Objects.requireNonNull(releaseHistoryCompactModel_);
        String str = this.f29839k;
        if (str == null ? releaseHistoryCompactModel_.f29839k != null : !str.equals(releaseHistoryCompactModel_.f29839k)) {
            return false;
        }
        if (this.f29840l != releaseHistoryCompactModel_.f29840l) {
            return false;
        }
        String str2 = this.f29841m;
        if (str2 == null ? releaseHistoryCompactModel_.f29841m != null : !str2.equals(releaseHistoryCompactModel_.f29841m)) {
            return false;
        }
        String str3 = this.f29842n;
        if (str3 == null ? releaseHistoryCompactModel_.f29842n == null : str3.equals(releaseHistoryCompactModel_.f29842n)) {
            return (this.f29843o == null) == (releaseHistoryCompactModel_.f29843o == null);
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModelBuilder
    /* renamed from: h1 */
    public ReleaseHistoryCompactModelBuilder mo16069h1(long j2) {
        m4524l2();
        this.f29840l = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29839k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f29840l;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f29841m;
        int hashCode3 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29842n;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f29843o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseHistoryCompactModel_{titleRussian=");
        m24u.append(this.f29839k);
        m24u.append(", tsLastView=");
        m24u.append(this.f29840l);
        m24u.append(", lastView=");
        m24u.append(this.f29841m);
        m24u.append(", image=");
        m24u.append(this.f29842n);
        m24u.append(", listener=");
        m24u.append(this.f29843o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseHistoryCompactModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}

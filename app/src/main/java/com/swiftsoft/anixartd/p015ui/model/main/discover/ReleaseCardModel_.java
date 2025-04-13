package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseCardModel_ extends ReleaseCardModel implements GeneratedModel<View>, ReleaseCardModelBuilder {
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
        return C2507R.layout.item_discover_release_card;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseCardModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseCardModel_ releaseCardModel_ = (ReleaseCardModel_) obj;
        Objects.requireNonNull(releaseCardModel_);
        String str = this.f29637k;
        if (str == null ? releaseCardModel_.f29637k != null : !str.equals(releaseCardModel_.f29637k)) {
            return false;
        }
        Integer num = this.f29638l;
        if (num == null ? releaseCardModel_.f29638l != null : !num.equals(releaseCardModel_.f29638l)) {
            return false;
        }
        Integer num2 = this.f29639m;
        if (num2 == null ? releaseCardModel_.f29639m != null : !num2.equals(releaseCardModel_.f29639m)) {
            return false;
        }
        Double d = this.f29640n;
        if (d == null ? releaseCardModel_.f29640n != null : !d.equals(releaseCardModel_.f29640n)) {
            return false;
        }
        String str2 = this.f29641o;
        if (str2 == null ? releaseCardModel_.f29641o != null : !str2.equals(releaseCardModel_.f29641o)) {
            return false;
        }
        String str3 = this.f29642p;
        if (str3 == null ? releaseCardModel_.f29642p != null : !str3.equals(releaseCardModel_.f29642p)) {
            return false;
        }
        if (this.f29643q == releaseCardModel_.f29643q && this.f29644r == releaseCardModel_.f29644r && this.f29645s == releaseCardModel_.f29645s) {
            return (this.f29646t == null) == (releaseCardModel_.f29646t == null);
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
        String str = this.f29637k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29638l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29639m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29640n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29641o;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29642p;
        return ((((((((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f29643q ? 1 : 0)) * 31) + this.f29644r) * 31) + (this.f29645s ? 1 : 0)) * 31) + (this.f29646t != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseCardModel_{titleRussian=");
        m24u.append(this.f29637k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29638l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29639m);
        m24u.append(", grade=");
        m24u.append(this.f29640n);
        m24u.append(", description=");
        m24u.append(this.f29641o);
        m24u.append(", image=");
        m24u.append(this.f29642p);
        m24u.append(", favorite=");
        m24u.append(this.f29643q);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29644r);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29645s);
        m24u.append(", listener=");
        m24u.append(this.f29646t);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.ReleaseCardModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public ReleaseCardModel_ m15949w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

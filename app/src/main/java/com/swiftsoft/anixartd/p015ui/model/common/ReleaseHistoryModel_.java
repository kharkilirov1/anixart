package com.swiftsoft.anixartd.p015ui.model.common;

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
public class ReleaseHistoryModel_ extends ReleaseHistoryModel implements GeneratedModel<View>, ReleaseHistoryModelBuilder {
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
        return C2507R.layout.item_release_history;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseHistoryModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseHistoryModel_ releaseHistoryModel_ = (ReleaseHistoryModel_) obj;
        Objects.requireNonNull(releaseHistoryModel_);
        String str = this.f29402k;
        if (str == null ? releaseHistoryModel_.f29402k != null : !str.equals(releaseHistoryModel_.f29402k)) {
            return false;
        }
        Integer num = this.f29403l;
        if (num == null ? releaseHistoryModel_.f29403l != null : !num.equals(releaseHistoryModel_.f29403l)) {
            return false;
        }
        Integer num2 = this.f29404m;
        if (num2 == null ? releaseHistoryModel_.f29404m != null : !num2.equals(releaseHistoryModel_.f29404m)) {
            return false;
        }
        Double d = this.f29405n;
        if (d == null ? releaseHistoryModel_.f29405n != null : !d.equals(releaseHistoryModel_.f29405n)) {
            return false;
        }
        String str2 = this.f29406o;
        if (str2 == null ? releaseHistoryModel_.f29406o != null : !str2.equals(releaseHistoryModel_.f29406o)) {
            return false;
        }
        if (this.f29407p != releaseHistoryModel_.f29407p || this.f29408q != releaseHistoryModel_.f29408q) {
            return false;
        }
        String str3 = this.f29409r;
        if (str3 == null ? releaseHistoryModel_.f29409r != null : !str3.equals(releaseHistoryModel_.f29409r)) {
            return false;
        }
        String str4 = this.f29410s;
        if (str4 == null ? releaseHistoryModel_.f29410s != null : !str4.equals(releaseHistoryModel_.f29410s)) {
            return false;
        }
        if (this.f29411t == releaseHistoryModel_.f29411t && this.f29412u == releaseHistoryModel_.f29412u) {
            return (this.f29413v == null) == (releaseHistoryModel_.f29413v == null);
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
        String str = this.f29402k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29403l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29404m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29405n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29406o;
        int hashCode6 = (((((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29407p ? 1 : 0)) * 31) + this.f29408q) * 31;
        String str3 = this.f29409r;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29410s;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j2 = this.f29411t;
        return ((((hashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f29412u ? 1 : 0)) * 31) + (this.f29413v != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseHistoryModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseHistoryModel_{titleRussian=");
        m24u.append(this.f29402k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29403l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29404m);
        m24u.append(", grade=");
        m24u.append(this.f29405n);
        m24u.append(", image=");
        m24u.append(this.f29406o);
        m24u.append(", favorite=");
        m24u.append(this.f29407p);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29408q);
        m24u.append(", lastViewEpisodeName=");
        m24u.append(this.f29409r);
        m24u.append(", lastViewEpisodeTypeName=");
        m24u.append(this.f29410s);
        m24u.append(", lastViewTimestamp=");
        m24u.append(this.f29411t);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29412u);
        m24u.append(", listener=");
        m24u.append(this.f29413v);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseHistoryModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    /* renamed from: x2 */
    public ReleaseHistoryModelBuilder m15752x2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

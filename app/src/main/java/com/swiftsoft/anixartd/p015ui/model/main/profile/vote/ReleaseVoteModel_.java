package com.swiftsoft.anixartd.p015ui.model.main.profile.vote;

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
public class ReleaseVoteModel_ extends ReleaseVoteModel implements GeneratedModel<View>, ReleaseVoteModelBuilder {
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
        return C2507R.layout.item_release_vote;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseVoteModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseVoteModel_ releaseVoteModel_ = (ReleaseVoteModel_) obj;
        Objects.requireNonNull(releaseVoteModel_);
        String str = this.f29947k;
        if (str == null ? releaseVoteModel_.f29947k != null : !str.equals(releaseVoteModel_.f29947k)) {
            return false;
        }
        Integer num = this.f29948l;
        if (num == null ? releaseVoteModel_.f29948l != null : !num.equals(releaseVoteModel_.f29948l)) {
            return false;
        }
        Integer num2 = this.f29949m;
        if (num2 == null ? releaseVoteModel_.f29949m != null : !num2.equals(releaseVoteModel_.f29949m)) {
            return false;
        }
        Double d = this.f29950n;
        if (d == null ? releaseVoteModel_.f29950n != null : !d.equals(releaseVoteModel_.f29950n)) {
            return false;
        }
        String str2 = this.f29951o;
        if (str2 == null ? releaseVoteModel_.f29951o != null : !str2.equals(releaseVoteModel_.f29951o)) {
            return false;
        }
        if (this.f29952p != releaseVoteModel_.f29952p || this.f29953q != releaseVoteModel_.f29953q) {
            return false;
        }
        Integer num3 = this.f29954r;
        if (num3 == null ? releaseVoteModel_.f29954r != null : !num3.equals(releaseVoteModel_.f29954r)) {
            return false;
        }
        if (this.f29955s == releaseVoteModel_.f29955s && this.f29956t == releaseVoteModel_.f29956t && this.f29957u == releaseVoteModel_.f29957u) {
            return (this.f29958v == null) == (releaseVoteModel_.f29958v == null);
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
        String str = this.f29947k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29948l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29949m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29950n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29951o;
        int hashCode6 = (((((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29952p ? 1 : 0)) * 31) + this.f29953q) * 31;
        Integer num3 = this.f29954r;
        int hashCode7 = (hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        long j2 = this.f29955s;
        return ((((((hashCode7 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f29956t ? 1 : 0)) * 31) + (this.f29957u ? 1 : 0)) * 31) + (this.f29958v != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.vote.ReleaseVoteModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseVoteModel_{titleRussian=");
        m24u.append(this.f29947k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29948l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29949m);
        m24u.append(", grade=");
        m24u.append(this.f29950n);
        m24u.append(", image=");
        m24u.append(this.f29951o);
        m24u.append(", favorite=");
        m24u.append(this.f29952p);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29953q);
        m24u.append(", myVote=");
        m24u.append(this.f29954r);
        m24u.append(", votedAt=");
        m24u.append(this.f29955s);
        m24u.append(", myProfile=");
        m24u.append(this.f29956t);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29957u);
        m24u.append(", listener=");
        m24u.append(this.f29958v);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.vote.ReleaseVoteModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    /* renamed from: x2 */
    public ReleaseVoteModelBuilder m16159x2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

package com.swiftsoft.anixartd.p015ui.model.main.profile;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseVoteCompactModel_ extends ReleaseVoteCompactModel implements GeneratedModel<View>, ReleaseVoteCompactModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModelBuilder
    /* renamed from: T1 */
    public ReleaseVoteCompactModelBuilder mo16073T1(ReleaseVoteCompactModel.Listener listener) {
        m4524l2();
        this.f29849o = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModelBuilder
    /* renamed from: a1 */
    public ReleaseVoteCompactModelBuilder mo16074a1(@Nullable Integer num) {
        m4524l2();
        this.f29846l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModelBuilder
    /* renamed from: b */
    public ReleaseVoteCompactModelBuilder mo16075b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModelBuilder
    /* renamed from: c */
    public ReleaseVoteCompactModelBuilder mo16076c(@Nullable String str) {
        m4524l2();
        this.f29848n = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModelBuilder
    /* renamed from: c0 */
    public ReleaseVoteCompactModelBuilder mo16077c0(long j2) {
        m4524l2();
        this.f29847m = j2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_vote_compact;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModelBuilder
    /* renamed from: e */
    public ReleaseVoteCompactModelBuilder mo16078e(@Nullable String str) {
        m4524l2();
        this.f29845k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseVoteCompactModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseVoteCompactModel_ releaseVoteCompactModel_ = (ReleaseVoteCompactModel_) obj;
        Objects.requireNonNull(releaseVoteCompactModel_);
        String str = this.f29845k;
        if (str == null ? releaseVoteCompactModel_.f29845k != null : !str.equals(releaseVoteCompactModel_.f29845k)) {
            return false;
        }
        Integer num = this.f29846l;
        if (num == null ? releaseVoteCompactModel_.f29846l != null : !num.equals(releaseVoteCompactModel_.f29846l)) {
            return false;
        }
        if (this.f29847m != releaseVoteCompactModel_.f29847m) {
            return false;
        }
        String str2 = this.f29848n;
        if (str2 == null ? releaseVoteCompactModel_.f29848n == null : str2.equals(releaseVoteCompactModel_.f29848n)) {
            return (this.f29849o == null) == (releaseVoteCompactModel_.f29849o == null);
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
        String str = this.f29845k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29846l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        long j2 = this.f29847m;
        int i2 = (hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f29848n;
        return ((i2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29849o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseVoteCompactModel_{titleRussian=");
        m24u.append(this.f29845k);
        m24u.append(", vote=");
        m24u.append(this.f29846l);
        m24u.append(", votedAt=");
        m24u.append(this.f29847m);
        m24u.append(", image=");
        m24u.append(this.f29848n);
        m24u.append(", listener=");
        m24u.append(this.f29849o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.ReleaseVoteCompactModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}

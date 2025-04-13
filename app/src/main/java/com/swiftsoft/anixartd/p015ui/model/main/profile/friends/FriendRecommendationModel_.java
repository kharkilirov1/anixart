package com.swiftsoft.anixartd.p015ui.model.main.profile.friends;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class FriendRecommendationModel_ extends FriendRecommendationModel implements GeneratedModel<View>, FriendRecommendationModelBuilder {
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
        return C2507R.layout.item_profile_friend_recommendation;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendRecommendationModel_) || !super.equals(obj)) {
            return false;
        }
        FriendRecommendationModel_ friendRecommendationModel_ = (FriendRecommendationModel_) obj;
        Objects.requireNonNull(friendRecommendationModel_);
        String str = this.f29910k;
        if (str == null ? friendRecommendationModel_.f29910k != null : !str.equals(friendRecommendationModel_.f29910k)) {
            return false;
        }
        String str2 = this.f29911l;
        if (str2 == null ? friendRecommendationModel_.f29911l != null : !str2.equals(friendRecommendationModel_.f29911l)) {
            return false;
        }
        if (this.f29912m == friendRecommendationModel_.f29912m && this.f29913n == friendRecommendationModel_.f29913n && this.f29914o == friendRecommendationModel_.f29914o && this.f29915p == friendRecommendationModel_.f29915p && this.f29916q == friendRecommendationModel_.f29916q && this.f29917r == friendRecommendationModel_.f29917r && this.f29918s == friendRecommendationModel_.f29918s) {
            return (this.f29919t == null) == (friendRecommendationModel_.f29919t == null);
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
        String str = this.f29910k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29911l;
        return ((((((((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29912m ? 1 : 0)) * 31) + this.f29913n) * 31) + this.f29914o) * 31) + this.f29915p) * 31) + this.f29916q) * 31) + (this.f29917r ? 1 : 0)) * 31) + (this.f29918s ? 1 : 0)) * 31) + (this.f29919t != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRecommendationModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("FriendRecommendationModel_{nickname=");
        m24u.append(this.f29910k);
        m24u.append(", avatar=");
        m24u.append(this.f29911l);
        m24u.append(", online=");
        m24u.append(this.f29912m);
        m24u.append(", positiveButtonTextResourceId=");
        m24u.append(this.f29913n);
        m24u.append(", negativeButtonTextResourceId=");
        m24u.append(this.f29914o);
        m24u.append(", positiveButtonAction=");
        m24u.append(this.f29915p);
        m24u.append(", negativeButtonAction=");
        m24u.append(this.f29916q);
        m24u.append(", sponsor=");
        m24u.append(this.f29917r);
        m24u.append(", verified=");
        m24u.append(this.f29918s);
        m24u.append(", listener=");
        m24u.append(this.f29919t);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRecommendationModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    /* renamed from: x2 */
    public FriendRecommendationModel_ m16135x2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

package com.swiftsoft.anixartd.p015ui.model.main.profile.friends;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class FriendRequestModel_ extends FriendRequestModel implements GeneratedModel<View>, FriendRequestModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: A0 */
    public FriendRequestModelBuilder mo16139A0(long j2) {
        m4524l2();
        this.f29926o = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: B0 */
    public FriendRequestModelBuilder mo16140B0(int i2) {
        m4524l2();
        this.f29925n = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: I0 */
    public FriendRequestModelBuilder mo16141I0(@StringRes int i2) {
        m4524l2();
        this.f29928q = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: L1 */
    public FriendRequestModelBuilder mo16142L1(int i2) {
        m4524l2();
        this.f29929r = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: P0 */
    public FriendRequestModelBuilder mo16143P0(FriendRequestModel.Listener listener) {
        m4524l2();
        this.f29933v = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: Q */
    public FriendRequestModelBuilder mo16144Q(boolean z) {
        m4524l2();
        this.f29924m = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: b */
    public FriendRequestModelBuilder mo16145b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: d */
    public FriendRequestModelBuilder mo16146d(@Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        this.f6932i = spanSizeOverrideCallback;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_profile_friend_request;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendRequestModel_) || !super.equals(obj)) {
            return false;
        }
        FriendRequestModel_ friendRequestModel_ = (FriendRequestModel_) obj;
        Objects.requireNonNull(friendRequestModel_);
        String str = this.f29922k;
        if (str == null ? friendRequestModel_.f29922k != null : !str.equals(friendRequestModel_.f29922k)) {
            return false;
        }
        String str2 = this.f29923l;
        if (str2 == null ? friendRequestModel_.f29923l != null : !str2.equals(friendRequestModel_.f29923l)) {
            return false;
        }
        if (this.f29924m == friendRequestModel_.f29924m && this.f29925n == friendRequestModel_.f29925n && this.f29926o == friendRequestModel_.f29926o && this.f29927p == friendRequestModel_.f29927p && this.f29928q == friendRequestModel_.f29928q && this.f29929r == friendRequestModel_.f29929r && this.f29930s == friendRequestModel_.f29930s && this.f29931t == friendRequestModel_.f29931t && this.f29932u == friendRequestModel_.f29932u) {
            return (this.f29933v == null) == (friendRequestModel_.f29933v == null);
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
        String str = this.f29922k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29923l;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29924m ? 1 : 0)) * 31) + this.f29925n) * 31;
        long j2 = this.f29926o;
        return ((((((((((((((hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29927p) * 31) + this.f29928q) * 31) + this.f29929r) * 31) + this.f29930s) * 31) + (this.f29931t ? 1 : 0)) * 31) + (this.f29932u ? 1 : 0)) * 31) + (this.f29933v != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: k */
    public FriendRequestModelBuilder mo16147k(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29922k = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: k1 */
    public FriendRequestModelBuilder mo16148k1(@StringRes int i2) {
        m4524l2();
        this.f29927p = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: l */
    public FriendRequestModelBuilder mo16149l(@org.jetbrains.annotations.Nullable String str) {
        m4524l2();
        this.f29923l = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: o0 */
    public FriendRequestModelBuilder mo16150o0(int i2) {
        m4524l2();
        this.f29930s = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: p */
    public FriendRequestModelBuilder mo16151p(boolean z) {
        m4524l2();
        this.f29932u = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModelBuilder
    /* renamed from: r */
    public FriendRequestModelBuilder mo16152r(boolean z) {
        m4524l2();
        this.f29931t = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("FriendRequestModel_{nickname=");
        m24u.append(this.f29922k);
        m24u.append(", avatar=");
        m24u.append(this.f29923l);
        m24u.append(", online=");
        m24u.append(this.f29924m);
        m24u.append(", friendsCount=");
        m24u.append(this.f29925n);
        m24u.append(", addedDate=");
        m24u.append(this.f29926o);
        m24u.append(", positiveButtonTextResourceId=");
        m24u.append(this.f29927p);
        m24u.append(", negativeButtonTextResourceId=");
        m24u.append(this.f29928q);
        m24u.append(", positiveButtonAction=");
        m24u.append(this.f29929r);
        m24u.append(", negativeButtonAction=");
        m24u.append(this.f29930s);
        m24u.append(", sponsor=");
        m24u.append(this.f29931t);
        m24u.append(", verified=");
        m24u.append(this.f29932u);
        m24u.append(", listener=");
        m24u.append(this.f29933v);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.profile.friends.FriendRequestModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}

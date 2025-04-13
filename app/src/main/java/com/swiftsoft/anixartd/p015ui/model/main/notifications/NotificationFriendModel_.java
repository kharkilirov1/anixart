package com.swiftsoft.anixartd.p015ui.model.main.notifications;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class NotificationFriendModel_ extends NotificationFriendModel implements GeneratedModel<View>, NotificationFriendModelBuilder {
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
        return C2507R.layout.item_notification;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationFriendModel_) || !super.equals(obj)) {
            return false;
        }
        NotificationFriendModel_ notificationFriendModel_ = (NotificationFriendModel_) obj;
        Objects.requireNonNull(notificationFriendModel_);
        if (this.f29774k != notificationFriendModel_.f29774k) {
            return false;
        }
        ProfileFriendNotification.Status status = this.f29775l;
        if (status == null ? notificationFriendModel_.f29775l != null : !status.equals(notificationFriendModel_.f29775l)) {
            return false;
        }
        String str = this.f29776m;
        if (str == null ? notificationFriendModel_.f29776m != null : !str.equals(notificationFriendModel_.f29776m)) {
            return false;
        }
        String str2 = this.f29777n;
        if (str2 == null ? notificationFriendModel_.f29777n != null : !str2.equals(notificationFriendModel_.f29777n)) {
            return false;
        }
        if (this.f29778o == notificationFriendModel_.f29778o && this.f29779p == notificationFriendModel_.f29779p) {
            return (this.f29780q == null) == (notificationFriendModel_.f29780q == null);
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
        long j2 = this.f29774k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ProfileFriendNotification.Status status = this.f29775l;
        int hashCode2 = (i2 + (status != null ? status.hashCode() : 0)) * 31;
        String str = this.f29776m;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29777n;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j3 = this.f29778o;
        return ((((hashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f29779p ? 1 : 0)) * 31) + (this.f29780q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationFriendModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NotificationFriendModel_{profileId=");
        m24u.append(this.f29774k);
        m24u.append(", status=");
        m24u.append(this.f29775l);
        m24u.append(", login=");
        m24u.append(this.f29776m);
        m24u.append(", avatar=");
        m24u.append(this.f29777n);
        m24u.append(", timestamp=");
        m24u.append(this.f29778o);
        m24u.append(", mNew=");
        m24u.append(this.f29779p);
        m24u.append(", listener=");
        m24u.append(this.f29780q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationFriendModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public NotificationFriendModelBuilder m16024w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

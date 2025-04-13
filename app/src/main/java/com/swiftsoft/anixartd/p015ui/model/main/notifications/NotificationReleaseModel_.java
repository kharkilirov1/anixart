package com.swiftsoft.anixartd.p015ui.model.main.notifications;

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
public class NotificationReleaseModel_ extends NotificationReleaseModel implements GeneratedModel<View>, NotificationReleaseModelBuilder {
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
        if (!(obj instanceof NotificationReleaseModel_) || !super.equals(obj)) {
            return false;
        }
        NotificationReleaseModel_ notificationReleaseModel_ = (NotificationReleaseModel_) obj;
        Objects.requireNonNull(notificationReleaseModel_);
        if (this.f29794k != notificationReleaseModel_.f29794k) {
            return false;
        }
        String str = this.f29795l;
        if (str == null ? notificationReleaseModel_.f29795l != null : !str.equals(notificationReleaseModel_.f29795l)) {
            return false;
        }
        String str2 = this.f29796m;
        if (str2 == null ? notificationReleaseModel_.f29796m != null : !str2.equals(notificationReleaseModel_.f29796m)) {
            return false;
        }
        if (this.f29797n == notificationReleaseModel_.f29797n && this.f29798o == notificationReleaseModel_.f29798o) {
            return (this.f29799p == null) == (notificationReleaseModel_.f29799p == null);
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
        long j2 = this.f29794k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29795l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29796m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j3 = this.f29797n;
        return ((((hashCode3 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f29798o ? 1 : 0)) * 31) + (this.f29799p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NotificationReleaseModel_{releaseId=");
        m24u.append(this.f29794k);
        m24u.append(", releaseTitleRu=");
        m24u.append(this.f29795l);
        m24u.append(", image=");
        m24u.append(this.f29796m);
        m24u.append(", timestamp=");
        m24u.append(this.f29797n);
        m24u.append(", mNew=");
        m24u.append(this.f29798o);
        m24u.append(", listener=");
        m24u.append(this.f29799p);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public NotificationReleaseModelBuilder m16033w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

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
public class NotificationEpisodeModel_ extends NotificationEpisodeModel implements GeneratedModel<View>, NotificationEpisodeModelBuilder {
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
        if (!(obj instanceof NotificationEpisodeModel_) || !super.equals(obj)) {
            return false;
        }
        NotificationEpisodeModel_ notificationEpisodeModel_ = (NotificationEpisodeModel_) obj;
        Objects.requireNonNull(notificationEpisodeModel_);
        if (this.f29764k != notificationEpisodeModel_.f29764k) {
            return false;
        }
        String str = this.f29765l;
        if (str == null ? notificationEpisodeModel_.f29765l != null : !str.equals(notificationEpisodeModel_.f29765l)) {
            return false;
        }
        String str2 = this.f29766m;
        if (str2 == null ? notificationEpisodeModel_.f29766m != null : !str2.equals(notificationEpisodeModel_.f29766m)) {
            return false;
        }
        String str3 = this.f29767n;
        if (str3 == null ? notificationEpisodeModel_.f29767n != null : !str3.equals(notificationEpisodeModel_.f29767n)) {
            return false;
        }
        String str4 = this.f29768o;
        if (str4 == null ? notificationEpisodeModel_.f29768o != null : !str4.equals(notificationEpisodeModel_.f29768o)) {
            return false;
        }
        String str5 = this.f29769p;
        if (str5 == null ? notificationEpisodeModel_.f29769p != null : !str5.equals(notificationEpisodeModel_.f29769p)) {
            return false;
        }
        if (this.f29770q == notificationEpisodeModel_.f29770q && this.f29771r == notificationEpisodeModel_.f29771r) {
            return (this.f29772s == null) == (notificationEpisodeModel_.f29772s == null);
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
        long j2 = this.f29764k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29765l;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29766m;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29767n;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29768o;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f29769p;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        long j3 = this.f29770q;
        return ((((hashCode6 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f29771r ? 1 : 0)) * 31) + (this.f29772s != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationEpisodeModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NotificationEpisodeModel_{releaseId=");
        m24u.append(this.f29764k);
        m24u.append(", releaseTitleRu=");
        m24u.append(this.f29765l);
        m24u.append(", image=");
        m24u.append(this.f29766m);
        m24u.append(", episodeName=");
        m24u.append(this.f29767n);
        m24u.append(", typeName=");
        m24u.append(this.f29768o);
        m24u.append(", sourceName=");
        m24u.append(this.f29769p);
        m24u.append(", timestamp=");
        m24u.append(this.f29770q);
        m24u.append(", mNew=");
        m24u.append(this.f29771r);
        m24u.append(", listener=");
        m24u.append(this.f29772s);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationEpisodeModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public NotificationEpisodeModelBuilder m16021w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

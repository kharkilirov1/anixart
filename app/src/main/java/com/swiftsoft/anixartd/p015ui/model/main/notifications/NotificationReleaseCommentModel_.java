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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class NotificationReleaseCommentModel_ extends NotificationReleaseCommentModel implements GeneratedModel<View>, NotificationReleaseCommentModelBuilder {
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
        if (!(obj instanceof NotificationReleaseCommentModel_) || !super.equals(obj)) {
            return false;
        }
        NotificationReleaseCommentModel_ notificationReleaseCommentModel_ = (NotificationReleaseCommentModel_) obj;
        Objects.requireNonNull(notificationReleaseCommentModel_);
        if (this.f29783k != notificationReleaseCommentModel_.f29783k || this.f29784l != notificationReleaseCommentModel_.f29784l || this.f29785m != notificationReleaseCommentModel_.f29785m) {
            return false;
        }
        String str = this.f29786n;
        if (str == null ? notificationReleaseCommentModel_.f29786n != null : !str.equals(notificationReleaseCommentModel_.f29786n)) {
            return false;
        }
        if (this.f29787o != notificationReleaseCommentModel_.f29787o) {
            return false;
        }
        String str2 = this.f29788p;
        if (str2 == null ? notificationReleaseCommentModel_.f29788p != null : !str2.equals(notificationReleaseCommentModel_.f29788p)) {
            return false;
        }
        String str3 = this.f29789q;
        if (str3 == null ? notificationReleaseCommentModel_.f29789q != null : !str3.equals(notificationReleaseCommentModel_.f29789q)) {
            return false;
        }
        if (this.f29790r == notificationReleaseCommentModel_.f29790r && this.f29791s == notificationReleaseCommentModel_.f29791s) {
            return (this.f29792t == null) == (notificationReleaseCommentModel_.f29792t == null);
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
        long j2 = this.f29783k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29784l;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f29785m;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        String str = this.f29786n;
        int hashCode2 = (((i4 + (str != null ? str.hashCode() : 0)) * 31) + (this.f29787o ? 1 : 0)) * 31;
        String str2 = this.f29788p;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29789q;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j5 = this.f29790r;
        return ((((hashCode4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f29791s ? 1 : 0)) * 31) + (this.f29792t != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseCommentModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NotificationReleaseCommentModel_{releaseId=");
        m24u.append(this.f29783k);
        m24u.append(", parentCommentId=");
        m24u.append(this.f29784l);
        m24u.append(", commentId=");
        m24u.append(this.f29785m);
        m24u.append(", message=");
        m24u.append(this.f29786n);
        m24u.append(", spoiler=");
        m24u.append(this.f29787o);
        m24u.append(", login=");
        m24u.append(this.f29788p);
        m24u.append(", avatar=");
        m24u.append(this.f29789q);
        m24u.append(", timestamp=");
        m24u.append(this.f29790r);
        m24u.append(", mNew=");
        m24u.append(this.f29791s);
        m24u.append(", listener=");
        m24u.append(this.f29792t);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationReleaseCommentModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public NotificationReleaseCommentModelBuilder m16027w2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29789q = str;
        return this;
    }

    /* renamed from: x2 */
    public NotificationReleaseCommentModelBuilder m16028x2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    /* renamed from: y2 */
    public NotificationReleaseCommentModelBuilder m16029y2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29788p = str;
        return this;
    }

    /* renamed from: z2 */
    public NotificationReleaseCommentModelBuilder m16030z2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29786n = str;
        return this;
    }
}

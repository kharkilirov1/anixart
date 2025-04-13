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
public class NotificationCollectionCommentModel_ extends NotificationCollectionCommentModel implements GeneratedModel<View>, NotificationCollectionCommentModelBuilder {
    /* renamed from: A2 */
    public NotificationCollectionCommentModelBuilder m16014A2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29756p = str;
        return this;
    }

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
        if (!(obj instanceof NotificationCollectionCommentModel_) || !super.equals(obj)) {
            return false;
        }
        NotificationCollectionCommentModel_ notificationCollectionCommentModel_ = (NotificationCollectionCommentModel_) obj;
        Objects.requireNonNull(notificationCollectionCommentModel_);
        if (this.f29751k != notificationCollectionCommentModel_.f29751k || this.f29752l != notificationCollectionCommentModel_.f29752l || this.f29753m != notificationCollectionCommentModel_.f29753m) {
            return false;
        }
        Long l2 = this.f29754n;
        if (l2 == null ? notificationCollectionCommentModel_.f29754n != null : !l2.equals(notificationCollectionCommentModel_.f29754n)) {
            return false;
        }
        String str = this.f29755o;
        if (str == null ? notificationCollectionCommentModel_.f29755o != null : !str.equals(notificationCollectionCommentModel_.f29755o)) {
            return false;
        }
        String str2 = this.f29756p;
        if (str2 == null ? notificationCollectionCommentModel_.f29756p != null : !str2.equals(notificationCollectionCommentModel_.f29756p)) {
            return false;
        }
        if (this.f29757q != notificationCollectionCommentModel_.f29757q) {
            return false;
        }
        String str3 = this.f29758r;
        if (str3 == null ? notificationCollectionCommentModel_.f29758r != null : !str3.equals(notificationCollectionCommentModel_.f29758r)) {
            return false;
        }
        String str4 = this.f29759s;
        if (str4 == null ? notificationCollectionCommentModel_.f29759s != null : !str4.equals(notificationCollectionCommentModel_.f29759s)) {
            return false;
        }
        if (this.f29760t == notificationCollectionCommentModel_.f29760t && this.f29761u == notificationCollectionCommentModel_.f29761u) {
            return (this.f29762v == null) == (notificationCollectionCommentModel_.f29762v == null);
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
        int hashCode = ((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29751k) * 31;
        long j2 = this.f29752l;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f29753m;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Long l2 = this.f29754n;
        int hashCode2 = (i3 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.f29755o;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29756p;
        int hashCode4 = (((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29757q ? 1 : 0)) * 31;
        String str3 = this.f29758r;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29759s;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j4 = this.f29760t;
        return ((((hashCode6 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f29761u ? 1 : 0)) * 31) + (this.f29762v != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationCollectionCommentModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("NotificationCollectionCommentModel_{type=");
        m24u.append(this.f29751k);
        m24u.append(", collectionId=");
        m24u.append(this.f29752l);
        m24u.append(", parentCommentId=");
        m24u.append(this.f29753m);
        m24u.append(", commentId=");
        m24u.append(this.f29754n);
        m24u.append(", collectionTitle=");
        m24u.append(this.f29755o);
        m24u.append(", message=");
        m24u.append(this.f29756p);
        m24u.append(", spoiler=");
        m24u.append(this.f29757q);
        m24u.append(", login=");
        m24u.append(this.f29758r);
        m24u.append(", avatar=");
        m24u.append(this.f29759s);
        m24u.append(", timestamp=");
        m24u.append(this.f29760t);
        m24u.append(", mNew=");
        m24u.append(this.f29761u);
        m24u.append(", listener=");
        m24u.append(this.f29762v);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.notifications.NotificationCollectionCommentModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    /* renamed from: w2 */
    public NotificationCollectionCommentModelBuilder m16015w2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29759s = str;
        return this;
    }

    /* renamed from: x2 */
    public NotificationCollectionCommentModelBuilder m16016x2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29755o = str;
        return this;
    }

    /* renamed from: y2 */
    public NotificationCollectionCommentModelBuilder m16017y2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    /* renamed from: z2 */
    public NotificationCollectionCommentModelBuilder m16018z2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29758r = str;
        return this;
    }
}

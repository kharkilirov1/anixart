package com.swiftsoft.anixartd.p015ui.model.main.preference;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseNotificationPreferenceModel_ extends ReleaseNotificationPreferenceModel implements GeneratedModel<View>, ReleaseNotificationPreferenceModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: F1 */
    public ReleaseNotificationPreferenceModelBuilder mo16041F1(int i2) {
        m4524l2();
        this.f29824s = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: R0 */
    public ReleaseNotificationPreferenceModelBuilder mo16042R0(ReleaseNotificationPreferenceModel.Listener listener) {
        m4524l2();
        this.f29826u = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: b */
    public ReleaseNotificationPreferenceModelBuilder mo16043b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: c */
    public ReleaseNotificationPreferenceModelBuilder mo16044c(@Nullable String str) {
        m4524l2();
        this.f29820o = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_notification_preference;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: e */
    public ReleaseNotificationPreferenceModelBuilder mo16045e(@Nullable String str) {
        m4524l2();
        this.f29816k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseNotificationPreferenceModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseNotificationPreferenceModel_ releaseNotificationPreferenceModel_ = (ReleaseNotificationPreferenceModel_) obj;
        Objects.requireNonNull(releaseNotificationPreferenceModel_);
        String str = this.f29816k;
        if (str == null ? releaseNotificationPreferenceModel_.f29816k != null : !str.equals(releaseNotificationPreferenceModel_.f29816k)) {
            return false;
        }
        Integer num = this.f29817l;
        if (num == null ? releaseNotificationPreferenceModel_.f29817l != null : !num.equals(releaseNotificationPreferenceModel_.f29817l)) {
            return false;
        }
        Integer num2 = this.f29818m;
        if (num2 == null ? releaseNotificationPreferenceModel_.f29818m != null : !num2.equals(releaseNotificationPreferenceModel_.f29818m)) {
            return false;
        }
        Double d = this.f29819n;
        if (d == null ? releaseNotificationPreferenceModel_.f29819n != null : !d.equals(releaseNotificationPreferenceModel_.f29819n)) {
            return false;
        }
        String str2 = this.f29820o;
        if (str2 == null ? releaseNotificationPreferenceModel_.f29820o != null : !str2.equals(releaseNotificationPreferenceModel_.f29820o)) {
            return false;
        }
        if (this.f29821p == releaseNotificationPreferenceModel_.f29821p && this.f29822q == releaseNotificationPreferenceModel_.f29822q && this.f29823r == releaseNotificationPreferenceModel_.f29823r && this.f29824s == releaseNotificationPreferenceModel_.f29824s && this.f29825t == releaseNotificationPreferenceModel_.f29825t) {
            return (this.f29826u == null) == (releaseNotificationPreferenceModel_.f29826u == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: f */
    public ReleaseNotificationPreferenceModelBuilder mo16046f(boolean z) {
        m4524l2();
        this.f29821p = z;
        return this;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: h */
    public ReleaseNotificationPreferenceModelBuilder mo16047h(@Nullable Double d) {
        m4524l2();
        this.f29819n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29816k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29817l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29818m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29819n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29820o;
        return ((((((((((((hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29821p ? 1 : 0)) * 31) + this.f29822q) * 31) + (this.f29823r ? 1 : 0)) * 31) + this.f29824s) * 31) + this.f29825t) * 31) + (this.f29826u != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: i */
    public ReleaseNotificationPreferenceModelBuilder mo16048i(boolean z) {
        m4524l2();
        this.f29823r = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: m */
    public ReleaseNotificationPreferenceModelBuilder mo16049m(@Nullable Integer num) {
        m4524l2();
        this.f29818m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: n */
    public ReleaseNotificationPreferenceModelBuilder mo16050n(@Nullable Integer num) {
        m4524l2();
        this.f29817l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: o */
    public ReleaseNotificationPreferenceModelBuilder mo16051o(int i2) {
        m4524l2();
        this.f29822q = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModelBuilder
    /* renamed from: p1 */
    public ReleaseNotificationPreferenceModelBuilder mo16052p1(int i2) {
        m4524l2();
        this.f29825t = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseNotificationPreferenceModel_{titleRussian=");
        m24u.append(this.f29816k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29817l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29818m);
        m24u.append(", grade=");
        m24u.append(this.f29819n);
        m24u.append(", image=");
        m24u.append(this.f29820o);
        m24u.append(", favorite=");
        m24u.append(this.f29821p);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29822q);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29823r);
        m24u.append(", typeCount=");
        m24u.append(this.f29824s);
        m24u.append(", totalTypeCount=");
        m24u.append(this.f29825t);
        m24u.append(", listener=");
        m24u.append(this.f29826u);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.preference.ReleaseNotificationPreferenceModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}

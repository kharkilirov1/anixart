package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseModel_ extends ReleaseModel implements GeneratedModel<View>, ReleaseModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: A */
    public ReleaseModelBuilder mo15756A(@Nullable String str) {
        m4524l2();
        this.f29422q = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: C */
    public ReleaseModelBuilder mo15757C(@Nullable Long l2) {
        m4524l2();
        this.f29425t = l2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: I */
    public ReleaseModelBuilder mo15758I(int i2) {
        m4524l2();
        this.f29423r = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: J */
    public ReleaseModelBuilder mo15759J(long j2) {
        m4524l2();
        this.f29424s = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: L */
    public ReleaseModelBuilder mo15760L(ReleaseModel.Listener listener) {
        m4524l2();
        this.f29429x = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: b */
    public ReleaseModelBuilder mo15761b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: c */
    public ReleaseModelBuilder mo15762c(@Nullable String str) {
        m4524l2();
        this.f29421p = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: e */
    public ReleaseModelBuilder mo15763e(@Nullable String str) {
        m4524l2();
        this.f29416k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseModel_ releaseModel_ = (ReleaseModel_) obj;
        Objects.requireNonNull(releaseModel_);
        String str = this.f29416k;
        if (str == null ? releaseModel_.f29416k != null : !str.equals(releaseModel_.f29416k)) {
            return false;
        }
        Integer num = this.f29417l;
        if (num == null ? releaseModel_.f29417l != null : !num.equals(releaseModel_.f29417l)) {
            return false;
        }
        Integer num2 = this.f29418m;
        if (num2 == null ? releaseModel_.f29418m != null : !num2.equals(releaseModel_.f29418m)) {
            return false;
        }
        Double d = this.f29419n;
        if (d == null ? releaseModel_.f29419n != null : !d.equals(releaseModel_.f29419n)) {
            return false;
        }
        String str2 = this.f29420o;
        if (str2 == null ? releaseModel_.f29420o != null : !str2.equals(releaseModel_.f29420o)) {
            return false;
        }
        String str3 = this.f29421p;
        if (str3 == null ? releaseModel_.f29421p != null : !str3.equals(releaseModel_.f29421p)) {
            return false;
        }
        String str4 = this.f29422q;
        if (str4 == null ? releaseModel_.f29422q != null : !str4.equals(releaseModel_.f29422q)) {
            return false;
        }
        if (this.f29423r != releaseModel_.f29423r || this.f29424s != releaseModel_.f29424s) {
            return false;
        }
        Long l2 = this.f29425t;
        if (l2 == null ? releaseModel_.f29425t != null : !l2.equals(releaseModel_.f29425t)) {
            return false;
        }
        if (this.f29426u == releaseModel_.f29426u && this.f29427v == releaseModel_.f29427v && this.f29428w == releaseModel_.f29428w) {
            return (this.f29429x == null) == (releaseModel_.f29429x == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: f */
    public ReleaseModelBuilder mo15764f(boolean z) {
        m4524l2();
        this.f29426u = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: g */
    public ReleaseModelBuilder mo15765g(@Nullable String str) {
        m4524l2();
        this.f29420o = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: h */
    public ReleaseModelBuilder mo15766h(@Nullable Double d) {
        m4524l2();
        this.f29419n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29416k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29417l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29418m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29419n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29420o;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29421p;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29422q;
        int hashCode8 = (((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f29423r) * 31;
        long j2 = this.f29424s;
        int i2 = (hashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l2 = this.f29425t;
        return ((((((((i2 + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.f29426u ? 1 : 0)) * 31) + this.f29427v) * 31) + (this.f29428w ? 1 : 0)) * 31) + (this.f29429x != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: i */
    public ReleaseModelBuilder mo15767i(boolean z) {
        m4524l2();
        this.f29428w = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: m */
    public ReleaseModelBuilder mo15768m(@Nullable Integer num) {
        m4524l2();
        this.f29418m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: n */
    public ReleaseModelBuilder mo15769n(@Nullable Integer num) {
        m4524l2();
        this.f29417l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModelBuilder
    /* renamed from: o */
    public ReleaseModelBuilder mo15770o(int i2) {
        m4524l2();
        this.f29427v = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseModel_{titleRussian=");
        m24u.append(this.f29416k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29417l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29418m);
        m24u.append(", grade=");
        m24u.append(this.f29419n);
        m24u.append(", description=");
        m24u.append(this.f29420o);
        m24u.append(", image=");
        m24u.append(this.f29421p);
        m24u.append(", year=");
        m24u.append(this.f29422q);
        m24u.append(", season=");
        m24u.append(this.f29423r);
        m24u.append(", airedOnDate=");
        m24u.append(this.f29424s);
        m24u.append(", status=");
        m24u.append(this.f29425t);
        m24u.append(", favorite=");
        m24u.append(this.f29426u);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29427v);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29428w);
        m24u.append(", listener=");
        m24u.append(this.f29429x);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}

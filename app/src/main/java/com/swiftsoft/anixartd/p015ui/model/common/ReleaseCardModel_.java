package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.ReleaseModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ReleaseCardModel_ extends ReleaseCardModel implements GeneratedModel<View>, ReleaseCardModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: A */
    public ReleaseCardModelBuilder mo15734A(@Nullable String str) {
        m4524l2();
        this.f29393q = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: C */
    public ReleaseCardModelBuilder mo15735C(@Nullable Long l2) {
        m4524l2();
        this.f29396t = l2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: I */
    public ReleaseCardModelBuilder mo15736I(int i2) {
        m4524l2();
        this.f29394r = i2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: J */
    public ReleaseCardModelBuilder mo15737J(long j2) {
        m4524l2();
        this.f29395s = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: L */
    public ReleaseCardModelBuilder mo15738L(ReleaseModel.Listener listener) {
        m4524l2();
        this.f29400x = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: b */
    public ReleaseCardModelBuilder mo15739b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: c */
    public ReleaseCardModelBuilder mo15740c(@Nullable String str) {
        m4524l2();
        this.f29392p = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_release_card;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: e */
    public ReleaseCardModelBuilder mo15741e(@Nullable String str) {
        m4524l2();
        this.f29387k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReleaseCardModel_) || !super.equals(obj)) {
            return false;
        }
        ReleaseCardModel_ releaseCardModel_ = (ReleaseCardModel_) obj;
        Objects.requireNonNull(releaseCardModel_);
        String str = this.f29387k;
        if (str == null ? releaseCardModel_.f29387k != null : !str.equals(releaseCardModel_.f29387k)) {
            return false;
        }
        Integer num = this.f29388l;
        if (num == null ? releaseCardModel_.f29388l != null : !num.equals(releaseCardModel_.f29388l)) {
            return false;
        }
        Integer num2 = this.f29389m;
        if (num2 == null ? releaseCardModel_.f29389m != null : !num2.equals(releaseCardModel_.f29389m)) {
            return false;
        }
        Double d = this.f29390n;
        if (d == null ? releaseCardModel_.f29390n != null : !d.equals(releaseCardModel_.f29390n)) {
            return false;
        }
        String str2 = this.f29391o;
        if (str2 == null ? releaseCardModel_.f29391o != null : !str2.equals(releaseCardModel_.f29391o)) {
            return false;
        }
        String str3 = this.f29392p;
        if (str3 == null ? releaseCardModel_.f29392p != null : !str3.equals(releaseCardModel_.f29392p)) {
            return false;
        }
        String str4 = this.f29393q;
        if (str4 == null ? releaseCardModel_.f29393q != null : !str4.equals(releaseCardModel_.f29393q)) {
            return false;
        }
        if (this.f29394r != releaseCardModel_.f29394r || this.f29395s != releaseCardModel_.f29395s) {
            return false;
        }
        Long l2 = this.f29396t;
        if (l2 == null ? releaseCardModel_.f29396t != null : !l2.equals(releaseCardModel_.f29396t)) {
            return false;
        }
        if (this.f29397u == releaseCardModel_.f29397u && this.f29398v == releaseCardModel_.f29398v && this.f29399w == releaseCardModel_.f29399w) {
            return (this.f29400x == null) == (releaseCardModel_.f29400x == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: f */
    public ReleaseCardModelBuilder mo15742f(boolean z) {
        m4524l2();
        this.f29397u = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: g */
    public ReleaseCardModelBuilder mo15743g(@Nullable String str) {
        m4524l2();
        this.f29391o = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: h */
    public ReleaseCardModelBuilder mo15744h(@Nullable Double d) {
        m4524l2();
        this.f29390n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29387k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29388l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29389m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29390n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        String str2 = this.f29391o;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29392p;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29393q;
        int hashCode8 = (((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f29394r) * 31;
        long j2 = this.f29395s;
        int i2 = (hashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l2 = this.f29396t;
        return ((((((((i2 + (l2 != null ? l2.hashCode() : 0)) * 31) + (this.f29397u ? 1 : 0)) * 31) + this.f29398v) * 31) + (this.f29399w ? 1 : 0)) * 31) + (this.f29400x != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: i */
    public ReleaseCardModelBuilder mo15745i(boolean z) {
        m4524l2();
        this.f29399w = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: m */
    public ReleaseCardModelBuilder mo15746m(@Nullable Integer num) {
        m4524l2();
        this.f29389m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: n */
    public ReleaseCardModelBuilder mo15747n(@Nullable Integer num) {
        m4524l2();
        this.f29388l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModelBuilder
    /* renamed from: o */
    public ReleaseCardModelBuilder mo15748o(int i2) {
        m4524l2();
        this.f29398v = i2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ReleaseCardModel_{titleRussian=");
        m24u.append(this.f29387k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29388l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29389m);
        m24u.append(", grade=");
        m24u.append(this.f29390n);
        m24u.append(", description=");
        m24u.append(this.f29391o);
        m24u.append(", image=");
        m24u.append(this.f29392p);
        m24u.append(", year=");
        m24u.append(this.f29393q);
        m24u.append(", season=");
        m24u.append(this.f29394r);
        m24u.append(", airedOnDate=");
        m24u.append(this.f29395s);
        m24u.append(", status=");
        m24u.append(this.f29396t);
        m24u.append(", favorite=");
        m24u.append(this.f29397u);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29398v);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29399w);
        m24u.append(", listener=");
        m24u.append(this.f29400x);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.ReleaseCardModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}

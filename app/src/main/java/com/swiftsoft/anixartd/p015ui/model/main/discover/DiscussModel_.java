package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModel;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class DiscussModel_ extends DiscussModel implements GeneratedModel<View>, DiscussModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: D0 */
    public DiscussModelBuilder mo15927D0(DiscussModel.Listener listener) {
        m4524l2();
        this.f29627t = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: b */
    public DiscussModelBuilder mo15928b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: b0 */
    public DiscussModelBuilder mo15929b0(@Nullable Integer num) {
        m4524l2();
        this.f29622o = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: c */
    public DiscussModelBuilder mo15930c(@Nullable String str) {
        m4524l2();
        this.f29623p = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_discover_discuss;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: e */
    public DiscussModelBuilder mo15931e(@Nullable String str) {
        m4524l2();
        this.f29618k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscussModel_) || !super.equals(obj)) {
            return false;
        }
        DiscussModel_ discussModel_ = (DiscussModel_) obj;
        Objects.requireNonNull(discussModel_);
        String str = this.f29618k;
        if (str == null ? discussModel_.f29618k != null : !str.equals(discussModel_.f29618k)) {
            return false;
        }
        Integer num = this.f29619l;
        if (num == null ? discussModel_.f29619l != null : !num.equals(discussModel_.f29619l)) {
            return false;
        }
        Integer num2 = this.f29620m;
        if (num2 == null ? discussModel_.f29620m != null : !num2.equals(discussModel_.f29620m)) {
            return false;
        }
        Double d = this.f29621n;
        if (d == null ? discussModel_.f29621n != null : !d.equals(discussModel_.f29621n)) {
            return false;
        }
        Integer num3 = this.f29622o;
        if (num3 == null ? discussModel_.f29622o != null : !num3.equals(discussModel_.f29622o)) {
            return false;
        }
        String str2 = this.f29623p;
        if (str2 == null ? discussModel_.f29623p != null : !str2.equals(discussModel_.f29623p)) {
            return false;
        }
        if (this.f29624q == discussModel_.f29624q && this.f29625r == discussModel_.f29625r && this.f29626s == discussModel_.f29626s) {
            return (this.f29627t == null) == (discussModel_.f29627t == null);
        }
        return false;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: f */
    public DiscussModelBuilder mo15932f(boolean z) {
        m4524l2();
        this.f29624q = z;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: h */
    public DiscussModelBuilder mo15933h(@Nullable Double d) {
        m4524l2();
        this.f29621n = d;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29618k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.f29619l;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29620m;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Double d = this.f29621n;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 31;
        Integer num3 = this.f29622o;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str2 = this.f29623p;
        return ((((((((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29624q ? 1 : 0)) * 31) + this.f29625r) * 31) + (this.f29626s ? 1 : 0)) * 31) + (this.f29627t != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: i */
    public DiscussModelBuilder mo15934i(boolean z) {
        m4524l2();
        this.f29626s = z;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: m */
    public DiscussModelBuilder mo15935m(@Nullable Integer num) {
        m4524l2();
        this.f29620m = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: n */
    public DiscussModelBuilder mo15936n(@Nullable Integer num) {
        m4524l2();
        this.f29619l = num;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModelBuilder
    /* renamed from: o */
    public DiscussModelBuilder mo15937o(int i2) {
        m4524l2();
        this.f29625r = i2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DiscussModel_{titleRussian=");
        m24u.append(this.f29618k);
        m24u.append(", episodesReleased=");
        m24u.append(this.f29619l);
        m24u.append(", episodesTotal=");
        m24u.append(this.f29620m);
        m24u.append(", grade=");
        m24u.append(this.f29621n);
        m24u.append(", commentPerDayCount=");
        m24u.append(this.f29622o);
        m24u.append(", image=");
        m24u.append(this.f29623p);
        m24u.append(", favorite=");
        m24u.append(this.f29624q);
        m24u.append(", profileListStatus=");
        m24u.append(this.f29625r);
        m24u.append(", ratingAvailable=");
        m24u.append(this.f29626s);
        m24u.append(", listener=");
        m24u.append(this.f29627t);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.DiscussModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }
}

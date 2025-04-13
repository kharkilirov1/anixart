package com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class TorlookModel_ extends TorlookModel implements GeneratedModel<View>, TorlookModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: D */
    public TorlookModelBuilder mo15994D(@Nullable Number[] numberArr) {
        m4521i2(numberArr);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: M1 */
    public TorlookModelBuilder mo15995M1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29732p = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: N0 */
    public TorlookModelBuilder mo15996N0(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29733q = str;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: S1 */
    public TorlookModelBuilder mo15997S1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29736t = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: U1 */
    public TorlookModelBuilder mo15998U1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29734r = str;
        return this;
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
        return C2507R.layout.item_torlook;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: e1 */
    public TorlookModelBuilder mo15999e1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29729m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TorlookModel_) || !super.equals(obj)) {
            return false;
        }
        TorlookModel_ torlookModel_ = (TorlookModel_) obj;
        Objects.requireNonNull(torlookModel_);
        String str = this.f29727k;
        if (str == null ? torlookModel_.f29727k != null : !str.equals(torlookModel_.f29727k)) {
            return false;
        }
        String str2 = this.f29728l;
        if (str2 == null ? torlookModel_.f29728l != null : !str2.equals(torlookModel_.f29728l)) {
            return false;
        }
        String str3 = this.f29729m;
        if (str3 == null ? torlookModel_.f29729m != null : !str3.equals(torlookModel_.f29729m)) {
            return false;
        }
        String str4 = this.f29730n;
        if (str4 == null ? torlookModel_.f29730n != null : !str4.equals(torlookModel_.f29730n)) {
            return false;
        }
        String str5 = this.f29731o;
        if (str5 == null ? torlookModel_.f29731o != null : !str5.equals(torlookModel_.f29731o)) {
            return false;
        }
        String str6 = this.f29732p;
        if (str6 == null ? torlookModel_.f29732p != null : !str6.equals(torlookModel_.f29732p)) {
            return false;
        }
        String str7 = this.f29733q;
        if (str7 == null ? torlookModel_.f29733q != null : !str7.equals(torlookModel_.f29733q)) {
            return false;
        }
        String str8 = this.f29734r;
        if (str8 == null ? torlookModel_.f29734r != null : !str8.equals(torlookModel_.f29734r)) {
            return false;
        }
        String str9 = this.f29735s;
        if (str9 == null ? torlookModel_.f29735s != null : !str9.equals(torlookModel_.f29735s)) {
            return false;
        }
        String str10 = this.f29736t;
        if (str10 == null ? torlookModel_.f29736t == null : str10.equals(torlookModel_.f29736t)) {
            return (this.f29737u == null) == (torlookModel_.f29737u == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: g0 */
    public TorlookModelBuilder mo16000g0(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29731o = str;
        return this;
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
        String str = this.f29727k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29728l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29729m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f29730n;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f29731o;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f29732p;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f29733q;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f29734r;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f29735s;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f29736t;
        return ((hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31) + (this.f29737u != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: j */
    public TorlookModelBuilder mo16001j(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29728l = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: l1 */
    public TorlookModelBuilder mo16002l1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29735s = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: m1 */
    public TorlookModelBuilder mo16003m1(TorlookModel.Listener listener) {
        m4524l2();
        this.f29737u = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("TorlookModel_{searchQuery=");
        m24u.append(this.f29727k);
        m24u.append(", title=");
        m24u.append(this.f29728l);
        m24u.append(", size=");
        m24u.append(this.f29729m);
        m24u.append(", date=");
        m24u.append(this.f29730n);
        m24u.append(", trackerDomain=");
        m24u.append(this.f29731o);
        m24u.append(", trackerIcon=");
        m24u.append(this.f29732p);
        m24u.append(", seedCount=");
        m24u.append(this.f29733q);
        m24u.append(", leechCount=");
        m24u.append(this.f29734r);
        m24u.append(", link=");
        m24u.append(this.f29735s);
        m24u.append(", magnetLink=");
        m24u.append(this.f29736t);
        m24u.append(", listener=");
        m24u.append(this.f29737u);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        C2052a.m12282q(view, "view", null, null);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: x0 */
    public TorlookModelBuilder mo16004x0(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29730n = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.episodes.torlook.TorlookModelBuilder
    /* renamed from: x1 */
    public TorlookModelBuilder mo16005x1(@NotNull String str) {
        m4524l2();
        this.f29727k = str;
        return this;
    }
}

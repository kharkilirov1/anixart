package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class InterestingModel_ extends InterestingModel implements GeneratedModel<View>, InterestingModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: R1 */
    public InterestingModelBuilder mo15940R1(InterestingModel.Listener listener) {
        m4524l2();
        this.f29635p = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: b */
    public InterestingModelBuilder mo15941b(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: c */
    public InterestingModelBuilder mo15942c(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29632m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_discover_interesting;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterestingModel_) || !super.equals(obj)) {
            return false;
        }
        InterestingModel_ interestingModel_ = (InterestingModel_) obj;
        Objects.requireNonNull(interestingModel_);
        String str = this.f29630k;
        if (str == null ? interestingModel_.f29630k != null : !str.equals(interestingModel_.f29630k)) {
            return false;
        }
        String str2 = this.f29631l;
        if (str2 == null ? interestingModel_.f29631l != null : !str2.equals(interestingModel_.f29631l)) {
            return false;
        }
        String str3 = this.f29632m;
        if (str3 == null ? interestingModel_.f29632m != null : !str3.equals(interestingModel_.f29632m)) {
            return false;
        }
        if (this.f29633n != interestingModel_.f29633n) {
            return false;
        }
        String str4 = this.f29634o;
        if (str4 == null ? interestingModel_.f29634o == null : str4.equals(interestingModel_.f29634o)) {
            return (this.f29635p == null) == (interestingModel_.f29635p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: g */
    public InterestingModelBuilder mo15943g(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29631l = str;
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
        String str = this.f29630k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29631l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29632m;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f29633n) * 31;
        String str4 = this.f29634o;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f29635p != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: j */
    public InterestingModelBuilder mo15944j(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29630k = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: n1 */
    public InterestingModelBuilder mo15945n1(int i2) {
        m4524l2();
        this.f29633n = i2;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModelBuilder
    /* renamed from: r0 */
    public InterestingModelBuilder mo15946r0(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29634o = str;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("InterestingModel_{title=");
        m24u.append(this.f29630k);
        m24u.append(", description=");
        m24u.append(this.f29631l);
        m24u.append(", image=");
        m24u.append(this.f29632m);
        m24u.append(", type=");
        m24u.append(this.f29633n);
        m24u.append(", action=");
        m24u.append(this.f29634o);
        m24u.append(", listener=");
        m24u.append(this.f29635p);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.discover.InterestingModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }
}

package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.CheckboxModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CheckboxModel_ extends CheckboxModel implements GeneratedModel<View>, CheckboxModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModelBuilder
    /* renamed from: D */
    public CheckboxModelBuilder mo15716D(@Nullable Number[] numberArr) {
        m4521i2(numberArr);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModelBuilder
    /* renamed from: E0 */
    public CheckboxModelBuilder mo15717E0(CheckboxModel.Listener listener) {
        m4524l2();
        this.f29381n = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModelBuilder
    /* renamed from: L0 */
    public CheckboxModelBuilder mo15718L0(boolean z) {
        m4524l2();
        this.f29380m = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModelBuilder
    /* renamed from: Q1 */
    public CheckboxModelBuilder mo15719Q1(int i2) {
        m4524l2();
        this.f29379l = i2;
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
        return C2507R.layout.item_checkbox;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CheckboxModel_) || !super.equals(obj)) {
            return false;
        }
        CheckboxModel_ checkboxModel_ = (CheckboxModel_) obj;
        Objects.requireNonNull(checkboxModel_);
        String str = this.f29378k;
        if (str == null ? checkboxModel_.f29378k != null : !str.equals(checkboxModel_.f29378k)) {
            return false;
        }
        if (this.f29379l == checkboxModel_.f29379l && this.f29380m == checkboxModel_.f29380m) {
            return (this.f29381n == null) == (checkboxModel_.f29381n == null);
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
        String str = this.f29378k;
        return ((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f29379l) * 31) + (this.f29380m ? 1 : 0)) * 31) + (this.f29381n != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModelBuilder
    /* renamed from: j */
    public CheckboxModelBuilder mo15720j(String str) {
        m4524l2();
        this.f29378k = str;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((AppCompatCheckBox) view2.findViewById(C2507R.id.checkbox)).setOnCheckedChangeListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CheckboxModel_{title=");
        m24u.append(this.f29378k);
        m24u.append(", position=");
        m24u.append(this.f29379l);
        m24u.append(", checked=");
        m24u.append(this.f29380m);
        m24u.append(", listener=");
        m24u.append(this.f29381n);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.CheckboxModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        ((AppCompatCheckBox) view.findViewById(C2507R.id.checkbox)).setOnCheckedChangeListener(null);
    }
}

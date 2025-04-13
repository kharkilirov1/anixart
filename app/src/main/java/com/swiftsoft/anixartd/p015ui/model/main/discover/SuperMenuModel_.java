package com.swiftsoft.anixartd.p015ui.model.main.discover;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class SuperMenuModel_ extends SuperMenuModel implements GeneratedModel<View>, SuperMenuModelBuilder {
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
        return C2507R.layout.item_super_menu;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperMenuModel_) || !super.equals(obj)) {
            return false;
        }
        SuperMenuModel_ superMenuModel_ = (SuperMenuModel_) obj;
        Objects.requireNonNull(superMenuModel_);
        if (this.f29648k != superMenuModel_.f29648k) {
            return false;
        }
        String str = this.f29649l;
        if (str == null ? superMenuModel_.f29649l != null : !str.equals(superMenuModel_.f29649l)) {
            return false;
        }
        if (this.f29650m == superMenuModel_.f29650m && this.f29651n == superMenuModel_.f29651n && this.f29652o == superMenuModel_.f29652o && this.f29653p == superMenuModel_.f29653p) {
            return (this.f29654q == null) == (superMenuModel_.f29654q == null);
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
        long j2 = this.f29648k;
        int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f29649l;
        return ((((((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f29650m) * 31) + this.f29651n) * 31) + this.f29652o) * 31) + (this.f29653p ? 1 : 0)) * 31) + (this.f29654q != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ void mo4506s2(View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SuperMenuModel_{superMenuId=");
        m24u.append(this.f29648k);
        m24u.append(", title=");
        m24u.append(this.f29649l);
        m24u.append(", color=");
        m24u.append(this.f29650m);
        m24u.append(", backgroundColor=");
        m24u.append(this.f29651n);
        m24u.append(", icon=");
        m24u.append(this.f29652o);
        m24u.append(", newDot=");
        m24u.append(this.f29653p);
        m24u.append(", listener=");
        m24u.append(this.f29654q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    /* renamed from: u2 */
    public SuperMenuModelBuilder m15950u2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    /* renamed from: v2 */
    public SuperMenuModelBuilder m15951v2(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29649l = str;
        return this;
    }
}

package com.swiftsoft.anixartd.p015ui.model.common;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class SectionHeaderModel_ extends SectionHeaderModel implements GeneratedModel<View>, SectionHeaderModelBuilder {
    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: G0 */
    public SectionHeaderModelBuilder mo15772G0(boolean z) {
        m4524l2();
        this.f29435n = z;
        return this;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: V0 */
    public SectionHeaderModelBuilder mo15773V0(@Nullable String str) {
        m4524l2();
        this.f29433l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: a */
    public SectionHeaderModelBuilder mo15774a(@androidx.annotation.Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_common_section_header;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: e0 */
    public SectionHeaderModelBuilder mo15775e0(int i2) {
        m4524l2();
        this.f29432k = i2;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionHeaderModel_) || !super.equals(obj)) {
            return false;
        }
        SectionHeaderModel_ sectionHeaderModel_ = (SectionHeaderModel_) obj;
        Objects.requireNonNull(sectionHeaderModel_);
        if (this.f29432k != sectionHeaderModel_.f29432k) {
            return false;
        }
        String str = this.f29433l;
        if (str == null ? sectionHeaderModel_.f29433l != null : !str.equals(sectionHeaderModel_.f29433l)) {
            return false;
        }
        String str2 = this.f29434m;
        if (str2 == null ? sectionHeaderModel_.f29434m != null : !str2.equals(sectionHeaderModel_.f29434m)) {
            return false;
        }
        if (this.f29435n != sectionHeaderModel_.f29435n) {
            return false;
        }
        Integer num = this.f29436o;
        if (num == null ? sectionHeaderModel_.f29436o == null : num.equals(sectionHeaderModel_.f29436o)) {
            return (this.f29437p == null) == (sectionHeaderModel_.f29437p == null);
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
        int hashCode = ((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f29432k) * 31;
        String str = this.f29433l;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29434m;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29435n ? 1 : 0)) * 31;
        Integer num = this.f29436o;
        return ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + (this.f29437p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: q0 */
    public SectionHeaderModelBuilder mo15776q0(@Nullable Integer num) {
        m4524l2();
        this.f29436o = num;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ void mo4506s2(View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: t0 */
    public SectionHeaderModelBuilder mo15777t0(SectionHeaderModel.Listener listener) {
        m4524l2();
        this.f29437p = listener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SectionHeaderModel_{titleResourceId=");
        m24u.append(this.f29432k);
        m24u.append(", titleText=");
        m24u.append(this.f29433l);
        m24u.append(", badgeText=");
        m24u.append(this.f29434m);
        m24u.append(", showButton=");
        m24u.append(this.f29435n);
        m24u.append(", buttonAction=");
        m24u.append(this.f29436o);
        m24u.append(", listener=");
        m24u.append(this.f29437p);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.common.SectionHeaderModelBuilder
    /* renamed from: w1 */
    public SectionHeaderModelBuilder mo15778w1(@NotNull String str) {
        m4524l2();
        Intrinsics.m32179h(str, "<set-?>");
        this.f29434m = str;
        return this;
    }
}

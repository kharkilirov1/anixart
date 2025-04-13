package com.swiftsoft.anixartd.p015ui.model.main.schedule;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ScheduleModel_ extends ScheduleModel implements GeneratedModel<View>, ScheduleModelBuilder {
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
        return C2507R.layout.item_schedule;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduleModel_) || !super.equals(obj)) {
            return false;
        }
        ScheduleModel_ scheduleModel_ = (ScheduleModel_) obj;
        Objects.requireNonNull(scheduleModel_);
        String str = this.f30087k;
        if (str == null ? scheduleModel_.f30087k != null : !str.equals(scheduleModel_.f30087k)) {
            return false;
        }
        String str2 = this.f30088l;
        if (str2 == null ? scheduleModel_.f30088l != null : !str2.equals(scheduleModel_.f30088l)) {
            return false;
        }
        Integer num = this.f30089m;
        if (num == null ? scheduleModel_.f30089m != null : !num.equals(scheduleModel_.f30089m)) {
            return false;
        }
        Integer num2 = this.f30090n;
        if (num2 == null ? scheduleModel_.f30090n == null : num2.equals(scheduleModel_.f30090n)) {
            return (this.f30091o == null) == (scheduleModel_.f30091o == null);
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
        String str = this.f30087k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30088l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f30089m;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f30090n;
        return ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.f30091o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        view2.setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ScheduleModel_{titleRussian=");
        m24u.append(this.f30087k);
        m24u.append(", image=");
        m24u.append(this.f30088l);
        m24u.append(", episodesReleased=");
        m24u.append(this.f30089m);
        m24u.append(", episodesTotal=");
        m24u.append(this.f30090n);
        m24u.append(", listener=");
        m24u.append(this.f30091o);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleModel
    /* renamed from: v2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        view.setOnClickListener(null);
    }

    /* renamed from: w2 */
    public ScheduleModel_ m16260w2(long j2) {
        super.mo4503g2(j2);
        return this;
    }
}

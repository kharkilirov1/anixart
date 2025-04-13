package com.swiftsoft.anixartd.p015ui.model.main.schedule;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModel;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class ScheduleHintModel_ extends ScheduleHintModel implements GeneratedModel<View>, ScheduleHintModelBuilder {
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModelBuilder
    /* renamed from: a */
    public ScheduleHintModelBuilder mo16256a(@Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_schedule_hint;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduleHintModel_) || !super.equals(obj)) {
            return false;
        }
        ScheduleHintModel_ scheduleHintModel_ = (ScheduleHintModel_) obj;
        Objects.requireNonNull(scheduleHintModel_);
        return (this.f30084k == null) == (scheduleHintModel_.f30084k == null);
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
        return (((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + (this.f30084k != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModelBuilder
    /* renamed from: j1 */
    public ScheduleHintModelBuilder mo16257j1(ScheduleHintModel.Listener listener) {
        m4524l2();
        this.f30084k = listener;
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

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        ((ImageView) view2.findViewById(C2507R.id.close)).setOnClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ScheduleHintModel_{listener=");
        m24u.append(this.f30084k);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.schedule.ScheduleHintModel
    /* renamed from: u2 */
    public void mo4506s2(View view) {
        Intrinsics.m32179h(view, "view");
        ((ImageView) view.findViewById(C2507R.id.close)).setOnClickListener(null);
    }
}

package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1440c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a */
    public final /* synthetic */ int f19291a;

    /* renamed from: b */
    public final /* synthetic */ Object f19292b;

    public /* synthetic */ C1440c(Object obj, int i2) {
        this.f19291a = i2;
        this.f19292b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    /* renamed from: a */
    public final void mo9895a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z) {
        TimePickerView.OnPeriodChangeListener onPeriodChangeListener;
        switch (this.f19291a) {
            case 0:
                TimePickerTextInputPresenter timePickerTextInputPresenter = (TimePickerTextInputPresenter) this.f19292b;
                Objects.requireNonNull(timePickerTextInputPresenter);
                if (z) {
                    timePickerTextInputPresenter.f19262c.m10553g(i2 == C2507R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) this.f19292b;
                int i3 = TimePickerView.f19276C;
                Objects.requireNonNull(timePickerView);
                if (z && (onPeriodChangeListener = timePickerView.f19285z) != null) {
                    onPeriodChangeListener.mo10555d(i2 == C2507R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
        }
    }
}

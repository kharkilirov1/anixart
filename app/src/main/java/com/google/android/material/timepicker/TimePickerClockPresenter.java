package com.google.android.material.timepicker;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {

    /* renamed from: g */
    public static final String[] f19247g = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: h */
    public static final String[] f19248h = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: i */
    public static final String[] f19249i = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: b */
    public final TimePickerView f19250b;

    /* renamed from: c */
    public final TimeModel f19251c;

    /* renamed from: d */
    public float f19252d;

    /* renamed from: e */
    public float f19253e;

    /* renamed from: f */
    public boolean f19254f = false;

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.f19250b = timePickerView;
        this.f19251c = timeModel;
        if (timeModel.f19242d == 0) {
            timePickerView.f19283x.setVisibility(0);
        }
        timePickerView.f19281v.f19199i.add(this);
        timePickerView.f19277A = this;
        timePickerView.f19285z = this;
        timePickerView.f19281v.f19207q = this;
        m10560i(f19247g, "%d");
        m10560i(f19249i, "%02d");
        invalidate();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    /* renamed from: a */
    public void mo10554a() {
        this.f19250b.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    /* renamed from: b */
    public void mo10538b(float f2, boolean z) {
        if (this.f19254f) {
            return;
        }
        TimeModel timeModel = this.f19251c;
        int i2 = timeModel.f19243e;
        int i3 = timeModel.f19244f;
        int round = Math.round(f2);
        TimeModel timeModel2 = this.f19251c;
        if (timeModel2.f19245g == 12) {
            timeModel2.f19244f = ((round + 3) / 6) % 60;
            this.f19252d = (float) Math.floor(r6 * 6);
        } else {
            int i4 = (round + 15) / 30;
            if (timeModel2.f19242d == 1) {
                i4 %= 12;
                if (this.f19250b.f19282w.f19185w.f19210t == 2) {
                    i4 += 12;
                }
            }
            timeModel2.m10552f(i4);
            this.f19253e = (this.f19251c.m10551d() * 30) % 360;
        }
        if (z) {
            return;
        }
        m10559h();
        TimeModel timeModel3 = this.f19251c;
        if (timeModel3.f19244f == i3 && timeModel3.f19243e == i2) {
            return;
        }
        this.f19250b.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    /* renamed from: c */
    public void mo10546c(float f2, boolean z) {
        this.f19254f = true;
        TimeModel timeModel = this.f19251c;
        int i2 = timeModel.f19244f;
        int i3 = timeModel.f19243e;
        if (timeModel.f19245g == 10) {
            this.f19250b.f19281v.m10544c(this.f19253e, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) ContextCompat.m1674g(this.f19250b.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                m10558g(12, true);
            }
        } else {
            int round = Math.round(f2);
            if (!z) {
                TimeModel timeModel2 = this.f19251c;
                Objects.requireNonNull(timeModel2);
                timeModel2.f19244f = (((round + 15) / 30) * 5) % 60;
                this.f19252d = this.f19251c.f19244f * 6;
            }
            this.f19250b.f19281v.m10544c(this.f19252d, z);
        }
        this.f19254f = false;
        m10559h();
        TimeModel timeModel3 = this.f19251c;
        if (timeModel3.f19244f == i2 && timeModel3.f19243e == i3) {
            return;
        }
        this.f19250b.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    /* renamed from: d */
    public void mo10555d(int i2) {
        this.f19251c.m10553g(i2);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    /* renamed from: e */
    public void mo10556e(int i2) {
        m10558g(i2, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    /* renamed from: f */
    public void mo10557f() {
        this.f19250b.setVisibility(8);
    }

    /* renamed from: g */
    public void m10558g(int i2, boolean z) {
        boolean z2 = i2 == 12;
        TimePickerView timePickerView = this.f19250b;
        timePickerView.f19281v.f19193c = z2;
        TimeModel timeModel = this.f19251c;
        timeModel.f19245g = i2;
        timePickerView.f19282w.m10541v(z2 ? f19249i : timeModel.f19242d == 1 ? f19248h : f19247g, z2 ? C2507R.string.material_minute_suffix : timeModel.m10550c());
        TimeModel timeModel2 = this.f19251c;
        int i3 = (timeModel2.f19245g == 10 && timeModel2.f19242d == 1 && timeModel2.f19243e >= 12) ? 2 : 1;
        ClockHandView clockHandView = this.f19250b.f19282w.f19185w;
        clockHandView.f19210t = i3;
        clockHandView.invalidate();
        this.f19250b.f19281v.m10544c(z2 ? this.f19252d : this.f19253e, z);
        TimePickerView timePickerView2 = this.f19250b;
        Chip chip = timePickerView2.f19279t;
        boolean z3 = i2 == 12;
        chip.setChecked(z3);
        ViewCompat.m2200g0(chip, z3 ? 2 : 0);
        Chip chip2 = timePickerView2.f19280u;
        boolean z4 = i2 == 10;
        chip2.setChecked(z4);
        ViewCompat.m2200g0(chip2, z4 ? 2 : 0);
        ViewCompat.m2196e0(this.f19250b.f19280u, new ClickActionDelegate(this.f19250b.getContext(), C2507R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.m2497a(this.f19173d);
                accessibilityNodeInfoCompat.f3743a.setContentDescription(view.getResources().getString(TimePickerClockPresenter.this.f19251c.m10550c(), String.valueOf(TimePickerClockPresenter.this.f19251c.m10551d())));
            }
        });
        ViewCompat.m2196e0(this.f19250b.f19279t, new ClickActionDelegate(this.f19250b.getContext(), C2507R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.m2497a(this.f19173d);
                accessibilityNodeInfoCompat.f3743a.setContentDescription(view.getResources().getString(C2507R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.this.f19251c.f19244f)));
            }
        });
    }

    /* renamed from: h */
    public final void m10559h() {
        TimePickerView timePickerView = this.f19250b;
        TimeModel timeModel = this.f19251c;
        int i2 = timeModel.f19246h;
        int m10551d = timeModel.m10551d();
        int i3 = this.f19251c.f19244f;
        timePickerView.f19283x.m9890b(i2 == 1 ? C2507R.id.material_clock_period_pm_button : C2507R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i3));
        String format2 = String.format(locale, "%02d", Integer.valueOf(m10551d));
        if (!TextUtils.equals(timePickerView.f19279t.getText(), format)) {
            timePickerView.f19279t.setText(format);
        }
        if (TextUtils.equals(timePickerView.f19280u.getText(), format2)) {
            return;
        }
        timePickerView.f19280u.setText(format2);
    }

    /* renamed from: i */
    public final void m10560i(String[] strArr, String str) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = TimeModel.m10549a(this.f19250b.getResources(), strArr[i2], str);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        this.f19253e = (this.f19251c.m10551d() * 30) % 360;
        TimeModel timeModel = this.f19251c;
        this.f19252d = timeModel.f19244f * 6;
        m10558g(timeModel.f19245g, false);
        m10559h();
    }
}

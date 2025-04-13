package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.TimePickerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {

    /* renamed from: b */
    public final LinearLayout f19261b;

    /* renamed from: c */
    public final TimeModel f19262c;

    /* renamed from: d */
    public final TextWatcher f19263d;

    /* renamed from: e */
    public final TextWatcher f19264e;

    /* renamed from: f */
    public final ChipTextInputComboView f19265f;

    /* renamed from: g */
    public final ChipTextInputComboView f19266g;

    /* renamed from: h */
    public final TimePickerTextInputKeyController f19267h;

    /* renamed from: i */
    public final EditText f19268i;

    /* renamed from: j */
    public final EditText f19269j;

    /* renamed from: k */
    public MaterialButtonToggleGroup f19270k;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        TextWatcherAdapter textWatcherAdapter = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    if (TextUtils.isEmpty(editable)) {
                        TimeModel timeModel2 = TimePickerTextInputPresenter.this.f19262c;
                        Objects.requireNonNull(timeModel2);
                        timeModel2.f19244f = 0;
                    } else {
                        int parseInt = Integer.parseInt(editable.toString());
                        TimeModel timeModel3 = TimePickerTextInputPresenter.this.f19262c;
                        Objects.requireNonNull(timeModel3);
                        timeModel3.f19244f = parseInt % 60;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.f19263d = textWatcherAdapter;
        TextWatcherAdapter textWatcherAdapter2 = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    if (TextUtils.isEmpty(editable)) {
                        TimePickerTextInputPresenter.this.f19262c.m10552f(0);
                    } else {
                        TimePickerTextInputPresenter.this.f19262c.m10552f(Integer.parseInt(editable.toString()));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.f19264e = textWatcherAdapter2;
        this.f19261b = linearLayout;
        this.f19262c = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C2507R.id.material_minute_text_input);
        this.f19265f = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C2507R.id.material_hour_text_input);
        this.f19266g = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(C2507R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(C2507R.id.material_label);
        textView.setText(resources.getString(C2507R.string.material_timepicker_minute));
        textView2.setText(resources.getString(C2507R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(C2507R.id.selection_type, 12);
        chipTextInputComboView2.setTag(C2507R.id.selection_type, 10);
        if (timeModel.f19242d == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(C2507R.id.material_clock_period_toggle);
            this.f19270k = materialButtonToggleGroup;
            materialButtonToggleGroup.f17725d.add(new C1440c(this, 0));
            this.f19270k.setVisibility(0);
            m10563c();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TimePickerTextInputPresenter.this.mo10556e(((Integer) view.getTag(C2507R.id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        chipTextInputComboView2.m10535a(timeModel.f19241c);
        chipTextInputComboView.m10535a(timeModel.f19240b);
        EditText editText = chipTextInputComboView2.f19168c.getEditText();
        this.f19268i = editText;
        EditText editText2 = chipTextInputComboView.f19168c.getEditText();
        this.f19269j = editText2;
        TimePickerTextInputKeyController timePickerTextInputKeyController = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        this.f19267h = timePickerTextInputKeyController;
        ViewCompat.m2196e0(chipTextInputComboView2.f19167b, new ClickActionDelegate(this, linearLayout.getContext(), C2507R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.m2497a(this.f19173d);
                accessibilityNodeInfoCompat.f3743a.setContentDescription(view.getResources().getString(timeModel.m10550c(), String.valueOf(timeModel.m10551d())));
            }
        });
        ViewCompat.m2196e0(chipTextInputComboView.f19167b, new ClickActionDelegate(this, linearLayout.getContext(), C2507R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            /* renamed from: d */
            public void mo2044d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f3570a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f3743a);
                accessibilityNodeInfoCompat.m2497a(this.f19173d);
                accessibilityNodeInfoCompat.f3743a.setContentDescription(view.getResources().getString(C2507R.string.material_minute_suffix, String.valueOf(timeModel.f19244f)));
            }
        });
        editText.addTextChangedListener(textWatcherAdapter2);
        editText2.addTextChangedListener(textWatcherAdapter);
        m10562b(timeModel);
        TextInputLayout textInputLayout = chipTextInputComboView2.f19168c;
        TextInputLayout textInputLayout2 = chipTextInputComboView.f19168c;
        EditText editText3 = textInputLayout.getEditText();
        EditText editText4 = textInputLayout2.getEditText();
        editText3.setImeOptions(268435461);
        editText4.setImeOptions(268435462);
        editText3.setOnEditorActionListener(timePickerTextInputKeyController);
        editText3.setOnKeyListener(timePickerTextInputKeyController);
        editText4.setOnKeyListener(timePickerTextInputKeyController);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    /* renamed from: a */
    public void mo10554a() {
        this.f19261b.setVisibility(0);
        mo10556e(this.f19262c.f19245g);
    }

    /* renamed from: b */
    public final void m10562b(TimeModel timeModel) {
        this.f19268i.removeTextChangedListener(this.f19264e);
        this.f19269j.removeTextChangedListener(this.f19263d);
        Locale locale = this.f19261b.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(timeModel.f19244f));
        String format2 = String.format(locale, "%02d", Integer.valueOf(timeModel.m10551d()));
        this.f19265f.m10536b(format);
        this.f19266g.m10536b(format2);
        this.f19268i.addTextChangedListener(this.f19264e);
        this.f19269j.addTextChangedListener(this.f19263d);
        m10563c();
    }

    /* renamed from: c */
    public final void m10563c() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f19270k;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.m9890b(this.f19262c.f19246h == 0 ? C2507R.id.material_clock_period_am_button : C2507R.id.material_clock_period_pm_button, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    /* renamed from: e */
    public void mo10556e(int i2) {
        this.f19262c.f19245g = i2;
        this.f19265f.setChecked(i2 == 12);
        this.f19266g.setChecked(i2 == 10);
        m10563c();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    /* renamed from: f */
    public void mo10557f() {
        View focusedChild = this.f19261b.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.m10170g(focusedChild);
        }
        this.f19261b.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        m10562b(this.f19262c);
    }
}

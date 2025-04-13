package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: b */
    public final ChipTextInputComboView f19257b;

    /* renamed from: c */
    public final ChipTextInputComboView f19258c;

    /* renamed from: d */
    public final TimeModel f19259d;

    /* renamed from: e */
    public boolean f19260e = false;

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f19257b = chipTextInputComboView;
        this.f19258c = chipTextInputComboView2;
        this.f19259d = timeModel;
    }

    /* renamed from: a */
    public final void m10561a(int i2) {
        this.f19258c.setChecked(i2 == 12);
        this.f19257b.setChecked(i2 == 10);
        this.f19259d.f19245g = i2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        boolean z = i2 == 5;
        if (z) {
            m10561a(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (this.f19260e) {
            return false;
        }
        boolean z = true;
        this.f19260e = true;
        EditText editText = (EditText) view;
        if (this.f19259d.f19245g == 12) {
            if (i2 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
                m10561a(10);
            }
            z = false;
        } else {
            Editable text = editText.getText();
            if (text != null) {
                if (i2 >= 7 && i2 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    m10561a(12);
                }
            }
            z = false;
        }
        this.f19260e = false;
        return z;
    }
}

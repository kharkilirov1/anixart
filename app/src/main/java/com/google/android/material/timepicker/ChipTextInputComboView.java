package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import java.util.Arrays;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b */
    public final Chip f19167b;

    /* renamed from: c */
    public final TextInputLayout f19168c;

    /* renamed from: d */
    public final EditText f19169d;

    /* renamed from: e */
    public TextWatcher f19170e;

    /* renamed from: f */
    public TextView f19171f;

    public class TextFormatter extends TextWatcherAdapter {
        public TextFormatter(C14201 c14201) {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f19167b.setText(TimeModel.m10549a(chipTextInputComboView.getResources(), "00", "%02d"));
            } else {
                ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
                chipTextInputComboView2.f19167b.setText(TimeModel.m10549a(chipTextInputComboView2.getResources(), editable, "%02d"));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C2507R.layout.material_time_chip, (ViewGroup) this, false);
        this.f19167b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C2507R.layout.material_time_input, (ViewGroup) this, false);
        this.f19168c = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f19169d = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter(null);
        this.f19170e = textFormatter;
        editText.addTextChangedListener(textFormatter);
        m10537c();
        addView(chip);
        addView(textInputLayout);
        this.f19171f = (TextView) findViewById(C2507R.id.material_label);
        editText.setId(ViewCompat.m2203i());
        ViewCompat.m2220q0(this.f19171f, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* renamed from: a */
    public void m10535a(InputFilter inputFilter) {
        InputFilter[] filters = this.f19169d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f19169d.setFilters(inputFilterArr);
    }

    /* renamed from: b */
    public void m10536b(CharSequence charSequence) {
        this.f19167b.setText(TimeModel.m10549a(getResources(), charSequence, "%02d"));
        if (TextUtils.isEmpty(this.f19169d.getText())) {
            return;
        }
        this.f19169d.removeTextChangedListener(this.f19170e);
        this.f19169d.setText((CharSequence) null);
        this.f19169d.addTextChangedListener(this.f19170e);
    }

    /* renamed from: c */
    public final void m10537c() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f19169d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f19167b.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m10537c();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f19167b.setChecked(z);
        this.f19169d.setVisibility(z ? 0 : 4);
        this.f19167b.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            ViewUtils.m10173j(this.f19169d);
            if (TextUtils.isEmpty(this.f19169d.getText())) {
                return;
            }
            EditText editText = this.f19169d;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f19167b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.f19167b.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f19167b.toggle();
    }
}

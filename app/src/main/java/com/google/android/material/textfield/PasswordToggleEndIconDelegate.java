package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {

    /* renamed from: e */
    public int f19058e;

    /* renamed from: f */
    @Nullable
    public EditText f19059f;

    /* renamed from: g */
    public final View.OnClickListener f19060g;

    public PasswordToggleEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout, @DrawableRes int i2) {
        super(endCompoundLayout);
        this.f19058e = C2507R.drawable.design_password_eye;
        this.f19060g = new ViewOnClickListenerC1414b(this, 2);
        if (i2 != 0) {
            this.f19058e = i2;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: b */
    public void mo10476b(CharSequence charSequence, int i2, int i3, int i4) {
        m10478q();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @StringRes
    /* renamed from: c */
    public int mo10429c() {
        return C2507R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @DrawableRes
    /* renamed from: d */
    public int mo10430d() {
        return this.f19058e;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: f */
    public View.OnClickListener mo10432f() {
        return this.f19060g;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: k */
    public boolean mo10477k() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: l */
    public boolean mo10445l() {
        EditText editText = this.f19059f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: m */
    public void mo10434m(@Nullable EditText editText) {
        this.f19059f = editText;
        m10478q();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: r */
    public void mo10436r() {
        EditText editText = this.f19059f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f19059f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: s */
    public void mo10437s() {
        EditText editText = this.f19059f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

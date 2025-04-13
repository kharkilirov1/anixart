package com.google.android.material.textfield;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.textfield.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1414b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19156b;

    /* renamed from: c */
    public final /* synthetic */ Object f19157c;

    public /* synthetic */ ViewOnClickListenerC1414b(EndIconDelegate endIconDelegate, int i2) {
        this.f19156b = i2;
        this.f19157c = endIconDelegate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19156b) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f19157c;
                EditText editText = clearTextEndIconDelegate.f18965e;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    clearTextEndIconDelegate.m10478q();
                    break;
                }
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) this.f19157c).m10451w();
                break;
            default:
                PasswordToggleEndIconDelegate passwordToggleEndIconDelegate = (PasswordToggleEndIconDelegate) this.f19157c;
                EditText editText2 = passwordToggleEndIconDelegate.f19059f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = passwordToggleEndIconDelegate.f19059f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        passwordToggleEndIconDelegate.f19059f.setTransformationMethod(null);
                    } else {
                        passwordToggleEndIconDelegate.f19059f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        passwordToggleEndIconDelegate.f19059f.setSelection(selectionEnd);
                    }
                    passwordToggleEndIconDelegate.m10478q();
                    break;
                }
                break;
        }
    }
}

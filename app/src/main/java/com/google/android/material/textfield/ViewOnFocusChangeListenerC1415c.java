package com.google.android.material.textfield;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.textfield.c */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC1415c implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f19158b;

    /* renamed from: c */
    public final /* synthetic */ Object f19159c;

    public /* synthetic */ ViewOnFocusChangeListenerC1415c(EndIconDelegate endIconDelegate, int i2) {
        this.f19158b = i2;
        this.f19159c = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f19158b) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f19159c;
                clearTextEndIconDelegate.m10438t(clearTextEndIconDelegate.m10440v());
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f19159c;
                dropdownMenuEndIconDelegate.f18977i = z;
                dropdownMenuEndIconDelegate.m10478q();
                if (!z) {
                    dropdownMenuEndIconDelegate.m10450v(false);
                    dropdownMenuEndIconDelegate.f18978j = false;
                    break;
                }
                break;
        }
    }
}

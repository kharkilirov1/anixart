package com.google.android.material.textfield;

import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    public CustomEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    /* renamed from: r */
    public void mo10436r() {
        EndCompoundLayout endCompoundLayout = this.f19017b;
        endCompoundLayout.f19000p = null;
        CheckableImageButton checkableImageButton = endCompoundLayout.f18992h;
        checkableImageButton.setOnLongClickListener(null);
        IconHelper.m10484f(checkableImageButton, null);
    }
}

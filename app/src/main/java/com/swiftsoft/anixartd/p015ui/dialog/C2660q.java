package com.swiftsoft.anixartd.p015ui.dialog;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.textfield.TextInputLayout;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.CommentProcessDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.dialog.q */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2660q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f27780a;

    /* renamed from: b */
    public final /* synthetic */ View f27781b;

    public /* synthetic */ C2660q(View view, int i2) {
        this.f27780a = i2;
        this.f27781b = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f27780a) {
            case 0:
                View view = this.f27781b;
                CommentProcessDialogFragment.Companion companion = CommentProcessDialogFragment.f27708l;
                ((TextInputLayout) view.findViewById(C2507R.id.ban_expires_layout)).setEnabled(z);
                ((TextInputLayout) view.findViewById(C2507R.id.ban_reason_layout)).setEnabled(z);
                break;
            default:
                View view2 = this.f27781b;
                int i2 = ProfileProcessDialogFragment.f27724i;
                ((TextInputLayout) view2.findViewById(C2507R.id.ban_expires_layout)).setEnabled(z);
                ((TextInputLayout) view2.findViewById(C2507R.id.ban_reason_layout)).setEnabled(z);
                break;
        }
    }
}

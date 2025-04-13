package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: b */
    public Dialog f15342b;

    /* renamed from: c */
    public DialogInterface.OnCancelListener f15343c;

    /* renamed from: d */
    @Nullable
    public Dialog f15344d;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15343c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f15342b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f15344d == null) {
            Context context = getContext();
            Objects.requireNonNull(context, "null reference");
            this.f15344d = new AlertDialog.Builder(context).create();
        }
        return this.f15344d;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}

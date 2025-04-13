package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: b */
    public Dialog f15318b;

    /* renamed from: c */
    public DialogInterface.OnCancelListener f15319c;

    /* renamed from: d */
    @Nullable
    public Dialog f15320d;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f15319c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f15318b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f15320d == null) {
            Activity activity = getActivity();
            Objects.requireNonNull(activity, "null reference");
            this.f15320d = new AlertDialog.Builder(activity).create();
        }
        return this.f15320d;
    }

    @Override // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}

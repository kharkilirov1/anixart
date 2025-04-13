package org.greenrobot.eventbus.util;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes3.dex */
public class ErrorDialogFragments {

    @TargetApi
    public static class Honeycomb extends DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            Activity activity = getActivity();
            if (!getArguments().getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) || activity == null) {
                return;
            }
            activity.finish();
        }

        @Override // android.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.m34660a(getActivity(), getArguments(), this);
        }
    }

    public static class Support extends androidx.fragment.app.DialogFragment implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            FragmentActivity activity = getActivity();
            if (!getArguments().getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) || activity == null) {
                return;
            }
            activity.finish();
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog onCreateDialog(Bundle bundle) {
            return ErrorDialogFragments.m34660a(getActivity(), getArguments(), this);
        }
    }

    /* renamed from: a */
    public static Dialog m34660a(Context context, Bundle bundle, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(bundle.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(bundle.getString("de.greenrobot.eventbus.errordialog.message"));
        builder.setPositiveButton(R.string.ok, onClickListener);
        return builder.create();
    }
}

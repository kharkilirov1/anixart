package pub.devrel.easypermissions;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import pub.devrel.easypermissions.EasyPermissions;

@RestrictTo
/* loaded from: classes3.dex */
public class RationaleDialogFragment extends DialogFragment {

    /* renamed from: b */
    public EasyPermissions.PermissionCallbacks f69398b;

    /* renamed from: c */
    public EasyPermissions.RationaleCallbacks f69399c;

    /* renamed from: d */
    public boolean f69400d = false;

    /* renamed from: a */
    public static RationaleDialogFragment m34999a(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String[] strArr) {
        RationaleDialogFragment rationaleDialogFragment = new RationaleDialogFragment();
        rationaleDialogFragment.setArguments(new RationaleDialogConfig(str, str2, str3, i2, i3, strArr).m34998a());
        return rationaleDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions.PermissionCallbacks) {
                this.f69398b = (EasyPermissions.PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions.RationaleCallbacks) {
                this.f69399c = (EasyPermissions.RationaleCallbacks) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions.PermissionCallbacks) {
            this.f69398b = (EasyPermissions.PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions.RationaleCallbacks) {
            this.f69399c = (EasyPermissions.RationaleCallbacks) context;
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        RationaleDialogConfig rationaleDialogConfig = new RationaleDialogConfig(getArguments());
        RationaleDialogClickListener rationaleDialogClickListener = new RationaleDialogClickListener(this, rationaleDialogConfig, this.f69398b, this.f69399c);
        Activity activity = getActivity();
        return (rationaleDialogConfig.f69394c > 0 ? new AlertDialog.Builder(activity, rationaleDialogConfig.f69394c) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton(rationaleDialogConfig.f69392a, rationaleDialogClickListener).setNegativeButton(rationaleDialogConfig.f69393b, rationaleDialogClickListener).setMessage(rationaleDialogConfig.f69396e).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f69398b = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f69400d = true;
        super.onSaveInstanceState(bundle);
    }
}

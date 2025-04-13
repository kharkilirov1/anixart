package pub.devrel.easypermissions;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import pub.devrel.easypermissions.EasyPermissions;

@RestrictTo
/* loaded from: classes3.dex */
public class RationaleDialogFragmentCompat extends AppCompatDialogFragment {

    /* renamed from: b */
    public EasyPermissions.PermissionCallbacks f69401b;

    /* renamed from: c */
    public EasyPermissions.RationaleCallbacks f69402c;

    /* renamed from: n3 */
    public static RationaleDialogFragmentCompat m35000n3(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String[] strArr) {
        RationaleDialogFragmentCompat rationaleDialogFragmentCompat = new RationaleDialogFragmentCompat();
        rationaleDialogFragmentCompat.setArguments(new RationaleDialogConfig(str2, str3, str, i2, i3, strArr).m34998a());
        return rationaleDialogFragmentCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof EasyPermissions.PermissionCallbacks) {
                this.f69401b = (EasyPermissions.PermissionCallbacks) getParentFragment();
            }
            if (getParentFragment() instanceof EasyPermissions.RationaleCallbacks) {
                this.f69402c = (EasyPermissions.RationaleCallbacks) getParentFragment();
            }
        }
        if (context instanceof EasyPermissions.PermissionCallbacks) {
            this.f69401b = (EasyPermissions.PermissionCallbacks) context;
        }
        if (context instanceof EasyPermissions.RationaleCallbacks) {
            this.f69402c = (EasyPermissions.RationaleCallbacks) context;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        RationaleDialogConfig rationaleDialogConfig = new RationaleDialogConfig(getArguments());
        RationaleDialogClickListener rationaleDialogClickListener = new RationaleDialogClickListener(this, rationaleDialogConfig, this.f69401b, this.f69402c);
        Context context = getContext();
        int i2 = rationaleDialogConfig.f69394c;
        return (i2 > 0 ? new AlertDialog.Builder(context, i2) : new AlertDialog.Builder(context)).mo367a(false).mo375i(rationaleDialogConfig.f69392a, rationaleDialogClickListener).mo371e(rationaleDialogConfig.f69393b, rationaleDialogClickListener).mo369c(rationaleDialogConfig.f69396e).create();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f69401b = null;
        this.f69402c = null;
    }
}

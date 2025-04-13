package pub.devrel.easypermissions;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.helper.PermissionHelper;

/* loaded from: classes3.dex */
class RationaleDialogClickListener implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public Object f69388b;

    /* renamed from: c */
    public RationaleDialogConfig f69389c;

    /* renamed from: d */
    public EasyPermissions.PermissionCallbacks f69390d;

    /* renamed from: e */
    public EasyPermissions.RationaleCallbacks f69391e;

    public RationaleDialogClickListener(RationaleDialogFragmentCompat rationaleDialogFragmentCompat, RationaleDialogConfig rationaleDialogConfig, EasyPermissions.PermissionCallbacks permissionCallbacks, EasyPermissions.RationaleCallbacks rationaleCallbacks) {
        this.f69388b = rationaleDialogFragmentCompat.getParentFragment() != null ? rationaleDialogFragmentCompat.getParentFragment() : rationaleDialogFragmentCompat.getActivity();
        this.f69389c = rationaleDialogConfig;
        this.f69390d = permissionCallbacks;
        this.f69391e = rationaleCallbacks;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        RationaleDialogConfig rationaleDialogConfig = this.f69389c;
        int i3 = rationaleDialogConfig.f69395d;
        if (i2 != -1) {
            EasyPermissions.RationaleCallbacks rationaleCallbacks = this.f69391e;
            if (rationaleCallbacks != null) {
                rationaleCallbacks.m34995b(i3);
            }
            EasyPermissions.PermissionCallbacks permissionCallbacks = this.f69390d;
            if (permissionCallbacks != null) {
                RationaleDialogConfig rationaleDialogConfig2 = this.f69389c;
                permissionCallbacks.m34993v1(rationaleDialogConfig2.f69395d, Arrays.asList(rationaleDialogConfig2.f69397f));
                return;
            }
            return;
        }
        String[] strArr = rationaleDialogConfig.f69397f;
        EasyPermissions.RationaleCallbacks rationaleCallbacks2 = this.f69391e;
        if (rationaleCallbacks2 != null) {
            rationaleCallbacks2.m34994a(i3);
        }
        Object obj = this.f69388b;
        if (obj instanceof Fragment) {
            PermissionHelper.m35007d((Fragment) obj).mo35001a(i3, strArr);
        } else {
            if (!(obj instanceof Activity)) {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
            PermissionHelper.m35006c((Activity) obj).mo35001a(i3, strArr);
        }
    }

    public RationaleDialogClickListener(RationaleDialogFragment rationaleDialogFragment, RationaleDialogConfig rationaleDialogConfig, EasyPermissions.PermissionCallbacks permissionCallbacks, EasyPermissions.RationaleCallbacks rationaleCallbacks) {
        this.f69388b = rationaleDialogFragment.getActivity();
        this.f69389c = rationaleDialogConfig;
        this.f69390d = permissionCallbacks;
        this.f69391e = rationaleCallbacks;
    }
}

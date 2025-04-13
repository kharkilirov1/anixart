package pub.devrel.easypermissions.helper;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes3.dex */
class SupportFragmentPermissionHelper extends BaseSupportPermissionsHelper<Fragment> {
    public SupportFragmentPermissionHelper(@NonNull Fragment fragment) {
        super(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: a */
    public void mo35001a(int i2, @NonNull String... strArr) {
        ((Fragment) this.f69403a).requestPermissions(strArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: b */
    public Context mo35002b() {
        return ((Fragment) this.f69403a).getActivity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: e */
    public boolean mo35003e(@NonNull String str) {
        return ((Fragment) this.f69403a).shouldShowRequestPermissionRationale(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.BaseSupportPermissionsHelper
    /* renamed from: g */
    public FragmentManager mo35005g() {
        return ((Fragment) this.f69403a).getChildFragmentManager();
    }
}

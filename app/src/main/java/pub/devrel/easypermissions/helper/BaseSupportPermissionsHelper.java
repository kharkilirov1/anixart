package pub.devrel.easypermissions.helper;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.FragmentManager;
import pub.devrel.easypermissions.RationaleDialogFragmentCompat;

/* loaded from: classes3.dex */
public abstract class BaseSupportPermissionsHelper<T> extends PermissionHelper<T> {
    public BaseSupportPermissionsHelper(@NonNull T t) {
        super(t);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: f */
    public void mo35004f(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String... strArr) {
        FragmentManager mo35005g = mo35005g();
        if (mo35005g.m3000H("RationaleDialogFragmentCompat") instanceof RationaleDialogFragmentCompat) {
            Log.d("BSPermissionsHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        RationaleDialogFragmentCompat m35000n3 = RationaleDialogFragmentCompat.m35000n3(str, str2, str3, i2, i3, strArr);
        if (mo35005g.m3012U()) {
            return;
        }
        m35000n3.show(mo35005g, "RationaleDialogFragmentCompat");
    }

    /* renamed from: g */
    public abstract FragmentManager mo35005g();
}

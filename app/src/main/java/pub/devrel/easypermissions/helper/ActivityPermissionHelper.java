package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.app.ActivityCompat;
import pub.devrel.easypermissions.RationaleDialogFragment;

/* loaded from: classes3.dex */
class ActivityPermissionHelper extends PermissionHelper<Activity> {
    public ActivityPermissionHelper(Activity activity) {
        super(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: a */
    public void mo35001a(int i2, @NonNull String... strArr) {
        ActivityCompat.m1518n((Activity) this.f69403a, strArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: b */
    public Context mo35002b() {
        return (Context) this.f69403a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: e */
    public boolean mo35003e(@NonNull String str) {
        return ActivityCompat.m1521q((Activity) this.f69403a, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: f */
    public void mo35004f(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String... strArr) {
        FragmentManager fragmentManager = ((Activity) this.f69403a).getFragmentManager();
        if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof RationaleDialogFragment) {
            Log.d("ActPermissionHelper", "Found existing fragment, not showing rationale.");
            return;
        }
        RationaleDialogFragment m34999a = RationaleDialogFragment.m34999a(str2, str3, str, i2, i3, strArr);
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !m34999a.f69400d) {
            m34999a.show(fragmentManager, "RationaleDialogFragment");
        }
    }
}

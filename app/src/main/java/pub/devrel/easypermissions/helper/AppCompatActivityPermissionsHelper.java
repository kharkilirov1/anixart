package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes3.dex */
class AppCompatActivityPermissionsHelper extends BaseSupportPermissionsHelper<AppCompatActivity> {
    public AppCompatActivityPermissionsHelper(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
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
    @Override // pub.devrel.easypermissions.helper.BaseSupportPermissionsHelper
    /* renamed from: g */
    public FragmentManager mo35005g() {
        return ((AppCompatActivity) this.f69403a).getSupportFragmentManager();
    }
}

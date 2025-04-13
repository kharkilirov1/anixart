package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public abstract class PermissionHelper<T> {

    /* renamed from: a */
    public T f69403a;

    public PermissionHelper(@NonNull T t) {
        this.f69403a = t;
    }

    @NonNull
    /* renamed from: c */
    public static PermissionHelper<? extends Activity> m35006c(Activity activity) {
        return Build.VERSION.SDK_INT < 23 ? new LowApiPermissionsHelper(activity) : activity instanceof AppCompatActivity ? new AppCompatActivityPermissionsHelper((AppCompatActivity) activity) : new ActivityPermissionHelper(activity);
    }

    @NonNull
    /* renamed from: d */
    public static PermissionHelper<Fragment> m35007d(Fragment fragment) {
        return Build.VERSION.SDK_INT < 23 ? new LowApiPermissionsHelper(fragment) : new SupportFragmentPermissionHelper(fragment);
    }

    /* renamed from: a */
    public abstract void mo35001a(int i2, @NonNull String... strArr);

    /* renamed from: b */
    public abstract Context mo35002b();

    /* renamed from: e */
    public abstract boolean mo35003e(@NonNull String str);

    /* renamed from: f */
    public abstract void mo35004f(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String... strArr);
}

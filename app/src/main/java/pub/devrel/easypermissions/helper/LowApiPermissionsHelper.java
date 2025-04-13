package pub.devrel.easypermissions.helper;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import p000a.C0000a;

/* loaded from: classes3.dex */
class LowApiPermissionsHelper<T> extends PermissionHelper<T> {
    public LowApiPermissionsHelper(@NonNull T t) {
        super(t);
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: a */
    public void mo35001a(int i2, @NonNull String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: b */
    public Context mo35002b() {
        T t = this.f69403a;
        if (t instanceof Activity) {
            return (Context) t;
        }
        if (t instanceof Fragment) {
            return ((Fragment) t).getContext();
        }
        StringBuilder m24u = C0000a.m24u("Unknown host: ");
        m24u.append(this.f69403a);
        throw new IllegalStateException(m24u.toString());
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: e */
    public boolean mo35003e(@NonNull String str) {
        return false;
    }

    @Override // pub.devrel.easypermissions.helper.PermissionHelper
    /* renamed from: f */
    public void mo35004f(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i2, int i3, @NonNull String... strArr) {
        throw new IllegalStateException("Should never be requesting permissions on API < 23!");
    }
}

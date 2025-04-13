package pub.devrel.easypermissions;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.fragment.app.Fragment;
import androidx.room.util.C0576a;
import com.swiftsoft.anixartd.C2507R;
import java.util.Arrays;
import p000a.C0000a;
import pub.devrel.easypermissions.helper.PermissionHelper;

/* loaded from: classes3.dex */
public final class PermissionRequest {

    /* renamed from: a */
    public final PermissionHelper f69375a;

    /* renamed from: b */
    public final String[] f69376b;

    /* renamed from: c */
    public final int f69377c;

    /* renamed from: d */
    public final String f69378d;

    /* renamed from: e */
    public final String f69379e;

    /* renamed from: f */
    public final String f69380f;

    /* renamed from: g */
    public final int f69381g;

    public PermissionRequest(PermissionHelper permissionHelper, String[] strArr, int i2, String str, String str2, String str3, int i3, C69781 c69781) {
        this.f69375a = permissionHelper;
        this.f69376b = (String[]) strArr.clone();
        this.f69377c = i2;
        this.f69378d = str;
        this.f69379e = str2;
        this.f69380f = str3;
        this.f69381g = i3;
    }

    @NonNull
    /* renamed from: a */
    public String[] m34996a() {
        return (String[]) this.f69376b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PermissionRequest.class != obj.getClass()) {
            return false;
        }
        PermissionRequest permissionRequest = (PermissionRequest) obj;
        return Arrays.equals(this.f69376b, permissionRequest.f69376b) && this.f69377c == permissionRequest.f69377c;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f69376b) * 31) + this.f69377c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PermissionRequest{mHelper=");
        m24u.append(this.f69375a);
        m24u.append(", mPerms=");
        m24u.append(Arrays.toString(this.f69376b));
        m24u.append(", mRequestCode=");
        m24u.append(this.f69377c);
        m24u.append(", mRationale='");
        C0576a.m4100A(m24u, this.f69378d, '\'', ", mPositiveButtonText='");
        C0576a.m4100A(m24u, this.f69379e, '\'', ", mNegativeButtonText='");
        C0576a.m4100A(m24u, this.f69380f, '\'', ", mTheme=");
        return C0000a.m17n(m24u, this.f69381g, '}');
    }

    public static final class Builder {

        /* renamed from: a */
        public final PermissionHelper f69382a;

        /* renamed from: b */
        public final int f69383b;

        /* renamed from: c */
        public final String[] f69384c;

        /* renamed from: d */
        public String f69385d;

        /* renamed from: e */
        public String f69386e;

        /* renamed from: f */
        public String f69387f;

        public Builder(@NonNull Activity activity, int i2, @NonNull @Size String... strArr) {
            this.f69382a = PermissionHelper.m35006c(activity);
            this.f69383b = i2;
            this.f69384c = strArr;
        }

        @NonNull
        /* renamed from: a */
        public PermissionRequest m34997a() {
            if (this.f69385d == null) {
                this.f69385d = this.f69382a.mo35002b().getString(C2507R.string.rationale_ask);
            }
            if (this.f69386e == null) {
                this.f69386e = this.f69382a.mo35002b().getString(android.R.string.ok);
            }
            if (this.f69387f == null) {
                this.f69387f = this.f69382a.mo35002b().getString(android.R.string.cancel);
            }
            return new PermissionRequest(this.f69382a, this.f69384c, this.f69383b, this.f69385d, this.f69386e, this.f69387f, -1, null);
        }

        public Builder(@NonNull Fragment fragment, int i2, @NonNull @Size String... strArr) {
            this.f69382a = PermissionHelper.m35007d(fragment);
            this.f69383b = i2;
            this.f69384c = strArr;
        }
    }
}

package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface PermissionResult {
    }

    /* renamed from: a */
    public static int m1702a(@NonNull Context context, @NonNull String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String m1561c = AppOpsManagerCompat.m1561c(str);
            if (m1561c == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            return (Process.myUid() == myUid && ObjectsCompat.m2022a(context.getPackageName(), packageName) ? AppOpsManagerCompat.m1559a(context, myUid, m1561c, packageName) : AppOpsManagerCompat.m1560b(context, m1561c, packageName)) == 0 ? 0 : -2;
        }
        return -1;
    }
}

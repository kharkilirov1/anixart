package pub.devrel.easypermissions;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.util.List;
import java.util.Objects;
import pub.devrel.easypermissions.helper.PermissionHelper;

/* loaded from: classes3.dex */
public class EasyPermissions {

    public interface PermissionCallbacks extends ActivityCompat.OnRequestPermissionsResultCallback {
        /* renamed from: n3 */
        void m34992n3(int i2, @NonNull List<String> list);

        /* renamed from: v1 */
        void m34993v1(int i2, @NonNull List<String> list);
    }

    public interface RationaleCallbacks {
        /* renamed from: a */
        void m34994a(int i2);

        /* renamed from: b */
        void m34995b(int i2);
    }

    /* renamed from: a */
    public static boolean m34989a(@NonNull Context context, @NonNull @Size String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("EasyPermissions", "hasPermissions: API version < M, returning true by default");
            return true;
        }
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (ContextCompat.m1668a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m34990b(int r11, @androidx.annotation.NonNull java.lang.String[] r12, @androidx.annotation.NonNull int[] r13, @androidx.annotation.NonNull java.lang.Object... r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r12.length
            if (r3 >= r4) goto L1f
            r4 = r12[r3]
            r5 = r13[r3]
            if (r5 != 0) goto L19
            r0.add(r4)
            goto L1c
        L19:
            r1.add(r4)
        L1c:
            int r3 = r3 + 1
            goto Lc
        L1f:
            int r12 = r14.length
            r13 = 0
        L21:
            if (r13 >= r12) goto Le3
            r3 = r14[r13]
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L35
            boolean r4 = r3 instanceof pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks
            if (r4 == 0) goto L35
            r4 = r3
            pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks r4 = (pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks) r4
            r4.m34992n3(r11, r0)
        L35:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L45
            boolean r4 = r3 instanceof pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks
            if (r4 == 0) goto L45
            r4 = r3
            pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks r4 = (pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks) r4
            r4.m34993v1(r11, r1)
        L45:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Ldf
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto Ldf
            java.lang.String r4 = "EasyPermissions"
            java.lang.Class r5 = r3.getClass()
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = "_"
            boolean r6 = r6.endsWith(r7)
            if (r6 != 0) goto L68
            goto L73
        L68:
            java.lang.String r6 = "org.androidannotations.api.view.HasViews"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L73
            boolean r6 = r6.isInstance(r3)     // Catch: java.lang.ClassNotFoundException -> L73
            goto L74
        L73:
            r6 = 0
        L74:
            if (r6 == 0) goto L7a
            java.lang.Class r5 = r5.getSuperclass()
        L7a:
            if (r5 == 0) goto Ldf
            java.lang.reflect.Method[] r6 = r5.getDeclaredMethods()
            int r7 = r6.length
            r8 = 0
        L82:
            if (r8 >= r7) goto Lda
            r9 = r6[r8]
            java.lang.Class<pub.devrel.easypermissions.AfterPermissionGranted> r10 = pub.devrel.easypermissions.AfterPermissionGranted.class
            java.lang.annotation.Annotation r10 = r9.getAnnotation(r10)
            pub.devrel.easypermissions.AfterPermissionGranted r10 = (pub.devrel.easypermissions.AfterPermissionGranted) r10
            if (r10 == 0) goto Ld7
            int r10 = r10.value()
            if (r10 != r11) goto Ld7
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 > 0) goto Lbb
            boolean r10 = r9.isAccessible()     // Catch: java.lang.reflect.InvocationTargetException -> Lad java.lang.IllegalAccessException -> Lb4
            if (r10 != 0) goto La7
            r10 = 1
            r9.setAccessible(r10)     // Catch: java.lang.reflect.InvocationTargetException -> Lad java.lang.IllegalAccessException -> Lb4
        La7:
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> Lad java.lang.IllegalAccessException -> Lb4
            r9.invoke(r3, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Lad java.lang.IllegalAccessException -> Lb4
            goto Ld7
        Lad:
            r9 = move-exception
            java.lang.String r10 = "runDefaultMethod:InvocationTargetException"
            android.util.Log.e(r4, r10, r9)
            goto Ld7
        Lb4:
            r9 = move-exception
            java.lang.String r10 = "runDefaultMethod:IllegalAccessException"
            android.util.Log.e(r4, r10, r9)
            goto Ld7
        Lbb:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Cannot execute method "
            java.lang.StringBuilder r12 = p000a.C0000a.m24u(r12)
            java.lang.String r13 = r9.getName()
            r12.append(r13)
            java.lang.String r13 = " because it is non-void method and/or has input parameters."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Ld7:
            int r8 = r8 + 1
            goto L82
        Lda:
            java.lang.Class r5 = r5.getSuperclass()
            goto L7a
        Ldf:
            int r13 = r13 + 1
            goto L21
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pub.devrel.easypermissions.EasyPermissions.m34990b(int, java.lang.String[], int[], java.lang.Object[]):void");
    }

    /* renamed from: c */
    public static void m34991c(PermissionRequest permissionRequest) {
        boolean z = true;
        if (m34989a(permissionRequest.f69375a.mo35002b(), permissionRequest.m34996a())) {
            Object obj = permissionRequest.f69375a.f69403a;
            int i2 = permissionRequest.f69377c;
            String[] m34996a = permissionRequest.m34996a();
            int[] iArr = new int[m34996a.length];
            for (int i3 = 0; i3 < m34996a.length; i3++) {
                iArr[i3] = 0;
            }
            m34990b(i2, m34996a, iArr, obj);
            return;
        }
        PermissionHelper permissionHelper = permissionRequest.f69375a;
        String str = permissionRequest.f69378d;
        String str2 = permissionRequest.f69379e;
        String str3 = permissionRequest.f69380f;
        int i4 = permissionRequest.f69381g;
        int i5 = permissionRequest.f69377c;
        String[] m34996a2 = permissionRequest.m34996a();
        Objects.requireNonNull(permissionHelper);
        int length = m34996a2.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                z = false;
                break;
            } else if (permissionHelper.mo35003e(m34996a2[i6])) {
                break;
            } else {
                i6++;
            }
        }
        if (z) {
            permissionHelper.mo35004f(str, str2, str3, i4, i5, m34996a2);
        } else {
            permissionHelper.mo35001a(i5, m34996a2);
        }
    }
}

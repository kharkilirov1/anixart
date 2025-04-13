package androidx.core.content.p002pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class PermissionInfoCompat {

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1709a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m1710b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Protection {
    }

    @SuppressLint
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ProtectionFlags {
    }
}

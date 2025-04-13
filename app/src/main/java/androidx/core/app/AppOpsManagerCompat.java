package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AppOpsManagerCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1562a(AppOpsManager appOpsManager, String str, int i2, String str2) {
            return appOpsManager.noteOp(str, i2, str2);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m1563b(AppOpsManager appOpsManager, String str, int i2, String str2) {
            return appOpsManager.noteOpNoThrow(str, i2, str2);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static <T> T m1564a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m1565b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @DoNotInline
        /* renamed from: c */
        public static int m1566c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @DoNotInline
        /* renamed from: d */
        public static String m1567d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1568a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i2, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static String m1569b(@NonNull Context context) {
            return context.getOpPackageName();
        }

        @Nullable
        @DoNotInline
        /* renamed from: c */
        public static AppOpsManager m1570c(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m1559a(@NonNull Context context, int i2, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m1560b(context, str, str2);
        }
        AppOpsManager m1570c = Api29Impl.m1570c(context);
        int m1568a = Api29Impl.m1568a(m1570c, str, Binder.getCallingUid(), str2);
        return m1568a != 0 ? m1568a : Api29Impl.m1568a(m1570c, str, i2, Api29Impl.m1569b(context));
    }

    /* renamed from: b */
    public static int m1560b(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1566c((AppOpsManager) Api23Impl.m1564a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    @Nullable
    /* renamed from: c */
    public static String m1561c(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.m1567d(str);
        }
        return null;
    }
}

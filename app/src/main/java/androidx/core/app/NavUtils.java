package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class NavUtils {

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static Intent m1593a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m1594b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1595c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @Nullable
    /* renamed from: a */
    public static Intent m1588a(@NonNull Activity activity) {
        Intent m1593a = Api16Impl.m1593a(activity);
        if (m1593a != null) {
            return m1593a;
        }
        try {
            String m1590c = m1590c(activity, activity.getComponentName());
            if (m1590c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m1590c);
            try {
                return m1590c(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m1590c + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Nullable
    /* renamed from: b */
    public static Intent m1589b(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String m1590c = m1590c(context, componentName);
        if (m1590c == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m1590c);
        return m1590c(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @Nullable
    /* renamed from: c */
    public static String m1590c(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 640;
        if (i2 >= 29) {
            i3 = 269222528;
        } else if (i2 >= 24) {
            i3 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i3);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: d */
    public static void m1591d(@NonNull Activity activity, @NonNull Intent intent) {
        Api16Impl.m1594b(activity, intent);
    }

    /* renamed from: e */
    public static boolean m1592e(@NonNull Activity activity, @NonNull Intent intent) {
        return Api16Impl.m1595c(activity, intent);
    }
}

package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.os.ExecutorCompat;
import java.io.File;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

@SuppressLint
/* loaded from: classes.dex */
public class ContextCompat {

    /* renamed from: a */
    public static final Object f3288a = new Object();

    /* renamed from: b */
    public static final Object f3289b = new Object();

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1678a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1679b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static File[] m1680a(Context context) {
            return context.getExternalCacheDirs();
        }

        @DoNotInline
        /* renamed from: b */
        public static File[] m1681b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @DoNotInline
        /* renamed from: c */
        public static File[] m1682c(Context context) {
            return context.getObbDirs();
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static File m1683a(Context context) {
            return context.getCodeCacheDir();
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m1684b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        @DoNotInline
        /* renamed from: c */
        public static File m1685c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1686a(Context context, int i2) {
            return context.getColor(i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static <T> T m1687b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m1688c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static Context m1689a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @DoNotInline
        /* renamed from: b */
        public static File m1690b(Context context) {
            return context.getDataDir();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1691c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static ComponentName m1692a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static Executor m1693a(Context context) {
            return context.getMainExecutor();
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m1694a(Context context) {
            return context.getAttributionTag();
        }
    }

    public static final class LegacyServiceMapHolder {

        /* renamed from: a */
        public static final HashMap<Class<?>, String> f3290a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f3290a = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* renamed from: a */
    public static int m1668a(@NonNull Context context, @NonNull String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @Nullable
    /* renamed from: b */
    public static Context m1669b(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.m1689a(context);
        }
        return null;
    }

    @ColorInt
    /* renamed from: c */
    public static int m1670c(@NonNull Context context, @ColorRes int i2) {
        return Build.VERSION.SDK_INT >= 23 ? Api23Impl.m1686a(context, i2) : context.getResources().getColor(i2);
    }

    @Nullable
    /* renamed from: d */
    public static Drawable m1671d(@NonNull Context context, @DrawableRes int i2) {
        return Api21Impl.m1684b(context, i2);
    }

    @NonNull
    /* renamed from: e */
    public static Executor m1672e(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.m1693a(context) : ExecutorCompat.m1954a(new Handler(context.getMainLooper()));
    }

    @Nullable
    /* renamed from: f */
    public static File m1673f(@NonNull Context context) {
        return Api21Impl.m1685c(context);
    }

    @Nullable
    /* renamed from: g */
    public static <T> T m1674g(@NonNull Context context, @NonNull Class<T> cls) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return (T) Api23Impl.m1687b(context, cls);
        }
        String m1688c = i2 >= 23 ? Api23Impl.m1688c(context, cls) : LegacyServiceMapHolder.f3290a.get(cls);
        if (m1688c != null) {
            return (T) context.getSystemService(m1688c);
        }
        return null;
    }

    /* renamed from: h */
    public static boolean m1675h(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        Api16Impl.m1678a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: i */
    public static void m1676i(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        Api16Impl.m1679b(context, intent, bundle);
    }

    /* renamed from: j */
    public static void m1677j(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m1692a(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

package androidx.core.net;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ConnectivityManagerCompat {

    @RequiresApi
    public static class Api16Impl {
        @RequiresPermission
        @DoNotInline
        /* renamed from: a */
        public static boolean m1935a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m1936a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface RestrictBackgroundStatus {
    }
}

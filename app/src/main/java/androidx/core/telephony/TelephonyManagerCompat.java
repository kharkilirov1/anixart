package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.telephony.TelephonyManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* loaded from: classes.dex */
public class TelephonyManagerCompat {

    @RequiresApi
    public static class Api23Impl {
        @SuppressLint
        @Nullable
        @RequiresPermission
        @DoNotInline
        /* renamed from: a */
        public static String m1999a(TelephonyManager telephonyManager, int i2) {
            return telephonyManager.getDeviceId(i2);
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @SuppressLint
        @Nullable
        @RequiresPermission
        @DoNotInline
        /* renamed from: a */
        public static String m2000a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        /* renamed from: a */
        public static int m2001a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }
}

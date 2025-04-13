package androidx.core.location;

import android.location.Location;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class LocationCompat {

    @RequiresApi
    public static class Api17Impl {
        @DoNotInline
        /* renamed from: a */
        public static long m1908a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1909a(Location location) {
            return location.isFromMockProvider();
        }
    }

    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* renamed from: a */
        public static float m1910a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @DoNotInline
        /* renamed from: b */
        public static float m1911b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @DoNotInline
        /* renamed from: c */
        public static float m1912c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m1913d(Location location) {
            return location.hasBearingAccuracy();
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m1914e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m1915f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @DoNotInline
        /* renamed from: g */
        public static void m1916g(Location location, float f2) {
            location.setBearingAccuracyDegrees(f2);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m1917h(Location location, float f2) {
            location.setSpeedAccuracyMetersPerSecond(f2);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m1918i(Location location, float f2) {
            location.setVerticalAccuracyMeters(f2);
        }
    }
}

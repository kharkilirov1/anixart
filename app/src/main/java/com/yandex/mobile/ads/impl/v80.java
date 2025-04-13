package com.yandex.mobile.ads.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class v80 {

    /* renamed from: a */
    private static final long f55777a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    private static boolean m29193a(@NonNull Location location, @NonNull Location location2) {
        long time = location.getTime() - location2.getTime();
        long j2 = f55777a;
        boolean z = time > j2;
        boolean z2 = time < (-j2);
        boolean z3 = time > 0;
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = ((long) accuracy) > 200;
        String provider = location.getProvider();
        String provider2 = location2.getProvider();
        boolean equals = provider == null ? provider2 == null : provider.equals(provider2);
        if (z) {
            return true;
        }
        if (!z2) {
            if (z5) {
                return true;
            }
            if (z3 && !z4) {
                return true;
            }
            if (z3 && !z6 && equals) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m29194b(@NonNull Location location, @Nullable Location location2) {
        return location2 == null || m29193a(location, location2);
    }
}

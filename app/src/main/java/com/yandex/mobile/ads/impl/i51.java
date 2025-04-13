package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes3.dex */
final class i51 {

    /* renamed from: c */
    private static final HashSet f51221c = new HashSet(Collections.singletonList("gps"));

    /* renamed from: d */
    private static final HashSet f51222d = new HashSet(Arrays.asList("gps", "passive"));

    /* renamed from: a */
    @Nullable
    private final LocationManager f51223a;

    /* renamed from: b */
    @NonNull
    private final qp0 f51224b;

    public i51(@NonNull Context context, @Nullable LocationManager locationManager) {
        this.f51223a = locationManager;
        this.f51224b = new qp0(context);
    }

    /* renamed from: b */
    private boolean m25450b(@NonNull String str) {
        boolean m27771a = this.f51224b.m27771a();
        boolean m27772b = this.f51224b.m27772b();
        boolean z = !f51221c.contains(str);
        if (f51222d.contains(str)) {
            if (z && m27771a && m27772b) {
                return true;
            }
        } else if (z && m27771a) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final Location m25451a(@NonNull String str) {
        Location location = null;
        if (!m25450b(str)) {
            return null;
        }
        try {
            LocationManager locationManager = this.f51223a;
            if (locationManager == null) {
                return null;
            }
            location = locationManager.getLastKnownLocation(str);
            n60.m26809b("Location for provider %s is %s: ", str, location);
            return location;
        } catch (Throwable unused) {
            n60.m26810c("Exception while getting last known location", new Object[0]);
            return location;
        }
    }
}

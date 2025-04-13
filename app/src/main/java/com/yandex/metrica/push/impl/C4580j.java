package com.yandex.metrica.push.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.Iterator;

/* renamed from: com.yandex.metrica.push.impl.j */
/* loaded from: classes2.dex */
public class C4580j implements InterfaceC4578i {

    /* renamed from: a */
    @NonNull
    private final Context f47390a;

    public C4580j(@NonNull Context context) {
        this.f47390a = context;
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4578i
    @Nullable
    /* renamed from: a */
    public Location mo21545a(@NonNull LocationManager locationManager, @NonNull String str, long j2, long j3, int i2) {
        Location location;
        InternalLogger.m21370i("Trying get last known location", new Object[0]);
        Iterator<String> it = locationManager.getProviders(true).iterator();
        do {
            location = null;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            try {
                if (AbstractC4536M0.m21458a(this.f47390a, next)) {
                    location = locationManager.getLastKnownLocation(next);
                }
            } catch (Throwable th) {
                InternalLogger.m21369e(th, "Failed to get last known location", new Object[0]);
            }
        } while (!AbstractC4584l.m21554a(location, Long.valueOf(j3), i2));
        return location;
    }
}

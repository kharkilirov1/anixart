package com.yandex.metrica.push.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.n */
/* loaded from: classes2.dex */
public class C4588n {

    /* renamed from: a */
    @NonNull
    private final Context f47399a;

    /* renamed from: b */
    @NonNull
    private final C4574g f47400b;

    /* renamed from: c */
    @NonNull
    private final List<? extends InterfaceC4578i> f47401c;

    public C4588n(@NonNull Context context) {
        this.f47399a = context;
        this.f47400b = new C4574g(context);
        this.f47401c = Arrays.asList(new C4580j(context), new C4576h(context), new C4580j(context));
    }

    @Nullable
    /* renamed from: a */
    public Location m21557a(@NonNull String str, long j2, long j3, int i2) throws C4582k {
        LocationManager locationManager;
        this.f47400b.m21541a(str, j2, j3, i2);
        try {
            locationManager = (LocationManager) this.f47399a.getSystemService("location");
        } catch (Throwable th) {
            InternalLogger.m21368e("Failed to get location manager", th);
            locationManager = null;
        }
        if (locationManager == null) {
            throw new C4582k("LocationManager is null");
        }
        if (!AbstractC4536M0.m21458a(this.f47399a, null)) {
            throw new C4582k("Location permissions is not granted");
        }
        Iterator<? extends InterfaceC4578i> it = this.f47401c.iterator();
        while (it.hasNext()) {
            Location mo21545a = it.next().mo21545a(locationManager, str, j2, j3, i2);
            if (mo21545a != null) {
                return mo21545a;
            }
        }
        return null;
    }
}

package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.Bd */
/* loaded from: classes2.dex */
class C3195Bd extends AbstractC4105ld<C3269Ec> {

    /* renamed from: f */
    @Nullable
    private final LocationManager f42621f;

    /* renamed from: g */
    @NonNull
    private final String f42622g;

    @VisibleForTesting
    public C3195Bd(@NonNull Context context, @NonNull Looper looper, @Nullable LocationManager locationManager, @NonNull InterfaceC3976ge interfaceC3976ge, @NonNull String str, @NonNull LocationListener locationListener) {
        super(context, locationListener, interfaceC3976ge, looper);
        this.f42621f = locationManager;
        this.f42622g = str;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4105ld
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo17899a(@NonNull C3269Ec c3269Ec) {
        return m17901c();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4105ld
    @SuppressLint
    /* renamed from: b */
    public void mo17900b() {
        Location lastKnownLocation;
        if (this.f45880b.mo19401a(this.f45879a)) {
            LocationManager locationManager = this.f42621f;
            if (locationManager != null) {
                try {
                    lastKnownLocation = locationManager.getLastKnownLocation(this.f42622g);
                } catch (Throwable unused) {
                }
                this.f45881c.onLocationChanged(lastKnownLocation);
            }
            lastKnownLocation = null;
            this.f45881c.onLocationChanged(lastKnownLocation);
        }
    }

    /* renamed from: c */
    public boolean m17901c() {
        if (!this.f45880b.mo19401a(this.f45879a)) {
            return false;
        }
        String str = this.f42622g;
        long j2 = AbstractC4105ld.f45878e;
        LocationListener locationListener = this.f45881c;
        Looper looper = this.f45882d;
        LocationManager locationManager = this.f42621f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j2, 0.0f, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4105ld
    /* renamed from: a */
    public void mo17898a() {
        LocationManager locationManager = this.f42621f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f45881c);
            } catch (Throwable unused) {
            }
        }
    }
}

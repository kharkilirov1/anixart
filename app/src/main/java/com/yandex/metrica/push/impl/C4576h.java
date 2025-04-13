package com.yandex.metrica.push.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.impl.C4557X0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.push.impl.h */
/* loaded from: classes2.dex */
public class C4576h implements InterfaceC4578i {

    /* renamed from: a */
    @NonNull
    private final Context f47376a;

    /* renamed from: b */
    @Nullable
    private b f47377b = null;

    /* renamed from: com.yandex.metrica.push.impl.h$a */
    public class a extends C4557X0.a {

        /* renamed from: b */
        public final /* synthetic */ LocationManager f47378b;

        /* renamed from: c */
        public final /* synthetic */ long f47379c;

        /* renamed from: d */
        public final /* synthetic */ int f47380d;

        /* renamed from: e */
        public final /* synthetic */ String f47381e;

        public a(LocationManager locationManager, long j2, int i2, String str) {
            this.f47378b = locationManager;
            this.f47379c = j2;
            this.f47380d = i2;
            this.f47381e = str;
        }

        @Override // com.yandex.metrica.push.impl.C4557X0.a
        @SuppressLint
        /* renamed from: a */
        public void mo21485a(@NonNull CountDownLatch countDownLatch) {
            C4576h.m21544a(C4576h.this, this.f47378b);
            C4576h.this.f47377b = new b(countDownLatch, this.f47379c, this.f47380d);
            try {
                this.f47378b.requestLocationUpdates(this.f47381e, 0L, 0.0f, C4576h.this.f47377b, m21484a());
            } catch (Throwable th) {
                InternalLogger.m21369e(th, th.getMessage(), new Object[0]);
            }
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.h$b */
    public static class b implements LocationListener {

        /* renamed from: a */
        @NonNull
        private final CountDownLatch f47383a;

        /* renamed from: b */
        private final long f47384b;

        /* renamed from: c */
        private final int f47385c;

        /* renamed from: d */
        @Nullable
        private volatile Location f47386d = null;

        public b(@NonNull CountDownLatch countDownLatch, long j2, int i2) {
            this.f47383a = countDownLatch;
            this.f47384b = j2;
            this.f47385c = i2;
        }

        @Nullable
        /* renamed from: a */
        public Location m21546a() {
            return this.f47386d;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (AbstractC4584l.m21554a(location, Long.valueOf(this.f47384b), this.f47385c)) {
                this.f47386d = location;
                this.f47383a.countDown();
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    public C4576h(@NonNull Context context) {
        this.f47376a = context;
    }

    @Override // com.yandex.metrica.push.impl.InterfaceC4578i
    @Nullable
    /* renamed from: a */
    public Location mo21545a(@NonNull LocationManager locationManager, @NonNull String str, long j2, long j3, int i2) throws C4582k {
        InternalLogger.m21370i("Trying request new location from %s provider", str);
        if (AbstractC4536M0.m21458a(this.f47376a, str)) {
            new C4557X0(new a(locationManager, j3, i2, str), C4553V0.m21478b().m21479a()).m21482a(j2, TimeUnit.SECONDS);
            b bVar = this.f47377b;
            Location m21546a = bVar != null ? bVar.m21546a() : null;
            b bVar2 = this.f47377b;
            if (bVar2 != null) {
                locationManager.removeUpdates(bVar2);
            }
            this.f47377b = null;
            return m21546a;
        }
        throw new C4582k(C0000a.m14k("Location permissions is not granted for ", str));
    }

    /* renamed from: a */
    public static void m21544a(C4576h c4576h, LocationManager locationManager) {
        b bVar = c4576h.f47377b;
        if (bVar != null) {
            locationManager.removeUpdates(bVar);
        }
        c4576h.f47377b = null;
    }
}

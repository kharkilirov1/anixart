package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.hd */
/* loaded from: classes2.dex */
public class C4001hd implements LocationListener {

    /* renamed from: a */
    @NonNull
    private final C4417xd f45268a;

    public C4001hd(@NonNull C4417xd c4417xd) {
        this.f45268a = c4417xd;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(@Nullable Location location) {
        if (location != null) {
            this.f45268a.m21143a(location);
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

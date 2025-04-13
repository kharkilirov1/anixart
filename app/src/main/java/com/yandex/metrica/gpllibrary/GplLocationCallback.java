package com.yandex.metrica.gpllibrary;

import android.location.LocationListener;
import androidx.annotation.NonNull;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
class GplLocationCallback extends LocationCallback {

    @NonNull
    private final LocationListener mLocationListener;

    public GplLocationCallback(@NonNull LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    public void onLocationResult(LocationResult locationResult) {
        this.mLocationListener.onLocationChanged(locationResult.getLastLocation());
    }
}

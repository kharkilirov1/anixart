package com.yandex.metrica.gpllibrary;

import android.location.Location;
import android.location.LocationListener;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes2.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    @NonNull
    private final LocationListener mLocationListener;

    public GplOnSuccessListener(@NonNull LocationListener locationListener) {
        this.mLocationListener = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.mLocationListener.onLocationChanged(location);
    }
}

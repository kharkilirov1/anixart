package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
class TwilightManager {

    /* renamed from: d */
    public static TwilightManager f561d;

    /* renamed from: a */
    public final Context f562a;

    /* renamed from: b */
    public final LocationManager f563b;

    /* renamed from: c */
    public final TwilightState f564c = new TwilightState();

    public static class TwilightState {

        /* renamed from: a */
        public boolean f565a;

        /* renamed from: b */
        public long f566b;
    }

    @VisibleForTesting
    public TwilightManager(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f562a = context;
        this.f563b = locationManager;
    }

    @RequiresPermission
    /* renamed from: a */
    public final Location m469a(String str) {
        try {
            if (this.f563b.isProviderEnabled(str)) {
                return this.f563b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}

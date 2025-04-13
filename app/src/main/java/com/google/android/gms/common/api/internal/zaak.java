package com.google.android.gms.common.api.internal;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zaak implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ zaaw f15462b;

    public zaak(zaaw zaawVar) {
        this.f15462b = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zaaw zaawVar = this.f15462b;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = zaawVar.f15481d;
        Context context = zaawVar.f15480c;
        Objects.requireNonNull(googleApiAvailabilityLight);
        if (GooglePlayServicesUtilLight.f15332a.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(10436);
            }
        } catch (SecurityException unused) {
        }
    }
}

package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ServiceStarter {

    /* renamed from: c */
    public static ServiceStarter f23104c;

    /* renamed from: a */
    public Boolean f23105a = null;

    /* renamed from: b */
    public Boolean f23106b = null;

    @KeepForSdk
    /* renamed from: a */
    public static synchronized ServiceStarter m12540a() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (f23104c == null) {
                f23104c = new ServiceStarter();
            }
            serviceStarter = f23104c;
        }
        return serviceStarter;
    }

    /* renamed from: b */
    public boolean m12541b(Context context) {
        if (this.f23106b == null) {
            this.f23106b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f23105a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23106b.booleanValue();
    }

    /* renamed from: c */
    public boolean m12542c(Context context) {
        if (this.f23105a == null) {
            this.f23105a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f23105a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23105a.booleanValue();
    }
}

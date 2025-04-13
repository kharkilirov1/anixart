package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

@KeepForSdk
/* loaded from: classes2.dex */
public class ServiceStarter {

    /* renamed from: e */
    public static ServiceStarter f23306e;

    /* renamed from: a */
    @Nullable
    @GuardedBy
    public String f23307a = null;

    /* renamed from: b */
    public Boolean f23308b = null;

    /* renamed from: c */
    public Boolean f23309c = null;

    /* renamed from: d */
    public final Queue<Intent> f23310d = new ArrayDeque();

    /* renamed from: a */
    public static synchronized ServiceStarter m12680a() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (f23306e == null) {
                f23306e = new ServiceStarter();
            }
            serviceStarter = f23306e;
        }
        return serviceStarter;
    }

    /* renamed from: b */
    public boolean m12681b(Context context) {
        if (this.f23309c == null) {
            this.f23309c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f23308b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23309c.booleanValue();
    }

    /* renamed from: c */
    public boolean m12682c(Context context) {
        if (this.f23308b == null) {
            this.f23308b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f23308b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23308b.booleanValue();
    }
}

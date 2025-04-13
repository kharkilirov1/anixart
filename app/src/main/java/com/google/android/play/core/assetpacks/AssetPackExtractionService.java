package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: b */
    public zzb f19647b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f19647b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        zza zzaVar;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (zzd.class) {
            if (zzd.f19893a == null) {
                zzcb zzcbVar = new zzcb(null);
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                zzp zzpVar = new zzp(applicationContext);
                zzcbVar.f19787a = zzpVar;
                zzd.f19893a = new zzcd(zzpVar, null);
            }
            zzaVar = zzd.f19893a;
        }
        zzaVar.mo10690a(this);
    }
}

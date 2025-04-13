package com.google.android.play.core.appupdate;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class AppUpdateManagerFactory {
    @NonNull
    /* renamed from: a */
    public static AppUpdateManager m10651a(@NonNull Context context) {
        zzaa zzaaVar;
        synchronized (zza.class) {
            if (zza.f19601a == null) {
                zzy zzyVar = new zzy(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                zzh zzhVar = new zzh(context);
                zzyVar.f19645a = zzhVar;
                zza.f19601a = new zzaa(zzhVar, null);
            }
            zzaaVar = zza.f19601a;
        }
        return zzaaVar.f19607f.mo10658u();
    }
}

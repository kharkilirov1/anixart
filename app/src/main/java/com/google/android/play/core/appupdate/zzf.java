package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.tasks.Task;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzf implements AppUpdateManager {

    /* renamed from: a */
    public final zzq f19610a;

    /* renamed from: b */
    public final zzb f19611b;

    /* renamed from: c */
    public final Context f19612c;

    public zzf(zzq zzqVar, zzb zzbVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f19610a = zzqVar;
        this.f19611b = zzbVar;
        this.f19612c = context;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: a */
    public final Task<Void> mo10646a() {
        zzq zzqVar = this.f19610a;
        String packageName = this.f19612c.getPackageName();
        if (zzqVar.f19633a == null) {
            return zzq.m10666b();
        }
        zzq.f19631e.m10837d("completeUpdate(%s)", packageName);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        zzqVar.f19633a.m10842b(new zzm(zzqVar, zziVar, zziVar, packageName), zziVar);
        return zziVar.f20324a;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: b */
    public final Task<AppUpdateInfo> mo10647b() {
        zzq zzqVar = this.f19610a;
        String packageName = this.f19612c.getPackageName();
        if (zzqVar.f19633a == null) {
            return zzq.m10666b();
        }
        zzq.f19631e.m10837d("requestUpdateInfo(%s)", packageName);
        com.google.android.play.core.tasks.zzi<?> zziVar = new com.google.android.play.core.tasks.zzi<>();
        zzqVar.f19633a.m10842b(new zzl(zzqVar, zziVar, packageName, zziVar), zziVar);
        return zziVar.f20324a;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: c */
    public final synchronized void mo10648c(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f19611b.m10927c(installStateUpdatedListener);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: d */
    public final boolean mo10649d(AppUpdateInfo appUpdateInfo, @AppUpdateType int i2, Activity activity, int i3) throws IntentSender.SendIntentException {
        AppUpdateOptions m10652c = AppUpdateOptions.m10652c(i2);
        if (activity == null) {
            return false;
        }
        zze zzeVar = new zze(activity);
        if (m10652c == null) {
            return false;
        }
        if (!(appUpdateInfo.m10644a(m10652c) != null) || appUpdateInfo.f19598i) {
            return false;
        }
        appUpdateInfo.f19598i = true;
        zzeVar.m10659a(appUpdateInfo.m10644a(m10652c).getIntentSender(), i3, null, 0, 0, 0, null);
        return true;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: e */
    public final synchronized void mo10650e(InstallStateUpdatedListener installStateUpdatedListener) {
        this.f19611b.m10928d(installStateUpdatedListener);
    }
}

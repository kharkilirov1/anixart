package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.zzag;
import java.io.File;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzp extends zzn<AppUpdateInfo> {

    /* renamed from: d */
    public final String f19629d;

    /* renamed from: e */
    public final /* synthetic */ zzq f19630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzq zzqVar, com.google.android.play.core.tasks.zzi<AppUpdateInfo> zziVar, String str) {
        super(zzqVar, new zzag("OnRequestInstallCallback"), zziVar);
        this.f19630e = zzqVar;
        this.f19629d = str;
    }

    @Override // com.google.android.play.core.appupdate.zzn, com.google.android.play.core.internal.zzr
    /* renamed from: c */
    public final void mo10663c(Bundle bundle) throws RemoteException {
        this.f19628c.f19633a.m10843c(this.f19627b);
        this.f19626a.m10837d("onRequestInfo", new Object[0]);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f19627b.m11014c(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        com.google.android.play.core.tasks.zzi<T> zziVar = this.f19627b;
        zzq zzqVar = this.f19630e;
        String str = this.f19629d;
        int i2 = bundle.getInt("version.code", -1);
        int i3 = bundle.getInt("update.availability");
        int i4 = bundle.getInt("install.status", 0);
        Integer valueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i5 = bundle.getInt("in.app.update.priority", 0);
        long j2 = bundle.getLong("bytes.downloaded");
        long j3 = bundle.getLong("total.bytes.to.download");
        long j4 = bundle.getLong("additional.size.required");
        zzs zzsVar = zzqVar.f19636d;
        Objects.requireNonNull(zzsVar);
        zziVar.m11015d(AppUpdateInfo.m10643b(str, i2, i3, i4, valueOf, i5, j2, j3, j4, zzs.m10667a(new File(zzsVar.f19639a.getFilesDir(), "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}

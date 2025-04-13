package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.internal.zzan;
import com.google.android.play.core.internal.zzas;
import com.google.android.play.core.internal.zzch;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzq {

    /* renamed from: e */
    public static final zzag f19631e = new zzag("AppUpdateService");

    /* renamed from: f */
    public static final Intent f19632f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    @Nullable
    @VisibleForTesting
    public zzas<com.google.android.play.core.internal.zzp> f19633a;

    /* renamed from: b */
    public final String f19634b;

    /* renamed from: c */
    public final Context f19635c;

    /* renamed from: d */
    public final zzs f19636d;

    public zzq(Context context, zzs zzsVar) {
        this.f19634b = context.getPackageName();
        this.f19635c = context;
        this.f19636d = zzsVar;
        if (zzch.m10889b(context)) {
            Context applicationContext = context.getApplicationContext();
            this.f19633a = new zzas<>(applicationContext != null ? applicationContext : context, f19631e, "AppUpdateService", f19632f, new zzan() { // from class: com.google.android.play.core.appupdate.zzk
                @Override // com.google.android.play.core.internal.zzan
                /* renamed from: a */
                public final Object mo10661a(IBinder iBinder) {
                    int i2 = com.google.android.play.core.internal.zzo.f20159a;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
                    return queryLocalInterface instanceof com.google.android.play.core.internal.zzp ? (com.google.android.play.core.internal.zzp) queryLocalInterface : new com.google.android.play.core.internal.zzn(iBinder);
                }
            }, null);
        }
    }

    /* renamed from: a */
    public static Bundle m10665a(zzq zzqVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(PlayCoreVersion.m10821a("app_update"));
        bundle2.putInt("playcore.version.code", 11002);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(zzqVar.f19635c.getPackageManager().getPackageInfo(zzqVar.f19635c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f19631e.m10835b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static <T> Task<T> m10666b() {
        f19631e.m10835b("onError(%d)", -9);
        return Tasks.m11006b(new InstallException(-9));
    }
}

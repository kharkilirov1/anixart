package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.common.PlayCoreVersion;
import com.google.android.play.core.internal.zzah;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzm extends zzah {

    /* renamed from: c */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19623c;

    /* renamed from: d */
    public final /* synthetic */ String f19624d;

    /* renamed from: e */
    public final /* synthetic */ zzq f19625e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzq zzqVar, com.google.android.play.core.tasks.zzi zziVar, com.google.android.play.core.tasks.zzi zziVar2, String str) {
        super(zziVar);
        this.f19625e = zzqVar;
        this.f19623c = zziVar2;
        this.f19624d = str;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzq zzqVar = this.f19625e;
            com.google.android.play.core.internal.zzp zzpVar = zzqVar.f19633a.f20120n;
            String str = zzqVar.f19634b;
            Bundle bundle = new Bundle();
            bundle.putAll(PlayCoreVersion.m10821a("app_update"));
            bundle.putInt("playcore.version.code", 11002);
            zzpVar.mo10916o2(str, bundle, new zzo(this.f19625e, this.f19623c));
        } catch (RemoteException e2) {
            zzq.f19631e.m10836c(e2, "completeUpdate(%s)", this.f19624d);
            this.f19623c.m11014c(new RuntimeException(e2));
        }
    }
}

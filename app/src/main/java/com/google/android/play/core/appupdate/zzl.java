package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.play.core.internal.zzah;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzl extends zzah {

    /* renamed from: c */
    public final /* synthetic */ String f19620c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19621d;

    /* renamed from: e */
    public final /* synthetic */ zzq f19622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzq zzqVar, com.google.android.play.core.tasks.zzi zziVar, String str, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19622e = zzqVar;
        this.f19620c = str;
        this.f19621d = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzq zzqVar = this.f19622e;
            zzqVar.f19633a.f20120n.mo10915j1(zzqVar.f19634b, zzq.m10665a(zzqVar, this.f19620c), new zzp(this.f19622e, this.f19621d, this.f19620c));
        } catch (RemoteException e2) {
            zzq.f19631e.m10836c(e2, "requestUpdateInfo(%s)", this.f19620c);
            this.f19621d.m11014c(new RuntimeException(e2));
        }
    }
}

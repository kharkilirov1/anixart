package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzak extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19680c;

    /* renamed from: d */
    public final /* synthetic */ zzaw f19681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19681d = zzawVar;
        this.f19680c = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19681d;
            zzawVar.f19702e.f20120n.mo10920b2(zzawVar.f19698a, zzaw.m10704g(), new zzap(this.f19681d, this.f19680c));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "keepAlive", new Object[0]);
        }
    }
}

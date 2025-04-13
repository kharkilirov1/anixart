package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzai extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ int f19671c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19672d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f19673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, int i2, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19673e = zzawVar;
        this.f19671c = i2;
        this.f19672d = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19673e;
            com.google.android.play.core.internal.zzu zzuVar = zzawVar.f19701d.f20120n;
            String str = zzawVar.f19698a;
            int i2 = this.f19671c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i2);
            zzuVar.mo10921e2(str, bundle, zzaw.m10704g(), new zzas(this.f19673e, this.f19672d));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "notifySessionFailed", new Object[0]);
        }
    }
}

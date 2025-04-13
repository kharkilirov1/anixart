package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzab extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ String f19651c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19652d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f19653e;

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19653e;
            com.google.android.play.core.internal.zzu zzuVar = zzawVar.f19701d.f20120n;
            String str = zzawVar.f19698a;
            String str2 = this.f19651c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putString("module_name", str2);
            zzuVar.mo10919Y(str, bundle, zzaw.m10704g(), new zzat(this.f19653e, this.f19652d));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "removePack(%s)", this.f19651c);
        }
    }
}

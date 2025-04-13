package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzae extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ Map f19657c;

    /* renamed from: d */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19658d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f19659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, Map map, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19659e = zzawVar;
        this.f19657c = map;
        this.f19658d = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19659e;
            zzawVar.f19701d.f20120n.mo10923n0(zzawVar.f19698a, zzaw.m10707k(this.f19657c), new zzao(this.f19659e, this.f19658d));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "syncPacks", new Object[0]);
            this.f19658d.m11014c(new RuntimeException(e2));
        }
    }
}

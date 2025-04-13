package com.google.android.play.core.assetpacks;

import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzag extends com.google.android.play.core.internal.zzah {

    /* renamed from: c */
    public final /* synthetic */ int f19660c;

    /* renamed from: d */
    public final /* synthetic */ String f19661d;

    /* renamed from: e */
    public final /* synthetic */ String f19662e;

    /* renamed from: f */
    public final /* synthetic */ int f19663f;

    /* renamed from: g */
    public final /* synthetic */ com.google.android.play.core.tasks.zzi f19664g;

    /* renamed from: h */
    public final /* synthetic */ zzaw f19665h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzaw zzawVar, com.google.android.play.core.tasks.zzi zziVar, int i2, String str, String str2, int i3, com.google.android.play.core.tasks.zzi zziVar2) {
        super(zziVar);
        this.f19665h = zzawVar;
        this.f19660c = i2;
        this.f19661d = str;
        this.f19662e = str2;
        this.f19663f = i3;
        this.f19664g = zziVar2;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        try {
            zzaw zzawVar = this.f19665h;
            zzawVar.f19701d.f20120n.mo10924x1(zzawVar.f19698a, zzaw.m10706j(this.f19660c, this.f19661d, this.f19662e, this.f19663f), zzaw.m10704g(), new zzaq(this.f19665h, this.f19664g));
        } catch (RemoteException e2) {
            zzaw.f19696g.m10836c(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}

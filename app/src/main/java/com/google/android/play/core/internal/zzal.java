package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzal extends zzah {

    /* renamed from: c */
    public final /* synthetic */ zzas f20101c;

    public zzal(zzas zzasVar) {
        this.f20101c = zzasVar;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        zzas zzasVar = this.f20101c;
        if (zzasVar.f20120n != 0) {
            zzasVar.f20108b.m10837d("Unbind from service.", new Object[0]);
            zzas zzasVar2 = this.f20101c;
            zzasVar2.f20107a.unbindService(zzasVar2.f20119m);
            zzas zzasVar3 = this.f20101c;
            zzasVar3.f20113g = false;
            zzasVar3.f20120n = null;
            zzasVar3.f20119m = null;
        }
        this.f20101c.m10844d();
    }
}

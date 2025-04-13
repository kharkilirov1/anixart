package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzap extends zzah {

    /* renamed from: c */
    public final /* synthetic */ zzar f20104c;

    public zzap(zzar zzarVar) {
        this.f20104c = zzarVar;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        zzas zzasVar = this.f20104c.f20105b;
        zzasVar.f20108b.m10837d("unlinkToDeath", new Object[0]);
        zzasVar.f20120n.asBinder().unlinkToDeath(zzasVar.f20117k, 0);
        zzas zzasVar2 = this.f20104c.f20105b;
        zzasVar2.f20120n = null;
        zzasVar2.f20113g = false;
    }
}

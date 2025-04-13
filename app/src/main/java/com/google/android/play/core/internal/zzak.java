package com.google.android.play.core.internal;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzak extends zzah {

    /* renamed from: c */
    public final /* synthetic */ zzah f20099c;

    /* renamed from: d */
    public final /* synthetic */ zzas f20100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzas zzasVar, com.google.android.play.core.tasks.zzi zziVar, zzah zzahVar) {
        super(zziVar);
        this.f20100d = zzasVar;
        this.f20099c = zzahVar;
    }

    @Override // com.google.android.play.core.internal.zzah
    /* renamed from: a */
    public final void mo10662a() {
        zzas zzasVar = this.f20100d;
        zzah zzahVar = this.f20099c;
        if (zzasVar.f20120n != 0 || zzasVar.f20113g) {
            if (!zzasVar.f20113g) {
                zzahVar.run();
                return;
            } else {
                zzasVar.f20108b.m10837d("Waiting to bind to the service.", new Object[0]);
                zzasVar.f20110d.add(zzahVar);
                return;
            }
        }
        zzasVar.f20108b.m10837d("Initiate binding to the service.", new Object[0]);
        zzasVar.f20110d.add(zzahVar);
        zzar zzarVar = new zzar(zzasVar);
        zzasVar.f20119m = zzarVar;
        zzasVar.f20113g = true;
        if (zzasVar.f20107a.bindService(zzasVar.f20114h, zzarVar, 1)) {
            return;
        }
        zzasVar.f20108b.m10837d("Failed to bind to the service.", new Object[0]);
        zzasVar.f20113g = false;
        for (zzah zzahVar2 : zzasVar.f20110d) {
            zzat zzatVar = new zzat();
            com.google.android.play.core.tasks.zzi<?> zziVar = zzahVar2.f20095b;
            if (zziVar != null) {
                zziVar.m11014c(zzatVar);
            }
        }
        zzasVar.f20110d.clear();
    }
}

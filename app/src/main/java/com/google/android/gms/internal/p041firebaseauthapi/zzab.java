package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzab extends zzad {

    /* renamed from: g */
    public final /* synthetic */ zzp f16290g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzaf zzafVar, CharSequence charSequence, zzp zzpVar) {
        super(zzafVar, charSequence);
        this.f16290g = zzpVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzad
    /* renamed from: b */
    public final int mo8615b(int i2) {
        return ((zzs) this.f16290g).f16799a.end();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzad
    /* renamed from: c */
    public final int mo8616c(int i2) {
        if (((zzs) this.f16290g).f16799a.find(i2)) {
            return ((zzs) this.f16290g).f16799a.start();
        }
        return -1;
    }
}

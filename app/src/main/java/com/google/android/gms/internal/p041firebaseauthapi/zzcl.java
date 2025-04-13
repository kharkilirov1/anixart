package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzcl extends zzfo {
    public zzcl() {
        super(zzgx.class, new zzcj(zzne.class));
    }

    /* renamed from: i */
    public static final void m8902i(zzgx zzgxVar) throws GeneralSecurityException {
        zznm.m9341c(zzgxVar.m9012q(), 0);
        zznm.m9340b(zzgxVar.m9014w().mo9513d());
        m8903j(zzgxVar.m9013v());
    }

    /* renamed from: j */
    public static final void m8903j(zzhd zzhdVar) throws GeneralSecurityException {
        if (zzhdVar.m9027q() < 12 || zzhdVar.m9027q() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzck(this, zzha.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzgx.m9008u(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        m8902i((zzgx) zzabcVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

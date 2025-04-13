package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzcx extends zzfo {
    public zzcx() {
        super(zzih.class, new zzcv(zzap.class));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzcw(this, zzik.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzih.m9087t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzih zzihVar = (zzih) zzabcVar;
        zznm.m9341c(zzihVar.m9090q(), 0);
        if (zzihVar.m9091u().mo9513d() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

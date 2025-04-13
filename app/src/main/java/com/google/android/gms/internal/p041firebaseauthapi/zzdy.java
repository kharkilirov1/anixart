package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdy extends zzfo {
    public zzdy() {
        super(zzib.class, new zzdw(zzat.class));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzdx(this, zzie.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzib.m9075t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzib zzibVar = (zzib) zzabcVar;
        zznm.m9341c(zzibVar.m9078q(), 0);
        if (zzibVar.m9079u().mo9513d() != 64) {
            throw new InvalidKeyException(C0000a.m8e("invalid key size: ", zzibVar.m9079u().mo9513d(), ". Valid keys must have 64 bytes."));
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfu extends zzfo {
    public zzfu() {
        super(zzgi.class, new zzfs(zzbl.class));
    }

    /* renamed from: i */
    public static void m8958i(zzgo zzgoVar) throws GeneralSecurityException {
        if (zzgoVar.m8988q() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgoVar.m8988q() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzft(zzgl.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzgi.m8966t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzgi zzgiVar = (zzgi) zzabcVar;
        zznm.m9341c(zzgiVar.m8971q(), 0);
        if (zzgiVar.m8973v().mo9513d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        m8958i(zzgiVar.m8972u());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

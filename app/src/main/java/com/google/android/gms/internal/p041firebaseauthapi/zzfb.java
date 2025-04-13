package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfb extends zzfo {
    public zzfb() {
        super(zzki.class, new zzfa(zzav.class));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzki.m9208v(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzki zzkiVar = (zzki) zzabcVar;
        zznm.m9341c(zzkiVar.m9213q(), 0);
        if (!zzkiVar.m9212A()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzfc.m8942a(zzkiVar.m9214r());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 5;
    }
}

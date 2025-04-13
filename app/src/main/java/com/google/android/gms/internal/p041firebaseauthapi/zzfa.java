package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzfa extends zzfp {
    public zzfa(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfp
    /* renamed from: a */
    public final Object mo8889a(zzabc zzabcVar) throws GeneralSecurityException {
        zzki zzkiVar = (zzki) zzabcVar;
        if (zzkiVar.m9215w().m9524A()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzkc m9214r = zzkiVar.m9214r();
        return new zzev(zzkiVar, zzew.m8940c(m9214r), zzew.m8939b(m9214r), zzew.m8938a(m9214r));
    }
}

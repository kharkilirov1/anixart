package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzex extends zzfp {
    public zzex(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfp
    /* renamed from: a */
    public final Object mo8889a(zzabc zzabcVar) throws GeneralSecurityException {
        zzkf zzkfVar = (zzkf) zzabcVar;
        if (!zzkfVar.m9204z()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzkfVar.m9202u().m9212A()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzkfVar.m9203v().m9524A()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzkc m9214r = zzkfVar.m9202u().m9214r();
        zzfd m8940c = zzew.m8940c(m9214r);
        zzer m8939b = zzew.m8939b(m9214r);
        zzes m8938a = zzew.m8938a(m9214r);
        int m9194v = m9214r.m9194v();
        if (m9194v - 2 != 1) {
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(m9194v != 2 ? m9194v != 3 ? "UNRECOGNIZED" : "DHKEM_X25519_HKDF_SHA256" : "KEM_UNKNOWN"));
        }
        return new zzeu(zzkfVar, m8940c, m8939b, m8938a);
    }
}

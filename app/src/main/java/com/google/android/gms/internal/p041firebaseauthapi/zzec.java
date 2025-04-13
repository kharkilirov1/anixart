package com.google.android.gms.internal.p041firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzec extends zzfp {
    public zzec(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfp
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8889a(zzabc zzabcVar) throws GeneralSecurityException {
        zziy zziyVar = (zziy) zzabcVar;
        zziv m9132r = zziyVar.m9121u().m9132r();
        zzje m9112u = m9132r.m9112u();
        int m8928c = zzen.m8928c(m9112u.m9142v());
        byte[] m9525C = zziyVar.m9122v().m9525C();
        return new zzmn((ECPrivateKey) ((KeyFactory) zzmt.f16600i.m9325a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, m9525C), zzmr.m9322d(m8928c))), m9112u.m9141t().m9525C(), zzen.m8927b(m9112u.m9143w()), zzen.m8929d(m9132r.m9113x()), new zzeo(m9132r.m9111q().m9099t()));
    }
}

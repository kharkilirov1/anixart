package com.google.android.gms.internal.p041firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzef extends zzfp {
    public zzef(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfp
    /* renamed from: a */
    public final Object mo8889a(zzabc zzabcVar) throws GeneralSecurityException {
        zzjb zzjbVar = (zzjb) zzabcVar;
        zziv m9132r = zzjbVar.m9132r();
        zzje m9112u = m9132r.m9112u();
        int m8928c = zzen.m8928c(m9112u.m9142v());
        byte[] m9525C = zzjbVar.m9133w().m9525C();
        byte[] m9525C2 = zzjbVar.m9134x().m9525C();
        ECParameterSpec m9322d = zzmr.m9322d(m8928c);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, m9525C), new BigInteger(1, m9525C2));
        zzmr.m9321c(eCPoint, m9322d.getCurve());
        return new zzmo((ECPublicKey) ((KeyFactory) zzmt.f16600i.m9325a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, m9322d)), m9112u.m9141t().m9525C(), zzen.m8927b(m9112u.m9143w()), zzen.m8929d(m9132r.m9113x()), new zzeo(m9132r.m9111q().m9099t()));
    }
}

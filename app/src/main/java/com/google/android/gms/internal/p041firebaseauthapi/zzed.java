package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzed extends zzfn {
    public zzed(zzee zzeeVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzis zzisVar = (zzis) zzabcVar;
        ECParameterSpec m9322d = zzmr.m9322d(zzen.m8928c(zzisVar.m9104t().m9112u().m9142v()));
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzmt.f16599h.m9325a("EC");
        keyPairGenerator.initialize(m9322d);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w = eCPublicKey.getW();
        zzja m9125s = zzjb.m9125s();
        if (m9125s.f17169d) {
            m9125s.m9647j();
            m9125s.f17169d = false;
        }
        ((zzjb) m9125s.f17168c).zze = 0;
        zziv m9104t = zzisVar.m9104t();
        if (m9125s.f17169d) {
            m9125s.m9647j();
            m9125s.f17169d = false;
        }
        zzjb.m9130z((zzjb) m9125s.f17168c, m9104t);
        zzyu m9522y = zzyu.m9522y(w.getAffineX().toByteArray());
        if (m9125s.f17169d) {
            m9125s.m9647j();
            m9125s.f17169d = false;
        }
        ((zzjb) m9125s.f17168c).zzg = m9522y;
        zzyu m9522y2 = zzyu.m9522y(w.getAffineY().toByteArray());
        if (m9125s.f17169d) {
            m9125s.m9647j();
            m9125s.f17169d = false;
        }
        ((zzjb) m9125s.f17168c).zzh = m9522y2;
        zzjb zzjbVar = (zzjb) m9125s.m9645h();
        zzix m9114r = zziy.m9114r();
        if (m9114r.f17169d) {
            m9114r.m9647j();
            m9114r.f17169d = false;
        }
        ((zziy) m9114r.f17168c).zze = 0;
        if (m9114r.f17169d) {
            m9114r.m9647j();
            m9114r.f17169d = false;
        }
        zziy.m9118x((zziy) m9114r.f17168c, zzjbVar);
        zzyu m9522y3 = zzyu.m9522y(eCPrivateKey.getS().toByteArray());
        if (m9114r.f17169d) {
            m9114r.m9647j();
            m9114r.f17169d = false;
        }
        ((zziy) m9114r.f17168c).zzg = m9522y3;
        return (zziy) m9114r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzis.m9102s(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzbe m8851a = zzbf.m8851a("AES128_GCM");
        byte[] bArr = zzee.f16451d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzee.m8922j(4, 5, 3, m8851a, bArr, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzee.m8922j(4, 5, 3, zzbf.m8851a("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzee.m8922j(4, 5, 4, zzbf.m8851a("AES128_GCM"), bArr, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzee.m8922j(4, 5, 4, zzbf.m8851a("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzee.m8922j(4, 5, 4, zzbf.m8851a("AES128_GCM"), bArr, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzee.m8922j(4, 5, 3, zzbf.m8851a("AES128_CTR_HMAC_SHA256"), bArr, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzee.m8922j(4, 5, 3, zzbf.m8851a("AES128_CTR_HMAC_SHA256"), bArr, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzee.m8922j(4, 5, 4, zzbf.m8851a("AES128_CTR_HMAC_SHA256"), bArr, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzee.m8922j(4, 5, 4, zzbf.m8851a("AES128_CTR_HMAC_SHA256"), bArr, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzen.m8926a(((zzis) zzabcVar).m9104t());
    }
}

package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzey extends zzfn {
    public zzey(zzez zzezVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzjz zzjzVar = (zzjz) zzabcVar;
        byte[] m9337a = zznk.m9337a(32);
        m9337a[0] = (byte) (m9337a[0] | 7);
        int i2 = m9337a[31] & 63;
        m9337a[31] = (byte) i2;
        m9337a[31] = (byte) (i2 | 128);
        byte[] m9343b = zznn.m9343b(m9337a);
        zzkh m9205s = zzki.m9205s();
        if (m9205s.f17169d) {
            m9205s.m9647j();
            m9205s.f17169d = false;
        }
        ((zzki) m9205s.f17168c).zze = 0;
        zzkc m9185t = zzjzVar.m9185t();
        if (m9205s.f17169d) {
            m9205s.m9647j();
            m9205s.f17169d = false;
        }
        zzki.m9210y((zzki) m9205s.f17168c, m9185t);
        zzyu m9523z = zzyu.m9523z(m9343b, 0, m9343b.length);
        if (m9205s.f17169d) {
            m9205s.m9647j();
            m9205s.f17169d = false;
        }
        ((zzki) m9205s.f17168c).zzg = m9523z;
        zzki zzkiVar = (zzki) m9205s.m9645h();
        zzke m9195r = zzkf.m9195r();
        if (m9195r.f17169d) {
            m9195r.m9647j();
            m9195r.f17169d = false;
        }
        ((zzkf) m9195r.f17168c).zze = 0;
        if (m9195r.f17169d) {
            m9195r.m9647j();
            m9195r.f17169d = false;
        }
        zzkf.m9199x((zzkf) m9195r.f17168c, zzkiVar);
        zzyu m9523z2 = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9195r.f17169d) {
            m9195r.m9647j();
            m9195r.f17169d = false;
        }
        ((zzkf) m9195r.f17168c).zzg = m9523z2;
        return (zzkf) m9195r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzjz.m9183s(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzez.m8941j(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzez.m8941j(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzez.m8941j(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzez.m8941j(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzez.m8941j(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzez.m8941j(3, 3, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzfc.m8942a(((zzjz) zzabcVar).m9185t());
    }
}

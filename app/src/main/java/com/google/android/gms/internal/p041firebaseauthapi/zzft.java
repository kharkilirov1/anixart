package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzft extends zzfn {
    public zzft(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzgl zzglVar = (zzgl) zzabcVar;
        zzgh m8964r = zzgi.m8964r();
        if (m8964r.f17169d) {
            m8964r.m9647j();
            m8964r.f17169d = false;
        }
        ((zzgi) m8964r.f17168c).zze = 0;
        byte[] m9337a = zznk.m9337a(zzglVar.m8981q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m8964r.f17169d) {
            m8964r.m9647j();
            m8964r.f17169d = false;
        }
        ((zzgi) m8964r.f17168c).zzf = m9523z;
        zzgo m8982u = zzglVar.m8982u();
        if (m8964r.f17169d) {
            m8964r.m9647j();
            m8964r.f17169d = false;
        }
        zzgi.m8969y((zzgi) m8964r.f17168c, m8982u);
        return (zzgi) m8964r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzgl.m8978t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgk m8976r = zzgl.m8976r();
        m8976r.m8974k();
        zzgn m8984r = zzgo.m8984r();
        m8984r.m8983k();
        m8976r.m8975l((zzgo) m8984r.m9645h());
        hashMap.put("AES_CMAC", new zzfm((zzgl) m8976r.m9645h(), 1));
        zzgk m8976r2 = zzgl.m8976r();
        m8976r2.m8974k();
        zzgn m8984r2 = zzgo.m8984r();
        m8984r2.m8983k();
        m8976r2.m8975l((zzgo) m8984r2.m9645h());
        hashMap.put("AES256_CMAC", new zzfm((zzgl) m8976r2.m9645h(), 1));
        zzgk m8976r3 = zzgl.m8976r();
        m8976r3.m8974k();
        zzgn m8984r3 = zzgo.m8984r();
        m8984r3.m8983k();
        m8976r3.m8975l((zzgo) m8984r3.m9645h());
        hashMap.put("AES256_CMAC_RAW", new zzfm((zzgl) m8976r3.m9645h(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzgl zzglVar = (zzgl) zzabcVar;
        zzfu.m8958i(zzglVar.m8982u());
        if (zzglVar.m8981q() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}

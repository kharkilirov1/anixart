package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzdx extends zzfn {
    public zzdx(zzdy zzdyVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzia m9073r = zzib.m9073r();
        byte[] m9337a = zznk.m9337a(((zzie) zzabcVar).m9084q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9073r.f17169d) {
            m9073r.m9647j();
            m9073r.f17169d = false;
        }
        ((zzib) m9073r.f17168c).zzf = m9523z;
        if (m9073r.f17169d) {
            m9073r.m9647j();
            m9073r.f17169d = false;
        }
        ((zzib) m9073r.f17168c).zze = 0;
        return (zzib) m9073r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzie.m9082t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzid m9080r = zzie.m9080r();
        if (m9080r.f17169d) {
            m9080r.m9647j();
            m9080r.f17169d = false;
        }
        ((zzie) m9080r.f17168c).zze = 64;
        hashMap.put("AES256_SIV", new zzfm((zzie) m9080r.m9645h(), 1));
        zzid m9080r2 = zzie.m9080r();
        if (m9080r2.f17169d) {
            m9080r2.m9647j();
            m9080r2.f17169d = false;
        }
        ((zzie) m9080r2.f17168c).zze = 64;
        hashMap.put("AES256_SIV_RAW", new zzfm((zzie) m9080r2.m9645h(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzie zzieVar = (zzie) zzabcVar;
        if (zzieVar.m9084q() != 64) {
            throw new InvalidAlgorithmParameterException(C0000a.m8e("invalid key size: ", zzieVar.m9084q(), ". Valid keys must have 64 bytes."));
        }
    }
}

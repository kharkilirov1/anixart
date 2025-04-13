package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzct extends zzfn {
    public zzct(zzcu zzcuVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzhu m9061r = zzhv.m9061r();
        byte[] m9337a = zznk.m9337a(((zzhy) zzabcVar).m9072q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9061r.f17169d) {
            m9061r.m9647j();
            m9061r.f17169d = false;
        }
        ((zzhv) m9061r.f17168c).zzf = m9523z;
        if (m9061r.f17169d) {
            m9061r.m9647j();
            m9061r.f17169d = false;
        }
        ((zzhv) m9061r.f17168c).zze = 0;
        return (zzhv) m9061r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzhy.m9070t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzcu.m8906i(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzcu.m8906i(16, 3));
        hashMap.put("AES256_GCM_SIV", zzcu.m8906i(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzcu.m8906i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zznm.m9340b(((zzhy) zzabcVar).m9072q());
    }
}

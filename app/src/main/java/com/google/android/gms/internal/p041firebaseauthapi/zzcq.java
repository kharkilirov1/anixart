package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzcq extends zzfn {
    public zzcq(zzcr zzcrVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzho m9049r = zzhp.m9049r();
        byte[] m9337a = zznk.m9337a(((zzhs) zzabcVar).m9060q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9049r.f17169d) {
            m9049r.m9647j();
            m9049r.f17169d = false;
        }
        ((zzhp) m9049r.f17168c).zzf = m9523z;
        if (m9049r.f17169d) {
            m9049r.m9647j();
            m9049r.f17169d = false;
        }
        ((zzhp) m9049r.f17168c).zze = 0;
        return (zzhp) m9049r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzhs.m9058t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzcr.m8905i(16, 1));
        hashMap.put("AES128_GCM_RAW", zzcr.m8905i(16, 3));
        hashMap.put("AES256_GCM", zzcr.m8905i(32, 1));
        hashMap.put("AES256_GCM_RAW", zzcr.m8905i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zznm.m9340b(((zzhs) zzabcVar).m9060q());
    }
}

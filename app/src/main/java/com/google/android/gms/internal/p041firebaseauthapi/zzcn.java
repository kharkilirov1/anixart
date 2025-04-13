package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzcn extends zzfn {
    public zzcn(zzco zzcoVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzhj zzhjVar = (zzhj) zzabcVar;
        zzhf m9028r = zzhg.m9028r();
        byte[] m9337a = zznk.m9337a(zzhjVar.m9042q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9028r.f17169d) {
            m9028r.m9647j();
            m9028r.f17169d = false;
        }
        ((zzhg) m9028r.f17168c).zzg = m9523z;
        zzhm m9043u = zzhjVar.m9043u();
        if (m9028r.f17169d) {
            m9028r.m9647j();
            m9028r.f17169d = false;
        }
        zzhg.m9032x((zzhg) m9028r.f17168c, m9043u);
        if (m9028r.f17169d) {
            m9028r.m9647j();
            m9028r.f17169d = false;
        }
        ((zzhg) m9028r.f17168c).zze = 0;
        return (zzhg) m9028r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzhj.m9039t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzco.m8904i(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzco.m8904i(16, 16, 3));
        hashMap.put("AES256_EAX", zzco.m8904i(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzco.m8904i(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzhj zzhjVar = (zzhj) zzabcVar;
        zznm.m9340b(zzhjVar.m9042q());
        if (zzhjVar.m9043u().m9048q() != 12 && zzhjVar.m9043u().m9048q() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}

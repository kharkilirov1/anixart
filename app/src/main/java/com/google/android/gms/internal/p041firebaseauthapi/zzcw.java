package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzcw extends zzfn {
    public zzcw(zzcx zzcxVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzig m9085r = zzih.m9085r();
        if (m9085r.f17169d) {
            m9085r.m9647j();
            m9085r.f17169d = false;
        }
        ((zzih) m9085r.f17168c).zze = 0;
        byte[] m9337a = zznk.m9337a(32);
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9085r.f17169d) {
            m9085r.m9647j();
            m9085r.f17169d = false;
        }
        ((zzih) m9085r.f17168c).zzf = m9523z;
        return (zzih) m9085r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzik.m9094s(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzfm(zzik.m9093r(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzfm(zzik.m9093r(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
    }
}

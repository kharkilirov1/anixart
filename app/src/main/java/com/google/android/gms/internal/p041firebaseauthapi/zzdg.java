package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzdg extends zzfn {
    public zzdg(zzdh zzdhVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzlw m9297r = zzlx.m9297r();
        if (m9297r.f17169d) {
            m9297r.m9647j();
            m9297r.f17169d = false;
        }
        ((zzlx) m9297r.f17168c).zze = 0;
        byte[] m9337a = zznk.m9337a(32);
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9297r.f17169d) {
            m9297r.m9647j();
            m9297r.f17169d = false;
        }
        ((zzlx) m9297r.f17168c).zzf = m9523z;
        return (zzlx) m9297r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzma.m9306s(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzfm(zzma.m9305r(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzfm(zzma.m9305r(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
    }
}

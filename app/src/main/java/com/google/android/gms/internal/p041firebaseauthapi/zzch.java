package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzch extends zzfn {
    public zzch(zzci zzciVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzgu zzguVar = (zzgu) zzabcVar;
        new zzcl();
        zzgx m8901e = zzck.m8901e(zzguVar.m9003t());
        zzabc mo8890a = new zzfx().mo8895a().mo8890a(zzguVar.m9004u());
        zzgq m8989r = zzgr.m8989r();
        if (m8989r.f17169d) {
            m8989r.m9647j();
            m8989r.f17169d = false;
        }
        zzgr.m8993x((zzgr) m8989r.f17168c, m8901e);
        zzjo zzjoVar = (zzjo) mo8890a;
        if (m8989r.f17169d) {
            m8989r.m9647j();
            m8989r.f17169d = false;
        }
        zzgr.m8994y((zzgr) m8989r.f17168c, zzjoVar);
        if (m8989r.f17169d) {
            m8989r.m9647j();
            m8989r.f17169d = false;
        }
        ((zzgr) m8989r.f17168c).zze = 0;
        return (zzgr) m8989r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzgu.m9000s(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: c */
    public final Map mo8892c() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzci.m8894i(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzci.m8894i(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzci.m8894i(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzci.m8894i(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzgu zzguVar = (zzgu) zzabcVar;
        new zzcl();
        zzha m9003t = zzguVar.m9003t();
        zznm.m9340b(m9003t.m9021q());
        zzcl.m8903j(m9003t.m9022v());
        new zzfx().mo8895a().mo8893d(zzguVar.m9004u());
        zznm.m9340b(zzguVar.m9003t().m9021q());
    }
}

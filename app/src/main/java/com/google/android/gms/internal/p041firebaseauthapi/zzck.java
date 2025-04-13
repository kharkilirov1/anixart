package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzck extends zzfn {
    public zzck(zzcl zzclVar, Class cls) {
        super(cls);
    }

    /* renamed from: e */
    public static final zzgx m8901e(zzha zzhaVar) throws GeneralSecurityException {
        zzgw m9005r = zzgx.m9005r();
        zzhd m9022v = zzhaVar.m9022v();
        if (m9005r.f17169d) {
            m9005r.m9647j();
            m9005r.f17169d = false;
        }
        zzgx.m9010y((zzgx) m9005r.f17168c, m9022v);
        byte[] m9337a = zznk.m9337a(zzhaVar.m9021q());
        zzyu m9523z = zzyu.m9523z(m9337a, 0, m9337a.length);
        if (m9005r.f17169d) {
            m9005r.m9647j();
            m9005r.f17169d = false;
        }
        ((zzgx) m9005r.f17168c).zzg = m9523z;
        if (m9005r.f17169d) {
            m9005r.m9647j();
            m9005r.f17169d = false;
        }
        ((zzgx) m9005r.f17168c).zze = 0;
        return (zzgx) m9005r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        return m8901e((zzha) zzabcVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzha.m9018u(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzha zzhaVar = (zzha) zzabcVar;
        zznm.m9340b(zzhaVar.m9021q());
        zzcl.m8903j(zzhaVar.m9022v());
    }
}

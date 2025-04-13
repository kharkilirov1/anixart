package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzdd extends zzfn {
    public zzdd(zzde zzdeVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: a */
    public final zzabc mo8890a(zzabc zzabcVar) throws GeneralSecurityException {
        zzlp zzlpVar = (zzlp) zzabcVar;
        zzll m9281r = zzlm.m9281r();
        if (m9281r.f17169d) {
            m9281r.m9647j();
            m9281r.f17169d = false;
        }
        zzlm.m9285w((zzlm) m9281r.f17168c, zzlpVar);
        if (m9281r.f17169d) {
            m9281r.m9647j();
            m9281r.f17169d = false;
        }
        ((zzlm) m9281r.f17168c).zze = 0;
        return (zzlm) m9281r.m9645h();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8891b(zzyu zzyuVar) throws zzaaf {
        return zzlp.m9290t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfn
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8893d(zzabc zzabcVar) throws GeneralSecurityException {
        zzlp zzlpVar = (zzlp) zzabcVar;
        if (zzlpVar.m9292u().isEmpty() || !zzlpVar.m9293v()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}

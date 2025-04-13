package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
class zzaz implements zzax {

    /* renamed from: a */
    public final zzfo f16394a;

    /* renamed from: b */
    public final Class f16395b;

    public zzaz(zzfo zzfoVar, Class cls) {
        if (!zzfoVar.m8956h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzfoVar.toString(), cls.getName()));
        }
        this.f16394a = zzfoVar;
        this.f16395b = cls;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzax
    /* renamed from: a */
    public final zzkl mo8832a(zzyu zzyuVar) throws GeneralSecurityException {
        try {
            zzabc m8837a = new zzay(this.f16394a.mo8895a()).m8837a(zzyuVar);
            zzkk m9216q = zzkl.m9216q();
            String mo8897c = this.f16394a.mo8897c();
            if (m9216q.f17169d) {
                m9216q.m9647j();
                m9216q.f17169d = false;
            }
            ((zzkl) m9216q.f17168c).zze = mo8897c;
            zzyu mo8622b = m8837a.mo8622b();
            if (m9216q.f17169d) {
                m9216q.m9647j();
                m9216q.f17169d = false;
            }
            ((zzkl) m9216q.f17168c).zzf = mo8622b;
            int mo8900f = this.f16394a.mo8900f();
            if (m9216q.f17169d) {
                m9216q.m9647j();
                m9216q.f17169d = false;
            }
            ((zzkl) m9216q.f17168c).zzg = mo8900f - 2;
            return (zzkl) m9216q.m9645h();
        } catch (zzaaf e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzax
    /* renamed from: b */
    public final Object mo8833b(zzabc zzabcVar) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.f16394a.f16505a.getName());
        if (this.f16394a.f16505a.isInstance(zzabcVar)) {
            return m8838f(zzabcVar);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzax
    /* renamed from: d */
    public final Object mo8834d(zzyu zzyuVar) throws GeneralSecurityException {
        try {
            return m8838f(this.f16394a.mo8896b(zzyuVar));
        } catch (zzaaf e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f16394a.f16505a.getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzax
    /* renamed from: e */
    public final zzabc mo8835e(zzyu zzyuVar) throws GeneralSecurityException {
        try {
            zzfn mo8895a = this.f16394a.mo8895a();
            zzabc mo8891b = mo8895a.mo8891b(zzyuVar);
            mo8895a.mo8893d(mo8891b);
            return mo8895a.mo8890a(mo8891b);
        } catch (zzaaf e2) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f16394a.mo8895a().f16504a.getName()), e2);
        }
    }

    /* renamed from: f */
    public final Object m8838f(zzabc zzabcVar) throws GeneralSecurityException {
        if (Void.class.equals(this.f16395b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f16394a.mo8898d(zzabcVar);
        return this.f16394a.m8955g(zzabcVar, this.f16395b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzax
    /* renamed from: j */
    public final String mo8836j() {
        return this.f16394a.mo8897c();
    }
}

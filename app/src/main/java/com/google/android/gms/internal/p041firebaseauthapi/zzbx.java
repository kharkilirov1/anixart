package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzbx extends zzaz implements zzbw {

    /* renamed from: c */
    public final zzfq f16418c;

    /* renamed from: d */
    public final zzfo f16419d;

    public zzbx(zzfq zzfqVar, zzfo zzfoVar, Class cls) {
        super(zzfqVar, cls);
        this.f16418c = zzfqVar;
        this.f16419d = zzfoVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzbw
    /* renamed from: c */
    public final zzkl mo8873c(zzyu zzyuVar) throws GeneralSecurityException {
        try {
            zzabc mo8896b = this.f16418c.mo8896b(zzyuVar);
            this.f16418c.mo8898d(mo8896b);
            zzabc mo8923i = this.f16418c.mo8923i(mo8896b);
            this.f16419d.mo8898d(mo8923i);
            zzkk m9216q = zzkl.m9216q();
            String mo8897c = this.f16419d.mo8897c();
            if (m9216q.f17169d) {
                m9216q.m9647j();
                m9216q.f17169d = false;
            }
            ((zzkl) m9216q.f17168c).zze = mo8897c;
            zzyu mo8622b = mo8923i.mo8622b();
            if (m9216q.f17169d) {
                m9216q.m9647j();
                m9216q.f17169d = false;
            }
            ((zzkl) m9216q.f17168c).zzf = mo8622b;
            int mo8900f = this.f16419d.mo8900f();
            if (m9216q.f17169d) {
                m9216q.m9647j();
                m9216q.f17169d = false;
            }
            ((zzkl) m9216q.f17168c).zzg = mo8900f - 2;
            return (zzkl) m9216q.m9645h();
        } catch (zzaaf e2) {
            throw new GeneralSecurityException("expected serialized proto of type ", e2);
        }
    }
}

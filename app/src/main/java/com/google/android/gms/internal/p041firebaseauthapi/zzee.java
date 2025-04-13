package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzee extends zzfq {

    /* renamed from: d */
    public static final byte[] f16451d = new byte[0];

    public zzee() {
        super(zziy.class, zzjb.class, new zzec(zzau.class));
    }

    /* renamed from: j */
    public static zzfm m8922j(int i2, int i3, int i4, zzbe zzbeVar, byte[] bArr, int i5) {
        int i6;
        zzir m9100q = zzis.m9100q();
        zzjd m9135q = zzje.m9135q();
        if (m9135q.f17169d) {
            m9135q.m9647j();
            m9135q.f17169d = false;
        }
        zzje.m9139x((zzje) m9135q.f17168c);
        if (m9135q.f17169d) {
            m9135q.m9647j();
            m9135q.f17169d = false;
        }
        ((zzje) m9135q.f17168c).zzf = zzjl.m9150a(5);
        zzyu m9523z = zzyu.m9523z(bArr, 0, bArr.length);
        if (m9135q.f17169d) {
            m9135q.m9647j();
            m9135q.f17169d = false;
        }
        ((zzje) m9135q.f17168c).zzg = m9523z;
        zzje zzjeVar = (zzje) m9135q.m9645h();
        zzkp m9228q = zzkq.m9228q();
        m9228q.m9225k(zzbeVar.f16402a.m9235u());
        m9228q.m9226l(zzyu.m9522y(zzbeVar.f16402a.m9234t().m9525C()));
        int m9236x = zzbeVar.f16402a.m9236x() - 2;
        int i7 = 4;
        if (m9236x == 1) {
            i6 = 1;
        } else if (m9236x == 2) {
            i6 = 2;
        } else if (m9236x == 3) {
            i6 = 3;
        } else {
            if (m9236x != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            i6 = 4;
        }
        int i8 = i6 - 1;
        if (i8 == 0) {
            i7 = 3;
        } else if (i8 != 1) {
            i7 = i8 != 2 ? 6 : 5;
        }
        m9228q.m9227m(i7);
        zzkq zzkqVar = (zzkq) m9228q.m9645h();
        zzio m9095q = zzip.m9095q();
        if (m9095q.f17169d) {
            m9095q.m9647j();
            m9095q.f17169d = false;
        }
        zzip.m9098u((zzip) m9095q.f17168c, zzkqVar);
        zzip zzipVar = (zzip) m9095q.m9645h();
        zziu m9105r = zziv.m9105r();
        if (m9105r.f17169d) {
            m9105r.m9647j();
            m9105r.f17169d = false;
        }
        zziv.m9108v((zziv) m9105r.f17168c, zzjeVar);
        if (m9105r.f17169d) {
            m9105r.m9647j();
            m9105r.f17169d = false;
        }
        zziv.m9109w((zziv) m9105r.f17168c, zzipVar);
        if (m9105r.f17169d) {
            m9105r.m9647j();
            m9105r.f17169d = false;
        }
        zziv.m9110y((zziv) m9105r.f17168c, i4);
        zziv zzivVar = (zziv) m9105r.m9645h();
        if (m9100q.f17169d) {
            m9100q.m9647j();
            m9100q.f17169d = false;
        }
        zzis.m9103u((zzis) m9100q.f17168c, zzivVar);
        return new zzfm((zzis) m9100q.m9645h(), i5);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzed(this, zzis.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zziy.m9116t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zziy zziyVar = (zziy) zzabcVar;
        if (zziyVar.m9122v().m9524A()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zznm.m9341c(zziyVar.m9120q(), 0);
        zzen.m8926a(zziyVar.m9121u().m9132r());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 4;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfq
    /* renamed from: i */
    public final /* synthetic */ zzabc mo8923i(zzabc zzabcVar) throws GeneralSecurityException {
        return ((zziy) zzabcVar).m9121u();
    }
}

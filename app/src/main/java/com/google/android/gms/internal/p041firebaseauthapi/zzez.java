package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzez extends zzfq {
    public zzez() {
        super(zzkf.class, zzki.class, new zzex(zzau.class));
    }

    /* renamed from: j */
    public static zzfm m8941j(int i2, int i3, int i4, int i5) {
        zzkb m9186q = zzkc.m9186q();
        if (m9186q.f17169d) {
            m9186q.m9647j();
            m9186q.f17169d = false;
        }
        ((zzkc) m9186q.f17168c).zze = 1;
        if (m9186q.f17169d) {
            m9186q.m9647j();
            m9186q.f17169d = false;
        }
        ((zzkc) m9186q.f17168c).zzf = 1;
        if (m9186q.f17169d) {
            m9186q.m9647j();
            m9186q.f17169d = false;
        }
        ((zzkc) m9186q.f17168c).zzg = i4 - 2;
        zzkc zzkcVar = (zzkc) m9186q.m9645h();
        zzjy m9181q = zzjz.m9181q();
        if (m9181q.f17169d) {
            m9181q.m9647j();
            m9181q.f17169d = false;
        }
        zzjz.m9184u((zzjz) m9181q.f17168c, zzkcVar);
        return new zzfm((zzjz) m9181q.m9645h(), i5);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzey(this, zzjz.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzkf.m9197t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzkf zzkfVar = (zzkf) zzabcVar;
        if (zzkfVar.m9203v().m9524A()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzkfVar.m9204z()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zznm.m9341c(zzkfVar.m9201q(), 0);
        zzfc.m8942a(zzkfVar.m9202u().m9214r());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 4;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfq
    /* renamed from: i */
    public final /* synthetic */ zzabc mo8923i(zzabc zzabcVar) throws GeneralSecurityException {
        return ((zzkf) zzabcVar).m9202u();
    }
}

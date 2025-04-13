package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzcu extends zzfo {
    public zzcu() {
        super(zzhv.class, new zzcs(zzap.class));
    }

    /* renamed from: i */
    public static zzfm m8906i(int i2, int i3) {
        zzhx m9068r = zzhy.m9068r();
        if (m9068r.f17169d) {
            m9068r.m9647j();
            m9068r.f17169d = false;
        }
        ((zzhy) m9068r.f17168c).zze = i2;
        return new zzfm((zzhy) m9068r.m9645h(), i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzct(this, zzhy.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzhv.m9063t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzhv zzhvVar = (zzhv) zzabcVar;
        zznm.m9341c(zzhvVar.m9066q(), 0);
        zznm.m9340b(zzhvVar.m9067u().mo9513d());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

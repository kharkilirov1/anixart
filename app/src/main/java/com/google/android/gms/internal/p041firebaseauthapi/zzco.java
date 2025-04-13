package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzco extends zzfo {
    public zzco() {
        super(zzhg.class, new zzcm(zzap.class));
    }

    /* renamed from: i */
    public static zzfm m8904i(int i2, int i3, int i4) {
        zzhi m9037r = zzhj.m9037r();
        if (m9037r.f17169d) {
            m9037r.m9647j();
            m9037r.f17169d = false;
        }
        ((zzhj) m9037r.f17168c).zzf = i2;
        zzhl m9044r = zzhm.m9044r();
        if (m9044r.f17169d) {
            m9044r.m9647j();
            m9044r.f17169d = false;
        }
        ((zzhm) m9044r.f17168c).zze = 16;
        zzhm zzhmVar = (zzhm) m9044r.m9645h();
        if (m9037r.f17169d) {
            m9037r.m9647j();
            m9037r.f17169d = false;
        }
        zzhj.m9040v((zzhj) m9037r.f17168c, zzhmVar);
        return new zzfm((zzhj) m9037r.m9645h(), i4);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzcn(this, zzhj.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzhg.m9030t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzhg zzhgVar = (zzhg) zzabcVar;
        zznm.m9341c(zzhgVar.m9034q(), 0);
        zznm.m9340b(zzhgVar.m9036v().mo9513d());
        if (zzhgVar.m9035u().m9048q() != 12 && zzhgVar.m9035u().m9048q() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

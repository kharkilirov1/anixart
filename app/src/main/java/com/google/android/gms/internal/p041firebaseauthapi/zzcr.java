package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzcr extends zzfo {
    public zzcr() {
        super(zzhp.class, new zzcp(zzap.class));
    }

    /* renamed from: i */
    public static zzfm m8905i(int i2, int i3) {
        zzhr m9056r = zzhs.m9056r();
        if (m9056r.f17169d) {
            m9056r.m9647j();
            m9056r.f17169d = false;
        }
        ((zzhs) m9056r.f17168c).zze = i2;
        return new zzfm((zzhs) m9056r.m9645h(), i3);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzcq(this, zzhs.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzhp.m9051t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzhp zzhpVar = (zzhp) zzabcVar;
        zznm.m9341c(zzhpVar.m9054q(), 0);
        zznm.m9340b(zzhpVar.m9055u().mo9513d());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: e */
    public final int mo8899e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: f */
    public final int mo8900f() {
        return 3;
    }
}

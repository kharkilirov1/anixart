package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzci extends zzfo {
    public zzci() {
        super(zzgr.class, new zzcg(zzap.class));
    }

    /* renamed from: i */
    public static zzfm m8894i(int i2, int i3, int i4, int i5, int i6, int i7) {
        zzgz m9015r = zzha.m9015r();
        zzhc m9023r = zzhd.m9023r();
        if (m9023r.f17169d) {
            m9023r.m9647j();
            m9023r.f17169d = false;
        }
        ((zzhd) m9023r.f17168c).zze = 16;
        zzhd zzhdVar = (zzhd) m9023r.m9645h();
        if (m9015r.f17169d) {
            m9015r.m9647j();
            m9015r.f17169d = false;
        }
        zzha.m9019w((zzha) m9015r.f17168c, zzhdVar);
        if (m9015r.f17169d) {
            m9015r.m9647j();
            m9015r.f17169d = false;
        }
        ((zzha) m9015r.f17168c).zzf = i2;
        zzha zzhaVar = (zzha) m9015r.m9645h();
        zzjq m9164r = zzjr.m9164r();
        zzjt m9174r = zzju.m9174r();
        m9174r.m9173l(5);
        m9174r.m9172k(i5);
        m9164r.m9163l((zzju) m9174r.m9645h());
        m9164r.m9162k(32);
        zzjr zzjrVar = (zzjr) m9164r.m9645h();
        zzgt m8998q = zzgu.m8998q();
        if (m8998q.f17169d) {
            m8998q.m9647j();
            m8998q.f17169d = false;
        }
        zzgu.m9001v((zzgu) m8998q.f17168c, zzhaVar);
        if (m8998q.f17169d) {
            m8998q.m9647j();
            m8998q.f17169d = false;
        }
        zzgu.m9002w((zzgu) m8998q.f17168c, zzjrVar);
        return new zzfm((zzgu) m8998q.m9645h(), i7);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzch(this, zzgu.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzgr.m8991t(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        zzgr zzgrVar = (zzgr) zzabcVar;
        zznm.m9341c(zzgrVar.m8995q(), 0);
        new zzcl();
        zzcl.m8902i(zzgrVar.m8996u());
        new zzfx();
        zzfx.m8959i(zzgrVar.m8997v());
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

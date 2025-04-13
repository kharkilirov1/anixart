package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfx extends zzfo {
    public zzfx() {
        super(zzjo.class, new zzfv(zzbl.class));
    }

    /* renamed from: i */
    public static final void m8959i(zzjo zzjoVar) throws GeneralSecurityException {
        zznm.m9341c(zzjoVar.m9159q(), 0);
        if (zzjoVar.m9161w().mo9513d() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m8961k(zzjoVar.m9160v());
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ zzfm m8960j(int i2, int i3, int i4, int i5) {
        zzjq m9164r = zzjr.m9164r();
        zzjt m9174r = zzju.m9174r();
        m9174r.m9173l(i4);
        m9174r.m9172k(i3);
        m9164r.m9163l((zzju) m9174r.m9645h());
        m9164r.m9162k(i2);
        return new zzfm((zzjr) m9164r.m9645h(), i5);
    }

    /* renamed from: k */
    public static void m8961k(zzju zzjuVar) throws GeneralSecurityException {
        if (zzjuVar.m9179q() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int m9180v = zzjuVar.m9180v() - 2;
        if (m9180v == 1) {
            if (zzjuVar.m9179q() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (m9180v == 2) {
            if (zzjuVar.m9179q() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (m9180v == 3) {
            if (zzjuVar.m9179q() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (m9180v == 4) {
            if (zzjuVar.m9179q() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (m9180v != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzjuVar.m9179q() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: a */
    public final zzfn mo8895a() {
        return new zzfw(this, zzjr.class);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: b */
    public final /* synthetic */ zzabc mo8896b(zzyu zzyuVar) throws zzaaf {
        return zzjo.m9155u(zzyuVar, zzzk.m9627a());
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: c */
    public final String mo8897c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzfo
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo8898d(zzabc zzabcVar) throws GeneralSecurityException {
        m8959i((zzjo) zzabcVar);
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

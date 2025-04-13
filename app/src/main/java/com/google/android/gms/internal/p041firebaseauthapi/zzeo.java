package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzeo implements zzmm {

    /* renamed from: a */
    public final String f16455a;

    /* renamed from: b */
    public final int f16456b;

    /* renamed from: c */
    public zzhp f16457c;

    /* renamed from: d */
    public zzgr f16458d;

    /* renamed from: e */
    public int f16459e;

    /* renamed from: f */
    public zzib f16460f;

    public zzeo(zzkq zzkqVar) throws GeneralSecurityException {
        String m9235u = zzkqVar.m9235u();
        this.f16455a = m9235u;
        if (m9235u.equals(zzcb.f16428b)) {
            try {
                zzhs m9058t = zzhs.m9058t(zzkqVar.m9234t(), zzzk.m9627a());
                this.f16457c = (zzhp) zzbz.m8875b(zzkqVar);
                this.f16456b = m9058t.m9060q();
                return;
            } catch (zzaaf e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
        if (m9235u.equals(zzcb.f16427a)) {
            try {
                zzgu m9000s = zzgu.m9000s(zzkqVar.m9234t(), zzzk.m9627a());
                this.f16458d = (zzgr) zzbz.m8875b(zzkqVar);
                this.f16459e = m9000s.m9003t().m9021q();
                this.f16456b = this.f16459e + m9000s.m9004u().m9170q();
                return;
            } catch (zzaaf e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
        if (!m9235u.equals(zzdz.f16448a)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(m9235u)));
        }
        try {
            zzie m9082t = zzie.m9082t(zzkqVar.m9234t(), zzzk.m9627a());
            this.f16460f = (zzib) zzbz.m8875b(zzkqVar);
            this.f16456b = m9082t.m9084q();
        } catch (zzaaf e4) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzmm
    /* renamed from: a */
    public final zzfe mo8930a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f16456b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f16455a.equals(zzcb.f16428b)) {
            zzho m9049r = zzhp.m9049r();
            m9049r.m9644g(this.f16457c);
            zzyu m9523z = zzyu.m9523z(bArr, 0, this.f16456b);
            if (m9049r.f17169d) {
                m9049r.m9647j();
                m9049r.f17169d = false;
            }
            ((zzhp) m9049r.f17168c).zzf = m9523z;
            return new zzfe((zzap) zzbz.m8876c(this.f16455a, (zzhp) m9049r.m9645h(), zzap.class));
        }
        if (!this.f16455a.equals(zzcb.f16427a)) {
            if (!this.f16455a.equals(zzdz.f16448a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzia m9073r = zzib.m9073r();
            m9073r.m9644g(this.f16460f);
            zzyu m9523z2 = zzyu.m9523z(bArr, 0, this.f16456b);
            if (m9073r.f17169d) {
                m9073r.m9647j();
                m9073r.f17169d = false;
            }
            ((zzib) m9073r.f17168c).zzf = m9523z2;
            return new zzfe((zzat) zzbz.m8876c(this.f16455a, (zzib) m9073r.m9645h(), zzat.class));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f16459e);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f16459e, this.f16456b);
        zzgw m9005r = zzgx.m9005r();
        m9005r.m9644g(this.f16458d.m8996u());
        zzyu m9522y = zzyu.m9522y(copyOfRange);
        if (m9005r.f17169d) {
            m9005r.m9647j();
            m9005r.f17169d = false;
        }
        ((zzgx) m9005r.f17168c).zzg = m9522y;
        zzgx zzgxVar = (zzgx) m9005r.m9645h();
        zzjn m9152r = zzjo.m9152r();
        m9152r.m9644g(this.f16458d.m8997v());
        zzyu m9522y2 = zzyu.m9522y(copyOfRange2);
        if (m9152r.f17169d) {
            m9152r.m9647j();
            m9152r.f17169d = false;
        }
        ((zzjo) m9152r.f17168c).zzg = m9522y2;
        zzjo zzjoVar = (zzjo) m9152r.m9645h();
        zzgq m8989r = zzgr.m8989r();
        int m8995q = this.f16458d.m8995q();
        if (m8989r.f17169d) {
            m8989r.m9647j();
            m8989r.f17169d = false;
        }
        ((zzgr) m8989r.f17168c).zze = m8995q;
        if (m8989r.f17169d) {
            m8989r.m9647j();
            m8989r.f17169d = false;
        }
        zzgr.m8993x((zzgr) m8989r.f17168c, zzgxVar);
        if (m8989r.f17169d) {
            m8989r.m9647j();
            m8989r.f17169d = false;
        }
        zzgr.m8994y((zzgr) m8989r.f17168c, zzjoVar);
        return new zzfe((zzap) zzbz.m8876c(this.f16455a, (zzgr) m8989r.m9645h(), zzap.class));
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzmm
    /* renamed from: u */
    public final int mo8931u() {
        return this.f16456b;
    }
}

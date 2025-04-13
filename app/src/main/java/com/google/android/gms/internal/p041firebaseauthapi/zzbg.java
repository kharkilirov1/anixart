package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbg {

    /* renamed from: a */
    public final zzky f16403a;

    public zzbg(zzky zzkyVar) {
        this.f16403a = zzkyVar;
    }

    /* renamed from: a */
    public static final zzbg m8852a(zzky zzkyVar) throws GeneralSecurityException {
        if (zzkyVar.m9254q() > 0) {
            return new zzbg(zzkyVar);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* renamed from: f */
    public static final zzbg m8853f(zzfk zzfkVar, zzap zzapVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzjj m9146s = zzjj.m9146s(zzfkVar.m8954a(), zzzk.m9627a());
        if (m9146s.m9149t().mo9513d() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            zzky m9251v = zzky.m9251v(zzapVar.mo8826a(m9146s.m9149t().m9525C(), bArr), zzzk.m9627a());
            if (m9251v.m9254q() > 0) {
                return new zzbg(m9251v);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (zzaaf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: b */
    public final zzbg m8854b() throws GeneralSecurityException {
        if (this.f16403a == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzkv m9249s = zzky.m9249s();
        for (zzkx zzkxVar : this.f16403a.m9257w()) {
            zzkl m9245r = zzkxVar.m9245r();
            if (m9245r.m9224x() != 4) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            String m9223u = m9245r.m9223u();
            zzyu m9222t = m9245r.m9222t();
            AtomicReference atomicReference = zzbz.f16421b;
            zzax m8847d = ((zzbd) atomicReference.get()).m8847d(m9223u, null);
            if (!(m8847d instanceof zzbw)) {
                throw new GeneralSecurityException(C0000a.m16m("manager for key type ", m9223u, " is not a PrivateKeyManager"));
            }
            zzkl mo8873c = ((zzbw) m8847d).mo8873c(m9222t);
            String m9223u2 = mo8873c.m9223u();
            ((zzbd) atomicReference.get()).m8847d(m9223u2, null).mo8834d(mo8873c.m9222t());
            zzkw m9239s = zzkx.m9239s();
            m9239s.m9644g(zzkxVar);
            if (m9239s.f17169d) {
                m9239s.m9647j();
                m9239s.f17169d = false;
            }
            zzkx.m9241u((zzkx) m9239s.f17168c, mo8873c);
            zzkx zzkxVar2 = (zzkx) m9239s.m9645h();
            if (m9249s.f17169d) {
                m9249s.m9647j();
                m9249s.f17169d = false;
            }
            zzky.m9253y((zzky) m9249s.f17168c, zzkxVar2);
        }
        int m9255r = this.f16403a.m9255r();
        if (m9249s.f17169d) {
            m9249s.m9647j();
            m9249s.f17169d = false;
        }
        ((zzky) m9249s.f17168c).zze = m9255r;
        return new zzbg((zzky) m9249s.m9645h());
    }

    /* renamed from: c */
    public final Object m8855c(Class cls) throws GeneralSecurityException {
        zzbv zzbvVar = (zzbv) ((ConcurrentHashMap) zzbz.f16424e).get(cls);
        zzbm zzbmVar = null;
        Class mo8871u = zzbvVar == null ? null : zzbvVar.mo8871u();
        if (mo8871u == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        zzky zzkyVar = this.f16403a;
        int i2 = zzca.f16426a;
        int m9255r = zzkyVar.m9255r();
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzkx zzkxVar : zzkyVar.m9257w()) {
            if (zzkxVar.m9247x() == 3) {
                if (!zzkxVar.m9246w()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzkxVar.m9244q())));
                }
                if (zzkxVar.m9248y() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzkxVar.m9244q())));
                }
                if (zzkxVar.m9247x() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzkxVar.m9244q())));
                }
                if (zzkxVar.m9244q() == m9255r) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzkxVar.m9245r().m9224x() == 5;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzbn zzbnVar = new zzbn(mo8871u, zzbmVar);
        for (zzkx zzkxVar2 : this.f16403a.m9257w()) {
            if (zzkxVar2.m9247x() == 3) {
                zzkl m9245r = zzkxVar2.m9245r();
                Object mo8834d = ((zzbd) zzbz.f16421b.get()).m8847d(m9245r.m9223u(), mo8871u).mo8834d(m9245r.m9222t());
                if (zzkxVar2.m9244q() == this.f16403a.m9255r()) {
                    zzbnVar.m8868a(mo8834d, zzkxVar2, true);
                } else {
                    zzbnVar.m8868a(mo8834d, zzkxVar2, false);
                }
            }
        }
        ConcurrentMap concurrentMap = zzbnVar.f16407b;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzbo zzboVar = zzbnVar.f16408c;
        zzge zzgeVar = zzbnVar.f16409d;
        Class cls2 = zzbnVar.f16406a;
        zzbu zzbuVar = new zzbu(concurrentMap, zzboVar, zzgeVar, cls2);
        zzbnVar.f16407b = null;
        zzbv zzbvVar2 = (zzbv) ((ConcurrentHashMap) zzbz.f16424e).get(cls);
        if (zzbvVar2 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
        }
        if (zzbvVar2.mo8871u().equals(cls2)) {
            return zzbvVar2.mo8870a(zzbuVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + zzbvVar2.mo8871u().toString() + ", got " + cls2.toString());
    }

    /* renamed from: d */
    public final void m8856d(zzbi zzbiVar, zzap zzapVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzky zzkyVar = this.f16403a;
        byte[] mo8827b = zzapVar.mo8827b(zzkyVar.mo8621a(), bArr);
        try {
            if (!zzky.m9251v(zzapVar.mo8826a(mo8827b, bArr), zzzk.m9627a()).equals(zzkyVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            zzji m9144q = zzjj.m9144q();
            zzyu m9522y = zzyu.m9522y(mo8827b);
            if (m9144q.f17169d) {
                m9144q.m9647j();
                m9144q.f17169d = false;
            }
            ((zzjj) m9144q.f17168c).zze = m9522y;
            zzld m8884a = zzca.m8884a(zzkyVar);
            if (m9144q.f17169d) {
                m9144q.m9647j();
                m9144q.f17169d = false;
            }
            zzjj.m9148v((zzjj) m9144q.f17168c, m8884a);
            zzbiVar.mo8829b((zzjj) m9144q.m9645h());
        } catch (zzaaf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: e */
    public final void m8857e(zzbi zzbiVar) throws GeneralSecurityException, IOException {
        for (zzkx zzkxVar : this.f16403a.m9257w()) {
            if (zzkxVar.m9245r().m9224x() == 2 || zzkxVar.m9245r().m9224x() == 3 || zzkxVar.m9245r().m9224x() == 4) {
                Object[] objArr = new Object[2];
                int m9224x = zzkxVar.m9245r().m9224x();
                objArr[0] = m9224x != 2 ? m9224x != 3 ? m9224x != 4 ? m9224x != 5 ? m9224x != 6 ? "UNRECOGNIZED" : "REMOTE" : "ASYMMETRIC_PUBLIC" : "ASYMMETRIC_PRIVATE" : "SYMMETRIC" : "UNKNOWN_KEYMATERIAL";
                objArr[1] = zzkxVar.m9245r().m9223u();
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", objArr));
            }
        }
        ((zzaq) zzbiVar).mo8828a(this.f16403a);
    }

    public final String toString() {
        return zzca.m8884a(this.f16403a).toString();
    }
}

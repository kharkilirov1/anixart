package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzbh {

    /* renamed from: a */
    @GuardedBy
    public final zzkv f16404a;

    public zzbh(zzkv zzkvVar) {
        this.f16404a = zzkvVar;
    }

    /* renamed from: d */
    public static zzbh m8858d(zzbg zzbgVar) {
        zzky zzkyVar = zzbgVar.f16403a;
        zzzt zzztVar = (zzzt) zzkyVar.mo8970l(5, null, null);
        zzztVar.m9644g(zzkyVar);
        return new zzbh((zzkv) zzztVar);
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int m8859a(zzkq zzkqVar) throws GeneralSecurityException {
        zzkx m8863f;
        synchronized (this) {
            m8863f = m8863f(zzbz.m8874a(zzkqVar), zzkqVar.m9236x());
        }
        return m8863f.m9244q();
        zzkv zzkvVar = this.f16404a;
        if (zzkvVar.f17169d) {
            zzkvVar.m9647j();
            zzkvVar.f17169d = false;
        }
        zzky.m9253y((zzky) zzkvVar.f17168c, m8863f);
        return m8863f.m9244q();
    }

    /* renamed from: b */
    public final synchronized zzbg m8860b() throws GeneralSecurityException {
        return zzbg.m8852a((zzky) this.f16404a.m9645h());
    }

    /* renamed from: c */
    public final synchronized zzbh m8861c(int i2) throws GeneralSecurityException {
        for (int i3 = 0; i3 < ((zzky) this.f16404a.f17168c).m9254q(); i3++) {
            zzkx m9256t = ((zzky) this.f16404a.f17168c).m9256t(i3);
            if (m9256t.m9244q() == i2) {
                if (m9256t.m9247x() != 3) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i2);
                }
                zzkv zzkvVar = this.f16404a;
                if (zzkvVar.f17169d) {
                    zzkvVar.m9647j();
                    zzkvVar.f17169d = false;
                }
                ((zzky) zzkvVar.f17168c).zze = i2;
            }
        }
        throw new GeneralSecurityException("key not found: " + i2);
        return this;
    }

    /* renamed from: e */
    public final synchronized int m8862e() {
        int m8957a;
        boolean z;
        m8957a = zzfr.m8957a();
        while (true) {
            synchronized (this) {
                Iterator it = Collections.unmodifiableList(((zzky) this.f16404a.f17168c).m9257w()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((zzkx) it.next()).m9244q() == m8957a) {
                        z = true;
                        break;
                    }
                }
            }
            return m8957a;
            m8957a = zzfr.m8957a();
        }
        if (!z) {
            return m8957a;
        }
        m8957a = zzfr.m8957a();
    }

    /* renamed from: f */
    public final synchronized zzkx m8863f(zzkl zzklVar, int i2) throws GeneralSecurityException {
        zzkw m9239s;
        int m8862e = m8862e();
        if (i2 == 2) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        m9239s = zzkx.m9239s();
        if (m9239s.f17169d) {
            m9239s.m9647j();
            m9239s.f17169d = false;
        }
        zzkx.m9241u((zzkx) m9239s.f17168c, zzklVar);
        if (m9239s.f17169d) {
            m9239s.m9647j();
            m9239s.f17169d = false;
        }
        ((zzkx) m9239s.f17168c).zzg = m8862e;
        if (m9239s.f17169d) {
            m9239s.m9647j();
            m9239s.f17169d = false;
        }
        zzkx.m9238A((zzkx) m9239s.f17168c);
        if (m9239s.f17169d) {
            m9239s.m9647j();
            m9239s.f17169d = false;
        }
        ((zzkx) m9239s.f17168c).zzh = zzlr.m9294a(i2);
        return (zzkx) m9239s.m9645h();
    }
}

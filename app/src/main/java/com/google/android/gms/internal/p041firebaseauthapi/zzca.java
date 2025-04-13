package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.charset.Charset;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzca {

    /* renamed from: a */
    public static final /* synthetic */ int f16426a = 0;

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static zzld m8884a(zzky zzkyVar) {
        zzla m9265q = zzld.m9265q();
        int m9255r = zzkyVar.m9255r();
        if (m9265q.f17169d) {
            m9265q.m9647j();
            m9265q.f17169d = false;
        }
        ((zzld) m9265q.f17168c).zze = m9255r;
        for (zzkx zzkxVar : zzkyVar.m9257w()) {
            zzlb m9258r = zzlc.m9258r();
            String m9223u = zzkxVar.m9245r().m9223u();
            if (m9258r.f17169d) {
                m9258r.m9647j();
                m9258r.f17169d = false;
            }
            zzlc.m9260t((zzlc) m9258r.f17168c, m9223u);
            int m9247x = zzkxVar.m9247x();
            if (m9258r.f17169d) {
                m9258r.m9647j();
                m9258r.f17169d = false;
            }
            zzlc.m9263w((zzlc) m9258r.f17168c, m9247x);
            int m9248y = zzkxVar.m9248y();
            if (m9258r.f17169d) {
                m9258r.m9647j();
                m9258r.f17169d = false;
            }
            ((zzlc) m9258r.f17168c).zzh = zzlr.m9294a(m9248y);
            int m9244q = zzkxVar.m9244q();
            if (m9258r.f17169d) {
                m9258r.m9647j();
                m9258r.f17169d = false;
            }
            ((zzlc) m9258r.f17168c).zzg = m9244q;
            zzlc zzlcVar = (zzlc) m9258r.m9645h();
            if (m9265q.f17169d) {
                m9265q.m9647j();
                m9265q.f17169d = false;
            }
            zzld.m9268u((zzld) m9265q.f17168c, zzlcVar);
        }
        return (zzld) m9265q.m9645h();
    }
}

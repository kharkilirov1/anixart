package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzabg implements zzabo {

    /* renamed from: a */
    public final zzabc f16307a;

    /* renamed from: b */
    public final zzacf f16308b;

    /* renamed from: c */
    public final boolean f16309c;

    /* renamed from: d */
    public final zzzl f16310d;

    public zzabg(zzacf zzacfVar, zzzl zzzlVar, zzabc zzabcVar) {
        this.f16308b = zzacfVar;
        this.f16309c = zzzlVar.mo9635h(zzabcVar);
        this.f16310d = zzzlVar;
        this.f16307a = zzabcVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: a */
    public final int mo8650a(Object obj) {
        zzacf zzacfVar = this.f16308b;
        int mo8743b = zzacfVar.mo8743b(zzacfVar.mo8745d(obj));
        if (!this.f16309c) {
            return mo8743b;
        }
        this.f16310d.mo9628a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: b */
    public final int mo8651b(Object obj) {
        int hashCode = this.f16308b.mo8745d(obj).hashCode();
        if (!this.f16309c) {
            return hashCode;
        }
        this.f16310d.mo9628a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: c */
    public final void mo8652c(Object obj) {
        this.f16308b.mo8754m(obj);
        this.f16310d.mo9632e(obj);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: d */
    public final void mo8653d(Object obj, zzzg zzzgVar) throws IOException {
        this.f16310d.mo9628a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: e */
    public final boolean mo8654e(Object obj) {
        this.f16310d.mo9628a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: f */
    public final void mo8655f(Object obj, zzabn zzabnVar, zzzk zzzkVar) throws IOException {
        boolean m9580s;
        zzacf zzacfVar = this.f16308b;
        zzzl zzzlVar = this.f16310d;
        Object mo8744c = zzacfVar.mo8744c(obj);
        zzzp mo9629b = zzzlVar.mo9629b(obj);
        while (true) {
            try {
                zzyz zzyzVar = (zzyz) zzabnVar;
                if (zzyzVar.mo8683v() == Integer.MAX_VALUE) {
                    return;
                }
                int i2 = ((zzyz) zzabnVar).f17131b;
                if (i2 != 11) {
                    if ((i2 & 7) == 2) {
                        Object mo9630c = zzzlVar.mo9630c(zzzkVar, this.f16307a, i2 >>> 3);
                        if (mo9630c != null) {
                            zzzlVar.mo9633f(zzabnVar, mo9630c, zzzkVar, mo9629b);
                        } else {
                            m9580s = zzacfVar.m8757p(mo8744c, zzabnVar);
                        }
                    } else {
                        m9580s = zzyzVar.m9580s();
                    }
                    if (!m9580s) {
                        return;
                    }
                } else {
                    int i3 = 0;
                    Object obj2 = null;
                    zzyu zzyuVar = null;
                    while (zzyzVar.mo8683v() != Integer.MAX_VALUE) {
                        int i4 = ((zzyz) zzabnVar).f17131b;
                        if (i4 == 16) {
                            i3 = zzyzVar.m9555J();
                            obj2 = zzzlVar.mo9630c(zzzkVar, this.f16307a, i3);
                        } else if (i4 == 26) {
                            if (obj2 != null) {
                                zzzlVar.mo9633f(zzabnVar, obj2, zzzkVar, mo9629b);
                            } else {
                                zzyuVar = zzyzVar.mo8680d();
                            }
                        } else if (!zzyzVar.m9580s()) {
                            break;
                        }
                    }
                    if (((zzyz) zzabnVar).f17131b != 12) {
                        throw zzaaf.m8578a();
                    }
                    if (zzyuVar != null) {
                        if (obj2 != null) {
                            zzzlVar.mo9634g(zzyuVar, obj2, zzzkVar, mo9629b);
                        } else {
                            zzacfVar.mo8752k(mo8744c, i3, zzyuVar);
                        }
                    }
                }
            } finally {
                zzacfVar.mo8755n(obj, mo8744c);
            }
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: g */
    public final void mo8656g(Object obj, Object obj2) {
        zzacf zzacfVar = this.f16308b;
        Class cls = zzabq.f16323a;
        zzacfVar.mo8756o(obj, zzacfVar.mo8746e(zzacfVar.mo8745d(obj), zzacfVar.mo8745d(obj2)));
        if (this.f16309c) {
            this.f16310d.mo9628a(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: h */
    public final void mo8657h(Object obj, byte[] bArr, int i2, int i3, zzyh zzyhVar) throws IOException {
        zzzx zzzxVar = (zzzx) obj;
        if (zzzxVar.zzc == zzacg.f16345f) {
            zzzxVar.zzc = zzacg.m8760b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: i */
    public final boolean mo8658i(Object obj, Object obj2) {
        if (!this.f16308b.mo8745d(obj).equals(this.f16308b.mo8745d(obj2))) {
            return false;
        }
        if (!this.f16309c) {
            return true;
        }
        this.f16310d.mo9628a(obj);
        this.f16310d.mo9628a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzabo
    /* renamed from: j */
    public final Object mo8659j() {
        return this.f16307a.mo8620E().mo8617C();
    }
}

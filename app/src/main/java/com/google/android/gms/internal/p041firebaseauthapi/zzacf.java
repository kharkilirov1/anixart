package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
abstract class zzacf {
    /* renamed from: a */
    public abstract int mo8742a(Object obj);

    /* renamed from: b */
    public abstract int mo8743b(Object obj);

    /* renamed from: c */
    public abstract Object mo8744c(Object obj);

    /* renamed from: d */
    public abstract Object mo8745d(Object obj);

    /* renamed from: e */
    public abstract Object mo8746e(Object obj, Object obj2);

    /* renamed from: f */
    public abstract Object mo8747f();

    /* renamed from: g */
    public abstract Object mo8748g(Object obj);

    /* renamed from: h */
    public abstract void mo8749h(Object obj, int i2, int i3);

    /* renamed from: i */
    public abstract void mo8750i(Object obj, int i2, long j2);

    /* renamed from: j */
    public abstract void mo8751j(Object obj, int i2, Object obj2);

    /* renamed from: k */
    public abstract void mo8752k(Object obj, int i2, zzyu zzyuVar);

    /* renamed from: l */
    public abstract void mo8753l(Object obj, int i2, long j2);

    /* renamed from: m */
    public abstract void mo8754m(Object obj);

    /* renamed from: n */
    public abstract void mo8755n(Object obj, Object obj2);

    /* renamed from: o */
    public abstract void mo8756o(Object obj, Object obj2);

    /* renamed from: p */
    public final boolean m8757p(Object obj, zzabn zzabnVar) throws IOException {
        int mo8684x = zzabnVar.mo8684x();
        int i2 = mo8684x >>> 3;
        int i3 = mo8684x & 7;
        if (i3 == 0) {
            mo8753l(obj, i2, zzabnVar.mo8681e());
            return true;
        }
        if (i3 == 1) {
            mo8750i(obj, i2, zzabnVar.mo8679c());
            return true;
        }
        if (i3 == 2) {
            mo8752k(obj, i2, zzabnVar.mo8680d());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                mo8749h(obj, i2, zzabnVar.mo8682l());
                return true;
            }
            int i4 = zzaaf.f16261b;
            throw new zzaae();
        }
        Object mo8747f = mo8747f();
        int i5 = 4 | (i2 << 3);
        while (zzabnVar.mo8683v() != Integer.MAX_VALUE && m8757p(mo8747f, zzabnVar)) {
        }
        if (i5 != zzabnVar.mo8684x()) {
            throw zzaaf.m8578a();
        }
        mo8748g(mo8747f);
        mo8751j(obj, i2, mo8747f);
        return true;
    }

    /* renamed from: q */
    public abstract boolean mo8758q(zzabn zzabnVar);

    /* renamed from: r */
    public abstract void mo8759r(Object obj, zzzg zzzgVar) throws IOException;
}

package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzis extends zzzx implements zzabd {
    private static final zzis zzb;
    private zziv zze;

    static {
        zzis zzisVar = new zzis();
        zzb = zzisVar;
        zzzx.m9650h(zzis.class, zzisVar);
    }

    /* renamed from: q */
    public static zzir m9100q() {
        return (zzir) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzis m9102s(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzis) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: u */
    public static /* synthetic */ void m9103u(zzis zzisVar, zziv zzivVar) {
        Objects.requireNonNull(zzivVar);
        zzisVar.zze = zzivVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzis();
        }
        zziq zziqVar = null;
        if (i3 == 4) {
            return new zzir(zziqVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zziv m9104t() {
        zziv zzivVar = this.zze;
        return zzivVar == null ? zziv.m9107t() : zzivVar;
    }
}

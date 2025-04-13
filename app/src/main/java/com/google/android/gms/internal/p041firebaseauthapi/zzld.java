package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzld extends zzzx implements zzabd {
    private static final zzld zzb;
    private int zze;
    private zzaac zzf = zzabl.f16316e;

    static {
        zzld zzldVar = new zzld();
        zzb = zzldVar;
        zzzx.m9650h(zzld.class, zzldVar);
    }

    /* renamed from: q */
    public static zzla m9265q() {
        return (zzla) zzb.m9657m();
    }

    /* renamed from: u */
    public static void m9268u(zzld zzldVar, zzlc zzlcVar) {
        Objects.requireNonNull(zzlcVar);
        zzaac zzaacVar = zzldVar.zzf;
        if (!zzaacVar.mo8573v()) {
            int size = zzaacVar.size();
            zzldVar.zzf = zzaacVar.mo8572c(size == 0 ? 10 : size + size);
        }
        zzldVar.zzf.add(zzlcVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzlc.class});
        }
        if (i3 == 3) {
            return new zzld();
        }
        zzkz zzkzVar = null;
        if (i3 == 4) {
            return new zzla(zzkzVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: r */
    public final zzlc m9269r() {
        return (zzlc) this.zzf.get(0);
    }
}

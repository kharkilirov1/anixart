package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzik extends zzzx implements zzabd {
    private static final zzik zzb;

    static {
        zzik zzikVar = new zzik();
        zzb = zzikVar;
        zzzx.m9650h(zzik.class, zzikVar);
    }

    /* renamed from: r */
    public static zzik m9093r() {
        return zzb;
    }

    /* renamed from: s */
    public static zzik m9094s(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzik) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        zzii zziiVar = null;
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0000", null);
        }
        if (i3 == 3) {
            return new zzik();
        }
        if (i3 == 4) {
            return new zzij(zziiVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}

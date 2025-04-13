package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzma extends zzzx implements zzabd {
    private static final zzma zzb;
    private int zze;

    static {
        zzma zzmaVar = new zzma();
        zzb = zzmaVar;
        zzzx.m9650h(zzma.class, zzmaVar);
    }

    /* renamed from: r */
    public static zzma m9305r() {
        return zzb;
    }

    /* renamed from: s */
    public static zzma m9306s(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzma) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzma();
        }
        zzly zzlyVar = null;
        if (i3 == 4) {
            return new zzlz(zzlyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}

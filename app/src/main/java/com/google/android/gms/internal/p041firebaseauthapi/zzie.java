package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzie extends zzzx implements zzabd {
    private static final zzie zzb;
    private int zze;
    private int zzf;

    static {
        zzie zzieVar = new zzie();
        zzb = zzieVar;
        zzzx.m9650h(zzie.class, zzieVar);
    }

    /* renamed from: r */
    public static zzid m9080r() {
        return (zzid) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzie m9082t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzie) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzie();
        }
        zzic zzicVar = null;
        if (i3 == 4) {
            return new zzid(zzicVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9084q() {
        return this.zze;
    }
}

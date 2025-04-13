package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhy extends zzzx implements zzabd {
    private static final zzhy zzb;
    private int zze;
    private int zzf;

    static {
        zzhy zzhyVar = new zzhy();
        zzb = zzhyVar;
        zzzx.m9650h(zzhy.class, zzhyVar);
    }

    /* renamed from: r */
    public static zzhx m9068r() {
        return (zzhx) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhy m9070t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzhy) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i3 == 3) {
            return new zzhy();
        }
        zzhw zzhwVar = null;
        if (i3 == 4) {
            return new zzhx(zzhwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9072q() {
        return this.zze;
    }
}

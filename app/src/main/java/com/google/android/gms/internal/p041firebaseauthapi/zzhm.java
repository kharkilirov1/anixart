package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhm extends zzzx implements zzabd {
    private static final zzhm zzb;
    private int zze;

    static {
        zzhm zzhmVar = new zzhm();
        zzb = zzhmVar;
        zzzx.m9650h(zzhm.class, zzhmVar);
    }

    /* renamed from: r */
    public static zzhl m9044r() {
        return (zzhl) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhm m9046t() {
        return zzb;
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
            return new zzhm();
        }
        zzhk zzhkVar = null;
        if (i3 == 4) {
            return new zzhl(zzhkVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9048q() {
        return this.zze;
    }
}

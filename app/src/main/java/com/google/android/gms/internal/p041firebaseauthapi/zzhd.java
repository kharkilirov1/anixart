package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhd extends zzzx implements zzabd {
    private static final zzhd zzb;
    private int zze;

    static {
        zzhd zzhdVar = new zzhd();
        zzb = zzhdVar;
        zzzx.m9650h(zzhd.class, zzhdVar);
    }

    /* renamed from: r */
    public static zzhc m9023r() {
        return (zzhc) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhd m9025t() {
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
            return new zzhd();
        }
        zzhb zzhbVar = null;
        if (i3 == 4) {
            return new zzhc(zzhbVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9027q() {
        return this.zze;
    }
}

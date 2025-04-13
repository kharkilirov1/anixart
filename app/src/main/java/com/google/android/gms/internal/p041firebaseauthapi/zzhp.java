package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhp extends zzzx implements zzabd {
    private static final zzhp zzb;
    private int zze;
    private zzyu zzf = zzyu.f17120c;

    static {
        zzhp zzhpVar = new zzhp();
        zzb = zzhpVar;
        zzzx.m9650h(zzhp.class, zzhpVar);
    }

    /* renamed from: r */
    public static zzho m9049r() {
        return (zzho) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhp m9051t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzhp) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhp();
        }
        zzhn zzhnVar = null;
        if (i3 == 4) {
            return new zzho(zzhnVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9054q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzyu m9055u() {
        return this.zzf;
    }
}

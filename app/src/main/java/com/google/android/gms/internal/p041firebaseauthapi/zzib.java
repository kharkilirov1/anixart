package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzib extends zzzx implements zzabd {
    private static final zzib zzb;
    private int zze;
    private zzyu zzf = zzyu.f17120c;

    static {
        zzib zzibVar = new zzib();
        zzb = zzibVar;
        zzzx.m9650h(zzib.class, zzibVar);
    }

    /* renamed from: r */
    public static zzia m9073r() {
        return (zzia) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzib m9075t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzib) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzib();
        }
        zzhz zzhzVar = null;
        if (i3 == 4) {
            return new zzia(zzhzVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9078q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzyu m9079u() {
        return this.zzf;
    }
}

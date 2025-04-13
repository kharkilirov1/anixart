package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhv extends zzzx implements zzabd {
    private static final zzhv zzb;
    private int zze;
    private zzyu zzf = zzyu.f17120c;

    static {
        zzhv zzhvVar = new zzhv();
        zzb = zzhvVar;
        zzzx.m9650h(zzhv.class, zzhvVar);
    }

    /* renamed from: r */
    public static zzhu m9061r() {
        return (zzhu) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhv m9063t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzhv) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
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
            return new zzhv();
        }
        zzht zzhtVar = null;
        if (i3 == 4) {
            return new zzhu(zzhtVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9066q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzyu m9067u() {
        return this.zzf;
    }
}

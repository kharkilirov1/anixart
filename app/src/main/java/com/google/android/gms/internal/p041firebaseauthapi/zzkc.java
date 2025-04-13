package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzkc extends zzzx implements zzabd {
    private static final zzkc zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzkc zzkcVar = new zzkc();
        zzb = zzkcVar;
        zzzx.m9650h(zzkc.class, zzkcVar);
    }

    /* renamed from: q */
    public static zzkb m9186q() {
        return (zzkb) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzkc m9188s() {
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
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzkc();
        }
        zzka zzkaVar = null;
        if (i3 == 4) {
            return new zzkb(zzkaVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final int m9192t() {
        int i2 = this.zzg;
        int i3 = 3;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 != 1) {
            i3 = i2 != 2 ? i2 != 3 ? 0 : 5 : 4;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: u */
    public final int m9193u() {
        int i2 = this.zzf;
        int i3 = i2 != 0 ? i2 != 1 ? 0 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: v */
    public final int m9194v() {
        int i2 = this.zze;
        int i3 = i2 != 0 ? i2 != 1 ? 0 : 3 : 2;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}

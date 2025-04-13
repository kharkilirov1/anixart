package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzkl extends zzzx implements zzabd {
    private static final zzkl zzb;
    private String zze = "";
    private zzyu zzf = zzyu.f17120c;
    private int zzg;

    static {
        zzkl zzklVar = new zzkl();
        zzb = zzklVar;
        zzzx.m9650h(zzkl.class, zzklVar);
    }

    /* renamed from: q */
    public static zzkk m9216q() {
        return (zzkk) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzkl m9218s() {
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
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzkl();
        }
        zzkj zzkjVar = null;
        if (i3 == 4) {
            return new zzkk(zzkjVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzyu m9222t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final String m9223u() {
        return this.zze;
    }

    /* renamed from: x */
    public final int m9224x() {
        int i2 = this.zzg;
        int i3 = 4;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 1) {
            i3 = 3;
        } else if (i2 != 2) {
            i3 = i2 != 3 ? i2 != 4 ? 0 : 6 : 5;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }
}

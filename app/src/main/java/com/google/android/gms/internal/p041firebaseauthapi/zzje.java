package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzje extends zzzx implements zzabd {
    private static final zzje zzb;
    private int zze;
    private int zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zzje zzjeVar = new zzje();
        zzb = zzjeVar;
        zzzx.m9650h(zzje.class, zzjeVar);
    }

    /* renamed from: q */
    public static zzjd m9135q() {
        return (zzjd) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzje m9137s() {
        return zzb;
    }

    /* renamed from: x */
    public static void m9139x(zzje zzjeVar) {
        zzjeVar.zze = 2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzje();
        }
        zzjc zzjcVar = null;
        if (i3 == 4) {
            return new zzjd(zzjcVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzyu m9141t() {
        return this.zzg;
    }

    /* renamed from: v */
    public final int m9142v() {
        int i2 = this.zze;
        int i3 = 5;
        if (i2 == 0) {
            i3 = 2;
        } else if (i2 == 2) {
            i3 = 4;
        } else if (i2 != 3) {
            i3 = i2 != 4 ? i2 != 5 ? 0 : 7 : 6;
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    /* renamed from: w */
    public final int m9143w() {
        int m9151b = zzjl.m9151b(this.zzf);
        if (m9151b == 0) {
            return 1;
        }
        return m9151b;
    }
}

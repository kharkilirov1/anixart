package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzkx extends zzzx implements zzabd {
    private static final zzkx zzb;
    private zzkl zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzkx zzkxVar = new zzkx();
        zzb = zzkxVar;
        zzzx.m9650h(zzkx.class, zzkxVar);
    }

    /* renamed from: A */
    public static void m9238A(zzkx zzkxVar) {
        zzkxVar.zzf = 1;
    }

    /* renamed from: s */
    public static zzkw m9239s() {
        return (zzkw) zzb.m9657m();
    }

    /* renamed from: u */
    public static /* synthetic */ void m9241u(zzkx zzkxVar, zzkl zzklVar) {
        Objects.requireNonNull(zzklVar);
        zzkxVar.zze = zzklVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzkx();
        }
        zzku zzkuVar = null;
        if (i3 == 4) {
            return new zzkw(zzkuVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9244q() {
        return this.zzg;
    }

    /* renamed from: r */
    public final zzkl m9245r() {
        zzkl zzklVar = this.zze;
        return zzklVar == null ? zzkl.m9218s() : zzklVar;
    }

    /* renamed from: w */
    public final boolean m9246w() {
        return this.zze != null;
    }

    /* renamed from: x */
    public final int m9247x() {
        int i2 = this.zzf;
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

    /* renamed from: y */
    public final int m9248y() {
        int m9295b = zzlr.m9295b(this.zzh);
        if (m9295b == 0) {
            return 1;
        }
        return m9295b;
    }
}

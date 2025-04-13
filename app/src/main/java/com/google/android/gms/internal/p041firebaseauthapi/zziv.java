package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zziv extends zzzx implements zzabd {
    private static final zziv zzb;
    private zzje zze;
    private zzip zzf;
    private int zzg;

    static {
        zziv zzivVar = new zziv();
        zzb = zzivVar;
        zzzx.m9650h(zziv.class, zzivVar);
    }

    /* renamed from: r */
    public static zziu m9105r() {
        return (zziu) zzb.m9657m();
    }

    /* renamed from: t */
    public static zziv m9107t() {
        return zzb;
    }

    /* renamed from: v */
    public static /* synthetic */ void m9108v(zziv zzivVar, zzje zzjeVar) {
        Objects.requireNonNull(zzjeVar);
        zzivVar.zze = zzjeVar;
    }

    /* renamed from: w */
    public static /* synthetic */ void m9109w(zziv zzivVar, zzip zzipVar) {
        Objects.requireNonNull(zzipVar);
        zzivVar.zzf = zzipVar;
    }

    /* renamed from: y */
    public static void m9110y(zziv zzivVar, int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzivVar.zzg = i2 - 2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zziv();
        }
        zzit zzitVar = null;
        if (i3 == 4) {
            return new zziu(zzitVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final zzip m9111q() {
        zzip zzipVar = this.zzf;
        return zzipVar == null ? zzip.m9097s() : zzipVar;
    }

    /* renamed from: u */
    public final zzje m9112u() {
        zzje zzjeVar = this.zze;
        return zzjeVar == null ? zzje.m9137s() : zzjeVar;
    }

    /* renamed from: x */
    public final int m9113x() {
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
}

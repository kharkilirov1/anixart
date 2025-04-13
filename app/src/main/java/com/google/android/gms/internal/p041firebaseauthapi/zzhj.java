package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhj extends zzzx implements zzabd {
    private static final zzhj zzb;
    private zzhm zze;
    private int zzf;

    static {
        zzhj zzhjVar = new zzhj();
        zzb = zzhjVar;
        zzzx.m9650h(zzhj.class, zzhjVar);
    }

    /* renamed from: r */
    public static zzhi m9037r() {
        return (zzhi) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhj m9039t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzhj) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: v */
    public static /* synthetic */ void m9040v(zzhj zzhjVar, zzhm zzhmVar) {
        Objects.requireNonNull(zzhmVar);
        zzhjVar.zze = zzhmVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhj();
        }
        zzhh zzhhVar = null;
        if (i3 == 4) {
            return new zzhi(zzhhVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9042q() {
        return this.zzf;
    }

    /* renamed from: u */
    public final zzhm m9043u() {
        zzhm zzhmVar = this.zze;
        return zzhmVar == null ? zzhm.m9046t() : zzhmVar;
    }
}

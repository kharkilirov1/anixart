package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzgx extends zzzx implements zzabd {
    private static final zzgx zzb;
    private int zze;
    private zzhd zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zzgx zzgxVar = new zzgx();
        zzb = zzgxVar;
        zzzx.m9650h(zzgx.class, zzgxVar);
    }

    /* renamed from: r */
    public static zzgw m9005r() {
        return (zzgw) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzgx m9007t() {
        return zzb;
    }

    /* renamed from: u */
    public static zzgx m9008u(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzgx) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: y */
    public static /* synthetic */ void m9010y(zzgx zzgxVar, zzhd zzhdVar) {
        Objects.requireNonNull(zzhdVar);
        zzgxVar.zzf = zzhdVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzgx();
        }
        zzgv zzgvVar = null;
        if (i3 == 4) {
            return new zzgw(zzgvVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9012q() {
        return this.zze;
    }

    /* renamed from: v */
    public final zzhd m9013v() {
        zzhd zzhdVar = this.zzf;
        return zzhdVar == null ? zzhd.m9025t() : zzhdVar;
    }

    /* renamed from: w */
    public final zzyu m9014w() {
        return this.zzg;
    }
}

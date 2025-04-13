package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzha extends zzzx implements zzabd {
    private static final zzha zzb;
    private zzhd zze;
    private int zzf;

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzzx.m9650h(zzha.class, zzhaVar);
    }

    /* renamed from: r */
    public static zzgz m9015r() {
        return (zzgz) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzha m9017t() {
        return zzb;
    }

    /* renamed from: u */
    public static zzha m9018u(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzha) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: w */
    public static /* synthetic */ void m9019w(zzha zzhaVar, zzhd zzhdVar) {
        Objects.requireNonNull(zzhdVar);
        zzhaVar.zze = zzhdVar;
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
            return new zzha();
        }
        zzgy zzgyVar = null;
        if (i3 == 4) {
            return new zzgz(zzgyVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9021q() {
        return this.zzf;
    }

    /* renamed from: v */
    public final zzhd m9022v() {
        zzhd zzhdVar = this.zze;
        return zzhdVar == null ? zzhd.m9025t() : zzhdVar;
    }
}

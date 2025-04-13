package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhg extends zzzx implements zzabd {
    private static final zzhg zzb;
    private int zze;
    private zzhm zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zzhg zzhgVar = new zzhg();
        zzb = zzhgVar;
        zzzx.m9650h(zzhg.class, zzhgVar);
    }

    /* renamed from: r */
    public static zzhf m9028r() {
        return (zzhf) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhg m9030t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzhg) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: x */
    public static /* synthetic */ void m9032x(zzhg zzhgVar, zzhm zzhmVar) {
        Objects.requireNonNull(zzhmVar);
        zzhgVar.zzf = zzhmVar;
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
            return new zzhg();
        }
        zzhe zzheVar = null;
        if (i3 == 4) {
            return new zzhf(zzheVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9034q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzhm m9035u() {
        zzhm zzhmVar = this.zzf;
        return zzhmVar == null ? zzhm.m9046t() : zzhmVar;
    }

    /* renamed from: v */
    public final zzyu m9036v() {
        return this.zzg;
    }
}

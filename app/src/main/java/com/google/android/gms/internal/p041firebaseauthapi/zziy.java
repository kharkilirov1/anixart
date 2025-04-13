package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zziy extends zzzx implements zzabd {
    private static final zziy zzb;
    private int zze;
    private zzjb zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zziy zziyVar = new zziy();
        zzb = zziyVar;
        zzzx.m9650h(zziy.class, zziyVar);
    }

    /* renamed from: r */
    public static zzix m9114r() {
        return (zzix) zzb.m9657m();
    }

    /* renamed from: t */
    public static zziy m9116t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zziy) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: x */
    public static /* synthetic */ void m9118x(zziy zziyVar, zzjb zzjbVar) {
        Objects.requireNonNull(zzjbVar);
        zziyVar.zzf = zzjbVar;
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
            return new zziy();
        }
        zziw zziwVar = null;
        if (i3 == 4) {
            return new zzix(zziwVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9120q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzjb m9121u() {
        zzjb zzjbVar = this.zzf;
        return zzjbVar == null ? zzjb.m9127u() : zzjbVar;
    }

    /* renamed from: v */
    public final zzyu m9122v() {
        return this.zzg;
    }
}

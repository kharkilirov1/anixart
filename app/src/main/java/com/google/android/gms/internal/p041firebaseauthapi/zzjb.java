package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzjb extends zzzx implements zzabd {
    private static final zzjb zzb;
    private int zze;
    private zziv zzf;
    private zzyu zzg;
    private zzyu zzh;

    static {
        zzjb zzjbVar = new zzjb();
        zzb = zzjbVar;
        zzzx.m9650h(zzjb.class, zzjbVar);
    }

    public zzjb() {
        zzyu zzyuVar = zzyu.f17120c;
        this.zzg = zzyuVar;
        this.zzh = zzyuVar;
    }

    /* renamed from: s */
    public static zzja m9125s() {
        return (zzja) zzb.m9657m();
    }

    /* renamed from: u */
    public static zzjb m9127u() {
        return zzb;
    }

    /* renamed from: v */
    public static zzjb m9128v(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzjb) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: z */
    public static /* synthetic */ void m9130z(zzjb zzjbVar, zziv zzivVar) {
        Objects.requireNonNull(zzivVar);
        zzjbVar.zzf = zzivVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzjb();
        }
        zziz zzizVar = null;
        if (i3 == 4) {
            return new zzja(zzizVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9131q() {
        return this.zze;
    }

    /* renamed from: r */
    public final zziv m9132r() {
        zziv zzivVar = this.zzf;
        return zzivVar == null ? zziv.m9107t() : zzivVar;
    }

    /* renamed from: w */
    public final zzyu m9133w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final zzyu m9134x() {
        return this.zzh;
    }
}

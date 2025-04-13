package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzjo extends zzzx implements zzabd {
    private static final zzjo zzb;
    private int zze;
    private zzju zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zzjo zzjoVar = new zzjo();
        zzb = zzjoVar;
        zzzx.m9650h(zzjo.class, zzjoVar);
    }

    /* renamed from: r */
    public static zzjn m9152r() {
        return (zzjn) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzjo m9154t() {
        return zzb;
    }

    /* renamed from: u */
    public static zzjo m9155u(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzjo) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: y */
    public static /* synthetic */ void m9157y(zzjo zzjoVar, zzju zzjuVar) {
        Objects.requireNonNull(zzjuVar);
        zzjoVar.zzf = zzjuVar;
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
            return new zzjo();
        }
        zzjm zzjmVar = null;
        if (i3 == 4) {
            return new zzjn(zzjmVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9159q() {
        return this.zze;
    }

    /* renamed from: v */
    public final zzju m9160v() {
        zzju zzjuVar = this.zzf;
        return zzjuVar == null ? zzju.m9176t() : zzjuVar;
    }

    /* renamed from: w */
    public final zzyu m9161w() {
        return this.zzg;
    }
}

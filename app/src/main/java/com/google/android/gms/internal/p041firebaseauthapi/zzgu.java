package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzgu extends zzzx implements zzabd {
    private static final zzgu zzb;
    private zzha zze;
    private zzjr zzf;

    static {
        zzgu zzguVar = new zzgu();
        zzb = zzguVar;
        zzzx.m9650h(zzgu.class, zzguVar);
    }

    /* renamed from: q */
    public static zzgt m8998q() {
        return (zzgt) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzgu m9000s(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzgu) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: v */
    public static /* synthetic */ void m9001v(zzgu zzguVar, zzha zzhaVar) {
        Objects.requireNonNull(zzhaVar);
        zzguVar.zze = zzhaVar;
    }

    /* renamed from: w */
    public static /* synthetic */ void m9002w(zzgu zzguVar, zzjr zzjrVar) {
        Objects.requireNonNull(zzjrVar);
        zzguVar.zzf = zzjrVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzgu();
        }
        zzgs zzgsVar = null;
        if (i3 == 4) {
            return new zzgt(zzgsVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzha m9003t() {
        zzha zzhaVar = this.zze;
        return zzhaVar == null ? zzha.m9017t() : zzhaVar;
    }

    /* renamed from: u */
    public final zzjr m9004u() {
        zzjr zzjrVar = this.zzf;
        return zzjrVar == null ? zzjr.m9166t() : zzjrVar;
    }
}

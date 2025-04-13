package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzjr extends zzzx implements zzabd {
    private static final zzjr zzb;
    private zzju zze;
    private int zzf;
    private int zzg;

    static {
        zzjr zzjrVar = new zzjr();
        zzb = zzjrVar;
        zzzx.m9650h(zzjr.class, zzjrVar);
    }

    /* renamed from: r */
    public static zzjq m9164r() {
        return (zzjq) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzjr m9166t() {
        return zzb;
    }

    /* renamed from: u */
    public static zzjr m9167u(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzjr) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: w */
    public static /* synthetic */ void m9168w(zzjr zzjrVar, zzju zzjuVar) {
        Objects.requireNonNull(zzjuVar);
        zzjrVar.zze = zzjuVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzjr();
        }
        zzjp zzjpVar = null;
        if (i3 == 4) {
            return new zzjq(zzjpVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9170q() {
        return this.zzf;
    }

    /* renamed from: v */
    public final zzju m9171v() {
        zzju zzjuVar = this.zze;
        return zzjuVar == null ? zzju.m9176t() : zzjuVar;
    }
}

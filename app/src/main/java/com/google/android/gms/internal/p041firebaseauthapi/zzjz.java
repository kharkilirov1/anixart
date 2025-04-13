package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzjz extends zzzx implements zzabd {
    private static final zzjz zzb;
    private zzkc zze;

    static {
        zzjz zzjzVar = new zzjz();
        zzb = zzjzVar;
        zzzx.m9650h(zzjz.class, zzjzVar);
    }

    /* renamed from: q */
    public static zzjy m9181q() {
        return (zzjy) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzjz m9183s(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzjz) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: u */
    public static /* synthetic */ void m9184u(zzjz zzjzVar, zzkc zzkcVar) {
        Objects.requireNonNull(zzkcVar);
        zzjzVar.zze = zzkcVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzjz();
        }
        zzjx zzjxVar = null;
        if (i3 == 4) {
            return new zzjy(zzjxVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzkc m9185t() {
        zzkc zzkcVar = this.zze;
        return zzkcVar == null ? zzkc.m9188s() : zzkcVar;
    }
}

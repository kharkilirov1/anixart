package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzgl extends zzzx implements zzabd {
    private static final zzgl zzb;
    private int zze;
    private zzgo zzf;

    static {
        zzgl zzglVar = new zzgl();
        zzb = zzglVar;
        zzzx.m9650h(zzgl.class, zzglVar);
    }

    /* renamed from: r */
    public static zzgk m8976r() {
        return (zzgk) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzgl m8978t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzgl) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: w */
    public static /* synthetic */ void m8980w(zzgl zzglVar, zzgo zzgoVar) {
        Objects.requireNonNull(zzgoVar);
        zzglVar.zzf = zzgoVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzgl();
        }
        zzgj zzgjVar = null;
        if (i3 == 4) {
            return new zzgk(zzgjVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m8981q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzgo m8982u() {
        zzgo zzgoVar = this.zzf;
        return zzgoVar == null ? zzgo.m8986t() : zzgoVar;
    }
}

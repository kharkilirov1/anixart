package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzgo extends zzzx implements zzabd {
    private static final zzgo zzb;
    private int zze;

    static {
        zzgo zzgoVar = new zzgo();
        zzb = zzgoVar;
        zzzx.m9650h(zzgo.class, zzgoVar);
    }

    /* renamed from: r */
    public static zzgn m8984r() {
        return (zzgn) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzgo m8986t() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzgo();
        }
        zzgm zzgmVar = null;
        if (i3 == 4) {
            return new zzgn(zzgmVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m8988q() {
        return this.zze;
    }
}

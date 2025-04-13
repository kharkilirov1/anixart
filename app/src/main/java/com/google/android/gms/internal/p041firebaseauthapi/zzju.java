package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzju extends zzzx implements zzabd {
    private static final zzju zzb;
    private int zze;
    private int zzf;

    static {
        zzju zzjuVar = new zzju();
        zzb = zzjuVar;
        zzzx.m9650h(zzju.class, zzjuVar);
    }

    /* renamed from: r */
    public static zzjt m9174r() {
        return (zzjt) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzju m9176t() {
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
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzju();
        }
        zzjs zzjsVar = null;
        if (i3 == 4) {
            return new zzjt(zzjsVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9179q() {
        return this.zzf;
    }

    /* renamed from: v */
    public final int m9180v() {
        int m9151b = zzjl.m9151b(this.zze);
        if (m9151b == 0) {
            return 1;
        }
        return m9151b;
    }
}

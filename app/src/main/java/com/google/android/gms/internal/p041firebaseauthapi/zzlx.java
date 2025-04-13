package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzlx extends zzzx implements zzabd {
    private static final zzlx zzb;
    private int zze;
    private zzyu zzf = zzyu.f17120c;

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzzx.m9650h(zzlx.class, zzlxVar);
    }

    /* renamed from: r */
    public static zzlw m9297r() {
        return (zzlw) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzlx m9299t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzlx) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzlx();
        }
        zzlv zzlvVar = null;
        if (i3 == 4) {
            return new zzlw(zzlvVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9302q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzyu m9303u() {
        return this.zzf;
    }
}

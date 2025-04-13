package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzih extends zzzx implements zzabd {
    private static final zzih zzb;
    private int zze;
    private zzyu zzf = zzyu.f17120c;

    static {
        zzih zzihVar = new zzih();
        zzb = zzihVar;
        zzzx.m9650h(zzih.class, zzihVar);
    }

    /* renamed from: r */
    public static zzig m9085r() {
        return (zzig) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzih m9087t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzih) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzih();
        }
        zzif zzifVar = null;
        if (i3 == 4) {
            return new zzig(zzifVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9090q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzyu m9091u() {
        return this.zzf;
    }
}

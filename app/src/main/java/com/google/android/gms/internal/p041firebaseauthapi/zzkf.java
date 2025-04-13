package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzkf extends zzzx implements zzabd {
    private static final zzkf zzb;
    private int zze;
    private zzki zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zzkf zzkfVar = new zzkf();
        zzb = zzkfVar;
        zzzx.m9650h(zzkf.class, zzkfVar);
    }

    /* renamed from: r */
    public static zzke m9195r() {
        return (zzke) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzkf m9197t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzkf) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: x */
    public static /* synthetic */ void m9199x(zzkf zzkfVar, zzki zzkiVar) {
        Objects.requireNonNull(zzkiVar);
        zzkfVar.zzf = zzkiVar;
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
            return new zzkf();
        }
        zzkd zzkdVar = null;
        if (i3 == 4) {
            return new zzke(zzkdVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9201q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzki m9202u() {
        zzki zzkiVar = this.zzf;
        return zzkiVar == null ? zzki.m9207u() : zzkiVar;
    }

    /* renamed from: v */
    public final zzyu m9203v() {
        return this.zzg;
    }

    /* renamed from: z */
    public final boolean m9204z() {
        return this.zzf != null;
    }
}

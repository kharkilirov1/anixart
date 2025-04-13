package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzki extends zzzx implements zzabd {
    private static final zzki zzb;
    private int zze;
    private zzkc zzf;
    private zzyu zzg = zzyu.f17120c;

    static {
        zzki zzkiVar = new zzki();
        zzb = zzkiVar;
        zzzx.m9650h(zzki.class, zzkiVar);
    }

    /* renamed from: s */
    public static zzkh m9205s() {
        return (zzkh) zzb.m9657m();
    }

    /* renamed from: u */
    public static zzki m9207u() {
        return zzb;
    }

    /* renamed from: v */
    public static zzki m9208v(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzki) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: y */
    public static /* synthetic */ void m9210y(zzki zzkiVar, zzkc zzkcVar) {
        Objects.requireNonNull(zzkcVar);
        zzkiVar.zzf = zzkcVar;
    }

    /* renamed from: A */
    public final boolean m9212A() {
        return this.zzf != null;
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
            return new zzki();
        }
        zzkg zzkgVar = null;
        if (i3 == 4) {
            return new zzkh(zzkgVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9213q() {
        return this.zze;
    }

    /* renamed from: r */
    public final zzkc m9214r() {
        zzkc zzkcVar = this.zzf;
        return zzkcVar == null ? zzkc.m9188s() : zzkcVar;
    }

    /* renamed from: w */
    public final zzyu m9215w() {
        return this.zzg;
    }
}

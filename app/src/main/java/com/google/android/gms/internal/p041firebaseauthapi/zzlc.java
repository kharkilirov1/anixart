package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzlc extends zzzx implements zzabd {
    private static final zzlc zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzlc zzlcVar = new zzlc();
        zzb = zzlcVar;
        zzzx.m9650h(zzlc.class, zzlcVar);
    }

    /* renamed from: r */
    public static zzlb m9258r() {
        return (zzlb) zzb.m9657m();
    }

    /* renamed from: t */
    public static /* synthetic */ void m9260t(zzlc zzlcVar, String str) {
        Objects.requireNonNull(str);
        zzlcVar.zze = str;
    }

    /* renamed from: w */
    public static void m9263w(zzlc zzlcVar, int i2) {
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzlcVar.zzf = i2 - 2;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzlc();
        }
        zzkz zzkzVar = null;
        if (i3 == 4) {
            return new zzlb(zzkzVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9264q() {
        return this.zzg;
    }
}

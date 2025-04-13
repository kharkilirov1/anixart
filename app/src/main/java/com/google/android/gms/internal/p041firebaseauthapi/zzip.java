package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzip extends zzzx implements zzabd {
    private static final zzip zzb;
    private zzkq zze;

    static {
        zzip zzipVar = new zzip();
        zzb = zzipVar;
        zzzx.m9650h(zzip.class, zzipVar);
    }

    /* renamed from: q */
    public static zzio m9095q() {
        return (zzio) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzip m9097s() {
        return zzb;
    }

    /* renamed from: u */
    public static /* synthetic */ void m9098u(zzip zzipVar, zzkq zzkqVar) {
        Objects.requireNonNull(zzkqVar);
        zzipVar.zze = zzkqVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzip();
        }
        zzin zzinVar = null;
        if (i3 == 4) {
            return new zzio(zzinVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzkq m9099t() {
        zzkq zzkqVar = this.zze;
        return zzkqVar == null ? zzkq.m9230s() : zzkqVar;
    }
}

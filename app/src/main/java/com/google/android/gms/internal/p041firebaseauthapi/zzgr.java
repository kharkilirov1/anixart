package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzgr extends zzzx implements zzabd {
    private static final zzgr zzb;
    private int zze;
    private zzgx zzf;
    private zzjo zzg;

    static {
        zzgr zzgrVar = new zzgr();
        zzb = zzgrVar;
        zzzx.m9650h(zzgr.class, zzgrVar);
    }

    /* renamed from: r */
    public static zzgq m8989r() {
        return (zzgq) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzgr m8991t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzgr) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: x */
    public static /* synthetic */ void m8993x(zzgr zzgrVar, zzgx zzgxVar) {
        Objects.requireNonNull(zzgxVar);
        zzgrVar.zzf = zzgxVar;
    }

    /* renamed from: y */
    public static /* synthetic */ void m8994y(zzgr zzgrVar, zzjo zzjoVar) {
        Objects.requireNonNull(zzjoVar);
        zzgrVar.zzg = zzjoVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzgr();
        }
        zzgp zzgpVar = null;
        if (i3 == 4) {
            return new zzgq(zzgpVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m8995q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzgx m8996u() {
        zzgx zzgxVar = this.zzf;
        return zzgxVar == null ? zzgx.m9007t() : zzgxVar;
    }

    /* renamed from: v */
    public final zzjo m8997v() {
        zzjo zzjoVar = this.zzg;
        return zzjoVar == null ? zzjo.m9154t() : zzjoVar;
    }
}

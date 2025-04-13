package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzgi extends zzzx implements zzabd {
    private static final zzgi zzb;
    private int zze;
    private zzyu zzf = zzyu.f17120c;
    private zzgo zzg;

    static {
        zzgi zzgiVar = new zzgi();
        zzb = zzgiVar;
        zzzx.m9650h(zzgi.class, zzgiVar);
    }

    /* renamed from: r */
    public static zzgh m8964r() {
        return (zzgh) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzgi m8966t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzgi) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: y */
    public static /* synthetic */ void m8969y(zzgi zzgiVar, zzgo zzgoVar) {
        Objects.requireNonNull(zzgoVar);
        zzgiVar.zzg = zzgoVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzgi();
        }
        zzgg zzggVar = null;
        if (i3 == 4) {
            return new zzgh(zzggVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m8971q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzgo m8972u() {
        zzgo zzgoVar = this.zzg;
        return zzgoVar == null ? zzgo.m8986t() : zzgoVar;
    }

    /* renamed from: v */
    public final zzyu m8973v() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzky extends zzzx implements zzabd {
    private static final zzky zzb;
    private int zze;
    private zzaac zzf = zzabl.f16316e;

    static {
        zzky zzkyVar = new zzky();
        zzb = zzkyVar;
        zzzx.m9650h(zzky.class, zzkyVar);
    }

    /* renamed from: s */
    public static zzkv m9249s() {
        return (zzkv) zzb.m9657m();
    }

    /* renamed from: v */
    public static zzky m9251v(byte[] bArr, zzzk zzzkVar) throws zzaaf {
        return (zzky) zzzx.m9654p(zzb, bArr, zzzkVar);
    }

    /* renamed from: y */
    public static void m9253y(zzky zzkyVar, zzkx zzkxVar) {
        Objects.requireNonNull(zzkxVar);
        zzaac zzaacVar = zzkyVar.zzf;
        if (!zzaacVar.mo8573v()) {
            int size = zzaacVar.size();
            zzkyVar.zzf = zzaacVar.mo8572c(size == 0 ? 10 : size + size);
        }
        zzkyVar.zzf.add(zzkxVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzkx.class});
        }
        if (i3 == 3) {
            return new zzky();
        }
        zzku zzkuVar = null;
        if (i3 == 4) {
            return new zzkv(zzkuVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9254q() {
        return this.zzf.size();
    }

    /* renamed from: r */
    public final int m9255r() {
        return this.zze;
    }

    /* renamed from: t */
    public final zzkx m9256t(int i2) {
        return (zzkx) this.zzf.get(i2);
    }

    /* renamed from: w */
    public final List m9257w() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzjj extends zzzx implements zzabd {
    private static final zzjj zzb;
    private zzyu zze = zzyu.f17120c;
    private zzld zzf;

    static {
        zzjj zzjjVar = new zzjj();
        zzb = zzjjVar;
        zzzx.m9650h(zzjj.class, zzjjVar);
    }

    /* renamed from: q */
    public static zzji m9144q() {
        return (zzji) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzjj m9146s(byte[] bArr, zzzk zzzkVar) throws zzaaf {
        return (zzjj) zzzx.m9654p(zzb, bArr, zzzkVar);
    }

    /* renamed from: v */
    public static /* synthetic */ void m9148v(zzjj zzjjVar, zzld zzldVar) {
        Objects.requireNonNull(zzldVar);
        zzjjVar.zzf = zzldVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzjj();
        }
        zzjh zzjhVar = null;
        if (i3 == 4) {
            return new zzji(zzjhVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzyu m9149t() {
        return this.zze;
    }
}

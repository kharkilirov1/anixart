package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@Deprecated
/* loaded from: classes.dex */
public final class zzkt extends zzzx implements zzabd {
    private static final zzkt zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        zzkt zzktVar = new zzkt();
        zzb = zzktVar;
        zzzx.m9650h(zzkt.class, zzktVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i3 == 3) {
            return new zzkt();
        }
        zzkr zzkrVar = null;
        if (i3 == 4) {
            return new zzks(zzkrVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}

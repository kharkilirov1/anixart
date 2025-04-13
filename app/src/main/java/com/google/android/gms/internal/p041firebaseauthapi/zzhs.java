package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzhs extends zzzx implements zzabd {
    private static final zzhs zzb;
    private int zze;
    private int zzf;

    static {
        zzhs zzhsVar = new zzhs();
        zzb = zzhsVar;
        zzzx.m9650h(zzhs.class, zzhsVar);
    }

    /* renamed from: r */
    public static zzhr m9056r() {
        return (zzhr) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzhs m9058t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzhs) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzhs();
        }
        zzhq zzhqVar = null;
        if (i3 == 4) {
            return new zzhr(zzhqVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9060q() {
        return this.zze;
    }
}

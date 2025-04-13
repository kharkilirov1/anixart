package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzlj extends zzzx implements zzabd {
    private static final zzlj zzb;
    private String zze = "";

    static {
        zzlj zzljVar = new zzlj();
        zzb = zzljVar;
        zzzx.m9650h(zzlj.class, zzljVar);
    }

    /* renamed from: r */
    public static zzlj m9278r() {
        return zzb;
    }

    /* renamed from: s */
    public static zzlj m9279s(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzlj) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i3 == 3) {
            return new zzlj();
        }
        zzlh zzlhVar = null;
        if (i3 == 4) {
            return new zzli(zzlhVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final String m9280t() {
        return this.zze;
    }
}

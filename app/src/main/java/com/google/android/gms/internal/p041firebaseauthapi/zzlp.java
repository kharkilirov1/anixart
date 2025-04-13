package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzlp extends zzzx implements zzabd {
    private static final zzlp zzb;
    private String zze = "";
    private zzkq zzf;

    static {
        zzlp zzlpVar = new zzlp();
        zzb = zzlpVar;
        zzzx.m9650h(zzlp.class, zzlpVar);
    }

    /* renamed from: s */
    public static zzlp m9289s() {
        return zzb;
    }

    /* renamed from: t */
    public static zzlp m9290t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzlp) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzlp();
        }
        zzln zzlnVar = null;
        if (i3 == 4) {
            return new zzlo(zzlnVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final zzkq m9291q() {
        zzkq zzkqVar = this.zzf;
        return zzkqVar == null ? zzkq.m9230s() : zzkqVar;
    }

    /* renamed from: u */
    public final String m9292u() {
        return this.zze;
    }

    /* renamed from: v */
    public final boolean m9293v() {
        return this.zzf != null;
    }
}

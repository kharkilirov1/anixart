package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzlm extends zzzx implements zzabd {
    private static final zzlm zzb;
    private int zze;
    private zzlp zzf;

    static {
        zzlm zzlmVar = new zzlm();
        zzb = zzlmVar;
        zzzx.m9650h(zzlm.class, zzlmVar);
    }

    /* renamed from: r */
    public static zzll m9281r() {
        return (zzll) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzlm m9283t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzlm) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: w */
    public static /* synthetic */ void m9285w(zzlm zzlmVar, zzlp zzlpVar) {
        Objects.requireNonNull(zzlpVar);
        zzlmVar.zzf = zzlpVar;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzlm();
        }
        zzlk zzlkVar = null;
        if (i3 == 4) {
            return new zzll(zzlkVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9286q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzlp m9287u() {
        zzlp zzlpVar = this.zzf;
        return zzlpVar == null ? zzlp.m9289s() : zzlpVar;
    }
}

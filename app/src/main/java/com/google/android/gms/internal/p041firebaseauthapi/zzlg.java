package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzlg extends zzzx implements zzabd {
    private static final zzlg zzb;
    private int zze;
    private zzlj zzf;

    static {
        zzlg zzlgVar = new zzlg();
        zzb = zzlgVar;
        zzzx.m9650h(zzlg.class, zzlgVar);
    }

    /* renamed from: r */
    public static zzlf m9270r() {
        return (zzlf) zzb.m9657m();
    }

    /* renamed from: t */
    public static zzlg m9272t(zzyu zzyuVar, zzzk zzzkVar) throws zzaaf {
        return (zzlg) zzzx.m9653o(zzb, zzyuVar, zzzkVar);
    }

    /* renamed from: w */
    public static /* synthetic */ void m9274w(zzlg zzlgVar, zzlj zzljVar) {
        Objects.requireNonNull(zzljVar);
        zzlgVar.zzf = zzljVar;
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
            return new zzlg();
        }
        zzle zzleVar = null;
        if (i3 == 4) {
            return new zzlf(zzleVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: q */
    public final int m9275q() {
        return this.zze;
    }

    /* renamed from: u */
    public final zzlj m9276u() {
        zzlj zzljVar = this.zzf;
        return zzljVar == null ? zzlj.m9278r() : zzljVar;
    }
}

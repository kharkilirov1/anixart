package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzkq extends zzzx implements zzabd {
    private static final zzkq zzb;
    private String zze = "";
    private zzyu zzf = zzyu.f17120c;
    private int zzg;

    static {
        zzkq zzkqVar = new zzkq();
        zzb = zzkqVar;
        zzzx.m9650h(zzkq.class, zzkqVar);
    }

    /* renamed from: q */
    public static zzkp m9228q() {
        return (zzkp) zzb.m9657m();
    }

    /* renamed from: s */
    public static zzkq m9230s() {
        return zzb;
    }

    /* renamed from: v */
    public static /* synthetic */ void m9231v(zzkq zzkqVar, String str) {
        Objects.requireNonNull(str);
        zzkqVar.zze = str;
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i3 == 3) {
            return new zzkq();
        }
        zzko zzkoVar = null;
        if (i3 == 4) {
            return new zzkp(zzkoVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    /* renamed from: t */
    public final zzyu m9234t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final String m9235u() {
        return this.zze;
    }

    /* renamed from: x */
    public final int m9236x() {
        int m9295b = zzlr.m9295b(this.zzg);
        if (m9295b == 0) {
            return 1;
        }
        return m9295b;
    }
}

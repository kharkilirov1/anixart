package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@Deprecated
/* loaded from: classes.dex */
public final class zzlu extends zzzx implements zzabd {

    /* renamed from: b */
    public static final /* synthetic */ int f16560b = 0;
    private static final zzlu zzb;
    private String zze = "";
    private zzaac zzf = zzabl.f16316e;

    static {
        zzlu zzluVar = new zzlu();
        zzb = zzluVar;
        zzzx.m9650h(zzlu.class, zzluVar);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzzx
    /* renamed from: l */
    public final Object mo8970l(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new zzabm(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzkt.class});
        }
        if (i3 == 3) {
            return new zzlu();
        }
        zzls zzlsVar = null;
        if (i3 == 4) {
            return new zzlt(zzlsVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}

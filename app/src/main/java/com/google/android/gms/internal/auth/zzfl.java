package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzfl {
    /* renamed from: a */
    public static final Object m8430a(Object obj, Object obj2) {
        zzfk zzfkVar = (zzfk) obj;
        zzfk zzfkVar2 = (zzfk) obj2;
        if (!zzfkVar2.isEmpty()) {
            if (!zzfkVar.f16119b) {
                zzfkVar = zzfkVar.isEmpty() ? new zzfk() : new zzfk(zzfkVar);
            }
            zzfkVar.m8429b();
            if (!zzfkVar2.isEmpty()) {
                zzfkVar.putAll(zzfkVar2);
            }
        }
        return zzfkVar;
    }
}

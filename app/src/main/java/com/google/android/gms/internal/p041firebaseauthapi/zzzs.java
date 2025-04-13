package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzzs implements zzaba {

    /* renamed from: a */
    public static final zzzs f17166a = new zzzs();

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaba
    /* renamed from: a */
    public final zzaaz mo8602a(Class cls) {
        if (!zzzx.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzaaz) zzzx.m9652n(cls.asSubclass(zzzx.class)).mo8970l(3, null, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzaba
    /* renamed from: b */
    public final boolean mo8603b(Class cls) {
        return zzzx.class.isAssignableFrom(cls);
    }
}

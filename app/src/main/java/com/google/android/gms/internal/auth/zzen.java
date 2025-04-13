package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzen implements zzfo {

    /* renamed from: a */
    public static final zzen f16101a = new zzen();

    @Override // com.google.android.gms.internal.auth.zzfo
    /* renamed from: a */
    public final zzfn mo8396a(Class<?> cls) {
        if (!zzeq.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzfn) zzeq.m8402a(cls.asSubclass(zzeq.class)).mo8405d(3, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    /* renamed from: b */
    public final boolean mo8397b(Class<?> cls) {
        return zzeq.class.isAssignableFrom(cls);
    }
}

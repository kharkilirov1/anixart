package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgd {

    /* renamed from: a */
    public static final Class<?> f16149a;

    /* renamed from: b */
    public static final zzgp<?, ?> f16150b;

    /* renamed from: c */
    public static final zzgp<?, ?> f16151c;

    /* renamed from: d */
    public static final zzgp<?, ?> f16152d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f16149a = cls;
        f16150b = m8473b(false);
        f16151c = m8473b(true);
        f16152d = new zzgr();
    }

    /* renamed from: a */
    public static boolean m8472a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static zzgp<?, ?> m8473b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgp) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }
}

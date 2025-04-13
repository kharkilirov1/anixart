package com.google.protobuf;

/* loaded from: classes2.dex */
final class Android {

    /* renamed from: a */
    public static final Class<?> f23956a;

    /* renamed from: b */
    public static final boolean f23957b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f23956a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f23957b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m12992a() {
        return (f23956a == null || f23957b) ? false : true;
    }
}

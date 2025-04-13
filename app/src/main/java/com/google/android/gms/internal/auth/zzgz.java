package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import p000a.C0000a;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgz {

    /* renamed from: a */
    public static final Unsafe f16179a;

    /* renamed from: b */
    public static final Class<?> f16180b;

    /* renamed from: c */
    public static final zzgy f16181c;

    /* renamed from: d */
    public static final boolean f16182d;

    /* renamed from: e */
    public static final boolean f16183e;

    /* renamed from: f */
    public static final boolean f16184f;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132  */
    static {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzgz.<clinit>():void");
    }

    /* renamed from: a */
    public static double m8508a(Object obj, long j2) {
        return f16181c.mo8493a(obj, j2);
    }

    /* renamed from: b */
    public static float m8509b(Object obj, long j2) {
        return f16181c.mo8494b(obj, j2);
    }

    /* renamed from: c */
    public static int m8510c(Object obj, long j2) {
        return f16181c.m8501i(obj, j2);
    }

    /* renamed from: d */
    public static long m8511d(Object obj, long j2) {
        return f16181c.m8502j(obj, j2);
    }

    /* renamed from: e */
    public static <T> T m8512e(Class<T> cls) {
        try {
            return (T) f16179a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: f */
    public static Object m8513f(Object obj, long j2) {
        return f16181c.m8504l(obj, j2);
    }

    /* renamed from: g */
    public static Unsafe m8514g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m8515h(Throwable th) {
        Logger logger = Logger.getLogger(zzgz.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", C0000a.m20q(new StringBuilder(valueOf.length() + 71), "platform method missing - proto runtime falling back to safer methods: ", valueOf));
    }

    /* renamed from: i */
    public static /* synthetic */ void m8516i(Object obj, long j2, boolean z) {
        long j3 = (-4) & j2;
        zzgy zzgyVar = f16181c;
        int m8501i = zzgyVar.m8501i(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zzgyVar.m8505m(obj, j3, ((z ? 1 : 0) << i2) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i2)) & m8501i));
    }

    /* renamed from: j */
    public static /* synthetic */ void m8517j(Object obj, long j2, boolean z) {
        long j3 = (-4) & j2;
        zzgy zzgyVar = f16181c;
        int i2 = (((int) j2) & 3) << 3;
        zzgyVar.m8505m(obj, j3, ((z ? 1 : 0) << i2) | ((~(KotlinVersion.MAX_COMPONENT_VALUE << i2)) & zzgyVar.m8501i(obj, j3)));
    }

    /* renamed from: k */
    public static void m8518k(Object obj, long j2, double d) {
        f16181c.mo8496d(obj, j2, d);
    }

    /* renamed from: l */
    public static void m8519l(Object obj, long j2, long j3) {
        f16181c.m8506n(obj, j2, j3);
    }

    /* renamed from: m */
    public static /* synthetic */ boolean m8520m(Object obj, long j2) {
        return ((byte) ((f16181c.m8501i(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m8521n(Object obj, long j2) {
        return ((byte) ((f16181c.m8501i(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: o */
    public static boolean m8522o(Class<?> cls) {
        int i2 = zzdo.f16072a;
        try {
            Class<?> cls2 = f16180b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m8523p(Object obj, long j2) {
        return f16181c.mo8498f(obj, j2);
    }

    /* renamed from: q */
    public static int m8524q(Class<?> cls) {
        if (f16183e) {
            return f16181c.m8499g(cls);
        }
        return -1;
    }

    /* renamed from: r */
    public static int m8525r(Class<?> cls) {
        if (f16183e) {
            return f16181c.m8500h(cls);
        }
        return -1;
    }

    /* renamed from: s */
    public static Field m8526s() {
        Field field;
        Field field2;
        int i2 = zzdo.f16072a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }
}

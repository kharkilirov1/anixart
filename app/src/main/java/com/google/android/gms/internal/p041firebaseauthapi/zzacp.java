package com.google.android.gms.internal.p041firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzacp {

    /* renamed from: a */
    public static final Unsafe f16355a;

    /* renamed from: b */
    public static final Class f16356b;

    /* renamed from: c */
    public static final zzaco f16357c;

    /* renamed from: d */
    public static final boolean f16358d;

    /* renamed from: e */
    public static final boolean f16359e;

    /* renamed from: f */
    public static final long f16360f;

    /* renamed from: g */
    public static final boolean f16361g;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    static {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzacp.<clinit>():void");
    }

    /* renamed from: a */
    public static int m8781a(Class cls) {
        if (f16359e) {
            return f16357c.m8773i(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m8782b() {
        Field field;
        Field field2;
        int i2 = zzyg.f17108a;
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

    /* renamed from: c */
    public static void m8783c(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        zzaco zzacoVar = f16357c;
        int m8774j = zzacoVar.m8774j(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zzacoVar.m8778n(obj, j3, ((255 & b) << i2) | (m8774j & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: d */
    public static void m8784d(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        zzaco zzacoVar = f16357c;
        int i2 = (((int) j2) & 3) << 3;
        zzacoVar.m8778n(obj, j3, ((255 & b) << i2) | (zzacoVar.m8774j(obj, j3) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: e */
    public static double m8785e(Object obj, long j2) {
        return f16357c.mo8765a(obj, j2);
    }

    /* renamed from: f */
    public static float m8786f(Object obj, long j2) {
        return f16357c.mo8766b(obj, j2);
    }

    /* renamed from: g */
    public static int m8787g(Object obj, long j2) {
        return f16357c.m8774j(obj, j2);
    }

    /* renamed from: h */
    public static long m8788h(Object obj, long j2) {
        return f16357c.m8775k(obj, j2);
    }

    /* renamed from: i */
    public static Object m8789i(Class cls) {
        try {
            return f16355a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: j */
    public static Object m8790j(Object obj, long j2) {
        return f16357c.m8777m(obj, j2);
    }

    /* renamed from: k */
    public static Unsafe m8791k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzacl());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m8792l(Throwable th) {
        Logger.getLogger(zzacp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* renamed from: m */
    public static void m8793m(byte[] bArr, long j2, byte b) {
        f16357c.mo8768d(bArr, f16360f + j2, b);
    }

    /* renamed from: n */
    public static void m8794n(Object obj, long j2, double d) {
        f16357c.mo8769e(obj, j2, d);
    }

    /* renamed from: o */
    public static void m8795o(Object obj, long j2, int i2) {
        f16357c.m8778n(obj, j2, i2);
    }

    /* renamed from: p */
    public static void m8796p(Object obj, long j2, long j3) {
        f16357c.m8779o(obj, j2, j3);
    }

    /* renamed from: q */
    public static void m8797q(Object obj, long j2, Object obj2) {
        f16357c.m8780p(obj, j2, obj2);
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m8798r(Object obj, long j2) {
        return ((byte) ((f16357c.m8774j(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m8799s(Object obj, long j2) {
        return ((byte) ((f16357c.m8774j(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static boolean m8800t(Class cls) {
        int i2 = zzyg.f17108a;
        try {
            Class cls2 = f16356b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    /* renamed from: u */
    public static boolean m8801u(Object obj, long j2) {
        return f16357c.mo8771g(obj, j2);
    }

    /* renamed from: v */
    public static int m8802v(Class cls) {
        if (f16359e) {
            return f16357c.m8772h(cls);
        }
        return -1;
    }
}

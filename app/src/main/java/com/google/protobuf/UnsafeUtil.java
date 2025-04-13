package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class UnsafeUtil {

    /* renamed from: a */
    public static final Unsafe f24386a;

    /* renamed from: b */
    public static final Class<?> f24387b;

    /* renamed from: c */
    public static final boolean f24388c;

    /* renamed from: d */
    public static final boolean f24389d;

    /* renamed from: e */
    public static final MemoryAccessor f24390e;

    /* renamed from: f */
    public static final boolean f24391f;

    /* renamed from: g */
    public static final boolean f24392g;

    /* renamed from: h */
    public static final long f24393h;

    /* renamed from: i */
    public static final long f24394i;

    /* renamed from: j */
    public static final boolean f24395j;

    public static final class Android32MemoryAccessor extends MemoryAccessor {
        public Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: c */
        public void mo13701c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: d */
        public void mo13702d(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: e */
        public boolean mo13703e(Object obj, long j2) {
            return UnsafeUtil.f24395j ? UnsafeUtil.m13685l(obj, j2) != 0 : UnsafeUtil.m13686m(obj, j2) != 0;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: f */
        public byte mo13704f(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: g */
        public byte mo13705g(Object obj, long j2) {
            return UnsafeUtil.f24395j ? UnsafeUtil.m13685l(obj, j2) : UnsafeUtil.m13686m(obj, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: h */
        public double mo13706h(Object obj, long j2) {
            return Double.longBitsToDouble(m13719l(obj, j2));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: i */
        public float mo13707i(Object obj, long j2) {
            return Float.intBitsToFloat(m13718j(obj, j2));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: k */
        public long mo13708k(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: o */
        public void mo13709o(Object obj, long j2, boolean z) {
            if (UnsafeUtil.f24395j) {
                UnsafeUtil.m13696w(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.m13697x(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: p */
        public void mo13710p(long j2, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: q */
        public void mo13711q(Object obj, long j2, byte b) {
            if (UnsafeUtil.f24395j) {
                UnsafeUtil.m13696w(obj, j2, b);
            } else {
                UnsafeUtil.m13697x(obj, j2, b);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: r */
        public void mo13712r(Object obj, long j2, double d) {
            m13723u(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: s */
        public void mo13713s(Object obj, long j2, float f2) {
            m13722t(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: x */
        public boolean mo13714x() {
            return false;
        }
    }

    public static final class Android64MemoryAccessor extends MemoryAccessor {
        public Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: c */
        public void mo13701c(long j2, byte[] bArr, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: d */
        public void mo13702d(byte[] bArr, long j2, long j3, long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: e */
        public boolean mo13703e(Object obj, long j2) {
            return UnsafeUtil.f24395j ? UnsafeUtil.m13685l(obj, j2) != 0 : UnsafeUtil.m13686m(obj, j2) != 0;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: f */
        public byte mo13704f(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: g */
        public byte mo13705g(Object obj, long j2) {
            return UnsafeUtil.f24395j ? UnsafeUtil.m13685l(obj, j2) : UnsafeUtil.m13686m(obj, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: h */
        public double mo13706h(Object obj, long j2) {
            return Double.longBitsToDouble(m13719l(obj, j2));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: i */
        public float mo13707i(Object obj, long j2) {
            return Float.intBitsToFloat(m13718j(obj, j2));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: k */
        public long mo13708k(long j2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: o */
        public void mo13709o(Object obj, long j2, boolean z) {
            if (UnsafeUtil.f24395j) {
                UnsafeUtil.m13696w(obj, j2, z ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.m13697x(obj, j2, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: p */
        public void mo13710p(long j2, byte b) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: q */
        public void mo13711q(Object obj, long j2, byte b) {
            if (UnsafeUtil.f24395j) {
                UnsafeUtil.m13696w(obj, j2, b);
            } else {
                UnsafeUtil.m13697x(obj, j2, b);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: r */
        public void mo13712r(Object obj, long j2, double d) {
            m13723u(obj, j2, Double.doubleToLongBits(d));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: s */
        public void mo13713s(Object obj, long j2, float f2) {
            m13722t(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: x */
        public boolean mo13714x() {
            return false;
        }
    }

    public static final class JvmMemoryAccessor extends MemoryAccessor {
        public JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: c */
        public void mo13701c(long j2, byte[] bArr, long j3, long j4) {
            this.f24396a.copyMemory((Object) null, j2, bArr, UnsafeUtil.f24393h + j3, j4);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: d */
        public void mo13702d(byte[] bArr, long j2, long j3, long j4) {
            this.f24396a.copyMemory(bArr, UnsafeUtil.f24393h + j2, (Object) null, j3, j4);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: e */
        public boolean mo13703e(Object obj, long j2) {
            return this.f24396a.getBoolean(obj, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: f */
        public byte mo13704f(long j2) {
            return this.f24396a.getByte(j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: g */
        public byte mo13705g(Object obj, long j2) {
            return this.f24396a.getByte(obj, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: h */
        public double mo13706h(Object obj, long j2) {
            return this.f24396a.getDouble(obj, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: i */
        public float mo13707i(Object obj, long j2) {
            return this.f24396a.getFloat(obj, j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: k */
        public long mo13708k(long j2) {
            return this.f24396a.getLong(j2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: o */
        public void mo13709o(Object obj, long j2, boolean z) {
            this.f24396a.putBoolean(obj, j2, z);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: p */
        public void mo13710p(long j2, byte b) {
            this.f24396a.putByte(j2, b);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: q */
        public void mo13711q(Object obj, long j2, byte b) {
            this.f24396a.putByte(obj, j2, b);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: r */
        public void mo13712r(Object obj, long j2, double d) {
            this.f24396a.putDouble(obj, j2, d);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: s */
        public void mo13713s(Object obj, long j2, float f2) {
            this.f24396a.putFloat(obj, j2, f2);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: w */
        public boolean mo13715w() {
            if (!super.mo13715w()) {
                return false;
            }
            try {
                Class<?> cls = this.f24396a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.m13674a(th);
                return false;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        /* renamed from: x */
        public boolean mo13714x() {
            if (!super.mo13714x()) {
                return false;
            }
            try {
                Class<?> cls = this.f24396a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.m13674a(th);
                return false;
            }
        }
    }

    public static abstract class MemoryAccessor {

        /* renamed from: a */
        public Unsafe f24396a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f24396a = unsafe;
        }

        /* renamed from: a */
        public final int m13716a(Class<?> cls) {
            return this.f24396a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m13717b(Class<?> cls) {
            return this.f24396a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo13701c(long j2, byte[] bArr, long j3, long j4);

        /* renamed from: d */
        public abstract void mo13702d(byte[] bArr, long j2, long j3, long j4);

        /* renamed from: e */
        public abstract boolean mo13703e(Object obj, long j2);

        /* renamed from: f */
        public abstract byte mo13704f(long j2);

        /* renamed from: g */
        public abstract byte mo13705g(Object obj, long j2);

        /* renamed from: h */
        public abstract double mo13706h(Object obj, long j2);

        /* renamed from: i */
        public abstract float mo13707i(Object obj, long j2);

        /* renamed from: j */
        public final int m13718j(Object obj, long j2) {
            return this.f24396a.getInt(obj, j2);
        }

        /* renamed from: k */
        public abstract long mo13708k(long j2);

        /* renamed from: l */
        public final long m13719l(Object obj, long j2) {
            return this.f24396a.getLong(obj, j2);
        }

        /* renamed from: m */
        public final Object m13720m(Object obj, long j2) {
            return this.f24396a.getObject(obj, j2);
        }

        /* renamed from: n */
        public final long m13721n(java.lang.reflect.Field field) {
            return this.f24396a.objectFieldOffset(field);
        }

        /* renamed from: o */
        public abstract void mo13709o(Object obj, long j2, boolean z);

        /* renamed from: p */
        public abstract void mo13710p(long j2, byte b);

        /* renamed from: q */
        public abstract void mo13711q(Object obj, long j2, byte b);

        /* renamed from: r */
        public abstract void mo13712r(Object obj, long j2, double d);

        /* renamed from: s */
        public abstract void mo13713s(Object obj, long j2, float f2);

        /* renamed from: t */
        public final void m13722t(Object obj, long j2, int i2) {
            this.f24396a.putInt(obj, j2, i2);
        }

        /* renamed from: u */
        public final void m13723u(Object obj, long j2, long j3) {
            this.f24396a.putLong(obj, j2, j3);
        }

        /* renamed from: v */
        public final void m13724v(Object obj, long j2, Object obj2) {
            this.f24396a.putObject(obj, j2, obj2);
        }

        /* renamed from: w */
        public boolean mo13715w() {
            Unsafe unsafe = this.f24396a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                UnsafeUtil.m13674a(th);
                return false;
            }
        }

        /* renamed from: x */
        public boolean mo13714x() {
            Unsafe unsafe = this.f24396a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.m13679f() != null;
            } catch (Throwable th) {
                UnsafeUtil.m13674a(th);
                return false;
            }
        }
    }

    static {
        Unsafe m13692s = m13692s();
        f24386a = m13692s;
        f24387b = Android.f23956a;
        boolean m13681h = m13681h(Long.TYPE);
        f24388c = m13681h;
        boolean m13681h2 = m13681h(Integer.TYPE);
        f24389d = m13681h2;
        MemoryAccessor memoryAccessor = null;
        if (m13692s != null) {
            if (!Android.m12992a()) {
                memoryAccessor = new JvmMemoryAccessor(m13692s);
            } else if (m13681h) {
                memoryAccessor = new Android64MemoryAccessor(m13692s);
            } else if (m13681h2) {
                memoryAccessor = new Android32MemoryAccessor(m13692s);
            }
        }
        f24390e = memoryAccessor;
        f24391f = memoryAccessor == null ? false : memoryAccessor.mo13714x();
        f24392g = memoryAccessor == null ? false : memoryAccessor.mo13715w();
        f24393h = m13677d(byte[].class);
        m13677d(boolean[].class);
        m13678e(boolean[].class);
        m13677d(int[].class);
        m13678e(int[].class);
        m13677d(long[].class);
        m13678e(long[].class);
        m13677d(float[].class);
        m13678e(float[].class);
        m13677d(double[].class);
        m13678e(double[].class);
        m13677d(Object[].class);
        m13678e(Object[].class);
        java.lang.reflect.Field m13679f = m13679f();
        f24394i = (m13679f == null || memoryAccessor == null) ? -1L : memoryAccessor.m13721n(m13679f);
        f24395j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static void m13671A(Object obj, long j2, int i2) {
        f24390e.m13722t(obj, j2, i2);
    }

    /* renamed from: B */
    public static void m13672B(Object obj, long j2, long j3) {
        f24390e.m13723u(obj, j2, j3);
    }

    /* renamed from: C */
    public static void m13673C(Object obj, long j2, Object obj2) {
        f24390e.m13724v(obj, j2, obj2);
    }

    /* renamed from: a */
    public static void m13674a(Throwable th) {
        Logger.getLogger(UnsafeUtil.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: b */
    public static long m13675b(ByteBuffer byteBuffer) {
        return f24390e.m13719l(byteBuffer, f24394i);
    }

    /* renamed from: c */
    public static <T> T m13676c(Class<T> cls) {
        try {
            return (T) f24386a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: d */
    public static int m13677d(Class<?> cls) {
        if (f24392g) {
            return f24390e.m13716a(cls);
        }
        return -1;
    }

    /* renamed from: e */
    public static int m13678e(Class<?> cls) {
        if (f24392g) {
            return f24390e.m13717b(cls);
        }
        return -1;
    }

    /* renamed from: f */
    public static java.lang.reflect.Field m13679f() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (Android.m12992a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: g */
    public static void m13680g(long j2, byte[] bArr, long j3, long j4) {
        f24390e.mo13701c(j2, bArr, j3, j4);
    }

    /* renamed from: h */
    public static boolean m13681h(Class<?> cls) {
        if (!Android.m12992a()) {
            return false;
        }
        try {
            Class<?> cls2 = f24387b;
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

    /* renamed from: i */
    public static boolean m13682i(Object obj, long j2) {
        return f24390e.mo13703e(obj, j2);
    }

    /* renamed from: j */
    public static byte m13683j(long j2) {
        return f24390e.mo13704f(j2);
    }

    /* renamed from: k */
    public static byte m13684k(byte[] bArr, long j2) {
        return f24390e.mo13705g(bArr, f24393h + j2);
    }

    /* renamed from: l */
    public static byte m13685l(Object obj, long j2) {
        return (byte) ((m13689p(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: m */
    public static byte m13686m(Object obj, long j2) {
        return (byte) ((m13689p(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: n */
    public static double m13687n(Object obj, long j2) {
        return f24390e.mo13706h(obj, j2);
    }

    /* renamed from: o */
    public static float m13688o(Object obj, long j2) {
        return f24390e.mo13707i(obj, j2);
    }

    /* renamed from: p */
    public static int m13689p(Object obj, long j2) {
        return f24390e.m13718j(obj, j2);
    }

    /* renamed from: q */
    public static long m13690q(Object obj, long j2) {
        return f24390e.m13719l(obj, j2);
    }

    /* renamed from: r */
    public static Object m13691r(Object obj, long j2) {
        return f24390e.m13720m(obj, j2);
    }

    /* renamed from: s */
    public static Unsafe m13692s() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t */
    public static long m13693t(java.lang.reflect.Field field) {
        return f24390e.m13721n(field);
    }

    /* renamed from: u */
    public static void m13694u(Object obj, long j2, boolean z) {
        f24390e.mo13709o(obj, j2, z);
    }

    /* renamed from: v */
    public static void m13695v(byte[] bArr, long j2, byte b) {
        f24390e.mo13711q(bArr, f24393h + j2, b);
    }

    /* renamed from: w */
    public static void m13696w(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        int m13689p = m13689p(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        f24390e.m13722t(obj, j3, ((255 & b) << i2) | (m13689p & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: x */
    public static void m13697x(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        f24390e.m13722t(obj, j3, ((255 & b) << i2) | (m13689p(obj, j3) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    /* renamed from: y */
    public static void m13698y(Object obj, long j2, double d) {
        f24390e.mo13712r(obj, j2, d);
    }

    /* renamed from: z */
    public static void m13699z(Object obj, long j2, float f2) {
        f24390e.mo13713s(obj, j2, f2);
    }
}

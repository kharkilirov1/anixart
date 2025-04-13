package com.google.common.hash;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class LittleEndianByteArray {

    /* renamed from: a */
    public static final LittleEndianBytes f21784a;

    public enum JavaLittleEndianBytes implements LittleEndianBytes {
        INSTANCE { // from class: com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.1
        };

        JavaLittleEndianBytes(C18741 c18741) {
        }
    }

    public interface LittleEndianBytes {
    }

    public enum UnsafeByteArray implements LittleEndianBytes {
        UNSAFE_LITTLE_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.1
        },
        UNSAFE_BIG_ENDIAN { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.2
        };


        /* renamed from: d */
        public static final Unsafe f21789d;

        /* renamed from: e */
        public static final int f21790e;

        static {
            Unsafe m12023a = m12023a();
            f21789d = m12023a;
            f21790e = m12023a.arrayBaseOffset(byte[].class);
            if (m12023a.arrayIndexScale(byte[].class) != 1) {
                throw new AssertionError();
            }
        }

        UnsafeByteArray(C18741 c18741) {
        }

        /* renamed from: a */
        public static Unsafe m12023a() {
            try {
                try {
                    return Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.3
                    @Override // java.security.PrivilegedExceptionAction
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Unsafe run() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
        }
    }

    static {
        LittleEndianBytes littleEndianBytes = JavaLittleEndianBytes.INSTANCE;
        try {
            if ("amd64".equals(System.getProperty("os.arch"))) {
                littleEndianBytes = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? UnsafeByteArray.UNSAFE_LITTLE_ENDIAN : UnsafeByteArray.UNSAFE_BIG_ENDIAN;
            }
        } catch (Throwable unused) {
        }
        f21784a = littleEndianBytes;
    }
}

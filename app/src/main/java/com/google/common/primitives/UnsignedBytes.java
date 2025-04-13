package com.google.common.primitives;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import sun.misc.Unsafe;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class UnsignedBytes {

    @VisibleForTesting
    public static class LexicographicalComparatorHolder {

        /* renamed from: a */
        public static final String f21968a;

        public enum PureJavaComparator implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                int min = Math.min(bArr3.length, bArr4.length);
                for (int i2 = 0; i2 < min; i2++) {
                    int i3 = (bArr3[i2] & 255) - (bArr4[i2] & 255);
                    if (i3 != 0) {
                        return i3;
                    }
                }
                return bArr3.length - bArr4.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
            }
        }

        @VisibleForTesting
        public enum UnsafeComparator implements Comparator<byte[]> {
            INSTANCE;


            /* renamed from: c */
            public static final boolean f21972c = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);

            /* renamed from: d */
            public static final Unsafe f21973d;

            /* renamed from: e */
            public static final int f21974e;

            static {
                Unsafe m12089b = m12089b();
                f21973d = m12089b;
                int arrayBaseOffset = m12089b.arrayBaseOffset(byte[].class);
                f21974e = arrayBaseOffset;
                if (!"64".equals(System.getProperty("sun.arch.data.model")) || arrayBaseOffset % 8 != 0 || m12089b.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            /* renamed from: b */
            public static Unsafe m12089b() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e2) {
                        throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.primitives.UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.1
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

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i2 = min & (-8);
                int i3 = 0;
                while (i3 < i2) {
                    Unsafe unsafe = f21973d;
                    long j2 = f21974e + i3;
                    long j3 = unsafe.getLong(bArr, j2);
                    long j4 = unsafe.getLong(bArr2, j2);
                    if (j3 != j4) {
                        if (f21972c) {
                            return UnsignedLongs.m12092a(j3, j4);
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3 ^ j4) & (-8);
                        return ((int) ((j3 >>> numberOfTrailingZeros) & 255)) - ((int) ((j4 >>> numberOfTrailingZeros) & 255));
                    }
                    i3 += 8;
                }
                while (i3 < min) {
                    int i4 = (bArr[i3] & 255) - (bArr2[i3] & 255);
                    if (i4 != 0) {
                        return i4;
                    }
                    i3++;
                }
                return bArr.length - bArr2.length;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
            }
        }

        static {
            String concat = LexicographicalComparatorHolder.class.getName().concat("$UnsafeComparator");
            f21968a = concat;
            try {
            } catch (Throwable unused) {
            }
        }
    }
}

package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import java.math.BigInteger;
import java.util.Comparator;

@Beta
@GwtCompatible
/* loaded from: classes2.dex */
public final class UnsignedLongs {

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int min = Math.min(jArr3.length, jArr4.length);
            for (int i2 = 0; i2 < min; i2++) {
                if (jArr3[i2] != jArr4[i2]) {
                    return UnsignedLongs.m12092a(jArr3[i2], jArr4[i2]);
                }
            }
            return jArr3.length - jArr4.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static final class ParseOverflowDetection {

        /* renamed from: a */
        public static final long[] f21982a = new long[37];

        /* renamed from: b */
        public static final int[] f21983b = new int[37];

        /* renamed from: c */
        public static final int[] f21984c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i2 = 2; i2 <= 36; i2++) {
                long j2 = i2;
                long j3 = -1;
                f21982a[i2] = UnsignedLongs.m12093b(-1L, j2);
                int[] iArr = f21983b;
                if (j2 >= 0) {
                    j3 = (-1) - (((Long.MAX_VALUE / j2) << 1) * j2);
                    if (UnsignedLongs.m12092a(j3, j2) < 0) {
                        j2 = 0;
                    }
                } else if (UnsignedLongs.m12092a(-1L, j2) < 0) {
                    iArr[i2] = (int) j3;
                    f21984c[i2] = bigInteger.toString(i2).length() - 1;
                }
                j3 -= j2;
                iArr[i2] = (int) j3;
                f21984c[i2] = bigInteger.toString(i2).length() - 1;
            }
        }
    }

    /* renamed from: a */
    public static int m12092a(long j2, long j3) {
        return Longs.m12086a(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE);
    }

    /* renamed from: b */
    public static long m12093b(long j2, long j3) {
        if (j3 < 0) {
            return m12092a(j2, j3) < 0 ? 0L : 1L;
        }
        if (j2 >= 0) {
            return j2 / j3;
        }
        long j4 = ((j2 >>> 1) / j3) << 1;
        return j4 + (m12092a(j2 - (j4 * j3), j3) < 0 ? 0 : 1);
    }
}

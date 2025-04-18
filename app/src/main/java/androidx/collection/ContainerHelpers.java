package androidx.collection;

/* loaded from: classes.dex */
class ContainerHelpers {

    /* renamed from: a */
    public static final int[] f1811a = new int[0];

    /* renamed from: b */
    public static final long[] f1812b = new long[0];

    /* renamed from: c */
    public static final Object[] f1813c = new Object[0];

    /* renamed from: a */
    public static int m1083a(int[] iArr, int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    /* renamed from: b */
    public static int m1084b(long[] jArr, int i2, long j2) {
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: c */
    public static boolean m1085c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static int m1086d(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                return i4;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static int m1087e(int i2) {
        return m1086d(i2 * 4) / 4;
    }

    /* renamed from: f */
    public static int m1088f(int i2) {
        return m1086d(i2 * 8) / 8;
    }
}

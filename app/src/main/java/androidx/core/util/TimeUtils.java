package androidx.core.util;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public final class TimeUtils {

    /* renamed from: a */
    public static final Object f3567a = new Object();

    /* renamed from: b */
    public static char[] f3568b = new char[24];

    /* renamed from: a */
    public static int m2037a(int i2, int i3, boolean z, int i4) {
        if (i2 > 99 || (z && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z && i4 >= 2)) {
            return i3 + 2;
        }
        if (z || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    @RestrictTo
    /* renamed from: b */
    public static void m2038b(long j2, StringBuilder sb) {
        synchronized (f3567a) {
            sb.append(f3568b, 0, m2039c(j2, 0));
        }
    }

    /* renamed from: c */
    public static int m2039c(long j2, int i2) {
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        if (f3568b.length < i2) {
            f3568b = new char[i2];
        }
        char[] cArr = f3568b;
        if (j3 == 0) {
            int i8 = i2 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j3 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j3 = -j3;
        }
        int i9 = (int) (j3 % 1000);
        int floor = (int) Math.floor(j3 / 1000);
        if (floor > 86400) {
            i3 = floor / 86400;
            floor -= 86400 * i3;
        } else {
            i3 = 0;
        }
        if (floor > 3600) {
            i4 = floor / 3600;
            floor -= i4 * 3600;
        } else {
            i4 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i5 = floor - (i10 * 60);
            i6 = i10;
        } else {
            i5 = floor;
            i6 = 0;
        }
        if (i2 != 0) {
            int m2037a = m2037a(i3, 1, false, 0);
            int m2037a2 = m2037a(i4, 1, m2037a > 0, 2) + m2037a;
            int m2037a3 = m2037a(i6, 1, m2037a2 > 0, 2) + m2037a2;
            int m2037a4 = m2037a(i5, 1, m2037a3 > 0, 2) + m2037a3;
            i7 = 0;
            for (int m2037a5 = m2037a(i9, 2, true, m2037a4 > 0 ? 3 : 0) + 1 + m2037a4; m2037a5 < i2; m2037a5++) {
                cArr[i7] = ' ';
                i7++;
            }
        } else {
            i7 = 0;
        }
        cArr[i7] = c2;
        int i11 = i7 + 1;
        boolean z = i2 != 0;
        int m2040d = m2040d(cArr, i3, 'd', i11, false, 0);
        int m2040d2 = m2040d(cArr, i4, 'h', m2040d, m2040d != i11, z ? 2 : 0);
        int m2040d3 = m2040d(cArr, i6, 'm', m2040d2, m2040d2 != i11, z ? 2 : 0);
        int m2040d4 = m2040d(cArr, i5, 's', m2040d3, m2040d3 != i11, z ? 2 : 0);
        int m2040d5 = m2040d(cArr, i9, 'm', m2040d4, true, (!z || m2040d4 == i11) ? 0 : 3);
        cArr[m2040d5] = 's';
        return m2040d5 + 1;
    }

    /* renamed from: d */
    public static int m2040d(char[] cArr, int i2, char c2, int i3, boolean z, int i4) {
        int i5;
        if (!z && i2 <= 0) {
            return i3;
        }
        if ((!z || i4 < 3) && i2 <= 99) {
            i5 = i3;
        } else {
            int i6 = i2 / 100;
            cArr[i3] = (char) (i6 + 48);
            i5 = i3 + 1;
            i2 -= i6 * 100;
        }
        if ((z && i4 >= 2) || i2 > 9 || i3 != i5) {
            int i7 = i2 / 10;
            cArr[i5] = (char) (i7 + 48);
            i5++;
            i2 -= i7 * 10;
        }
        cArr[i5] = (char) (i2 + 48);
        int i8 = i5 + 1;
        cArr[i8] = c2;
        return i8 + 1;
    }
}

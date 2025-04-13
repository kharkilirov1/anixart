package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zznc {

    /* renamed from: a */
    public static final int[] f16602a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b */
    public static final int[] f16603b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c */
    public static final int[] f16604c = {67108863, 33554431};

    /* renamed from: d */
    public static final int[] f16605d = {26, 25};

    /* renamed from: a */
    public static void m9327a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        m9328b(jArr4, jArr2, jArr3);
        m9330d(jArr4);
        m9329c(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    /* renamed from: b */
    public static void m9328b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[1] * jArr3[0]) + (jArr2[0] * jArr3[1]);
        long j2 = jArr2[1];
        jArr[2] = (jArr2[2] * jArr3[0]) + (jArr2[0] * jArr3[2]) + ((j2 + j2) * jArr3[1]);
        jArr[3] = (jArr2[3] * jArr3[0]) + (jArr2[0] * jArr3[3]) + (jArr2[2] * jArr3[1]) + (jArr2[1] * jArr3[2]);
        long j3 = jArr2[2];
        long j4 = jArr3[2];
        long j5 = (jArr2[3] * jArr3[1]) + (jArr2[1] * jArr3[3]);
        jArr[4] = (jArr2[4] * jArr3[0]) + (jArr2[0] * jArr3[4]) + j5 + j5 + (j3 * j4);
        jArr[5] = (jArr2[5] * jArr3[0]) + (jArr2[0] * jArr3[5]) + (jArr2[4] * jArr3[1]) + (jArr2[1] * jArr3[4]) + (jArr2[3] * jArr3[2]) + (jArr2[2] * jArr3[3]);
        long j6 = (jArr2[5] * jArr3[1]) + (jArr2[1] * jArr3[5]) + (jArr2[3] * jArr3[3]);
        jArr[6] = (jArr2[6] * jArr3[0]) + (jArr2[0] * jArr3[6]) + (jArr2[4] * jArr3[2]) + (jArr2[2] * jArr3[4]) + j6 + j6;
        jArr[7] = (jArr2[7] * jArr3[0]) + (jArr2[0] * jArr3[7]) + (jArr2[6] * jArr3[1]) + (jArr2[1] * jArr3[6]) + (jArr2[5] * jArr3[2]) + (jArr2[2] * jArr3[5]) + (jArr2[4] * jArr3[3]) + (jArr2[3] * jArr3[4]);
        long j7 = jArr2[4];
        long j8 = jArr3[4];
        long j9 = (jArr2[7] * jArr3[1]) + (jArr2[1] * jArr3[7]) + (jArr2[5] * jArr3[3]) + (jArr2[3] * jArr3[5]);
        jArr[8] = (jArr2[8] * jArr3[0]) + (jArr2[0] * jArr3[8]) + (jArr2[6] * jArr3[2]) + (jArr2[2] * jArr3[6]) + j9 + j9 + (j7 * j8);
        jArr[9] = (jArr2[9] * jArr3[0]) + (jArr2[0] * jArr3[9]) + (jArr2[8] * jArr3[1]) + (jArr2[1] * jArr3[8]) + (jArr2[7] * jArr3[2]) + (jArr2[2] * jArr3[7]) + (jArr2[6] * jArr3[3]) + (jArr2[3] * jArr3[6]) + (jArr2[5] * jArr3[4]) + (jArr2[4] * jArr3[5]);
        long j10 = (jArr2[9] * jArr3[1]) + (jArr2[1] * jArr3[9]) + (jArr2[7] * jArr3[3]) + (jArr2[3] * jArr3[7]) + (jArr2[5] * jArr3[5]);
        jArr[10] = (jArr2[8] * jArr3[2]) + (jArr2[2] * jArr3[8]) + (jArr2[6] * jArr3[4]) + (jArr2[4] * jArr3[6]) + j10 + j10;
        jArr[11] = (jArr2[9] * jArr3[2]) + (jArr2[2] * jArr3[9]) + (jArr2[8] * jArr3[3]) + (jArr2[3] * jArr3[8]) + (jArr2[7] * jArr3[4]) + (jArr2[4] * jArr3[7]) + (jArr2[6] * jArr3[5]) + (jArr2[5] * jArr3[6]);
        long j11 = jArr2[6];
        long j12 = jArr3[6];
        long j13 = (jArr2[9] * jArr3[3]) + (jArr2[3] * jArr3[9]) + (jArr2[7] * jArr3[5]) + (jArr2[5] * jArr3[7]);
        jArr[12] = (jArr2[8] * jArr3[4]) + (jArr2[4] * jArr3[8]) + j13 + j13 + (j11 * j12);
        jArr[13] = (jArr2[9] * jArr3[4]) + (jArr2[4] * jArr3[9]) + (jArr2[8] * jArr3[5]) + (jArr2[5] * jArr3[8]) + (jArr2[7] * jArr3[6]) + (jArr2[6] * jArr3[7]);
        long j14 = (jArr2[9] * jArr3[5]) + (jArr2[5] * jArr3[9]) + (jArr2[7] * jArr3[7]);
        jArr[14] = (jArr2[8] * jArr3[6]) + (jArr2[6] * jArr3[8]) + j14 + j14;
        jArr[15] = (jArr2[9] * jArr3[6]) + (jArr2[6] * jArr3[9]) + (jArr2[8] * jArr3[7]) + (jArr2[7] * jArr3[8]);
        long j15 = jArr2[8] * jArr3[8];
        long j16 = (jArr2[9] * jArr3[7]) + (jArr2[7] * jArr3[9]);
        jArr[16] = j16 + j16 + j15;
        jArr[17] = (jArr2[9] * jArr3[8]) + (jArr2[8] * jArr3[9]);
        long j17 = jArr2[9];
        jArr[18] = (j17 + j17) * jArr3[9];
    }

    /* renamed from: c */
    public static void m9329c(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j6;
        long j7 = jArr[10];
        long j8 = j7 + j7 + j6;
        jArr[0] = j8;
        jArr[0] = j8 + jArr[10];
        jArr[10] = 0;
        long j9 = jArr[0];
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    /* renamed from: d */
    public static void m9330d(long[] jArr) {
        long j2 = jArr[8] + (jArr[18] << 4);
        jArr[8] = j2;
        long j3 = jArr[18];
        long j4 = j3 + j3 + j2;
        jArr[8] = j4;
        jArr[8] = j4 + jArr[18];
        long j5 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j5;
        long j6 = jArr[17];
        long j7 = j6 + j6 + j5;
        jArr[7] = j7;
        jArr[7] = j7 + jArr[17];
        long j8 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j8;
        long j9 = jArr[16];
        long j10 = j9 + j9 + j8;
        jArr[6] = j10;
        jArr[6] = j10 + jArr[16];
        long j11 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j11;
        long j12 = jArr[15];
        long j13 = j12 + j12 + j11;
        jArr[5] = j13;
        jArr[5] = j13 + jArr[15];
        long j14 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j14;
        long j15 = jArr[14];
        long j16 = j15 + j15 + j14;
        jArr[4] = j16;
        jArr[4] = j16 + jArr[14];
        long j17 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j17;
        long j18 = jArr[13];
        long j19 = j18 + j18 + j17;
        jArr[3] = j19;
        jArr[3] = j19 + jArr[13];
        long j20 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j20;
        long j21 = jArr[12];
        long j22 = j21 + j21 + j20;
        jArr[2] = j22;
        jArr[2] = j22 + jArr[12];
        long j23 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j23;
        long j24 = jArr[11];
        long j25 = j24 + j24 + j23;
        jArr[1] = j25;
        jArr[1] = j25 + jArr[11];
        long j26 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j26;
        long j27 = jArr[10];
        long j28 = j27 + j27 + j26;
        jArr[0] = j28;
        jArr[0] = j28 + jArr[10];
    }

    /* renamed from: e */
    public static void m9331e(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = (jArr2[0] * jArr2[2]) + (j4 * j4);
        long j6 = (jArr2[0] * jArr2[3]) + (jArr2[1] * jArr2[2]);
        long j7 = jArr2[2];
        long j8 = jArr2[1];
        long j9 = jArr2[3];
        long j10 = jArr2[0];
        long j11 = j8 * 4 * j9;
        long j12 = (j10 + j10) * jArr2[4];
        long j13 = (jArr2[0] * jArr2[5]) + (jArr2[1] * jArr2[4]) + (jArr2[2] * jArr2[3]);
        long j14 = jArr2[3];
        long j15 = jArr2[2];
        long j16 = jArr2[4];
        long j17 = jArr2[0];
        long j18 = jArr2[6];
        long j19 = jArr2[1];
        long j20 = ((j19 + j19) * jArr2[5]) + (j17 * j18) + (j15 * j16) + (j14 * j14);
        long j21 = (jArr2[0] * jArr2[7]) + (jArr2[1] * jArr2[6]) + (jArr2[2] * jArr2[5]) + (jArr2[3] * jArr2[4]);
        long j22 = jArr2[4];
        long j23 = jArr2[2];
        long j24 = jArr2[6];
        long j25 = jArr2[0];
        long j26 = jArr2[8];
        long j27 = (jArr2[3] * jArr2[5]) + (jArr2[1] * jArr2[7]);
        long j28 = j27 + j27 + (j25 * j26) + (j23 * j24);
        long j29 = (jArr2[0] * jArr2[9]) + (jArr2[1] * jArr2[8]) + (jArr2[2] * jArr2[7]) + (jArr2[3] * jArr2[6]) + (jArr2[4] * jArr2[5]);
        long j30 = jArr2[5];
        long j31 = jArr2[4];
        long j32 = jArr2[6];
        long j33 = jArr2[2];
        long j34 = jArr2[8];
        long j35 = (jArr2[1] * jArr2[9]) + (jArr2[3] * jArr2[7]);
        long j36 = j35 + j35;
        long j37 = j36 + (j33 * j34) + (j31 * j32) + (j30 * j30);
        long j38 = (jArr2[2] * jArr2[9]) + (jArr2[3] * jArr2[8]) + (jArr2[4] * jArr2[7]) + (jArr2[5] * jArr2[6]);
        long j39 = jArr2[6];
        long j40 = jArr2[4];
        long j41 = jArr2[8];
        long j42 = (jArr2[3] * jArr2[9]) + (jArr2[5] * jArr2[7]);
        long j43 = j42 + j42 + (j40 * j41);
        long j44 = j43 + j43;
        long j45 = (jArr2[4] * jArr2[9]) + (jArr2[5] * jArr2[8]) + (jArr2[6] * jArr2[7]);
        long j46 = jArr2[7];
        long j47 = jArr2[6];
        long j48 = jArr2[8];
        long j49 = jArr2[5];
        long j50 = ((j49 + j49) * jArr2[9]) + (j47 * j48) + (j46 * j46);
        long j51 = (jArr2[6] * jArr2[9]) + (jArr2[7] * jArr2[8]);
        long j52 = jArr2[8];
        long j53 = jArr2[7] * 4 * jArr2[9];
        long j54 = jArr2[8];
        long j55 = jArr2[9];
        long[] jArr3 = {j2 * j2, (j3 + j3) * jArr2[1], j5 + j5, j6 + j6, j12 + j11 + (j7 * j7), j13 + j13, j20 + j20, j21 + j21, j28 + j28 + (j22 * j22), j29 + j29, j37 + j37, j38 + j38, j44 + (j39 * j39), j45 + j45, j50 + j50, j51 + j51, j53 + (j52 * j52), (j54 + j54) * jArr2[9], (j55 + j55) * j55};
        m9330d(jArr3);
        m9329c(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    /* renamed from: f */
    public static void m9332f(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    /* renamed from: g */
    public static void m9333g(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    /* renamed from: h */
    public static byte[] m9334h(long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            while (i3 < 9) {
                long j2 = copyOf[i3];
                int i4 = -((int) (((j2 >> 31) & j2) >> f16605d[i3 & 1]));
                copyOf[i3] = j2 + (i4 << r10);
                i3++;
                copyOf[i3] = copyOf[i3] - i4;
            }
            long j3 = copyOf[9];
            int i5 = -((int) (((j3 >> 31) & j3) >> 25));
            copyOf[9] = j3 + (i5 << 25);
            copyOf[0] = copyOf[0] - (i5 * 19);
        }
        long j4 = copyOf[0];
        copyOf[0] = j4 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j4 >> 31) & j4) >> 26)));
        for (int i6 = 0; i6 < 2; i6++) {
            int i7 = 0;
            while (i7 < 9) {
                long j5 = copyOf[i7];
                int i8 = f16605d[i7 & 1];
                copyOf[i7] = f16604c[r12] & j5;
                i7++;
                copyOf[i7] = copyOf[i7] + ((int) (j5 >> i8));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (r9 >> 25)) * 19);
        int i9 = ~((((int) r11) - 67108845) >> 31);
        for (int i10 = 1; i10 < 10; i10++) {
            int i11 = ~(((int) copyOf[i10]) ^ f16604c[i10 & 1]);
            int i12 = i11 & (i11 << 16);
            int i13 = i12 & (i12 << 8);
            int i14 = i13 & (i13 << 4);
            int i15 = i14 & (i14 << 2);
            i9 &= (i15 & (i15 + i15)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i9);
        long j6 = 33554431 & i9;
        copyOf[1] = copyOf[1] - j6;
        for (int i16 = 2; i16 < 10; i16 += 2) {
            copyOf[i16] = copyOf[i16] - (67108863 & i9);
            int i17 = i16 + 1;
            copyOf[i17] = copyOf[i17] - j6;
        }
        for (int i18 = 0; i18 < 10; i18++) {
            copyOf[i18] = copyOf[i18] << f16603b[i18];
        }
        byte[] bArr = new byte[32];
        for (int i19 = 0; i19 < 10; i19++) {
            int[] iArr = f16602a;
            int i20 = iArr[i19];
            byte b = bArr[i20];
            long j7 = copyOf[i19];
            bArr[i20] = (byte) (b | (j7 & 255));
            bArr[iArr[i19] + 1] = (byte) (bArr[r5] | ((j7 >> 8) & 255));
            bArr[iArr[i19] + 2] = (byte) (bArr[r5] | ((j7 >> 16) & 255));
            bArr[iArr[i19] + 3] = (byte) (bArr[r4] | ((j7 >> 24) & 255));
        }
        return bArr;
    }
}

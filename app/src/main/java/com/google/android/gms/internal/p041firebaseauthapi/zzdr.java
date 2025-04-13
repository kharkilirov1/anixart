package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzdr {
    /* renamed from: a */
    public static byte[] m8917a(byte[] bArr, byte[] bArr2) {
        long j2 = 67108863;
        long m8918b = (m8918b(bArr, 0) >> 0) & 67108863;
        long m8918b2 = (m8918b(bArr, 3) >> 2) & 67108863 & 67108611;
        long m8918b3 = (m8918b(bArr, 6) >> 4) & 67108863 & 67092735;
        long m8918b4 = (m8918b(bArr, 9) >> 6) & 67108863 & 66076671;
        long m8918b5 = (m8918b(bArr, 12) >> 8) & 67108863 & 1048575;
        long j3 = m8918b2 * 5;
        long j4 = m8918b3 * 5;
        long j5 = m8918b4 * 5;
        long j6 = m8918b5 * 5;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j12 = j2;
                long j13 = j8 + (j7 >> 26);
                long j14 = j13 & j12;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & j12;
                long j17 = j10 + (j15 >> 26);
                long j18 = j17 & j12;
                long j19 = ((j17 >> 26) * 5) + j11;
                long j20 = j19 & j12;
                long j21 = (j7 & j12) + (j19 >> 26);
                long j22 = j20 + 5;
                long j23 = (j22 >> 26) + j21;
                long j24 = j14 + (j23 >> 26);
                long j25 = j16 + (j24 >> 26);
                long j26 = (j18 + (j25 >> 26)) - 67108864;
                long j27 = j26 >> 63;
                long j28 = ~j27;
                long j29 = (j23 & 67108863 & j28) | (j21 & j27);
                long j30 = (j14 & j27) | (j24 & 67108863 & j28);
                long j31 = (j16 & j27) | (j25 & 67108863 & j28);
                long m8918b6 = m8918b(bArr, 16) + (((j20 & j27) | (j22 & 67108863 & j28) | (j29 << 26)) & 4294967295L);
                long m8918b7 = m8918b(bArr, 20) + (((j29 >> 6) | (j30 << 20)) & 4294967295L) + (m8918b6 >> 32);
                long m8918b8 = m8918b(bArr, 24) + (((j31 << 14) | (j30 >> 12)) & 4294967295L) + (m8918b7 >> 32);
                long m8918b9 = m8918b(bArr, 28);
                byte[] bArr4 = new byte[16];
                m8919c(bArr4, m8918b6 & 4294967295L, 0);
                m8919c(bArr4, m8918b7 & 4294967295L, 4);
                m8919c(bArr4, m8918b8 & 4294967295L, 8);
                m8919c(bArr4, ((((j31 >> 18) | (((j18 & j27) | (j26 & j28)) << 8)) & 4294967295L) + m8918b9 + (m8918b8 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i2, (byte) 0);
            }
            long m8918b10 = j11 + ((m8918b(bArr3, 0) >> 0) & j2);
            long m8918b11 = j7 + ((m8918b(bArr3, 3) >> 2) & j2);
            long m8918b12 = j8 + ((m8918b(bArr3, 6) >> 4) & j2);
            long m8918b13 = j9 + ((m8918b(bArr3, 9) >> 6) & j2);
            long m8918b14 = j10 + (((m8918b(bArr3, 12) >> 8) & j2) | (bArr3[16] << 24));
            long j32 = (m8918b14 * j3) + (m8918b13 * j4) + (m8918b12 * j5) + (m8918b11 * j6) + (m8918b10 * m8918b);
            long j33 = (m8918b14 * j4) + (m8918b13 * j5) + (m8918b12 * j6) + (m8918b11 * m8918b) + (m8918b10 * m8918b2) + (j32 >> 26);
            long j34 = (m8918b14 * j5) + (m8918b13 * j6) + (m8918b12 * m8918b) + (m8918b11 * m8918b2) + (m8918b10 * m8918b3) + (j33 >> 26);
            long j35 = (m8918b14 * j6) + (m8918b13 * m8918b) + (m8918b12 * m8918b2) + (m8918b11 * m8918b3) + (m8918b10 * m8918b4) + (j34 >> 26);
            long j36 = m8918b13 * m8918b2;
            long j37 = m8918b14 * m8918b;
            long j38 = j37 + j36 + (m8918b12 * m8918b3) + (m8918b11 * m8918b4) + (m8918b10 * m8918b5) + (j35 >> 26);
            long j39 = ((j38 >> 26) * 5) + (j32 & 67108863);
            j11 = j39 & 67108863;
            long j40 = (j33 & 67108863) + (j39 >> 26);
            i3 += 16;
            j10 = j38 & 67108863;
            j9 = j35 & 67108863;
            j8 = j34 & 67108863;
            i2 = 17;
            j7 = j40;
            j2 = 67108863;
        }
    }

    /* renamed from: b */
    public static long m8918b(byte[] bArr, int i2) {
        return (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: c */
    public static void m8919c(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }
}

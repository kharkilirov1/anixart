package com.google.android.gms.internal.p041firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zznn {
    /* renamed from: a */
    public static byte[] m9342a(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        int i3 = copyOf[31] & Byte.MAX_VALUE;
        copyOf[31] = (byte) i3;
        copyOf[31] = (byte) (i3 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i4 = 0; i4 < 7; i4++) {
            byte[][] bArr3 = zzml.f16580a;
            if (zzmj.m9314b(bArr3[i4], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(zznd.m9335a(bArr3[i4])));
            }
        }
        int i5 = 10;
        long[] jArr2 = new long[10];
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = zznc.f16602a[i6];
            jArr2[i6] = ((((copyOf2[i7 + 3] & 255) << 24) | (((copyOf2[i7] & 255) | ((copyOf2[i7 + 1] & 255) << 8)) | ((copyOf2[i7 + 2] & 255) << 16))) >> zznc.f16603b[i6]) & zznc.f16604c[i6 & 1];
        }
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        jArr5[0] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[0] = 1;
        System.arraycopy(jArr2, 0, jArr3, 0, 10);
        int i8 = 0;
        while (i8 < 32) {
            int i9 = copyOf[(32 - i8) - 1] & 255;
            int i10 = 8;
            while (i2 < i10) {
                int i11 = (i9 >> (7 - i2)) & 1;
                zzml.m9318a(jArr5, jArr3, i11);
                zzml.m9318a(jArr6, jArr4, i11);
                byte[] bArr4 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr5, i5);
                int i12 = i9;
                long[] jArr11 = new long[19];
                long[] jArr12 = jArr;
                long[] jArr13 = new long[19];
                int i13 = i8;
                long[] jArr14 = new long[19];
                int i14 = i2;
                long[] jArr15 = new long[19];
                long[] jArr16 = new long[19];
                long[] jArr17 = jArr10;
                long[] jArr18 = new long[19];
                long[] jArr19 = new long[19];
                zznc.m9333g(jArr5, jArr5, jArr6);
                zznc.m9332f(jArr6, copyOf3, jArr6);
                long[] copyOf4 = Arrays.copyOf(jArr3, 10);
                zznc.m9333g(jArr3, jArr3, jArr4);
                zznc.m9332f(jArr4, copyOf4, jArr4);
                zznc.m9328b(jArr15, jArr3, jArr6);
                zznc.m9328b(jArr16, jArr5, jArr4);
                zznc.m9330d(jArr15);
                zznc.m9329c(jArr15);
                zznc.m9330d(jArr16);
                zznc.m9329c(jArr16);
                long[] jArr20 = jArr3;
                System.arraycopy(jArr15, 0, copyOf4, 0, 10);
                zznc.m9333g(jArr15, jArr15, jArr16);
                zznc.m9332f(jArr16, copyOf4, jArr16);
                zznc.m9331e(jArr19, jArr15);
                zznc.m9331e(jArr18, jArr16);
                zznc.m9328b(jArr16, jArr18, jArr2);
                zznc.m9330d(jArr16);
                zznc.m9329c(jArr16);
                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                System.arraycopy(jArr16, 0, jArr8, 0, 10);
                zznc.m9331e(jArr13, jArr5);
                zznc.m9331e(jArr14, jArr6);
                zznc.m9328b(jArr9, jArr13, jArr14);
                zznc.m9330d(jArr9);
                zznc.m9329c(jArr9);
                zznc.m9332f(jArr14, jArr13, jArr14);
                Arrays.fill(jArr11, 10, 18, 0L);
                int i15 = 0;
                for (int i16 = 10; i15 < i16; i16 = 10) {
                    jArr11[i15] = jArr14[i15] * 121665;
                    i15++;
                }
                zznc.m9329c(jArr11);
                zznc.m9333g(jArr11, jArr11, jArr13);
                zznc.m9328b(jArr17, jArr14, jArr11);
                zznc.m9330d(jArr17);
                zznc.m9329c(jArr17);
                zzml.m9318a(jArr9, jArr7, i11);
                zzml.m9318a(jArr17, jArr8, i11);
                i2 = i14 + 1;
                jArr3 = jArr7;
                i9 = i12;
                copyOf = bArr4;
                jArr = jArr12;
                i8 = i13;
                jArr7 = jArr20;
                i5 = 10;
                i10 = 8;
                long[] jArr21 = jArr6;
                jArr6 = jArr17;
                jArr10 = jArr21;
                long[] jArr22 = jArr5;
                jArr5 = jArr9;
                jArr9 = jArr22;
                long[] jArr23 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr23;
            }
            i8++;
            i2 = 0;
            i5 = 10;
        }
        long[] jArr24 = jArr;
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = new long[10];
        long[] jArr34 = new long[10];
        long[] jArr35 = jArr3;
        long[] jArr36 = new long[10];
        zznc.m9331e(jArr26, jArr6);
        zznc.m9331e(jArr36, jArr26);
        zznc.m9331e(jArr34, jArr36);
        zznc.m9327a(jArr27, jArr34, jArr6);
        zznc.m9327a(jArr28, jArr27, jArr26);
        zznc.m9331e(jArr34, jArr28);
        zznc.m9327a(jArr29, jArr34, jArr27);
        zznc.m9331e(jArr34, jArr29);
        zznc.m9331e(jArr36, jArr34);
        zznc.m9331e(jArr34, jArr36);
        zznc.m9331e(jArr36, jArr34);
        zznc.m9331e(jArr34, jArr36);
        zznc.m9327a(jArr30, jArr34, jArr29);
        zznc.m9331e(jArr34, jArr30);
        zznc.m9331e(jArr36, jArr34);
        for (int i17 = 2; i17 < 10; i17 += 2) {
            zznc.m9331e(jArr34, jArr36);
            zznc.m9331e(jArr36, jArr34);
        }
        zznc.m9327a(jArr31, jArr36, jArr30);
        zznc.m9331e(jArr34, jArr31);
        zznc.m9331e(jArr36, jArr34);
        for (int i18 = 2; i18 < 20; i18 += 2) {
            zznc.m9331e(jArr34, jArr36);
            zznc.m9331e(jArr36, jArr34);
        }
        zznc.m9327a(jArr34, jArr36, jArr31);
        zznc.m9331e(jArr36, jArr34);
        zznc.m9331e(jArr34, jArr36);
        for (int i19 = 2; i19 < 10; i19 += 2) {
            zznc.m9331e(jArr36, jArr34);
            zznc.m9331e(jArr34, jArr36);
        }
        zznc.m9327a(jArr32, jArr34, jArr30);
        zznc.m9331e(jArr34, jArr32);
        zznc.m9331e(jArr36, jArr34);
        for (int i20 = 2; i20 < 50; i20 += 2) {
            zznc.m9331e(jArr34, jArr36);
            zznc.m9331e(jArr36, jArr34);
        }
        zznc.m9327a(jArr33, jArr36, jArr32);
        zznc.m9331e(jArr36, jArr33);
        zznc.m9331e(jArr34, jArr36);
        for (int i21 = 2; i21 < 100; i21 += 2) {
            zznc.m9331e(jArr36, jArr34);
            zznc.m9331e(jArr34, jArr36);
        }
        zznc.m9327a(jArr36, jArr34, jArr33);
        zznc.m9331e(jArr34, jArr36);
        zznc.m9331e(jArr36, jArr34);
        for (int i22 = 2; i22 < 50; i22 += 2) {
            zznc.m9331e(jArr34, jArr36);
            zznc.m9331e(jArr36, jArr34);
        }
        zznc.m9327a(jArr34, jArr36, jArr32);
        zznc.m9331e(jArr36, jArr34);
        zznc.m9331e(jArr34, jArr36);
        zznc.m9331e(jArr36, jArr34);
        zznc.m9331e(jArr34, jArr36);
        zznc.m9331e(jArr36, jArr34);
        zznc.m9327a(jArr25, jArr36, jArr28);
        zznc.m9327a(jArr24, jArr5, jArr25);
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        long[] jArr41 = new long[11];
        zznc.m9327a(jArr37, jArr2, jArr24);
        zznc.m9333g(jArr38, jArr2, jArr24);
        long[] jArr42 = new long[10];
        jArr42[0] = 486662;
        zznc.m9333g(jArr40, jArr38, jArr42);
        zznc.m9327a(jArr40, jArr40, jArr4);
        zznc.m9333g(jArr40, jArr40, jArr35);
        zznc.m9327a(jArr40, jArr40, jArr37);
        zznc.m9327a(jArr40, jArr40, jArr35);
        for (int i23 = 0; i23 < 10; i23++) {
            jArr39[i23] = jArr40[i23] * 4;
        }
        zznc.m9329c(jArr39);
        zznc.m9327a(jArr40, jArr37, jArr4);
        zznc.m9332f(jArr40, jArr40, jArr4);
        zznc.m9327a(jArr41, jArr38, jArr35);
        zznc.m9333g(jArr40, jArr40, jArr41);
        zznc.m9331e(jArr40, jArr40);
        if (zzmj.m9314b(zznc.m9334h(jArr39), zznc.m9334h(jArr40))) {
            return zznc.m9334h(jArr24);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zznd.m9335a(bArr2)));
    }

    /* renamed from: b */
    public static byte[] m9343b(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return m9342a(bArr, bArr2);
    }
}

package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzdi {

    /* renamed from: a */
    public static final int[] f16436a = m8910d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public static void m8907a(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        int i8 = (i7 >>> (-16)) | (i7 << 16);
        iArr[i5] = i8;
        int i9 = iArr[i4] + i8;
        iArr[i4] = i9;
        int i10 = iArr[i3] ^ i9;
        int i11 = (i10 >>> (-12)) | (i10 << 12);
        iArr[i3] = i11;
        int i12 = iArr[i2] + i11;
        iArr[i2] = i12;
        int i13 = iArr[i5] ^ i12;
        int i14 = (i13 >>> (-8)) | (i13 << 8);
        iArr[i5] = i14;
        int i15 = iArr[i4] + i14;
        iArr[i4] = i15;
        int i16 = iArr[i3] ^ i15;
        iArr[i3] = (i16 >>> (-7)) | (i16 << 7);
    }

    /* renamed from: b */
    public static void m8908b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f16436a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: c */
    public static void m8909c(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            m8907a(iArr, 0, 4, 8, 12);
            m8907a(iArr, 1, 5, 9, 13);
            m8907a(iArr, 2, 6, 10, 14);
            m8907a(iArr, 3, 7, 11, 15);
            m8907a(iArr, 0, 5, 10, 15);
            m8907a(iArr, 1, 6, 11, 12);
            m8907a(iArr, 2, 7, 8, 13);
            m8907a(iArr, 3, 4, 9, 14);
        }
    }

    /* renamed from: d */
    public static int[] m8910d(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}

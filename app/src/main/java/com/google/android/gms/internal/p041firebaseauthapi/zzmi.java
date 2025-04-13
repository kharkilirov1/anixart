package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzmi {
    /* renamed from: a */
    public static byte[] m9311a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        copyOf[length] = Byte.MIN_VALUE;
        return copyOf;
    }

    /* renamed from: b */
    public static byte[] m9312b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i2] = b2;
            if (i2 < 15) {
                bArr2[i2] = (byte) (((bArr[i2 + 1] >> 7) & 1) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}

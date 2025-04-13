package com.google.android.gms.internal.p041firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzmj {
    /* renamed from: a */
    public static final void m9313a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* renamed from: b */
    public static final boolean m9314b(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i2 = 0;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                i2 |= bArr[i3] ^ bArr2[i3];
            }
            if (i2 == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static byte[] m9315c(byte[]... bArr) throws GeneralSecurityException {
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i2 > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i2 += length;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i3, length2);
            i3 += length2;
        }
        return bArr3;
    }

    /* renamed from: d */
    public static final byte[] m9316d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return m9317e(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    /* renamed from: e */
    public static final byte[] m9317e(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }
}

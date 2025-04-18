package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes3.dex */
final class Utf8 {
    /* renamed from: a */
    public static int m33354a(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* renamed from: b */
    public static int m33355b(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* renamed from: c */
    public static int m33356c(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i4 == 1) {
            return m33354a(b, bArr[i2]);
        }
        if (i4 == 2) {
            return m33355b(b, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: d */
    public static boolean m33357d(byte[] bArr, int i2, int i3) {
        return m33358e(bArr, i2, i3) == 0;
    }

    /* renamed from: e */
    public static int m33358e(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b < 0) {
                if (b < -32) {
                    if (i4 >= i3) {
                        return b;
                    }
                    if (b >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i4 >= i3 - 1) {
                        return m33356c(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b2 = bArr[i4];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i2 = i5 + 1;
                        if (bArr[i5] > -65) {
                        }
                    }
                } else {
                    if (i4 >= i3 - 2) {
                        return m33356c(bArr, i4, i3);
                    }
                    int i6 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i7 = i6 + 1;
                            if (bArr[i6] <= -65) {
                                i4 = i7 + 1;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }
}

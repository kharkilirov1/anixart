package com.google.android.gms.internal.p041firebaseauthapi;

import p000a.C0000a;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzacu {

    /* renamed from: a */
    public static final zzacr f16362a;

    static {
        if (zzacp.f16359e && zzacp.f16358d) {
            int i2 = zzyg.f17108a;
        }
        f16362a = new zzacs();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m8806a(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 != 0) {
            if (i4 == 1) {
                byte b2 = bArr[i2];
                if (b <= -12 && b2 <= -65) {
                    return b ^ (b2 << 8);
                }
            } else {
                if (i4 != 2) {
                    throw new AssertionError();
                }
                byte b3 = bArr[i2];
                byte b4 = bArr[i2 + 1];
                if (b <= -12 && b3 <= -65 && b4 <= -65) {
                    return ((b3 << 8) ^ b) ^ (b4 << 16);
                }
            }
        } else if (b <= -12) {
            return b;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fd, code lost:
    
        return r9 + r0;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m8807b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p041firebaseauthapi.zzacu.m8807b(java.lang.CharSequence, byte[], int, int):int");
    }

    /* renamed from: c */
    public static int m8808c(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new zzact(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder m24u = C0000a.m24u("UTF-8 length does not fit in int: ");
        m24u.append(i4 + 4294967296L);
        throw new IllegalArgumentException(m24u.toString());
    }

    /* renamed from: d */
    public static String m8809d(byte[] bArr, int i2, int i3) throws zzaaf {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = bArr[i2];
            if (!zzacq.m8803a(b)) {
                break;
            }
            i2++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b2 = bArr[i2];
            if (zzacq.m8803a(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                i2 = i6;
                while (true) {
                    i5 = i7;
                    if (i2 < i4) {
                        byte b3 = bArr[i2];
                        if (!zzacq.m8803a(b3)) {
                            break;
                        }
                        i2++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b3;
                    }
                }
            } else if (b2 < -32) {
                if (i6 >= i4) {
                    throw zzaaf.m8580c();
                }
                int i8 = i6 + 1;
                int i9 = i5 + 1;
                byte b4 = bArr[i6];
                if (b2 < -62 || zzacq.m8804b(b4)) {
                    throw zzaaf.m8580c();
                }
                cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                i2 = i8;
                i5 = i9;
            } else {
                if (b2 < -16) {
                    if (i6 >= i4 - 1) {
                        throw zzaaf.m8580c();
                    }
                    int i10 = i6 + 1;
                    int i11 = i10 + 1;
                    int i12 = i5 + 1;
                    byte b5 = bArr[i6];
                    byte b6 = bArr[i10];
                    if (!zzacq.m8804b(b5)) {
                        if (b2 == -32) {
                            if (b5 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b5 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!zzacq.m8804b(b6)) {
                            cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                            i2 = i11;
                            i5 = i12;
                        }
                    }
                    throw zzaaf.m8580c();
                }
                if (i6 >= i4 - 2) {
                    throw zzaaf.m8580c();
                }
                int i13 = i6 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                byte b7 = bArr[i6];
                byte b8 = bArr[i13];
                byte b9 = bArr[i14];
                if (zzacq.m8804b(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || zzacq.m8804b(b8) || zzacq.m8804b(b9)) {
                    throw zzaaf.m8580c();
                }
                int i16 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i5] = (char) ((i16 >>> 10) + 55232);
                cArr[i5 + 1] = (char) ((i16 & 1023) + 56320);
                i5 += 2;
                i2 = i15;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* renamed from: e */
    public static boolean m8810e(byte[] bArr, int i2, int i3) {
        return f16362a.mo8805a(0, bArr, i2, i3) == 0;
    }
}

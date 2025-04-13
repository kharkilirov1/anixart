package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzdq {
    /* renamed from: a */
    public static int m8350a(byte[] bArr, int i2, zzdp zzdpVar) throws zzew {
        int m8359j = m8359j(bArr, i2, zzdpVar);
        int i3 = zzdpVar.f16073a;
        if (i3 < 0) {
            throw zzew.m8415b();
        }
        if (i3 > bArr.length - m8359j) {
            throw zzew.m8417d();
        }
        if (i3 == 0) {
            zzdpVar.f16075c = zzeb.f16083c;
            return m8359j;
        }
        zzdpVar.f16075c = zzeb.m8378t(bArr, m8359j, i3);
        return m8359j + i3;
    }

    /* renamed from: b */
    public static int m8351b(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m8352c(zzgb zzgbVar, byte[] bArr, int i2, int i3, int i4, zzdp zzdpVar) throws IOException {
        zzft zzftVar = (zzft) zzgbVar;
        Object mo8405d = ((zzeq) zzftVar.f16128e).mo8405d(4, null, null);
        int m8462p = zzftVar.m8462p(mo8405d, bArr, i2, i3, i4, zzdpVar);
        zzftVar.mo8449b(mo8405d);
        zzdpVar.f16075c = mo8405d;
        return m8462p;
    }

    /* renamed from: d */
    public static int m8353d(zzgb zzgbVar, byte[] bArr, int i2, int i3, zzdp zzdpVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = m8360k(i5, bArr, i4, zzdpVar);
            i5 = zzdpVar.f16073a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzew.m8417d();
        }
        Object mo8466x = zzgbVar.mo8466x();
        int i7 = i5 + i6;
        zzgbVar.mo8453f(mo8466x, bArr, i6, i7, zzdpVar);
        zzgbVar.mo8449b(mo8466x);
        zzdpVar.f16075c = mo8466x;
        return i7;
    }

    /* renamed from: e */
    public static int m8354e(zzgb<?> zzgbVar, int i2, byte[] bArr, int i3, int i4, zzeu<?> zzeuVar, zzdp zzdpVar) throws IOException {
        int m8353d = m8353d(zzgbVar, bArr, i3, i4, zzdpVar);
        zzeuVar.add(zzdpVar.f16075c);
        while (m8353d < i4) {
            int m8359j = m8359j(bArr, m8353d, zzdpVar);
            if (i2 != zzdpVar.f16073a) {
                break;
            }
            m8353d = m8353d(zzgbVar, bArr, m8359j, i4, zzdpVar);
            zzeuVar.add(zzdpVar.f16075c);
        }
        return m8353d;
    }

    /* renamed from: f */
    public static int m8355f(byte[] bArr, int i2, zzeu<?> zzeuVar, zzdp zzdpVar) throws IOException {
        zzer zzerVar = (zzer) zzeuVar;
        int m8359j = m8359j(bArr, i2, zzdpVar);
        int i3 = zzdpVar.f16073a + m8359j;
        while (m8359j < i3) {
            m8359j = m8359j(bArr, m8359j, zzdpVar);
            zzerVar.m8407d(zzdpVar.f16073a);
        }
        if (m8359j == i3) {
            return m8359j;
        }
        throw zzew.m8417d();
    }

    /* renamed from: g */
    public static int m8356g(byte[] bArr, int i2, zzdp zzdpVar) throws zzew {
        int m8359j = m8359j(bArr, i2, zzdpVar);
        int i3 = zzdpVar.f16073a;
        if (i3 < 0) {
            throw zzew.m8415b();
        }
        if (i3 == 0) {
            zzdpVar.f16075c = "";
            return m8359j;
        }
        zzdpVar.f16075c = new String(bArr, m8359j, i3, zzev.f16107a);
        return m8359j + i3;
    }

    /* renamed from: h */
    public static int m8357h(byte[] bArr, int i2, zzdp zzdpVar) throws zzew {
        int m8359j = m8359j(bArr, i2, zzdpVar);
        int i3 = zzdpVar.f16073a;
        if (i3 < 0) {
            throw zzew.m8415b();
        }
        if (i3 == 0) {
            zzdpVar.f16075c = "";
            return m8359j;
        }
        zzhb zzhbVar = zzhd.f16185a;
        int length = bArr.length;
        if ((m8359j | i3 | ((length - m8359j) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(m8359j), Integer.valueOf(i3)));
        }
        int i4 = m8359j + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (m8359j < i4) {
            byte b = bArr[m8359j];
            if (!zzha.m8527a(b)) {
                break;
            }
            m8359j++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (m8359j < i4) {
            int i6 = m8359j + 1;
            byte b2 = bArr[m8359j];
            if (zzha.m8527a(b2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b2;
                m8359j = i6;
                while (true) {
                    i5 = i7;
                    if (m8359j < i4) {
                        byte b3 = bArr[m8359j];
                        if (!zzha.m8527a(b3)) {
                            break;
                        }
                        m8359j++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b3;
                    }
                }
            } else if (b2 < -32) {
                if (i6 >= i4) {
                    throw zzew.m8414a();
                }
                int i8 = i6 + 1;
                int i9 = i5 + 1;
                byte b4 = bArr[i6];
                if (b2 < -62 || zzha.m8528b(b4)) {
                    throw zzew.m8414a();
                }
                cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & 63));
                m8359j = i8;
                i5 = i9;
            } else {
                if (b2 < -16) {
                    if (i6 >= i4 - 1) {
                        throw zzew.m8414a();
                    }
                    int i10 = i6 + 1;
                    int i11 = i10 + 1;
                    int i12 = i5 + 1;
                    byte b5 = bArr[i6];
                    byte b6 = bArr[i10];
                    if (!zzha.m8528b(b5)) {
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
                        if (!zzha.m8528b(b6)) {
                            cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                            m8359j = i11;
                            i5 = i12;
                        }
                    }
                    throw zzew.m8414a();
                }
                if (i6 >= i4 - 2) {
                    throw zzew.m8414a();
                }
                int i13 = i6 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                byte b7 = bArr[i6];
                byte b8 = bArr[i13];
                byte b9 = bArr[i14];
                if (zzha.m8528b(b7) || (((b7 + 112) + (b2 << 28)) >> 30) != 0 || zzha.m8528b(b8) || zzha.m8528b(b9)) {
                    throw zzew.m8414a();
                }
                int i16 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i5] = (char) ((i16 >>> 10) + 55232);
                cArr[i5 + 1] = (char) ((i16 & 1023) + 56320);
                i5 += 2;
                m8359j = i15;
            }
        }
        zzdpVar.f16075c = new String(cArr, 0, i5);
        return i4;
    }

    /* renamed from: i */
    public static int m8358i(int i2, byte[] bArr, int i3, int i4, zzgq zzgqVar, zzdp zzdpVar) throws zzew {
        if ((i2 >>> 3) == 0) {
            throw new zzew("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int m8362m = m8362m(bArr, i3, zzdpVar);
            zzgqVar.m8491b(i2, Long.valueOf(zzdpVar.f16074b));
            return m8362m;
        }
        if (i5 == 1) {
            zzgqVar.m8491b(i2, Long.valueOf(m8363n(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int m8359j = m8359j(bArr, i3, zzdpVar);
            int i6 = zzdpVar.f16073a;
            if (i6 < 0) {
                throw zzew.m8415b();
            }
            if (i6 > bArr.length - m8359j) {
                throw zzew.m8417d();
            }
            if (i6 == 0) {
                zzgqVar.m8491b(i2, zzeb.f16083c);
            } else {
                zzgqVar.m8491b(i2, zzeb.m8378t(bArr, m8359j, i6));
            }
            return m8359j + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzew("Protocol message contained an invalid tag (zero).");
            }
            zzgqVar.m8491b(i2, Integer.valueOf(m8351b(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzgq m8490a = zzgq.m8490a();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int m8359j2 = m8359j(bArr, i3, zzdpVar);
            int i9 = zzdpVar.f16073a;
            if (i9 == i7) {
                i8 = i9;
                i3 = m8359j2;
                break;
            }
            i8 = i9;
            i3 = m8358i(i9, bArr, m8359j2, i4, m8490a, zzdpVar);
        }
        if (i3 > i4 || i8 != i7) {
            throw zzew.m8416c();
        }
        zzgqVar.m8491b(i2, m8490a);
        return i3;
    }

    /* renamed from: j */
    public static int m8359j(byte[] bArr, int i2, zzdp zzdpVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return m8360k(b, bArr, i3, zzdpVar);
        }
        zzdpVar.f16073a = b;
        return i3;
    }

    /* renamed from: k */
    public static int m8360k(int i2, byte[] bArr, int i3, zzdp zzdpVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            zzdpVar.f16073a = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            zzdpVar.f16073a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzdpVar.f16073a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzdpVar.f16073a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzdpVar.f16073a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* renamed from: l */
    public static int m8361l(int i2, byte[] bArr, int i3, int i4, zzeu<?> zzeuVar, zzdp zzdpVar) {
        zzer zzerVar = (zzer) zzeuVar;
        int m8359j = m8359j(bArr, i3, zzdpVar);
        zzerVar.m8407d(zzdpVar.f16073a);
        while (m8359j < i4) {
            int m8359j2 = m8359j(bArr, m8359j, zzdpVar);
            if (i2 != zzdpVar.f16073a) {
                break;
            }
            m8359j = m8359j(bArr, m8359j2, zzdpVar);
            zzerVar.m8407d(zzdpVar.f16073a);
        }
        return m8359j;
    }

    /* renamed from: m */
    public static int m8362m(byte[] bArr, int i2, zzdp zzdpVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzdpVar.f16074b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b = bArr[i4];
            i4 = i6;
        }
        zzdpVar.f16074b = j3;
        return i4;
    }

    /* renamed from: n */
    public static long m8363n(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}

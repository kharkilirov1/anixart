package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzyi {
    /* renamed from: a */
    public static int m9491a(byte[] bArr, int i2, zzyh zzyhVar) throws zzaaf {
        int m9500j = m9500j(bArr, i2, zzyhVar);
        int i3 = zzyhVar.f17109a;
        if (i3 < 0) {
            throw zzaaf.m8582e();
        }
        if (i3 > bArr.length - m9500j) {
            throw zzaaf.m8584g();
        }
        if (i3 == 0) {
            zzyhVar.f17111c = zzyu.f17120c;
            return m9500j;
        }
        zzyhVar.f17111c = zzyu.m9523z(bArr, m9500j, i3);
        return m9500j + i3;
    }

    /* renamed from: b */
    public static int m9492b(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* renamed from: c */
    public static int m9493c(zzabo zzaboVar, byte[] bArr, int i2, int i3, int i4, zzyh zzyhVar) throws IOException {
        zzabf zzabfVar = (zzabf) zzaboVar;
        Object mo8659j = zzabfVar.mo8659j();
        int m8641F = zzabfVar.m8641F(mo8659j, bArr, i2, i3, i4, zzyhVar);
        zzabfVar.mo8652c(mo8659j);
        zzyhVar.f17111c = mo8659j;
        return m8641F;
    }

    /* renamed from: d */
    public static int m9494d(zzabo zzaboVar, byte[] bArr, int i2, int i3, zzyh zzyhVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = m9501k(i5, bArr, i4, zzyhVar);
            i5 = zzyhVar.f17109a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzaaf.m8584g();
        }
        Object mo8659j = zzaboVar.mo8659j();
        int i7 = i5 + i6;
        zzaboVar.mo8657h(mo8659j, bArr, i6, i7, zzyhVar);
        zzaboVar.mo8652c(mo8659j);
        zzyhVar.f17111c = mo8659j;
        return i7;
    }

    /* renamed from: e */
    public static int m9495e(zzabo zzaboVar, int i2, byte[] bArr, int i3, int i4, zzaac zzaacVar, zzyh zzyhVar) throws IOException {
        int m9494d = m9494d(zzaboVar, bArr, i3, i4, zzyhVar);
        zzaacVar.add(zzyhVar.f17111c);
        while (m9494d < i4) {
            int m9500j = m9500j(bArr, m9494d, zzyhVar);
            if (i2 != zzyhVar.f17109a) {
                break;
            }
            m9494d = m9494d(zzaboVar, bArr, m9500j, i4, zzyhVar);
            zzaacVar.add(zzyhVar.f17111c);
        }
        return m9494d;
    }

    /* renamed from: f */
    public static int m9496f(byte[] bArr, int i2, zzaac zzaacVar, zzyh zzyhVar) throws IOException {
        zzzy zzzyVar = (zzzy) zzaacVar;
        int m9500j = m9500j(bArr, i2, zzyhVar);
        int i3 = zzyhVar.f17109a + m9500j;
        while (m9500j < i3) {
            m9500j = m9500j(bArr, m9500j, zzyhVar);
            zzzyVar.m9659e(zzyhVar.f17109a);
        }
        if (m9500j == i3) {
            return m9500j;
        }
        throw zzaaf.m8584g();
    }

    /* renamed from: g */
    public static int m9497g(byte[] bArr, int i2, zzyh zzyhVar) throws zzaaf {
        int m9500j = m9500j(bArr, i2, zzyhVar);
        int i3 = zzyhVar.f17109a;
        if (i3 < 0) {
            throw zzaaf.m8582e();
        }
        if (i3 == 0) {
            zzyhVar.f17111c = "";
            return m9500j;
        }
        zzyhVar.f17111c = new String(bArr, m9500j, i3, zzaad.f16259a);
        return m9500j + i3;
    }

    /* renamed from: h */
    public static int m9498h(byte[] bArr, int i2, zzyh zzyhVar) throws zzaaf {
        int m9500j = m9500j(bArr, i2, zzyhVar);
        int i3 = zzyhVar.f17109a;
        if (i3 < 0) {
            throw zzaaf.m8582e();
        }
        if (i3 == 0) {
            zzyhVar.f17111c = "";
            return m9500j;
        }
        zzyhVar.f17111c = zzacu.m8809d(bArr, m9500j, i3);
        return m9500j + i3;
    }

    /* renamed from: i */
    public static int m9499i(int i2, byte[] bArr, int i3, int i4, zzacg zzacgVar, zzyh zzyhVar) throws zzaaf {
        if ((i2 >>> 3) == 0) {
            throw zzaaf.m8579b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int m9503m = m9503m(bArr, i3, zzyhVar);
            zzacgVar.m8762c(i2, Long.valueOf(zzyhVar.f17110b));
            return m9503m;
        }
        if (i5 == 1) {
            zzacgVar.m8762c(i2, Long.valueOf(m9504n(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int m9500j = m9500j(bArr, i3, zzyhVar);
            int i6 = zzyhVar.f17109a;
            if (i6 < 0) {
                throw zzaaf.m8582e();
            }
            if (i6 > bArr.length - m9500j) {
                throw zzaaf.m8584g();
            }
            if (i6 == 0) {
                zzacgVar.m8762c(i2, zzyu.f17120c);
            } else {
                zzacgVar.m8762c(i2, zzyu.m9523z(bArr, m9500j, i6));
            }
            return m9500j + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzaaf.m8579b();
            }
            zzacgVar.m8762c(i2, Integer.valueOf(m9492b(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzacg m8760b = zzacg.m8760b();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int m9500j2 = m9500j(bArr, i3, zzyhVar);
            int i9 = zzyhVar.f17109a;
            if (i9 == i7) {
                i8 = i9;
                i3 = m9500j2;
                break;
            }
            i8 = i9;
            i3 = m9499i(i9, bArr, m9500j2, i4, m8760b, zzyhVar);
        }
        if (i3 > i4 || i8 != i7) {
            throw zzaaf.m8583f();
        }
        zzacgVar.m8762c(i2, m8760b);
        return i3;
    }

    /* renamed from: j */
    public static int m9500j(byte[] bArr, int i2, zzyh zzyhVar) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return m9501k(b, bArr, i3, zzyhVar);
        }
        zzyhVar.f17109a = b;
        return i3;
    }

    /* renamed from: k */
    public static int m9501k(int i2, byte[] bArr, int i3, zzyh zzyhVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            zzyhVar.f17109a = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            zzyhVar.f17109a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            zzyhVar.f17109a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            zzyhVar.f17109a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzyhVar.f17109a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* renamed from: l */
    public static int m9502l(int i2, byte[] bArr, int i3, int i4, zzaac zzaacVar, zzyh zzyhVar) {
        zzzy zzzyVar = (zzzy) zzaacVar;
        int m9500j = m9500j(bArr, i3, zzyhVar);
        zzzyVar.m9659e(zzyhVar.f17109a);
        while (m9500j < i4) {
            int m9500j2 = m9500j(bArr, m9500j, zzyhVar);
            if (i2 != zzyhVar.f17109a) {
                break;
            }
            m9500j = m9500j(bArr, m9500j2, zzyhVar);
            zzzyVar.m9659e(zzyhVar.f17109a);
        }
        return m9500j;
    }

    /* renamed from: m */
    public static int m9503m(byte[] bArr, int i2, zzyh zzyhVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzyhVar.f17110b = j2;
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
        zzyhVar.f17110b = j3;
        return i4;
    }

    /* renamed from: n */
    public static long m9504n(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}

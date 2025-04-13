package com.google.android.exoplayer2.util;

import androidx.room.util.C0576a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class NalUnitUtil {

    /* renamed from: a */
    public static final byte[] f14658a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f14659b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f14660c = new Object();

    /* renamed from: d */
    public static int[] f14661d = new int[10];

    public static final class H265SpsData {

        /* renamed from: a */
        public final int f14662a;

        /* renamed from: b */
        public final boolean f14663b;

        /* renamed from: c */
        public final int f14664c;

        /* renamed from: d */
        public final int f14665d;

        /* renamed from: e */
        public final int[] f14666e;

        /* renamed from: f */
        public final int f14667f;

        /* renamed from: g */
        public final int f14668g;

        /* renamed from: h */
        public final int f14669h;

        /* renamed from: i */
        public final float f14670i;

        public H265SpsData(int i2, boolean z, int i3, int i4, int[] iArr, int i5, int i6, int i7, int i8, float f2) {
            this.f14662a = i2;
            this.f14663b = z;
            this.f14664c = i3;
            this.f14665d = i4;
            this.f14666e = iArr;
            this.f14667f = i5;
            this.f14668g = i7;
            this.f14669h = i8;
            this.f14670i = f2;
        }
    }

    public static final class PpsData {

        /* renamed from: a */
        public final int f14671a;

        /* renamed from: b */
        public final int f14672b;

        /* renamed from: c */
        public final boolean f14673c;

        public PpsData(int i2, int i3, boolean z) {
            this.f14671a = i2;
            this.f14672b = i3;
            this.f14673c = z;
        }
    }

    public static final class SpsData {

        /* renamed from: a */
        public final int f14674a;

        /* renamed from: b */
        public final int f14675b;

        /* renamed from: c */
        public final int f14676c;

        /* renamed from: d */
        public final int f14677d;

        /* renamed from: e */
        public final int f14678e;

        /* renamed from: f */
        public final int f14679f;

        /* renamed from: g */
        public final float f14680g;

        /* renamed from: h */
        public final boolean f14681h;

        /* renamed from: i */
        public final boolean f14682i;

        /* renamed from: j */
        public final int f14683j;

        /* renamed from: k */
        public final int f14684k;

        /* renamed from: l */
        public final int f14685l;

        /* renamed from: m */
        public final boolean f14686m;

        public SpsData(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f14674a = i2;
            this.f14675b = i3;
            this.f14676c = i4;
            this.f14677d = i5;
            this.f14678e = i6;
            this.f14679f = i7;
            this.f14680g = f2;
            this.f14681h = z;
            this.f14682i = z2;
            this.f14683j = i8;
            this.f14684k = i9;
            this.f14685l = i10;
            this.f14686m = z3;
        }
    }

    /* renamed from: a */
    public static void m7609a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m7610b(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        Assertions.m7516d(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            zArr[0] = false;
            zArr[1] = false;
            zArr[2] = false;
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            if ((bArr[i6] & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && bArr[i6] == 1) {
                    zArr[0] = false;
                    zArr[1] = false;
                    zArr[2] = false;
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    /* renamed from: c */
    public static H265SpsData m7611c(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2 + 2, i3);
        parsableNalUnitBitArray.m7672j(4);
        int m7667e = parsableNalUnitBitArray.m7667e(3);
        parsableNalUnitBitArray.m7671i();
        int m7667e2 = parsableNalUnitBitArray.m7667e(2);
        boolean m7666d = parsableNalUnitBitArray.m7666d();
        int m7667e3 = parsableNalUnitBitArray.m7667e(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (parsableNalUnitBitArray.m7666d()) {
                i8 |= 1 << i9;
            }
        }
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = parsableNalUnitBitArray.m7667e(8);
        }
        int m7667e4 = parsableNalUnitBitArray.m7667e(8);
        int i11 = 0;
        for (int i12 = 0; i12 < m7667e; i12++) {
            if (parsableNalUnitBitArray.m7666d()) {
                i11 += 89;
            }
            if (parsableNalUnitBitArray.m7666d()) {
                i11 += 8;
            }
        }
        parsableNalUnitBitArray.m7672j(i11);
        if (m7667e > 0) {
            parsableNalUnitBitArray.m7672j((8 - m7667e) * 2);
        }
        int m7668f = parsableNalUnitBitArray.m7668f();
        int m7668f2 = parsableNalUnitBitArray.m7668f();
        if (m7668f2 == 3) {
            parsableNalUnitBitArray.m7671i();
        }
        int m7668f3 = parsableNalUnitBitArray.m7668f();
        int m7668f4 = parsableNalUnitBitArray.m7668f();
        if (parsableNalUnitBitArray.m7666d()) {
            int m7668f5 = parsableNalUnitBitArray.m7668f();
            int m7668f6 = parsableNalUnitBitArray.m7668f();
            int m7668f7 = parsableNalUnitBitArray.m7668f();
            i5 = m7668f;
            int m7668f8 = parsableNalUnitBitArray.m7668f();
            int i13 = (m7668f2 == 1 || m7668f2 == 2) ? 2 : 1;
            i4 = m7667e4;
            int i14 = m7668f2 == 1 ? 2 : 1;
            int m4102C = C0576a.m4102C(m7668f5, m7668f6, i13, m7668f3);
            m7668f4 = C0576a.m4102C(m7668f7, m7668f8, i14, m7668f4);
            i6 = m4102C;
        } else {
            i4 = m7667e4;
            i5 = m7668f;
            i6 = m7668f3;
        }
        parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7668f();
        int m7668f9 = parsableNalUnitBitArray.m7668f();
        for (int i15 = parsableNalUnitBitArray.m7666d() ? 0 : m7667e; i15 <= m7667e; i15++) {
            parsableNalUnitBitArray.m7668f();
            parsableNalUnitBitArray.m7668f();
            parsableNalUnitBitArray.m7668f();
        }
        parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7668f();
        if (parsableNalUnitBitArray.m7666d() && parsableNalUnitBitArray.m7666d()) {
            int i16 = 4;
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                int i18 = 0;
                for (int i19 = 6; i18 < i19; i19 = 6) {
                    if (parsableNalUnitBitArray.m7666d()) {
                        int min = Math.min(64, 1 << ((i17 << 1) + 4));
                        if (i17 > 1) {
                            parsableNalUnitBitArray.m7669g();
                        }
                        for (int i20 = 0; i20 < min; i20++) {
                            parsableNalUnitBitArray.m7669g();
                        }
                    } else {
                        parsableNalUnitBitArray.m7668f();
                    }
                    i18 += i17 == 3 ? 3 : 1;
                }
                i17++;
                i16 = 4;
            }
        }
        parsableNalUnitBitArray.m7672j(2);
        if (parsableNalUnitBitArray.m7666d()) {
            parsableNalUnitBitArray.m7672j(8);
            parsableNalUnitBitArray.m7668f();
            parsableNalUnitBitArray.m7668f();
            parsableNalUnitBitArray.m7671i();
        }
        int m7668f10 = parsableNalUnitBitArray.m7668f();
        boolean z = false;
        int i21 = 0;
        for (int i22 = 0; i22 < m7668f10; i22++) {
            if (i22 != 0) {
                z = parsableNalUnitBitArray.m7666d();
            }
            if (z) {
                parsableNalUnitBitArray.m7671i();
                parsableNalUnitBitArray.m7668f();
                for (int i23 = 0; i23 <= i21; i23++) {
                    if (parsableNalUnitBitArray.m7666d()) {
                        parsableNalUnitBitArray.m7671i();
                    }
                }
            } else {
                int m7668f11 = parsableNalUnitBitArray.m7668f();
                int m7668f12 = parsableNalUnitBitArray.m7668f();
                int i24 = m7668f11 + m7668f12;
                for (int i25 = 0; i25 < m7668f11; i25++) {
                    parsableNalUnitBitArray.m7668f();
                    parsableNalUnitBitArray.m7671i();
                }
                for (int i26 = 0; i26 < m7668f12; i26++) {
                    parsableNalUnitBitArray.m7668f();
                    parsableNalUnitBitArray.m7671i();
                }
                i21 = i24;
            }
        }
        if (parsableNalUnitBitArray.m7666d()) {
            for (int i27 = 0; i27 < parsableNalUnitBitArray.m7668f(); i27++) {
                parsableNalUnitBitArray.m7672j(m7668f9 + 4 + 1);
            }
        }
        parsableNalUnitBitArray.m7672j(2);
        float f3 = 1.0f;
        if (parsableNalUnitBitArray.m7666d()) {
            if (parsableNalUnitBitArray.m7666d()) {
                int m7667e5 = parsableNalUnitBitArray.m7667e(8);
                if (m7667e5 == 255) {
                    int m7667e6 = parsableNalUnitBitArray.m7667e(16);
                    int m7667e7 = parsableNalUnitBitArray.m7667e(16);
                    if (m7667e6 != 0 && m7667e7 != 0) {
                        f3 = m7667e6 / m7667e7;
                    }
                } else {
                    float[] fArr = f14659b;
                    if (m7667e5 < fArr.length) {
                        f3 = fArr[m7667e5];
                    } else {
                        C0576a.m4123v(46, "Unexpected aspect_ratio_idc value: ", m7667e5, "NalUnitUtil");
                    }
                }
            }
            if (parsableNalUnitBitArray.m7666d()) {
                parsableNalUnitBitArray.m7671i();
            }
            if (parsableNalUnitBitArray.m7666d()) {
                parsableNalUnitBitArray.m7672j(4);
                if (parsableNalUnitBitArray.m7666d()) {
                    parsableNalUnitBitArray.m7672j(24);
                }
            }
            if (parsableNalUnitBitArray.m7666d()) {
                parsableNalUnitBitArray.m7668f();
                parsableNalUnitBitArray.m7668f();
            }
            parsableNalUnitBitArray.m7671i();
            if (parsableNalUnitBitArray.m7666d()) {
                m7668f4 *= 2;
            }
            f2 = f3;
            i7 = m7668f4;
        } else {
            i7 = m7668f4;
            f2 = 1.0f;
        }
        return new H265SpsData(m7667e2, m7666d, m7667e3, i8, iArr, i4, i5, i6, i7, f2);
    }

    /* renamed from: d */
    public static PpsData m7612d(byte[] bArr, int i2, int i3) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2 + 1, i3);
        int m7668f = parsableNalUnitBitArray.m7668f();
        int m7668f2 = parsableNalUnitBitArray.m7668f();
        parsableNalUnitBitArray.m7671i();
        return new PpsData(m7668f, m7668f2, parsableNalUnitBitArray.m7666d());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.util.NalUnitUtil.SpsData m7613e(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.NalUnitUtil.m7613e(byte[], int, int):com.google.android.exoplayer2.util.NalUnitUtil$SpsData");
    }

    /* renamed from: f */
    public static int m7614f(byte[] bArr, int i2) {
        int i3;
        synchronized (f14660c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                        break;
                    }
                    i4++;
                }
                if (i4 < i2) {
                    int[] iArr = f14661d;
                    if (iArr.length <= i5) {
                        f14661d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f14661d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = f14661d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }
}

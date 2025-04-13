package com.yandex.mobile.ads.impl;

import androidx.room.util.C0576a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ch0 {

    /* renamed from: a */
    public static final byte[] f49243a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f49244b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f49245c = new Object();

    /* renamed from: d */
    private static int[] f49246d = new int[10];

    /* renamed from: com.yandex.mobile.ads.impl.ch0$a */
    public static final class C4923a {

        /* renamed from: a */
        public final int f49247a;

        /* renamed from: b */
        public final boolean f49248b;

        /* renamed from: c */
        public final int f49249c;

        /* renamed from: d */
        public final int f49250d;

        /* renamed from: e */
        public final int[] f49251e;

        /* renamed from: f */
        public final int f49252f;

        /* renamed from: g */
        public final float f49253g;

        public C4923a(int i2, boolean z, int i3, int i4, int[] iArr, int i5, int i6, int i7, float f2) {
            this.f49247a = i2;
            this.f49248b = z;
            this.f49249c = i3;
            this.f49250d = i4;
            this.f49251e = iArr;
            this.f49252f = i5;
            this.f49253g = f2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ch0$b */
    public static final class C4924b {

        /* renamed from: a */
        public final int f49254a;

        /* renamed from: b */
        public final int f49255b;

        /* renamed from: c */
        public final boolean f49256c;

        public C4924b(int i2, int i3, boolean z) {
            this.f49254a = i2;
            this.f49255b = i3;
            this.f49256c = z;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ch0$c */
    public static final class C4925c {

        /* renamed from: a */
        public final int f49257a;

        /* renamed from: b */
        public final int f49258b;

        /* renamed from: c */
        public final int f49259c;

        /* renamed from: d */
        public final int f49260d;

        /* renamed from: e */
        public final int f49261e;

        /* renamed from: f */
        public final int f49262f;

        /* renamed from: g */
        public final float f49263g;

        /* renamed from: h */
        public final boolean f49264h;

        /* renamed from: i */
        public final boolean f49265i;

        /* renamed from: j */
        public final int f49266j;

        /* renamed from: k */
        public final int f49267k;

        /* renamed from: l */
        public final int f49268l;

        /* renamed from: m */
        public final boolean f49269m;

        public C4925c(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.f49257a = i2;
            this.f49258b = i3;
            this.f49259c = i4;
            this.f49260d = i5;
            this.f49261e = i6;
            this.f49262f = i7;
            this.f49263g = f2;
            this.f49264h = z;
            this.f49265i = z2;
            this.f49266j = i8;
            this.f49267k = i9;
            this.f49268l = i10;
            this.f49269m = z3;
        }
    }

    /* renamed from: a */
    public static int m23260a(int i2, byte[] bArr) {
        int i3;
        synchronized (f49245c) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = f49246d;
                    if (iArr.length <= i5) {
                        f49246d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f49246d[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = f49246d[i8] - i7;
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.ch0.C4925c m23264b(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ch0.m23264b(byte[], int, int):com.yandex.mobile.ads.impl.ch0$c");
    }

    /* renamed from: a */
    public static C4923a m23262a(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        bp0 bp0Var = new bp0(bArr, i2 + 2, i3);
        bp0Var.m22919d(4);
        int m22915b = bp0Var.m22915b(3);
        bp0Var.m22920e();
        int m22915b2 = bp0Var.m22915b(2);
        boolean m22916b = bp0Var.m22916b();
        int m22915b3 = bp0Var.m22915b(5);
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (bp0Var.m22916b()) {
                i10 |= 1 << i11;
            }
        }
        int[] iArr2 = new int[6];
        for (int i12 = 0; i12 < 6; i12++) {
            iArr2[i12] = bp0Var.m22915b(8);
        }
        int m22915b4 = bp0Var.m22915b(8);
        int i13 = 0;
        for (int i14 = 0; i14 < m22915b; i14++) {
            if (bp0Var.m22916b()) {
                i13 += 89;
            }
            if (bp0Var.m22916b()) {
                i13 += 8;
            }
        }
        bp0Var.m22919d(i13);
        if (m22915b > 0) {
            bp0Var.m22919d((8 - m22915b) * 2);
        }
        bp0Var.m22918d();
        int m22918d = bp0Var.m22918d();
        if (m22918d == 3) {
            bp0Var.m22920e();
        }
        int m22918d2 = bp0Var.m22918d();
        int m22918d3 = bp0Var.m22918d();
        if (bp0Var.m22916b()) {
            int m22918d4 = bp0Var.m22918d();
            int m22918d5 = bp0Var.m22918d();
            int m22918d6 = bp0Var.m22918d();
            i4 = m22915b4;
            int m22918d7 = bp0Var.m22918d();
            int i15 = (m22918d == 1 || m22918d == 2) ? 2 : 1;
            int i16 = m22918d == 1 ? 2 : 1;
            int m4102C = C0576a.m4102C(m22918d4, m22918d5, i15, m22918d2);
            m22918d3 = C0576a.m4102C(m22918d6, m22918d7, i16, m22918d3);
            m22918d2 = m4102C;
        } else {
            i4 = m22915b4;
        }
        bp0Var.m22918d();
        bp0Var.m22918d();
        int m22918d8 = bp0Var.m22918d();
        for (int i17 = bp0Var.m22916b() ? 0 : m22915b; i17 <= m22915b; i17++) {
            bp0Var.m22918d();
            bp0Var.m22918d();
            bp0Var.m22918d();
        }
        bp0Var.m22918d();
        bp0Var.m22918d();
        bp0Var.m22918d();
        bp0Var.m22918d();
        bp0Var.m22918d();
        bp0Var.m22918d();
        if (bp0Var.m22916b() && bp0Var.m22916b()) {
            int i18 = 0;
            while (true) {
                if (i18 >= 4) {
                    break;
                }
                int i19 = 0;
                for (int i20 = 6; i19 < i20; i20 = 6) {
                    if (!bp0Var.m22916b()) {
                        bp0Var.m22918d();
                    } else {
                        int min = Math.min(64, 1 << ((i18 << 1) + 4));
                        if (i18 > 1) {
                            bp0Var.m22917c();
                        }
                        for (int i21 = 0; i21 < min; i21++) {
                            bp0Var.m22917c();
                        }
                    }
                    i19 += i18 == 3 ? 3 : 1;
                }
                i18++;
            }
        }
        bp0Var.m22919d(2);
        if (bp0Var.m22916b()) {
            bp0Var.m22919d(8);
            bp0Var.m22918d();
            bp0Var.m22918d();
            bp0Var.m22920e();
        }
        int m22918d9 = bp0Var.m22918d();
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i22 = -1;
        int i23 = 0;
        int i24 = -1;
        while (i23 < m22918d9) {
            if (i23 != 0 && bp0Var.m22916b()) {
                int i25 = i22 + i24;
                int m22918d10 = (1 - ((bp0Var.m22916b() ? 1 : 0) * 2)) * (bp0Var.m22918d() + 1);
                i6 = m22918d9;
                int i26 = i25 + 1;
                i9 = m22918d2;
                boolean[] zArr = new boolean[i26];
                iArr = iArr2;
                for (int i27 = 0; i27 <= i25; i27++) {
                    if (!bp0Var.m22916b()) {
                        zArr[i27] = bp0Var.m22916b();
                    } else {
                        zArr[i27] = true;
                    }
                }
                int[] iArr5 = new int[i26];
                int[] iArr6 = new int[i26];
                int i28 = 0;
                for (int i29 = i24 - 1; i29 >= 0; i29--) {
                    int i30 = iArr4[i29] + m22918d10;
                    if (i30 < 0 && zArr[i22 + i29]) {
                        iArr5[i28] = i30;
                        i28++;
                    }
                }
                if (m22918d10 < 0 && zArr[i25]) {
                    iArr5[i28] = m22918d10;
                    i28++;
                }
                i7 = m22915b3;
                i8 = i10;
                int i31 = i28;
                for (int i32 = 0; i32 < i22; i32++) {
                    int i33 = iArr3[i32] + m22918d10;
                    if (i33 < 0 && zArr[i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i31);
                int i34 = 0;
                for (int i35 = i22 - 1; i35 >= 0; i35--) {
                    int i36 = iArr3[i35] + m22918d10;
                    if (i36 > 0 && zArr[i35]) {
                        iArr6[i34] = i36;
                        i34++;
                    }
                }
                if (m22918d10 > 0 && zArr[i25]) {
                    iArr6[i34] = m22918d10;
                    i34++;
                }
                int i37 = i34;
                for (int i38 = 0; i38 < i24; i38++) {
                    int i39 = iArr4[i38] + m22918d10;
                    if (i39 > 0 && zArr[i22 + i38]) {
                        iArr6[i37] = i39;
                        i37++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i37);
                i22 = i31;
                iArr3 = copyOf;
                i24 = i37;
            } else {
                i6 = m22918d9;
                i7 = m22915b3;
                i8 = i10;
                iArr = iArr2;
                i9 = m22918d2;
                int m22918d11 = bp0Var.m22918d();
                int m22918d12 = bp0Var.m22918d();
                iArr3 = new int[m22918d11];
                for (int i40 = 0; i40 < m22918d11; i40++) {
                    iArr3[i40] = bp0Var.m22918d() + 1;
                    bp0Var.m22920e();
                }
                int i41 = 1;
                int[] iArr7 = new int[m22918d12];
                int i42 = 0;
                while (i42 < m22918d12) {
                    iArr7[i42] = bp0Var.m22918d() + i41;
                    bp0Var.m22920e();
                    i42++;
                    i41 = 1;
                }
                i22 = m22918d11;
                i24 = m22918d12;
                iArr4 = iArr7;
            }
            i23++;
            m22918d9 = i6;
            m22918d2 = i9;
            iArr2 = iArr;
            m22915b3 = i7;
            i10 = i8;
        }
        int i43 = m22915b3;
        int i44 = i10;
        int[] iArr8 = iArr2;
        int i45 = m22918d2;
        if (bp0Var.m22916b()) {
            for (int i46 = 0; i46 < bp0Var.m22918d(); i46++) {
                bp0Var.m22919d(m22918d8 + 4 + 1);
            }
        }
        bp0Var.m22919d(2);
        float f3 = 1.0f;
        if (bp0Var.m22916b()) {
            if (bp0Var.m22916b()) {
                int m22915b5 = bp0Var.m22915b(8);
                if (m22915b5 == 255) {
                    int m22915b6 = bp0Var.m22915b(16);
                    int m22915b7 = bp0Var.m22915b(16);
                    if (m22915b6 != 0 && m22915b7 != 0) {
                        f3 = m22915b6 / m22915b7;
                    }
                } else {
                    float[] fArr = f49244b;
                    if (m22915b5 < 17) {
                        f3 = fArr[m22915b5];
                    } else {
                        c80.m23073a("Unexpected aspect_ratio_idc value: ", m22915b5, "NalUnitUtil");
                    }
                }
            }
            if (bp0Var.m22916b()) {
                bp0Var.m22920e();
            }
            if (bp0Var.m22916b()) {
                bp0Var.m22919d(4);
                if (bp0Var.m22916b()) {
                    bp0Var.m22919d(24);
                }
            }
            if (bp0Var.m22916b()) {
                bp0Var.m22918d();
                bp0Var.m22918d();
            }
            bp0Var.m22920e();
            if (bp0Var.m22916b()) {
                m22918d3 *= 2;
            }
            f2 = f3;
            i5 = m22918d3;
        } else {
            i5 = m22918d3;
            f2 = 1.0f;
        }
        return new C4923a(m22915b2, m22916b, i43, i44, iArr8, i4, i45, i5, f2);
    }

    /* renamed from: a */
    public static int m23261a(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        C5220ia.m25476b(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            m23263a(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            m23263a(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            m23263a(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b = bArr[i6];
            if ((b & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b == 1) {
                    m23263a(zArr);
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

    /* renamed from: a */
    public static void m23263a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}

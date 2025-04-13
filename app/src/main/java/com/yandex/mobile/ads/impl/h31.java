package com.yandex.mobile.ads.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class h31 {

    /* renamed from: a */
    private final int f50807a;

    /* renamed from: b */
    private final int f50808b;

    /* renamed from: c */
    private final float f50809c;

    /* renamed from: d */
    private final float f50810d;

    /* renamed from: e */
    private final float f50811e;

    /* renamed from: f */
    private final int f50812f;

    /* renamed from: g */
    private final int f50813g;

    /* renamed from: h */
    private final int f50814h;

    /* renamed from: i */
    private final short[] f50815i;

    /* renamed from: j */
    private short[] f50816j;

    /* renamed from: k */
    private int f50817k;

    /* renamed from: l */
    private short[] f50818l;

    /* renamed from: m */
    private int f50819m;

    /* renamed from: n */
    private short[] f50820n;

    /* renamed from: o */
    private int f50821o;

    /* renamed from: p */
    private int f50822p;

    /* renamed from: q */
    private int f50823q;

    /* renamed from: r */
    private int f50824r;

    /* renamed from: s */
    private int f50825s;

    /* renamed from: t */
    private int f50826t;

    /* renamed from: u */
    private int f50827u;

    /* renamed from: v */
    private int f50828v;

    public h31(int i2, int i3, float f2, float f3, int i4) {
        this.f50807a = i2;
        this.f50808b = i3;
        this.f50809c = f2;
        this.f50810d = f3;
        this.f50811e = i2 / i4;
        this.f50812f = i2 / 400;
        int i5 = i2 / 65;
        this.f50813g = i5;
        int i6 = i5 * 2;
        this.f50814h = i6;
        this.f50815i = new short[i6];
        int i7 = i6 * i3;
        this.f50816j = new short[i7];
        this.f50818l = new short[i7];
        this.f50820n = new short[i7];
    }

    /* renamed from: d */
    private void m25042d() {
        int i2;
        double d;
        int i3;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f50819m;
        float f3 = this.f50809c;
        float f4 = this.f50810d;
        float f5 = f3 / f4;
        float f6 = this.f50811e * f4;
        double d2 = f5;
        int i10 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i11 = this.f50817k;
            if (i11 >= this.f50814h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f50824r;
                    if (i13 > 0) {
                        int min = Math.min(this.f50814h, i13);
                        short[] sArr = this.f50816j;
                        short[] m25041a = m25041a(this.f50818l, this.f50819m, min);
                        this.f50818l = m25041a;
                        int i14 = this.f50808b;
                        System.arraycopy(sArr, i12 * i14, m25041a, this.f50819m * i14, i14 * min);
                        this.f50819m += min;
                        this.f50824r -= min;
                        i12 += min;
                        f2 = f5;
                        d = d2;
                    } else {
                        short[] sArr2 = this.f50816j;
                        int i15 = this.f50807a;
                        int i16 = i15 > 4000 ? i15 / 4000 : 1;
                        int i17 = this.f50808b;
                        if (i17 == i10 && i16 == i10) {
                            i2 = m25040a(sArr2, i12, this.f50812f, this.f50813g);
                        } else {
                            int i18 = this.f50814h / i16;
                            int i19 = i17 * i16;
                            int i20 = i17 * i12;
                            for (int i21 = 0; i21 < i18; i21++) {
                                int i22 = 0;
                                for (int i23 = 0; i23 < i19; i23++) {
                                    i22 += sArr2[(i21 * i19) + i20 + i23];
                                }
                                this.f50815i[i21] = (short) (i22 / i19);
                            }
                            int m25040a = m25040a(this.f50815i, 0, this.f50812f / i16, this.f50813g / i16);
                            if (i16 != 1) {
                                int i24 = m25040a * i16;
                                int i25 = i16 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                int i28 = this.f50812f;
                                if (i26 < i28) {
                                    i26 = i28;
                                }
                                int i29 = this.f50813g;
                                if (i27 > i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f50808b;
                                if (i30 == 1) {
                                    i2 = m25040a(sArr2, i12, i26, i27);
                                } else {
                                    int i31 = this.f50814h / 1;
                                    int i32 = i30 * 1;
                                    int i33 = i30 * i12;
                                    int i34 = 0;
                                    while (i34 < i31) {
                                        int i35 = 0;
                                        for (int i36 = 0; i36 < i32; i36++) {
                                            i35 += sArr2[(i34 * i32) + i33 + i36];
                                        }
                                        this.f50815i[i34] = (short) (i35 / i32);
                                        i34++;
                                        sArr2 = sArr2;
                                    }
                                    i2 = m25040a(this.f50815i, 0, i26, i27);
                                }
                            } else {
                                i2 = m25040a;
                            }
                        }
                        int i37 = this.f50827u;
                        int i38 = i37 != 0 && this.f50825s != 0 && this.f50828v <= i37 * 3 && i37 * 2 > this.f50826t * 3 ? this.f50825s : i2;
                        this.f50826t = i37;
                        this.f50825s = i2;
                        if (d2 > 1.0d) {
                            short[] sArr3 = this.f50816j;
                            if (f5 >= 2.0f) {
                                i4 = (int) (i38 / (f5 - 1.0f));
                            } else {
                                this.f50824r = (int) (((2.0f - f5) * i38) / (f5 - 1.0f));
                                i4 = i38;
                            }
                            short[] m25041a2 = m25041a(this.f50818l, this.f50819m, i4);
                            this.f50818l = m25041a2;
                            int i39 = this.f50808b;
                            int i40 = this.f50819m;
                            int i41 = i12 + i38;
                            int i42 = 0;
                            while (i42 < i39) {
                                int i43 = (i40 * i39) + i42;
                                int i44 = (i41 * i39) + i42;
                                int i45 = (i12 * i39) + i42;
                                double d3 = d2;
                                for (int i46 = 0; i46 < i4; i46++) {
                                    m25041a2[i43] = (short) (((sArr3[i44] * i46) + ((i4 - i46) * sArr3[i45])) / i4);
                                    i43 += i39;
                                    i45 += i39;
                                    i44 += i39;
                                }
                                i42++;
                                d2 = d3;
                            }
                            d = d2;
                            this.f50819m += i4;
                            f2 = f5;
                            i12 = i38 + i4 + i12;
                        } else {
                            d = d2;
                            short[] sArr4 = this.f50816j;
                            if (f5 < 0.5f) {
                                i3 = (int) ((i38 * f5) / (1.0f - f5));
                            } else {
                                this.f50824r = (int) ((((2.0f * f5) - 1.0f) * i38) / (1.0f - f5));
                                i3 = i38;
                            }
                            int i47 = i38 + i3;
                            short[] m25041a3 = m25041a(this.f50818l, this.f50819m, i47);
                            this.f50818l = m25041a3;
                            int i48 = this.f50808b;
                            System.arraycopy(sArr4, i12 * i48, m25041a3, this.f50819m * i48, i48 * i38);
                            int i49 = this.f50808b;
                            short[] sArr5 = this.f50818l;
                            int i50 = this.f50819m + i38;
                            int i51 = i38 + i12;
                            int i52 = 0;
                            while (i52 < i49) {
                                int i53 = (i50 * i49) + i52;
                                int i54 = (i12 * i49) + i52;
                                int i55 = (i51 * i49) + i52;
                                float f7 = f5;
                                int i56 = 0;
                                while (i56 < i3) {
                                    sArr5[i53] = (short) (((sArr4[i54] * i56) + ((i3 - i56) * sArr4[i55])) / i3);
                                    i53 += i49;
                                    i55 += i49;
                                    i54 += i49;
                                    i56++;
                                    sArr4 = sArr4;
                                }
                                i52++;
                                f5 = f7;
                            }
                            f2 = f5;
                            this.f50819m += i47;
                            i12 += i3;
                        }
                    }
                    if (this.f50814h + i12 > i11) {
                        break;
                    }
                    f5 = f2;
                    d2 = d;
                    i10 = 1;
                }
                int i57 = this.f50817k - i12;
                short[] sArr6 = this.f50816j;
                int i58 = this.f50808b;
                System.arraycopy(sArr6, i12 * i58, sArr6, 0, i58 * i57);
                this.f50817k = i57;
            }
        } else {
            short[] sArr7 = this.f50816j;
            int i59 = this.f50817k;
            short[] m25041a4 = m25041a(this.f50818l, i9, i59);
            this.f50818l = m25041a4;
            int i60 = this.f50808b;
            System.arraycopy(sArr7, i60 * 0, m25041a4, this.f50819m * i60, i60 * i59);
            this.f50819m += i59;
            this.f50817k = 0;
        }
        if (f6 == 1.0f || this.f50819m == i9) {
            return;
        }
        int i61 = this.f50807a;
        int i62 = (int) (i61 / f6);
        while (true) {
            if (i62 <= 16384 && i61 <= 16384) {
                break;
            }
            i62 /= 2;
            i61 /= 2;
        }
        int i63 = this.f50819m - i9;
        short[] m25041a5 = m25041a(this.f50820n, this.f50821o, i63);
        this.f50820n = m25041a5;
        short[] sArr8 = this.f50818l;
        int i64 = this.f50808b;
        System.arraycopy(sArr8, i9 * i64, m25041a5, this.f50821o * i64, i64 * i63);
        this.f50819m = i9;
        this.f50821o += i63;
        int i65 = 0;
        while (true) {
            i5 = this.f50821o;
            i6 = i5 - 1;
            if (i65 >= i6) {
                break;
            }
            while (true) {
                i7 = this.f50822p + 1;
                int i66 = i7 * i62;
                i8 = this.f50823q;
                if (i66 <= i8 * i61) {
                    break;
                }
                this.f50818l = m25041a(this.f50818l, this.f50819m, 1);
                int i67 = 0;
                while (true) {
                    int i68 = this.f50808b;
                    if (i67 < i68) {
                        short[] sArr9 = this.f50818l;
                        int i69 = (this.f50819m * i68) + i67;
                        short[] sArr10 = this.f50820n;
                        int i70 = (i65 * i68) + i67;
                        short s = sArr10[i70];
                        short s2 = sArr10[i70 + i68];
                        int i71 = this.f50823q * i61;
                        int i72 = this.f50822p;
                        int i73 = i72 * i62;
                        int i74 = (i72 + 1) * i62;
                        int i75 = i74 - i71;
                        int i76 = i74 - i73;
                        sArr9[i69] = (short) ((((i76 - i75) * s2) + (s * i75)) / i76);
                        i67++;
                    }
                }
                this.f50823q++;
                this.f50819m++;
            }
            this.f50822p = i7;
            if (i7 == i61) {
                this.f50822p = 0;
                C5220ia.m25476b(i8 == i62);
                this.f50823q = 0;
            }
            i65++;
        }
        if (i6 == 0) {
            return;
        }
        short[] sArr11 = this.f50820n;
        int i77 = this.f50808b;
        System.arraycopy(sArr11, i6 * i77, sArr11, 0, (i5 - i6) * i77);
        this.f50821o -= i6;
    }

    /* renamed from: a */
    public final void m25044a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f50808b, this.f50819m);
        shortBuffer.put(this.f50818l, 0, this.f50808b * min);
        int i2 = this.f50819m - min;
        this.f50819m = i2;
        short[] sArr = this.f50818l;
        int i3 = this.f50808b;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    /* renamed from: b */
    public final void m25046b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f50808b;
        int i3 = remaining / i2;
        short[] m25041a = m25041a(this.f50816j, this.f50817k, i3);
        this.f50816j = m25041a;
        shortBuffer.get(m25041a, this.f50817k * this.f50808b, ((i2 * i3) * 2) / 2);
        this.f50817k += i3;
        m25042d();
    }

    /* renamed from: c */
    public final int m25047c() {
        return this.f50817k * this.f50808b * 2;
    }

    /* renamed from: e */
    public final void m25048e() {
        int i2;
        int i3 = this.f50817k;
        float f2 = this.f50809c;
        float f3 = this.f50810d;
        int i4 = this.f50819m + ((int) ((((i3 / (f2 / f3)) + this.f50821o) / (this.f50811e * f3)) + 0.5f));
        this.f50816j = m25041a(this.f50816j, i3, (this.f50814h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f50814h * 2;
            int i6 = this.f50808b;
            if (i5 >= i2 * i6) {
                break;
            }
            this.f50816j[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.f50817k = i2 + this.f50817k;
        m25042d();
        if (this.f50819m > i4) {
            this.f50819m = i4;
        }
        this.f50817k = 0;
        this.f50824r = 0;
        this.f50821o = 0;
    }

    /* renamed from: a */
    public final void m25043a() {
        this.f50817k = 0;
        this.f50819m = 0;
        this.f50821o = 0;
        this.f50822p = 0;
        this.f50823q = 0;
        this.f50824r = 0;
        this.f50825s = 0;
        this.f50826t = 0;
        this.f50827u = 0;
        this.f50828v = 0;
    }

    /* renamed from: b */
    public final int m25045b() {
        return this.f50819m * this.f50808b * 2;
    }

    /* renamed from: a */
    private short[] m25041a(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f50808b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    /* renamed from: a */
    private int m25040a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f50808b;
        int i6 = 1;
        int i7 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.f50827u = i6 / i8;
        this.f50828v = i9 / i7;
        return i8;
    }
}

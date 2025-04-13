package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class Sonic {

    /* renamed from: a */
    public final int f10507a;

    /* renamed from: b */
    public final int f10508b;

    /* renamed from: c */
    public final float f10509c;

    /* renamed from: d */
    public final float f10510d;

    /* renamed from: e */
    public final float f10511e;

    /* renamed from: f */
    public final int f10512f;

    /* renamed from: g */
    public final int f10513g;

    /* renamed from: h */
    public final int f10514h;

    /* renamed from: i */
    public final short[] f10515i;

    /* renamed from: j */
    public short[] f10516j;

    /* renamed from: k */
    public int f10517k;

    /* renamed from: l */
    public short[] f10518l;

    /* renamed from: m */
    public int f10519m;

    /* renamed from: n */
    public short[] f10520n;

    /* renamed from: o */
    public int f10521o;

    /* renamed from: p */
    public int f10522p;

    /* renamed from: q */
    public int f10523q;

    /* renamed from: r */
    public int f10524r;

    /* renamed from: s */
    public int f10525s;

    /* renamed from: t */
    public int f10526t;

    /* renamed from: u */
    public int f10527u;

    /* renamed from: v */
    public int f10528v;

    public Sonic(int i2, int i3, float f2, float f3, int i4) {
        this.f10507a = i2;
        this.f10508b = i3;
        this.f10509c = f2;
        this.f10510d = f3;
        this.f10511e = i2 / i4;
        this.f10512f = i2 / 400;
        int i5 = i2 / 65;
        this.f10513g = i5;
        int i6 = i5 * 2;
        this.f10514h = i6;
        this.f10515i = new short[i6];
        this.f10516j = new short[i6 * i3];
        this.f10518l = new short[i6 * i3];
        this.f10520n = new short[i6 * i3];
    }

    /* renamed from: e */
    public static void m6231e(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    /* renamed from: a */
    public final void m6232a(short[] sArr, int i2, int i3) {
        short[] m6234c = m6234c(this.f10518l, this.f10519m, i3);
        this.f10518l = m6234c;
        int i4 = this.f10508b;
        System.arraycopy(sArr, i2 * i4, m6234c, this.f10519m * i4, i4 * i3);
        this.f10519m += i3;
    }

    /* renamed from: b */
    public final void m6233b(short[] sArr, int i2, int i3) {
        int i4 = this.f10514h / i3;
        int i5 = this.f10508b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f10515i[i8] = (short) (i9 / i6);
        }
    }

    /* renamed from: c */
    public final short[] m6234c(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f10508b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    /* renamed from: d */
    public final int m6235d(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f10508b;
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
        this.f10527u = i6 / i8;
        this.f10528v = i9 / i7;
        return i8;
    }

    /* renamed from: f */
    public final void m6236f() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f10519m;
        float f2 = this.f10509c;
        float f3 = this.f10510d;
        float f4 = f2 / f3;
        float f5 = this.f10511e * f3;
        double d = f4;
        float f6 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f10517k;
            if (i11 >= this.f10514h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f10524r;
                    if (i13 > 0) {
                        int min = Math.min(this.f10514h, i13);
                        m6232a(this.f10516j, i12, min);
                        this.f10524r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f10516j;
                        int i14 = this.f10507a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f10508b == i10 && i15 == i10) {
                            i2 = m6235d(sArr, i12, this.f10512f, this.f10513g);
                        } else {
                            m6233b(sArr, i12, i15);
                            int m6235d = m6235d(this.f10515i, 0, this.f10512f / i15, this.f10513g / i15);
                            if (i15 != i10) {
                                int i16 = m6235d * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f10512f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f10513g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f10508b == i10) {
                                    i2 = m6235d(sArr, i12, i18, i19);
                                } else {
                                    m6233b(sArr, i12, i10);
                                    i2 = m6235d(this.f10515i, 0, i18, i19);
                                }
                            } else {
                                i2 = m6235d;
                            }
                        }
                        int i22 = this.f10527u;
                        int i23 = i22 != 0 && this.f10525s != 0 && this.f10528v <= i22 * 3 && i22 * 2 > this.f10526t * 3 ? this.f10525s : i2;
                        this.f10526t = i22;
                        this.f10525s = i2;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f10516j;
                            if (f4 >= 2.0f) {
                                i4 = (int) (i23 / (f4 - f6));
                            } else {
                                this.f10524r = (int) (((2.0f - f4) * i23) / (f4 - f6));
                                i4 = i23;
                            }
                            short[] m6234c = m6234c(this.f10518l, this.f10519m, i4);
                            this.f10518l = m6234c;
                            int i24 = i4;
                            m6231e(i4, this.f10508b, m6234c, this.f10519m, sArr2, i12, sArr2, i12 + i23);
                            this.f10519m += i24;
                            i12 = i23 + i24 + i12;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f10516j;
                            if (f4 < 0.5f) {
                                i3 = (int) ((i25 * f4) / (f6 - f4));
                            } else {
                                this.f10524r = (int) ((((2.0f * f4) - f6) * i25) / (f6 - f4));
                                i3 = i25;
                            }
                            int i26 = i25 + i3;
                            short[] m6234c2 = m6234c(this.f10518l, this.f10519m, i26);
                            this.f10518l = m6234c2;
                            int i27 = this.f10508b;
                            System.arraycopy(sArr3, i12 * i27, m6234c2, this.f10519m * i27, i27 * i25);
                            m6231e(i3, this.f10508b, this.f10518l, this.f10519m + i25, sArr3, i12 + i25, sArr3, i12);
                            this.f10519m += i26;
                            i12 += i3;
                        }
                    }
                    if (this.f10514h + i12 > i11) {
                        break;
                    }
                    f6 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f10517k - i12;
                short[] sArr4 = this.f10516j;
                int i29 = this.f10508b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f10517k = i28;
            }
            f6 = 1.0f;
        } else {
            m6232a(this.f10516j, 0, this.f10517k);
            this.f10517k = 0;
        }
        if (f5 == f6 || this.f10519m == i9) {
            return;
        }
        int i30 = this.f10507a;
        int i31 = (int) (i30 / f5);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.f10519m - i9;
        short[] m6234c3 = m6234c(this.f10520n, this.f10521o, i32);
        this.f10520n = m6234c3;
        short[] sArr5 = this.f10518l;
        int i33 = this.f10508b;
        System.arraycopy(sArr5, i9 * i33, m6234c3, this.f10521o * i33, i33 * i32);
        this.f10519m = i9;
        this.f10521o += i32;
        int i34 = 0;
        while (true) {
            i5 = this.f10521o;
            i6 = i5 - 1;
            if (i34 >= i6) {
                break;
            }
            while (true) {
                i7 = this.f10522p + 1;
                int i35 = i7 * i31;
                i8 = this.f10523q;
                if (i35 <= i8 * i30) {
                    break;
                }
                this.f10518l = m6234c(this.f10518l, this.f10519m, 1);
                int i36 = 0;
                while (true) {
                    int i37 = this.f10508b;
                    if (i36 < i37) {
                        short[] sArr6 = this.f10518l;
                        int i38 = (this.f10519m * i37) + i36;
                        short[] sArr7 = this.f10520n;
                        int i39 = (i34 * i37) + i36;
                        short s = sArr7[i39];
                        short s2 = sArr7[i39 + i37];
                        int i40 = this.f10523q * i30;
                        int i41 = this.f10522p;
                        int i42 = i41 * i31;
                        int i43 = (i41 + 1) * i31;
                        int i44 = i43 - i40;
                        int i45 = i43 - i42;
                        sArr6[i38] = (short) ((((i45 - i44) * s2) + (s * i44)) / i45);
                        i36++;
                    }
                }
                this.f10523q++;
                this.f10519m++;
            }
            this.f10522p = i7;
            if (i7 == i30) {
                this.f10522p = 0;
                Assertions.m7516d(i8 == i31);
                this.f10523q = 0;
            }
            i34++;
        }
        if (i6 == 0) {
            return;
        }
        short[] sArr8 = this.f10520n;
        int i46 = this.f10508b;
        System.arraycopy(sArr8, i6 * i46, sArr8, 0, (i5 - i6) * i46);
        this.f10521o -= i6;
    }
}
